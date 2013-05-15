package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Cidade;
import br.com.genericnfe.model.Uf;
import br.com.genericnfe.tools.UltimaSequencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jsoliveira
 */
public class CidadeDao {

    private Conexao con = new Conexao();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String orderByOrd;
    private String orderByCampoOrd;
    private String msg;

    public int salvar(Cidade c) {

        c.setCd_cidade(Integer.parseInt(new UltimaSequencia("cd_cidade", "cad_cidade").ult));
        StringBuilder insert = new StringBuilder();
        insert.append("INSERT INTO CAD_CIDADE(CD_CIDADE,CD_UF,NM_CIDADE,DT_TRANSACAO)");
        insert.append("VALUES(");
        insert.append(c.getCd_cidade()).append(",");
        insert.append(c.getUf().getCd_uf()).append(",");
        insert.append("'").append(c.getNm_cidade()).append("'").append(",");
        insert.append("'").append(sdf.format(c.getDt_transacao())).append("')");
        setMsg((con.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluido com sucesso!"));

        return c.getCd_cidade();
    }

    public void excluir(Cidade c) {

        String delete = "delete from cad_cidade where cd_cidade=" + c.getCd_cidade();
        setMsg(this.con.executeUpdate(delete) ? "Registro excluido com sucesso!" : "Erro ao excluir o registro");

    }

    public void alterar(Cidade c) {

        StringBuilder update = new StringBuilder();

        update.append("UPDATE CAD_CIDADE SET ");
        update.append("CD_UF=").append(c.getUf().getCd_uf()).append(",");
        update.append("NM_CIDADE='").append(c.getNm_cidade()).append("',");
        update.append("DT_TRANSACAO='").append(sdf.format(c.getDt_transacao())).append("' \n");
        update.append("WHERE CD_CIDADE=").append(c.getCd_cidade());
        System.out.println(update.toString());
        setMsg((this.con.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update");

    }

    public ResultSet listarTodos() {
        StringBuilder sql = new StringBuilder();
        sql.append("select c.cd_cidade,u.sg_uf,c.nm_cidade,to_char(c.dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_cidade c\n");
        sql.append("inner join cad_uf u on (u.cd_uf=c.cd_uf)\n");
        sql.append(getOrderby());
        con.executeSQL(sql.toString());
        return con.resultset;

    }

    public ResultSet listarCod(int cod) {

        StringBuilder sql = new StringBuilder();
        sql.append("select c.cd_cidade,u.sg_uf,c.nm_cidade,to_char(c.dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_cidade c\n");
        sql.append("inner join cad_uf u on (u.cd_uf=c.cd_uf)\n");
        sql.append("where c.cd_cidade=").append(cod).append("\n");
        sql.append(getOrderby());
        con.executeSQL(sql.toString());
        return con.resultset;
    }

    public ResultSet listarNm(String nm) {

        StringBuilder sql = new StringBuilder();
        sql.append("select c.cd_cidade,u.sg_uf,c.nm_cidade,to_char(c.dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_cidade c\n");
        sql.append("inner join cad_uf u on (u.cd_uf=c.cd_uf)\n");
        sql.append("where c.nm_cidade like '%").append(nm).append("%'\n");
        sql.append(getOrderby());
        con.executeSQL(sql.toString());
        return con.resultset;
    }

    public ResultSet listarSg(String sg) {

        StringBuilder sql = new StringBuilder();
        sql.append("select c.cd_cidade,u.sg_uf,c.nm_cidade,to_char(c.dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_cidade c\n");
        sql.append("inner join cad_uf u on (u.cd_uf=c.cd_uf)\n");
        sql.append("where u.sg_uf like '%").append(sg).append("%'\n");
        sql.append(getOrderby());
        con.executeSQL(sql.toString());
        return con.resultset;
    }

    public Cidade buscarCod(int cod) {

        con.executeSQL("select cd_cidade,cd_uf,nm_cidade,dt_transacao from cad_cidade where cd_cidade=" + cod);
        return getCidade(con.resultset);
    }

    public ArrayList<Cidade> Cidades() {

        con.executeSQL("Select * from cad_cidade");
        ArrayList<Cidade> retorno = new ArrayList<Cidade>();
        try {
            while (con.resultset.next()) {
                int cd_cidade = con.resultset.getInt(1);
                int cd_uf = con.resultset.getInt(2);
                String nm_cidade = con.resultset.getString(3);
                Date date = con.resultset.getDate(4);
                retorno.add(new Cidade(cd_uf, new UfDao().buscarCod(cd_uf), nm_cidade, date));
            }

            return retorno;
        } catch (SQLException ex) {

            setMsg("Não foi possivel listar todos os registros");
            return null;

        }


    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOrderByCampoOrd() {
        return orderByCampoOrd;
    }

    public void setOrderByCampoOrd(String orderByCampoOrd) {
        this.orderByCampoOrd = orderByCampoOrd;
    }

    public String getOrderByOrd() {
        return orderByOrd;
    }

    public void setOrderByOrd(String orderByOrd) {
        this.orderByOrd = orderByOrd;
    }

    public String getOrderby() {

        return new StringBuilder(" ORDER BY ").append(getOrderByCampoOrd()).append(" ").append(getOrderByOrd()).toString();

    }

    private Cidade getCidade(ResultSet resultSet) {
        try {
            resultSet.first();
            int cd_cidade = resultSet.getInt(1);
            int cd_uf = resultSet.getInt(2);
            String nm_cidade = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            return new Cidade(cd_cidade, new UfDao().buscarCod(cd_uf), nm_cidade, date);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
