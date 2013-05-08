package br.com.genericnfe.tools;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.TelaPrincipal;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UltimaSequencia extends TelaPrincipal {

    int banco = 0;
    int base = 0;
    Conexao c;
    ImplodeArray implodeArray = new ImplodeArray();
    public String ult;

    public UltimaSequencia(String campo, String tabela) {

        c = new Conexao(banco, base);
        
        try {
            c.executeSQL("SELECT COALESCE(MAX(" + campo + "),0) + 1 AS ULTIMO FROM " + tabela);
            c.resultset.first();
            ult = c.resultset.getString("ULTIMO");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public UltimaSequencia(String campo, String tabela, String[] condicoes) {

        c = new Conexao(banco, base);
        // c.conecta(TelaPrincipal.banco);

        try {
            c.executeSQL("SELECT COALESCE(MAX(" + campo + "),0) + 1 AS ULTIMO FROM " + tabela + " WHERE " + implodeArray.implodeArray(condicoes, " AND "));
            c.resultset.first();
            ult = c.resultset.getString("ULTIMO");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public UltimaSequencia(String campo1, String campo2, String tabela, String valor) {

        c = new Conexao(banco, base);
        //   c.conecta(TelaPrincipal.banco);

        try {
            c.executeSQL("SELECT COALESCE(MAX(" + campo1 + "),0) + 1 AS ULTIMO FROM " + tabela + " where "
                    + campo2 + " = " + valor);
            c.resultset.first();
            ult = c.resultset.getString("ULTIMO");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public UltimaSequencia(String campo1, String campo2, String campo3, String tabela, String valor2, String valor3) {

        c = new Conexao(banco, base);
        //   c.conecta(TelaPrincipal.banco);

        try {
            c.executeSQL("SELECT COALESCE(MAX(" + campo1 + "),0) + 1 AS ULTIMO FROM " + tabela + " where "
                    + campo2 + " = " + valor2 + " and " + campo3 + " = " + valor3);
            c.resultset.first();
            ult = c.resultset.getString("ULTIMO");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public UltimaSequencia(String campo1, String campo2, String campo3, String campo4, String tabela, String valor2, String valor3, String valor4) {

        c = new Conexao(banco, base);
        //    c.conecta(TelaPrincipal.banco);

        try {
            c.executeSQL("SELECT COALESCE(MAX(" + campo1 + "),0) + 1 AS ULTIMO FROM " + tabela + " where "
                    + campo2 + " = " + valor2 + " and " + campo3 + " = " + valor3 + " AND " + campo4 + " = " + valor4);
            c.resultset.first();
            ult = c.resultset.getString("ULTIMO");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public UltimaSequencia(String campo1, String campo2, String campo3, String campo4, String campo5, String tabela, String valor2, String valor3, String valor4, String valor5) {

        c = new Conexao(banco, base);
        ///    c.conecta(TelaPrincipal.banco);

        try {
            c.executeSQL("SELECT COALESCE(MAX(" + campo1 + "),0) + 1 AS ULTIMO FROM " + tabela + " where "
                    + campo2 + " = " + valor2 + " and " + campo3 + " = " + valor3 + " AND " + campo4 + " = " + valor4 + " AND " + campo5 + " = " + valor5);
            c.resultset.first();
            ult = c.resultset.getString("ULTIMO");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public static void main(String[] args) {
        UltimaSequencia us = new UltimaSequencia("cd_maquina", "cad_maquina");
        System.out.println(us.ult);
    }
}
