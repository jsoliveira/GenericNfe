package br.com.genericnfe.connections;

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
    public ResultSet resultset;
    public ResultSetMetaData metadata;
    private ConexaoOracle co;
    private ConexaoPostgress cp;

    public Conexao(int banco, int base) {

        switch (banco) {


            case 0: { // 0- BANCO DE DADOS ORACLE
                co = new ConexaoOracle();
                this.c = co.conecta(base);
                break;
            }


            case 1: { // 1- BANCO DE DADOS POSTGRESSQL
                cp = new ConexaoPostgress();
                this.c = cp.conecta();
                break;
            }

        }


    }

    public void executeSQL(String sql) {
        try {
            statement = this.c.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //    statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");

            resultset = statement.executeQuery(sql);

        } catch (SQLException sqlex) {
            String str1 = (sqlex.toString());

            JOptionPane.showMessageDialog(null, "Não foi possível "
                    + "executar o comando sql," + sqlex + ", o sql passado foi " + sql);

        }

        try {
            this.metadata = this.resultset.getMetaData();
        } catch (SQLException erro) {
            //  JOptionPane.showMessageDialog(null, erro);
        }
    }

    public void insertSQL(String sql) {
        try {
            statement = this.c.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);

        } catch (SQLException sqlex) {
            String str1 = (sqlex.toString());

            JOptionPane.showMessageDialog(null, "Não foi possível "
                    + "executar o comando sql," + sqlex + ", o sql passado foi " + sql);
        }

    }

    //
//    public void AtualizarSQL(String sql) {
//        try {
//            statement = ConexaoOracle.createStatement(
//                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            retorno = 0;
//            retorno = statement.executeUpdate(sql);
//
//            if (retorno == 1) {
//                // JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
//            }
//        } catch (SQLException sqlex) {
//
//            JOptionPane.showMessageDialog(null, "Não foi possível "
//                    + "executar o comando sql de exclusão," + sqlex + ", o sql passado foi " + sql);
//        }
//        retorno = 0;
//    }
    public static void main(String[] args) throws SQLException {


        Conexao c = new Conexao(0, 0);
        UltimaSequencia us = new UltimaSequencia("cd_uf", "cad_uf");

        c.insertSQL("insert into cad_uf values(" + us.ult + ",'PARNA','PR',SYSDATE)");
        c.executeSQL("select * from cad_uf");

        while (c.resultset.next()) {

            System.out.println(c.resultset.getString(2));

        }



    }
}
