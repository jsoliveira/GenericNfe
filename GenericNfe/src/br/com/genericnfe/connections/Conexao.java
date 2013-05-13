package br.com.genericnfe.connections;

import br.com.genericnfe.model.Banco;
import br.com.genericnfe.tools.UltimaSequencia;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jsoliveira
 */
public class Conexao {

    private static Connection c;
    private Statement statement;
    private PreparedStatement ps;
    public ResultSet resultset;
    public ResultSetMetaData metadata;
    private ConexaoOracle co;
    private ConexaoPostgress cp;

    public Conexao() {
        conecta();
    }

    private void conecta() {

        if (Conexao.c != null) { ///VALIDA CONEXAO
            return;
        }

        switch (Banco.getBanco()) {

            case 0: { // 0- BANCO DE DADOS ORACLE / BASE 0-DESENVOLVIMENTO 1-PRODUCAO
                co = new ConexaoOracle();
                Conexao.c = co.conecta(Banco.getBase());
                break;
            }

            case 1: { // 1- BANCO DE DADOS POSTGRESS / BASE 0-DESENVOLVIMENTO 1-PRODUCAO
                cp = new ConexaoPostgress();
                Conexao.c = ConexaoPostgress.conecta(Banco.getBase());
                break;
            }
        }

    }

    public void desconecta() {
        if (Conexao.c == null) { ///VALIDA CONEXAO
            System.out.println("Não existe conexão para desconectar");
            return;
        }
        try {
            Conexao.c.close();
            System.out.println("Banco desconectado com Sucesso!");
            Conexao.c=null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi Possivel desconectar o banco\nEntre em contato com o suporte Tecnico");
            System.out.println("Não foi possivel desconectar o Banco");
        }

    }

    public void executeSQL(String sql) {
        try {
            statement = Conexao.c.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            if (Banco.getBanco() == 0) {
                statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            }
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql," + sqlex + ",\nO sql passado foi " + sql);
        }

        try {
            this.metadata = this.resultset.getMetaData();
        } catch (SQLException erro) {
            System.out.println("Erro ao capturar o metadata \n" + erro);
        }
    }

    public boolean insertSQL(String sql) {
        try {
            ps = Conexao.c.prepareStatement(sql);
            return ps.execute();
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir \n" + sqlex + "\nO insert passado foi " + sql);
            return false;
        }

    }

    public boolean executeUpdate(String sql) {
        try {
            statement = Conexao.c.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int executeUpdate = statement.executeUpdate(sql);
            return true;

        } catch (SQLException sqlex) {


            if (Banco.getBanco() == 0)///TRATA ERROS DO BANCO ORACLE
            {
            }

            if (Banco.getBanco() == 1) {///TRATA ERROS DO BANCO POSTGRESS
                int erro = Integer.parseInt(sqlex.getSQLState());

                System.out.println(erro);

                if (erro == 23503) {
                    JOptionPane.showMessageDialog(null, "O Registro não pode ser Excluido. Possui outras dependencias! ");
                } else {

                    JOptionPane.showMessageDialog(null, "Não foi possível "
                            + "executar o comando sql," + sqlex + ", o sql passado foi " + sql + " Error Code:  " + sqlex.getErrorCode());
                }

            }

            return false;
        }
    }

    public static void main(String[] args) throws SQLException {


        Banco.setBanco(0);
        Banco.setBase(0);
        Conexao co = new Conexao();
        UltimaSequencia us = new UltimaSequencia("cd_uf", "cad_uf");
        co.insertSQL("insert into cad_uf(cd_uf,nm_uf,sg_uf,dt_transacao) values(" + us.ult + ",'MARINGA','PR','09/05/2013')");
        co.executeSQL("select * from cad_uf");

        while (co.resultset.next()) {

            System.out.println(co.resultset.getString(2));

        }

    }
}
