package br.com.genericnfe.tools;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LimpaTabela {
    public void LimparTabela(JTable tabela) {
        DefaultTableModel TabelaLimpa = (DefaultTableModel) tabela.getModel();
        TabelaLimpa.setNumRows(0);
    }
}


