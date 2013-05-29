/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.ProdutoServico;
import br.com.genericnfe.tools.UltimaSequencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rodrigo
 */
public class ProdutoServicoDao {

    private Conexao c = new Conexao();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String msg;
    private String orderByOrd;
    private String orderByCampoOrd;
    private String sqlBase;

    public ProdutoServicoDao() {

        String sql = " SELECT P.CD_PROSERV, P.ds_proserv,P.sg_unidmedida,p.vl_proserv,p.nr_ncm,p.un_comercial,P.vl_un_comercial,p.un_tributario,"
                + " p.qtde_tributado,p.vl_unit_tributado,p.nr_cfop,to_char(p.dt_transacao,'dd/MM/yyyy') as dt_transacao FROM CAD_PRODUTO_SERVICO P";

        setSqlBase(sql);

    }

    public int salvar(ProdutoServico ps) {

        ps.setCd_prodserv(Integer.parseInt(new UltimaSequencia("CD_PROSERV", "CAD_PRODUTO_SERVICO").ult));

        StringBuilder insert = new StringBuilder("INSERT INTO CAD_PRODUTO_SERVICO(CD_PROSERV,"
                + " DS_PROSERV,SG_UNIMEDIDA,VL_PROSERV,NR_NCM,UN_COMERCIAL,VL_UN_COMERCIAL,UN_TRIBUTARIO,QTDE_TRIBUTADO,"
                + " VL_UNIT_TRIBUTADO,NR_CFOP,DT_TRANSACAO) VALUES(");
        insert.append(ps.getCd_prodserv()).append(",'");
        insert.append(ps.getDs_proserv()).append("','");
        insert.append(ps.getSg_unidademedida()).append("',");
        insert.append(ps.getVl_proserv()).append(",'");
        insert.append(ps.getNr_ncm()).append("',");
        insert.append(ps.getUn_comercial()).append(",");
        insert.append(ps.getVl_un_comercial()).append(",");
        insert.append(ps.getUn_tributario()).append(",");
        insert.append(ps.getQtde_tributado()).append(",");
        insert.append(ps.getVl_unit_tributado()).append(",'");
        insert.append(ps.getNr_cfop()).append("','");
        insert.append(ps.getDt_transacao()).append("')");

        setMsg((c.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluido com sucesso!"));

        return ps.getCd_prodserv();
    }

    public void excluir(ProdutoServico ps) {
        String delete = ("delete from CAD_PRODUTO_SERVICO where CD_PROSERV = " + ps.getCd_prodserv());
        setMsg((c.executeUpdate(delete)) ? "Registro excluído com sucesso!" : "Não foi possivel excluir o registro");
    }

    public void alterar(ProdutoServico ps) {

        StringBuilder update = new StringBuilder("UPDATE CAD_PRODUTO_SERVICO SET ");
        update.append("DS_PROSERV = ").append(ps.getDs_proserv()).append(",");
        update.append(" SG_UNIDMEDIDA = ").append(ps.getSg_unidademedida()).append(",");
        update.append(" VL_PROSERV = ").append(ps.getVl_proserv()).append(",");
        update.append(" NR_NCM = ").append(ps.getNr_ncm()).append(",");
        update.append(" UN_COMERCIAL = ").append(ps.getUn_comercial()).append(",");
        update.append(" VL_UN_COMERCIAL = ").append(ps.getVl_un_comercial()).append(",");
        update.append(" UN_TRIBUTARIO = ").append(ps.getUn_tributario()).append(",");
        update.append(" QTDE_TRIBUTADO = ").append(ps.getQtde_tributado()).append(",");
        update.append(" VL_UNIT_TRIBUTADO = ").append(ps.getVl_unit_tributado()).append(",");
        update.append(" NR_CFOP = ").append(ps.getNr_cfop()).append(",");
        update.append(" DT_TRANSACAO = ").append(ps.getDt_transacao()).append(")");
        update.append(" WHERE CD_PROSERV = ").append(ps.getCd_prodserv());

        setMsg((c.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update");
    }

    public ResultSet listarTodos() {
        c.executeSQL(getSqlBase() + getOrderby());
        return c.resultset;
    }

    public ResultSet listarCod(int cod) {
        c.executeSQL(getSqlBase()+ " where cd_proserv =" + cod + getOrderby());
        return c.resultset;
    }

    public ArrayList<ProdutoServico> ProdutoServico() {

        c.executeSQL("select * from CAD_PRODUTO_SERVICO");
        ArrayList<ProdutoServico> retorno = new ArrayList<ProdutoServico>();

        try {

            while (c.resultset.next()) {

                int cd_prod = c.resultset.getInt("CD_PROSERV");
                String ds_prod = c.resultset.getString("ds_proserv");
                String sg_uni = c.resultset.getString("SG_UNIDMEDIDA");
                Double vl_proserv = c.resultset.getDouble("VL_PROSERV");
                String nr_ncm = c.resultset.getString("NR_NCM");
                int un_comercial = c.resultset.getInt("UN_COMERCIAL");
                Double vl_un_comercial = c.resultset.getDouble("VL_UN_COMERCIAL");
                int un_tributario = c.resultset.getInt("UN_TRIBUTARIO");
                int qtde_tributado = c.resultset.getInt("QTDE_TRIBUTADO");
                Double vl_uni_tributado = c.resultset.getDouble("VL_UNIT_TRIBUTADO");
                String nr_cfop = c.resultset.getString("NR_CFOP");
                Date dt_transacao = c.resultset.getDate("DT_TRANSACAO");

                retorno.add(new ProdutoServico(cd_prod, ds_prod, sg_uni, vl_proserv, nr_ncm, un_comercial, vl_un_comercial, un_tributario, qtde_tributado, vl_uni_tributado, nr_cfop, dt_transacao));
            }

            return retorno;
        } catch (SQLException ex) {
            setMsg("Não foi possivel listar todos os registros");
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

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public String getSqlBase() {
        return sqlBase;
    }

    public void setSqlBase(String sqlBase) {
        this.sqlBase = sqlBase;
    }
}
