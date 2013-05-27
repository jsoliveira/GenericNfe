package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Pais;
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
public class UfDao {

    Conexao c = new Conexao();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String orderByOrd;
    private String orderByCampoOrd;
    private String msg;
    private String baseSql;

    public UfDao() {

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT u.cd_uf,  p.nm_pais,  u.nm_uf,  u.sg_uf,  TO_CHAR(u.dt_transacao,'dd/MM/yyyy') AS dt_transacao FROM \n");
        sql.append("cad_uf u INNER JOIN cad_pais p ON(p.cd_pais=u.cd_pais) ");

        setBaseSql(sql.toString());

    }

    public int salvar(Uf u) {

        u.setCd_uf(Integer.parseInt(new UltimaSequencia("CD_UF", "CAD_UF").ult));

        StringBuilder insert = new StringBuilder("INSERT INTO CAD_UF(CD_UF,CD_PAIS,NM_UF,SG_UF,DT_TRANSACAO) VALUES");
        insert.append("(");
        insert.append(u.getCd_uf()).append(",");
        insert.append(u.getP().getCd_pais()).append(",'");
        insert.append(u.getNm_uf()).append("','");
        insert.append(u.getSg_uf()).append("','");
        insert.append(sdf.format(u.getDt_transacao())).append("')");
        System.out.println(insert.toString());
        setMsg((c.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluido com sucesso!"));
        return u.getCd_uf();

    }

    public void excluir(Uf u) {

        String delete = "delete from cad_uf where cd_uf=" + u.getCd_uf();
        setMsg((c.executeUpdate(delete)) ? "Registro excluído com sucesso!" : "Não foi possivel excluir o registro");

    }

    public void alterar(Uf u) {

        StringBuilder update = new StringBuilder("UPDATE CAD_UF SET ");
        update.append("CD_PAIS=").append(u.getP().getCd_pais()).append(",");
        update.append("NM_UF='").append(u.getNm_uf()).append("',");
        update.append("SG_UF='").append(u.getSg_uf()).append("',");
        update.append("DT_TRANSACAO='").append(sdf.format(u.getDt_transacao())).append("'\n");
        update.append("WHERE CD_UF=").append(u.getCd_uf());
        setMsg((c.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update");

    }

    public ResultSet listarTodos() {
        c.executeSQL(getBaseSql() + getOrderby());
        return c.resultset;

    }

    public ResultSet listarCod(int cod) {

        c.executeSQL(getBaseSql() + " where cd_uf=" + cod + getOrderby());
        return c.resultset;
    }

    public ResultSet listarPais(String nmPais) {

        c.executeSQL(getBaseSql() + " where nm_pais like '%" + nmPais + "%'" + getOrderby());
        return c.resultset;
    }

    public ResultSet listarNm(String nm) {

        c.executeSQL(getBaseSql() + " where nm_uf like '%" + nm + "%'" + getOrderby());
        return c.resultset;
    }

    public ResultSet listarSg(String sg) {

        c.executeSQL(getBaseSql() + " where sg_uf like '%" + sg + "%'" + getOrderby());
        return c.resultset;
    }

    public Uf buscarCod(int cod) {

        c.executeSQL("select cd_uf,cd_pais,nm_uf,sg_uf,dt_transacao from cad_uf where cd_uf=" + cod);
        return getUf(c.resultset);
    }

    public ArrayList<Uf> ufs() {

        c.executeSQL("Select * from cad_uf");
        ArrayList<Uf> retorno = new ArrayList<Uf>();
        try {
            while (c.resultset.next()) {
                int cd_uf = c.resultset.getInt(1);
                Pais p = new PaisDao().buscarCod(c.resultset.getInt(2));
                String nm_uf = c.resultset.getString(3);
                String sg_uf = c.resultset.getString(4);
                Date date = c.resultset.getDate(5);
                retorno.add(new Uf(cd_uf, p, nm_uf, sg_uf, date));
            }

            return retorno;
        } catch (SQLException ex) {

            setMsg("Não foi possivel listar todos os registros");
            return null;

        }


    }

    private Uf getUf(ResultSet resultSet) {
        try {
            resultSet.first();
            int cd_uf = resultSet.getInt(1);
            Pais p = new PaisDao().buscarCod(resultSet.getInt(2));
            String nm_uf = resultSet.getString(3);
            String sg_uf = resultSet.getString(4);
            Date date = resultSet.getDate(5);
            return new Uf(cd_uf, p, nm_uf, sg_uf, date);
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

    public String getBaseSql() {
        return baseSql;
    }

    public void setBaseSql(String baseSql) {
        this.baseSql = baseSql;
    }

    public static void main(String[] args) {
        UfDao ufDao = new UfDao();
        ufDao.ufs();
    }
}
