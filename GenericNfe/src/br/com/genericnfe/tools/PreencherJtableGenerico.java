package br.com.genericnfe.tools;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acsantana
 */
public class PreencherJtableGenerico {

    // Parametros : tabela = jtable a ser preenchida
    //              campos = campos do select a ser preenchidos nas colunas da jtabled
    //              result    = o resultset para listar
    //              tipos  = tipos de dados , informar os tamanhos das colunas da jtabled
    public String servicos;

    public void FormatarJtable(JTable tabela, int valores[]) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        if (modelo.getColumnCount() == valores.length) {
            for (int x = 0; x < valores.length; x++) {
                tabela.getColumnModel().getColumn(x).setPreferredWidth(valores[x]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor verificar os parametros passados !");
        }
    }

    public void PreencherJtableGenerico(JTable tabela, String campos[], ResultSet resultset) {


        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        servicos = "";
        try {
            while (resultset.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    row[i] = resultset.getString(campos[i]);
                    servicos = (String) row[i];
                }
                modelo.addRow(row);
            }
            PintarLinhaJtable renderer = new PintarLinhaJtable();  //-------- Pinta linhas
            for (int c = 0; c < tabela.getColumnCount(); c++) {
                tabela.setDefaultRenderer(tabela.getColumnClass(c), renderer);
            }

            if (tabela.getRowCount() <= 0) {
              
                JOptionPane.showMessageDialog(null, "A pesquisa não retornou nenhum registro");
                return;
            
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    public void PreencherJtableTipos(JTable tabela, int tipos[]) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        int conta = tipos.length;
        for (int x = 0; x < conta; x++) {
            tabela.getColumnModel().getColumn(x).setPreferredWidth(tipos[x]);
        }
    }

//---------- Preenche Jtable que tenha campo de selecao
    public void PreencherJtableGenericoSel(JTable tabela, String campos[], ResultSet resultset) {
   DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        servicos = "";
        try {
            while (resultset.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    if (i == 0) {
                        row[i] = (false);
                    } else {
                        row[i] = resultset.getString(campos[i]);
                        servicos = (String) row[i];
                    }
                }
                modelo.addRow(row);
            }
            PintarLinhaJtable renderer = new PintarLinhaJtable();//-------- Pinta linhas
            for (int c = 2; c < tabela.getColumnCount(); c++) {
                tabela.setDefaultRenderer(tabela.getColumnClass(c), renderer);
            }
                       
              if (tabela.getRowCount() <= 0) {
              
                JOptionPane.showMessageDialog(null, "A pesquisa não retornou nenhum registro");
                return;
            
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    ///preenche jtable sem limpar ela com campo de seleção
    public void PreencherJtableGenericoSelSemLimpar(JTable tabela, String campos[], ResultSet resultset ) {

         DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        ///   modelo.setNumRows(0); desabilita limpar dados

        servicos = "";
        try {
            while (resultset.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    if (i == 0) {
                        row[i] = (false);
                    } else {
                        row[i] = resultset.getString(campos[i]);
                        servicos = (String) row[i];
                    }
                }
                modelo.addRow(row);
            }
            PintarLinhaJtable renderer = new PintarLinhaJtable();//-------- Pinta linhas
            for (int c = 2; c < tabela.getColumnCount(); c++) {
                tabela.setDefaultRenderer(tabela.getColumnClass(c), renderer);
            }
               if (tabela.getRowCount() <= 0) {
              
                JOptionPane.showMessageDialog(null, "A pesquisa não retornou nenhum registro");
                return;
            
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    public void PreencherJtableGenericoSemLimpar(JTable tabela, String campos[],ResultSet resultset) {

 
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        ///   modelo.setNumRows(0); desabilita limpar dados

        servicos = "";
        try {
            while (resultset.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    row[i] = resultset.getString(campos[i]);
                    servicos = (String) row[i];
                }
                modelo.addRow(row);
            }

            PintarLinhaJtable renderer = new PintarLinhaJtable();//-------- Pinta linhas
            for (int c = 2; c < tabela.getColumnCount(); c++) {
                tabela.setDefaultRenderer(tabela.getColumnClass(c), renderer);
            }
            
               if (tabela.getRowCount() <= 0) {
              
                JOptionPane.showMessageDialog(null, "A pesquisa não retornou nenhum registro");
                return;
            
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    public void PreencherJtableGenericoSemRetorno(JTable tabela, String campos[], ResultSet resultset) {

      
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        servicos = "";
        try {
            while (resultset.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    row[i] = resultset.getString(campos[i]);
                    servicos = (String) row[i];
                }
                modelo.addRow(row);
            }
            PintarLinhaJtable renderer = new PintarLinhaJtable(); //------- Pinta linhas
            for (int c = 0; c < tabela.getColumnCount(); c++) {
                tabela.setDefaultRenderer(tabela.getColumnClass(c), renderer);
            }
            
               if (tabela.getRowCount() <= 0) {
              
                JOptionPane.showMessageDialog(null, "A pesquisa não retornou nenhum registro");
                return;
            
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    public void PreencherJtableGenericoSelSemRetorno(JTable tabela, String campos[], ResultSet resultset) {

      
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        servicos = "";
        try {
            while (resultset.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    if (i == 0) {
                        row[i] = (false);
                    } else {
                        row[i] = resultset.getString(campos[i]);
                        servicos = (String) row[i];
                    }
                }
                modelo.addRow(row);
            }
            PintarLinhaJtable renderer = new PintarLinhaJtable();//-------- Pinta linhas
            for (int c = 2; c < tabela.getColumnCount(); c++) {
                tabela.setDefaultRenderer(tabela.getColumnClass(c), renderer);
            }
            
               if (tabela.getRowCount() <= 0) {
              
                JOptionPane.showMessageDialog(null, "A pesquisa não retornou nenhum registro");
                return;
            
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    public void limparJtabe(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setNumRows(0);

    }
}
