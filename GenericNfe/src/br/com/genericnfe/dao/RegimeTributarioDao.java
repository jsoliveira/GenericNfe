/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.RegimeTributario;
import br.com.genericnfe.tools.UltimaSequencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author RodrigoMonteiro
 */
public class RegimeTributarioDao {

    Conexao c = new Conexao();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String orderByOrd;
    private String orderByCampoOrd;
    private String msg;
    private String baseSql;

    public RegimeTributarioDao() {
        StringBuilder sql = new StringBuilder();
        sql.append(" select rt.cd_regime, rt.ds_regime, to_char(rt.dt_transacao,'dd/MM/yyyy') AS dt_transacao \n");
        sql.append(" from cad_regime_tributario rt");
        setBaseSql(sql.toString());
    }

    public int salvar(RegimeTributario rt) {
        rt.setCd_regime(Integer.parseInt(new UltimaSequencia("CD_REGIME", "CAD_REGIME_TRIBUTARIO").ult));

        StringBuilder insert = new StringBuilder("insert into cad_regime_tributario (cd_regime,ds_regime,dt_transacao) values(");
        insert.append(rt.getCd_regime()).append(",'");
        insert.append(rt.getDs_regime()).append("','");
        insert.append(sdf.format(rt.getDt_transacao())).append("')");
        System.out.println(insert.toString());
        setMsg((c.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluido com sucesso!"));

        return rt.getCd_regime();
    }

    public void excluir(RegimeTributario rt) {
        String delete = "delete from cad_regime_tributario where cd_regime = " + rt.getCd_regime();
        setMsg((c.executeUpdate(delete)) ? "Registro excluido com sucesso!" : "Não foi possivel excluir o registro");
    }

    public void alterar(RegimeTributario rt) {

        StringBuilder update = new StringBuilder(" UPDATE CAD_REGIME_TRIBUTARIO SET ");
        update.append("DS_REGIME = '").append(rt.getDs_regime()).append("',");
        update.append("DT_TRANSACAO = '").append(rt.getDt_transacao()).append("'");
        update.append(" WHERE CD_REGIME = ").append(rt.getCd_regime());
        setMsg((c.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update!");
    }

    public ResultSet listarTodos() {
        c.executeSQL(getBaseSql() + getOrderby());
        return c.resultset;
    }

    public ResultSet listarCod(int cod) {

        c.executeSQL(getBaseSql() + " where cd_regime = " + cod + getOrderby());
        return c.resultset;
    }

    public ResultSet listarDescricao(String ds) {
        c.executeSQL(getBaseSql() + " where ds_regime like '%" + ds + "%'" + getOrderby());
        return c.resultset;
    }

    public RegimeTributario buscarCod(int cod) {
        c.executeSQL("select rt.cd_regime, rt.ds_regime, to_char(rt.dt_transacao,'dd/MM/yyyy') AS dt_transacao  "
                + " from cad_regime_tributario rt where rt.cd_regime = " + cod);
        return getRT(c.resultset);
    }

    public ArrayList<RegimeTributario> rgs() {

        c.executeSQL("Select * from cad_regime_tributario");
        ArrayList<RegimeTributario> retorno = new ArrayList<RegimeTributario>();

        try {
            while (c.resultset.next()) {
                int cd_regime = c.resultset.getInt(1);
                String ds_regime = c.resultset.getString(2);
                Date date = c.resultset.getDate(3);
                retorno.add(new RegimeTributario(cd_regime, ds_regime, date));
            }

            return retorno;
        } catch (SQLException ex) {
            setMsg("Não foi possivel listar todos os registros");
            return null;
        }
    }

    private RegimeTributario getRT(ResultSet resultSet) {

        try {
            resultSet.first();
            int cd_regime = resultSet.getInt(1);
            String ds_regime = resultSet.getString(2);
            Date date = resultSet.getDate(3);
            return new RegimeTributario(cd_regime, ds_regime, date);
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

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
}
