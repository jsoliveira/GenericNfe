/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Parametros;
import br.com.genericnfe.tools.UltimaSequencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ParametrosDao {

    Conexao c = new Conexao();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String orderByOrd;
    private String orderByCampoOrd;
    private String msg;
    private String baseSql;

    public ParametrosDao() {

        String sql = "select p.cd_parametros,p.ds_sv_proxy,p.nr_pt_proxy,p.us_proxy,p.pw_proxy,"
                + " p.dir_lotes_gerados,p.dor_lotes_autorizados,to_char(p.dt_transacao,'dd/MM/yyyy') "
                + " from cad_parametros p";

        setBaseSql(sql);

    }

    public int salvar(Parametros p) {

        p.setCd_parametros(Integer.parseInt(new UltimaSequencia("CD_PARAMETROS", "CAD_PARAMETROS").ult));


        StringBuilder insert = new StringBuilder("insert into cad_parametros(cd_parametros,ds_sv_proxy,nr_pt_proxy,");
        insert.append("us_proxy,pw_proxy,dir_lotes_gerados,dor_lotes_autorizados,dt_transacao) values(");
        insert.append(p.getCd_parametros()).append(",'");
        insert.append(p.getDs_sv_proxy()).append("',");
        insert.append(p.getNr_pt_proxy()).append(",'");
        insert.append(p.getUs_proxy()).append("','");
        insert.append(p.getPw_proxy()).append("','");
        insert.append(p.getDir_lotes_gerados()).append("','");
        insert.append(p.getDor_lotes_autorizados()).append("','");
        insert.append(p.getDt_transacao()).append("')");
        System.out.println(insert.toString());
        setMsg((c.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluido com sucesso!"));
        return p.getCd_parametros();
    }

    public void excluir(Parametros p) {
        String delete = "delete from cad_parametros where cd_parametros=" + p.getCd_parametros();
        setMsg((c.executeUpdate(delete)) ? "Registro excluído com sucesso!" : "Não foi possivel excluir o registro");

    }

    public void alterar(Parametros p) {

        StringBuilder update = new StringBuilder("UPDATE CAD_PARAMETROS SET ");
        update.append(" DS_SV_PROXY = ").append(p.getDs_sv_proxy());
        update.append(" ,NR_PT_PROXY = ").append(p.getNr_pt_proxy());
        update.append(" ,US_PROXY = ").append(p.getUs_proxy());
        update.append(" ,PW_PROXY = ").append(p.getPw_proxy());
        update.append(" ,DIR_LOTES_GERADOS= ").append(p.getDir_lotes_gerados());
        update.append(" ,DOR_LOTES_AUTORIZADOS = ").append(p.getDor_lotes_autorizados());
        update.append(" ,DT_TRANSACAO = ").append(p.getDt_transacao());
        update.append(" WHERE CD_PARAMETROS = ").append(p.getCd_parametros());
                
        System.out.println(update);
        setMsg((c.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update!");

    }

    public ResultSet listarTodos() {

        c.executeSQL(getBaseSql() + getOrderby());
        return c.resultset;
    }

    public ResultSet listarCodigo(int cod) {

        c.executeSQL(getBaseSql() + " where cd_parametros = " + cod + getOrderby());
        return c.resultset;
    }

    public ResultSet listarDsProxy(String ds) {
        c.executeSQL(getBaseSql() + " where ds_sv_proxy like '%" + ds + "%'" + getOrderByOrd());
        return c.resultset;
    }

    public ArrayList<Parametros> Parametross() {
        c.executeSQL("Select * from cad_parametros");
        ArrayList<Parametros> retorno = new ArrayList<Parametros>();
        try {
            while (c.resultset.next()) {

                retorno.add(new Parametros(
                        c.resultset.getInt("CD_PARAMETROS"),
                        c.resultset.getString("DS_SV_PROXY"),
                        c.resultset.getInt("NR_PT_PROXY"),
                        c.resultset.getString("US_PROXY"),
                        c.resultset.getString("PW_PROXY"),
                        c.resultset.getString("DIR_LOTES_GERADOS"),
                        c.resultset.getString("DOR_LOTES_AUTORIZADOS"),
                        c.resultset.getDate("DT_TRANSACAO")));
            }

            return retorno;
        } catch (SQLException ex) {

            setMsg("Não foi possivel listar todos os registros");
            return null;

        }
    }

    private Parametros getParametros(ResultSet resultSet) {

        try {
            resultSet.first();

            return new Parametros(
                    resultSet.getInt("CD_PARAMETROS"),
                    resultSet.getString("DS_SV_PROXY"),
                    resultSet.getInt("NR_PT_PROXY"),
                    resultSet.getString("US_PROXY"),
                    resultSet.getString("PW_PROXY"),
                    resultSet.getString("DIR_LOTES_GERADOS"),
                    resultSet.getString("DOR_LOTES_AUTORIZADOS"),
                    resultSet.getDate("DT_TRANSACAO"));

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }


    }

    public String getOrderby() {

        return new StringBuilder(" ORDER BY ").append(getOrderByCampoOrd()).append(" ").append(getOrderByOrd()).toString();

    }

    public String getBaseSql() {
        return baseSql;
    }

    public void setBaseSql(String baseSql) {
        this.baseSql = baseSql;
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
}
