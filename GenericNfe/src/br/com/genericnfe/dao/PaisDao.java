package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Pais;
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
public class PaisDao {

    Conexao c = new Conexao();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String orderByOrd;
    private String orderByCampoOrd;
    private String msg;

    public int salvar(Pais p) {

        p.setCd_pais(Integer.parseInt(new UltimaSequencia("CD_PAIS", "CAD_PAIS").ult));

        StringBuilder insert = new StringBuilder("INSERT INTO CAD_Pais(CD_PAIS,NM_PAIS,DT_TRANSACAO) VALUES");
        insert.append("(");
        insert.append(p.getCd_pais()).append(",'");
        insert.append(p.getNm_pais()).append("','");
        insert.append(sdf.format(p.getDt_transacao())).append("')");
        System.out.println(insert.toString());
        setMsg((c.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluido com sucesso!"));
        return p.getCd_pais();

    }

    public void excluir(Pais u) {

        String delete = "delete from cad_pais where cd_pais=" + u.getCd_pais();
        setMsg((c.executeUpdate(delete)) ? "Registro excluído com sucesso!" : "Não foi possivel excluir o registro");

    }

    public void alterar(Pais u) {

        StringBuilder update = new StringBuilder("UPDATE CAD_PAIS SET ");
        update.append("NM_PAIS='").append(u.getNm_pais()).append("',");
        update.append("DT_TRANSACAO='").append(sdf.format(u.getDt_transacao())).append("'\n");
        update.append("WHERE CD_PAIS=").append(u.getCd_pais());
        setMsg((c.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update");

    }

    public ResultSet listarTodos() {
        c.executeSQL("select cd_pais,nm_pais,to_char(dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_pais " + getOrderby());
        return c.resultset;

    }

    public ResultSet listarCod(int cod) {

        c.executeSQL("select cd_pais,nm_pais,to_char(dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_pais where cd_pais=" + cod + getOrderby());
        return c.resultset;
    }

    public ResultSet listarNm(String nm) {

        c.executeSQL("select cd_pais,nm_pais,to_char(dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_pais where nm_pais like '%" + nm + "%'" + getOrderby());
        return c.resultset;
    }

    public ResultSet listarSg(String sg) {

        c.executeSQL("select cd_pais,nm_pais,to_char(dt_transacao,'dd/MM/yyyy') as dt_transacao from cad_pais where sg_pais like '%" + sg + "%'" + getOrderby());
        return c.resultset;
    }

    public Pais buscarCod(int cod) {

        c.executeSQL("select cd_pais,nm_pais,dt_transacao from cad_pais where cd_pais=" + cod);
        return getPais(c.resultset);
    }

    public ArrayList<Pais> Pais() {

        c.executeSQL("Select * from cad_pais");
        ArrayList<Pais> retorno = new ArrayList<Pais>();
        try {
            while (c.resultset.next()) {
                int cd_Pais = c.resultset.getInt(1);
                String nm_Pais = c.resultset.getString(2);
                Date date = c.resultset.getDate(3);
                retorno.add(new Pais(cd_Pais, nm_Pais, date));
            }

            return retorno;
        } catch (SQLException ex) {

            setMsg("Não foi possivel listar todos os registros");
            return null;

        }


    }

    private Pais getPais(ResultSet resultSet) {
        try {
            resultSet.first();
            int cd_Pais = resultSet.getInt(1);
            String nm_pais = resultSet.getString(2);
            Date date = resultSet.getDate(3);
            return new Pais(cd_Pais, nm_pais, date);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public String getOrderby() {

        return new StringBuilder(" ORDER BY ").append(getOrderByCampoOrd()).append(" ").append(getOrderByOrd()).toString();

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOrderByOrd() {
        return orderByOrd;
    }

    public void setOrderByOrd(String orderByOrd) {
        this.orderByOrd = orderByOrd;
    }

    public String getOrderByCampoOrd() {
        return orderByCampoOrd;
    }

    public void setOrderByCampoOrd(String orderByCampoOrd) {
        this.orderByCampoOrd = orderByCampoOrd;
    }

    public static void main(String[] args) {
        PaisDao pDao = new PaisDao();
       
    }
}
