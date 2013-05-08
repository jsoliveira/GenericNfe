
package br.com.genericnfe.connections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;

public class ConexaoOracle {

    final private String driver = "oracle.jdbc.driver.OracleDriver";
    final private String url = "jdbc:oracle:thin:@192.168.69.12:1521:PROD";
    final private String usuario = "desenvagricola";
    final private String senha = "desenvagricola";
    final private String usuarioprod = "prodagricola";
    final private String senhaprod = "prodagricola";
    private Connection ConexaoOracle;
    public Statement statement;
    public ResultSet resultset;
    public PreparedStatement preparedStatement;
    //---- Definicao de Metadatas
    public ResultSetMetaData metaData;
    public DatabaseMetaData databaseMetaData;
    public int numCols;
    public String colsName;
    private InputStream inputStream;
    public int retorno = 0; // 0 = sem erro de retorno, 1 = violou chave primaria
    int conta = 0;

    public boolean conecta(int banco) {
        boolean result = true;
        try {
            Class.forName(driver);
            if (banco == 0) {
                ConexaoOracle = DriverManager.getConnection(url, usuario, senha);
            } else {
                ConexaoOracle = DriverManager.getConnection(url, usuarioprod, senhaprod);
            }

            databaseMetaData = ConexaoOracle.getMetaData();
            // JOptionPane.showMessageDialog(null,"conectou");
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão "
                    + "com a fonte de dados: " + Fonte);
            result = false;
        }
        return result;
    }

    public void desconecta() {
        boolean result = true;
        try {
            ConexaoOracle.close();
            // JOptionPane.showMessageDialog(null, "banco fechado");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel "
                    + "fechar o banco de dados: " + fecha);
            result = false;
        }
    }

    public void executeSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            retorno = 0;
            resultset = statement.executeQuery(sql);

        } catch (SQLException sqlex) {
            String str1 = (sqlex.toString());
            String procurada = "ORA-00001";
            int x = str1.indexOf(procurada);
            //JOptionPane.showMessageDialog(null, sqlex);
            if (x != -1) {
                JOptionPane.showMessageDialog(null, "Registro já cadastrado \n" + sqlex);
                retorno = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql," + sqlex + ", o sql passado foi " + sql);
                retorno = 1;
            }

        }
        try {
            metaData = resultset.getMetaData();
        } catch (SQLException erro) {
            //  JOptionPane.showMessageDialog(null, erro);
        }
    }

    public void AtualizarSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            retorno = 0;
            retorno = statement.executeUpdate(sql);

            if (retorno == 1) {
                // JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
            }
        } catch (SQLException sqlex) {

            JOptionPane.showMessageDialog(null, "Não foi possível "
                    + "executar o comando sql de exclusão," + sqlex + ", o sql passado foi " + sql);
        }
        retorno = 0;
    }

    public void deleteSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            retorno = 0;
            retorno = statement.executeUpdate(sql);

            if (retorno == 1) {
                // JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
            }
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 2292) { //
                JOptionPane.showMessageDialog(null, "O registro não pôde ser "
                        + "excluído porque ele está sendo utilizado em outro cadastro/movimento");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql de exclusão," + sqlex + ", o sql passado foi " + sql);
            }

            retorno = 0;
        }

    }

    public void executeupdate(String sql, File arquivo, String ext) throws FileNotFoundException {
        if (!ext.equals("")) {
            try {
                FileInputStream inputStream = new FileInputStream(arquivo);
                PreparedStatement ps = ConexaoOracle.prepareStatement(sql);

                ps.setBinaryStream(1, inputStream, (int) arquivo.length());
                ps.setString(2, ext);

                ps.executeUpdate();

            } catch (SQLException sqlex) {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql," + sqlex + ", o sql passado foi " + sql);
            }
        } else {
            try {
                FileInputStream inputStream = new FileInputStream(arquivo);
                PreparedStatement ps = ConexaoOracle.prepareStatement(sql);

                ps.setBinaryStream(1, inputStream, (int) arquivo.length());
                ps.setString(2, ext);

                ps.executeUpdate();

            } catch (SQLException sqlex) {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql," + sqlex + ", o sql passado foi " + sql);
            }
        }
    }

    public String[] retornarPK(int banco, String tabela) {
        ResultSet primaryKey;
        String[] array = null;

        try {
            if (banco == 0) {
                primaryKey = databaseMetaData.getPrimaryKeys("PROD", usuario.toUpperCase(), tabela);
            } else {
                primaryKey = databaseMetaData.getPrimaryKeys("PROD", usuarioprod.toUpperCase(), tabela);
            }

            int cont = 0;

            while (primaryKey.next()) {
                cont++;
            }

            array = new String[cont];
            cont = 0;

            if (banco == 0) {
                primaryKey = databaseMetaData.getPrimaryKeys("PROD", usuario.toUpperCase(), tabela);
            } else {
                primaryKey = databaseMetaData.getPrimaryKeys("PROD", usuarioprod.toUpperCase(), tabela);
            }

            while (primaryKey.next()) {
                //JOptionPane.showMessageDialog(null, primaryKey.getString(4));
                array[cont] = primaryKey.getString(4);
                cont++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar PK: " + e);
        }

        return array;
    }

    public String[] retornarImportedKeys(int banco, String tabela) {
        ResultSet importedKey;
        String[] array = null;

        try {
            if (banco == 0) {
                importedKey = databaseMetaData.getImportedKeys("PROD", usuario.toUpperCase(), tabela);
            } else {
                importedKey = databaseMetaData.getImportedKeys("PROD", usuarioprod.toUpperCase(), tabela);
            }

            int cont = 0;

            while (importedKey.next()) {
                cont++;
            }

            array = new String[cont];
            cont = 0;

            if (banco == 0) {
                importedKey = databaseMetaData.getImportedKeys("PROD", usuario.toUpperCase(), tabela);
            } else {
                importedKey = databaseMetaData.getImportedKeys("PROD", usuarioprod.toUpperCase(), tabela);
            }

            while (importedKey.next()) {
                //JOptionPane.showMessageDialog(null, importedKey.getString(8));
                array[cont] = importedKey.getString(8);
                cont++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar FK(s) da PK: " + e);
        }

        return array;
    }
    
    
    public void incluirSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 00001) {
                JOptionPane.showMessageDialog(null, "O registro não pôde ser "
                        + "incluido pois já está cadastrado ");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql ," + sqlex
                        + ", o sql passado foi " + sql);
            }
            retorno = 0;
        }
    }
}
