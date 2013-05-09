package br.com.genericnfe.connections;

import br.com.genericnfe.model.Banco;
import br.com.genericnfe.tools.UltimaSequencia;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jsoliveira
 */
public class Conexao {

    private Connection c;
    private Statement statement;
    private PreparedStatement ps;
    public ResultSet resultset;
    public ResultSetMetaData metadata;
    private ConexaoOracle co;
    private ConexaoPostgress cp;

    public Conexao() {



        switch (Banco.BANCO.getBanco()) {

            case 0: { // 0- BANCO DE DADOS ORACLE
                co = new ConexaoOracle();
                this.c = co.conecta(Banco.BANCO.getBase());
                break;
            }

            case 1: { // 1- BANCO DE DADOS POSTGRESS
                cp = new ConexaoPostgress();
                this.c = cp.conecta(Banco.BANCO.getBase());
                break;
            }
        }
    }

    public void executeSQL(String sql) {
        try {
            statement = this.c.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            if (Banco.BANCO.getBanco() == 0) {
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
            ps = this.c.prepareStatement(sql);
            return ps.execute();
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir \n" + sqlex + "\nO insert passado foi " + sql);
            return false;
        }

    }

    public boolean executeUpdate(String sql) {
        try {
            statement = this.c.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int executeUpdate = statement.executeUpdate(sql);
            return true;

        } catch (SQLException sqlex) {


            if (Banco.BANCO.getBanco() == 0)///TRATA ERROS DO BANCO ORACLE
            {
            }

            if (Banco.BANCO.getBanco() == 1) {///TRATA ERROS DO BANCO POSTGRESS
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


        Banco.BANCO.setBanco(1);
        Banco.BANCO.setBase(0);
        Conexao c = new Conexao();
        UltimaSequencia us = new UltimaSequencia("cd_uf", "cad_uf");
        c.insertSQL("insert into cad_uf(cd_uf,nm_uf,sg_uf,dt_transacao) values(" + us.ult + ",'MARINGA','PR','09/05/2013')");
        c.executeSQL("select * from cad_uf");

        while (c.resultset.next()) {

            System.out.println(c.resultset.getString(2));

        }



    }
}
