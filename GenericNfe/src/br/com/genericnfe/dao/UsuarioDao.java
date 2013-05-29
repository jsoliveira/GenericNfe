package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Usuario;
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
public class UsuarioDao {

    private Conexao c = new Conexao();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String msg;
    private String orderByOrd;
    private String orderByCampoOrd;
    private String sqlBase;
    private Usuario usuLogado;

    public UsuarioDao() {
        setSqlBase("SELECT CD_USUARIO,NM_USUARIO,NM_LOGIN,PW_SENHA,TO_CHAR(DT_TRANSACAO,'DD/MM/YYYY') AS DT_TRANSACAO FROM CAD_USUARIO");
    }

    public int salvar(Usuario u) {

        UltimaSequencia us = new UltimaSequencia("cd_usuario", "cad_usuario");
        u.setCd_usuario(Integer.parseInt(us.ult));
        StringBuilder insert = new StringBuilder("insert into cad_usuario(cd_usuario,nm_usuario,nm_login,pw_senha,dt_transacao)\n ");
        insert.append("values(\n");
        insert.append(u.getCd_usuario()).append(",\n'");
        insert.append(u.getNm_usuario()).append("','");
        insert.append(u.getDs_usuario()).append("','");
        insert.append(u.getPw_usuario()).append("','");
        insert.append(sdf.format(u.getDt_transacao())).append("')");
        setMsg((c.insertSQL(insert.toString()) ? "Erro ao salvar o registro" : "Registro incluído com sucesso!"));
        return u.getCd_usuario();
    }

    public void alterar(Usuario u) {

        StringBuilder update = new StringBuilder();
        update.append("UPDATE CAD_USUARIO SET \n");
        update.append("NM_USUARIO='").append(u.getNm_usuario()).append("',\n");
        update.append("NM_LOGIN='").append(u.getDs_usuario()).append("',\n");
        update.append("PW_SENHA='").append(u.getPw_usuario()).append("',\n");
        update.append("DT_TRANSACAO='").append(sdf.format(u.getDt_transacao())).append("'\n");
        update.append("WHERE CD_USUARIO=").append(u.getCd_usuario());
        System.out.println(update.toString());
        setMsg((c.executeUpdate(update.toString())) ? "Registro alterado com sucesso!" : "Não foi possivel executar o update");
    }

    public void excluir(Usuario u) {

        String delete = "DELETE FROM CAD_USUARIO WHERE CD_USUARIO" + u.getCd_usuario();
        setMsg((c.executeUpdate(delete)) ? "Registro excluído com sucesso!" : "Não foi possivel excluir o registro");
    }

    public ArrayList<Usuario> usuarios() {


        c.executeSQL("select * from cad_usuario");

        ArrayList<Usuario> retorno = new ArrayList<Usuario>();
        try {
            while (c.resultset.next()) {

                Usuario u = new Usuario(c.resultset.getInt(1), c.resultset.getString(2), c.resultset.getString(3), c.resultset.getString(4), c.resultset.getDate(5));
                retorno.add(u);
            }

        } catch (SQLException ex) {
            retorno = null;
        }
        return retorno;
    }

    public Boolean validaLogin(Usuario u) {

        String sql = "select * from cad_usuario where nm_login='" + u.getDs_usuario() + "' and pw_senha='" + u.getPw_usuario() + "'";
        System.out.println(sql);
        c.executeSQL(sql);
        try {
            c.resultset.first();
            setUsuLogado(new Usuario(c.resultset.getInt(1), c.resultset.getString(2), c.resultset.getString(3), c.resultset.getString(4), c.resultset.getDate(5)));
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public Usuario buscarCod(int cod) {

        c.executeSQL("select * from cad_usuario where cd_usuario=" + cod);
        return getUsuario(c.resultset);
    }

    public ResultSet listarTodos() {
        c.executeSQL(getSqlBase() + getOrderby());
        return c.resultset;
    }

    public ResultSet listarCod(int cod) {

        c.executeSQL(getSqlBase() + " where cd_usuario=" + cod + getOrderby());
        return c.resultset;
    }

    public ResultSet listarNome(String nm) {
        c.executeSQL(getSqlBase() + " where nm_usuario like'%" + nm + "%' " + getOrderby());
        return c.resultset;
    }

    public ResultSet listarLogin(String login) {
        c.executeSQL(getSqlBase() + " where ds_usuario like'%" + login + "%' " + getOrderby());
        return c.resultset;
    }

    private Usuario getUsuario(ResultSet resultset) {
        try {
            resultset.first();

            int cod = resultset.getInt(1);
            String nome = resultset.getString(2);
            String login = resultset.getString(3);
            String pw = resultset.getString(4);
            Date dtTransacao = resultset.getDate(5);

            Usuario u = new Usuario(cod, nome, login, pw, dtTransacao);
            return u;

        } catch (SQLException ex) {
            return null;
        }

    }

    public String getOrderby() {

        return new StringBuilder(" ORDER BY ").append(getOrderByCampoOrd()).append(" ").append(getOrderByOrd()).toString();

    }

    public static void main(String[] args) {
//        Banco.BANCO.setBanco(0);
//        Banco.BANCO.setBase(1);
//        UsuarioDao uDao = new UsuarioDao();
//
//        //  uDao.setU(new Usuario(0, "RODRIGO MONTEIRO","RM","123MUDAR", new Date()));
//        //  uDao.salvar();
//
//        ArrayList<Usuario> us = uDao.listarTodos();
//
//        for (int i = 0; i <= us.size() - 1; i++) {
//            System.out.println(us.get(i).getCd_usuario());
//            System.out.print(us.get(i).getNm_usuario());
//            System.out.print(us.get(i).getDs_usuario());
//            System.out.print(us.get(i).getPw_usuario());
//            System.out.print(us.get(i).getDt_transacao());
//        }
//
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSqlBase() {
        return sqlBase;
    }

    public void setSqlBase(String sqlBase) {
        this.sqlBase = sqlBase;
    }

    public Usuario getUsuLogado() {
        return usuLogado;
    }

    public void setUsuLogado(Usuario usuLogado) {
        this.usuLogado = usuLogado;
    }
}
