package br.com.genericnfe.dao;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Banco;
import br.com.genericnfe.model.Usuario;
import br.com.genericnfe.tools.UltimaSequencia;
import br.com.genericnfe.view.TelaPrincipal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jsoliveira
 */
public class UsuarioDao {

    private Conexao c = new Conexao();
    private Usuario u;
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private UltimaSequencia us;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void salvar() {

        us = new UltimaSequencia("cd_usuario", "cad_usuario");
        StringBuffer insert = new StringBuffer("insert into cad_usuario(cd_usuario,nm_usuario,ds_usuario,pw_senha,dt_transacao)\n ");
        insert.append("values(\n");
        insert.append(us.ult).append(",\n'");
        insert.append(u.getNm_usuario()).append("','");
        insert.append(u.getDs_usuario()).append("','");
        insert.append(u.getPw_usuario()).append("','");
        insert.append(sdf.format(u.getDt_transacao())).append("')");

        System.out.println(insert.toString());
        c.insertSQL(insert.toString());

    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void alterar() {
    }

    public void excluir() {
    }

    public ArrayList<Usuario> listarTodos() {


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
        
      c.executeSQL("select nm_login,pw_senha from cad_usuario where nm_login='"+u.getDs_usuario()+"' and pw_senha='"+u.getPw_usuario()+"'");
        try {
            return c.resultset.first();
        } catch (SQLException ex) {
            return false;
        }
    
    
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
}
