/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Operacao;
import br.com.genericnfe.tools.UltimaSequencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class OperacaoDao {

    Conexao c = new Conexao();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String orderByOrd;
    private String orderByCamposOrd;
    private String msg;
    private String baseSql;
    
    public OperacaoDao(){
        
        StringBuilder sql = new StringBuilder();
        sql.append("select op.cd_operacao,op.nm_operacao,to_char(op.dt_transacao,'dd/MM/yyyy') from cad_operacao op");
        setBaseSql(sql.toString());
    }

    public int salvar(Operacao op) {

        op.setCd_operacao(Integer.parseInt(new UltimaSequencia("CD_OPERACAO", "CAD_OPERACAO").ult));

        StringBuilder insert = new StringBuilder("INSERT INTO CAD_OPERACAO(CD_OPERACAO,NM_OPERACAO,DT_TRANSICAO) VALUES ( ");
        insert.append(op.getCd_operacao()).append(",'");
        insert.append(op.getNm_operacao()).append("','");
        insert.append(op.getDt_transacao()).append("')");
        System.out.println(insert.toString());
        setMsg((c.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluido com sucesso!"));
        return op.getCd_operacao();
    }

    public void excluir(Operacao op) {
        String delete = "delete from cad_operacao where cd_operacao =" + op.getCd_operacao();
        setMsg((c.executeUpdate(delete)) ? "Registro excluído com sucesso!" : "Não foi possivel excluir o registro");

    }

    public void alterar(Operacao op) {
        StringBuilder update = new StringBuilder("UPDATE CAD_OPERACAO SET ");
        update.append(" NM_OPERACAO = '").append(op.getNm_operacao()).append(" ',");
        update.append("DT_TRANSACAO = '").append(sdf.format(op.getDt_transacao())).append("' ");
        update.append(" WHERE CD_OPERACAO = ").append(op.getCd_operacao());
        setMsg((c.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update");

    }

    public ResultSet listarTodos() {

        c.executeSQL(getBaseSql() + getOrderByOrd());
        return c.resultset;
    }

    public ResultSet listarCod(int cod) {
        c.executeSQL(getBaseSql() + " where cd_operacao = " + cod + getOrderby());
        return c.resultset;
    }

    public ResultSet listarDescricao(String ds_op) {
        c.executeSQL(getBaseSql() + " where nm_operacao like '%"+ds_op+"%' "+getOrderby() );
        return c.resultset;
    }

    public ArrayList<Operacao> Operacao() {
        c.executeSQL("select * from cad_operacao");
        ArrayList<Operacao> retorno = new ArrayList<Operacao>();

        try {

            while (c.resultset.next()) {
                int cd_operacao = c.resultset.getInt(1);
                String ds_operacao = c.resultset.getString(2);
                Date date = c.resultset.getDate(3);
                retorno.add(new Operacao(cd_operacao, ds_operacao, date));
            }

            return retorno;
        } catch (SQLException ex) {

            setMsg("Não foi possivel listar todos os registros");
            return null;
        }
    }

    private Operacao getOperacao(ResultSet resultSet) {
        try {
            resultSet.first();
            int cd_operacao = resultSet.getInt(1);
            String ds_operacao = resultSet.getString(2);
            Date date = resultSet.getDate(3);
            return new Operacao(cd_operacao, ds_operacao, date);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public String getOrderby() {

        return new StringBuilder(" ORDER BY ").append(getOrderByCamposOrd()).append(" ").append(getOrderByOrd()).toString();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOrderByCamposOrd() {
        return orderByCamposOrd;
    }

    public void setOrderByCamposOrd(String orderByCamposOrd) {
        this.orderByCamposOrd = orderByCamposOrd;
    }

    public String getOrderByOrd() {
        return orderByOrd;
    }

    public void setOrderByOrd(String orderByOrd) {
        this.orderByOrd = orderByOrd;
    }

    public String getBaseSql() {
        return baseSql;
    }

    public void setBaseSql(String baseSql) {
        this.baseSql = baseSql;
    }
    
    
    
}
