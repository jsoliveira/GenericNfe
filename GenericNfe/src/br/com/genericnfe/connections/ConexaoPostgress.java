package br.com.genericnfe.connections;

import java.sql.*;
import javax.swing.*;

public class ConexaoPostgress {

    public static Connection ConexaoPostgress;
    public static Statement statement;
    public static ResultSet resultset;
    public static ResultSetMetaData metaData;

    public ConexaoPostgress() {
        conecta();
    }

    public static Connection conecta() {
        if (ConexaoPostgress != null) {
            return ConexaoPostgress;
        } else {
            String url = "jdbc:postgresql://192.168.69.50:5432/postgres";
            String usuario = "postgres";
            // String senha = "acs1707$";
            String senha = "system";

            try {
                Class.forName("org.postgresql.Driver");
                ConexaoPostgress = DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conectado");
                return ConexaoPostgress;
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não localizado: ");
                ex.printStackTrace();
                return null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte de dados: ");
                ex.printStackTrace();
                return null;
            }
        }
    }

    public void desconecta() {
        boolean result = true;
        try {
            ConexaoPostgress.close();
            // JOptionPane.showMessageDialog(null, "banco fechado");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel "
                    + "fechar o banco de dados: " + fecha);
            result = false;
        }
    }

    public void executeSQL(String sql) {
        try {
            statement = ConexaoPostgress.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // System.out.println(sql);
            resultset = statement.executeQuery(sql);

        } catch (SQLException ex) {


            JOptionPane.showMessageDialog(null, "Não foi possível "
                    + "executar o comando sql," + ex + ", o sql passado foi " + sql);
        }
        try {
            metaData = resultset.getMetaData();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro ao pegar metadata  " + erro);
        }
    }

    public boolean executeUpdate(String sql) {
        try {
            statement = ConexaoPostgress.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int executeUpdate = statement.executeUpdate(sql);
            return true;

        } catch (SQLException sqlex) {

            int erro = Integer.parseInt(sqlex.getSQLState());
            
            System.out.println( erro);
            
            if (erro == 23503) {
                 JOptionPane.showMessageDialog(null, "O Registro não pode ser Excluido. Possui outras dependencias! ");
            } else {

                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql," + sqlex + ", o sql passado foi " + sql + " Error Code:  " + sqlex.getErrorCode());
            }
            return false;
        }
    }

    public static void main(String args[]) {
        ConexaoPostgress Obj1 = new ConexaoPostgress();
        Obj1.conecta();
    }
}