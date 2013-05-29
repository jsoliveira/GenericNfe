package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.ModalidadeTransporte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ModalidadeTransporteDao {

    Conexao c = new Conexao();
    SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy");
    private String orderByOrd;
    private String orderByCampoOrd;
    private String msg;

    public int salvar(ModalidadeTransporte mt) {

        return mt.getCd_modalidade();
    }

    public void excluir(ModalidadeTransporte mt) {
    }

    public void alterar(ModalidadeTransporte mt) {
    }

    public ResultSet listarTodos() {

        return c.resultset;
    }

    public ResultSet listarCod(int cod) {

        return c.resultset;
    }

    public ResultSet listarDescricao(String ds) {

        return c.resultset;
    }

    public ModalidadeTransporte buscarCod(int cod) {
        c.executeSQL("select mt.cd_modalidade, mt.ds_modalidade, mt.dt_transacao from cad_modalidade_transporte mt where mt.cd_modalidade = " + cod);
        return getModalidade(c.resultset);
    }

    public ArrayList<ModalidadeTransporte> Modalidade() {
        c.executeSQL("select * from cad_modalidade_transporte");
        ArrayList<ModalidadeTransporte> retorno = new ArrayList<ModalidadeTransporte>();
        try {

            while (c.resultset.next()) {
                int cd_modalidade = c.resultset.getInt(1);
                String ds_mod = c.resultset.getString(2);
                Date date = c.resultset.getDate(3);
                retorno.add(new ModalidadeTransporte(cd_modalidade, ds_mod, date));
            }

            return retorno;
        } catch (SQLException ex) {

            setMsg("Não foi possivel listar todos os registros");
            return null;
        }
    }

    private ModalidadeTransporte getModalidade(ResultSet resultSet) {

        try {
            resultSet.first();
            int cd_modalidade = resultSet.getInt(1);
            String ds_mod = resultSet.getString(2);
            Date date = resultSet.getDate(3);
            return new ModalidadeTransporte(cd_modalidade, ds_mod, date);
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
