package br.com.genericnfe.tools;

/**
 *
 * @author acsantana
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class PintarLinhaCalculada extends DefaultTableCellRenderer {

    int colunacinco = 0, colunaseis = 0, colunanove = 0;;
    int linhaatual = 0, linhaanterior = 0;
    String colunazero;
    
    @Override
    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        Component result = super.getTableCellRendererComponent(
                table,
                value,
                isSelected,
                hasFocus,
                row,
                column);

        linhaatual = row;



        if (column == 0) {
            colunazero = (value.toString());
        }
//
//        if (column == 6) {
//            colunaseis = Integer.parseInt(value.toString());
//        //    linhaanterior = linhaatual;
//        }
//
//        if (column == 9) {
//            colunanove = Integer.parseInt(value.toString());
//            linhaanterior = linhaatual;
//        }        
        
        if (row % 2 == 0) {
            result.setFont(new Font("arial", Font.PLAIN, 12));
            result.setForeground(Color.darkGray);
            result.setBackground(Color.lightGray);
        } else {
            result.setFont(new Font("arial", Font.PLAIN, 12));
            result.setForeground(Color.darkGray);
            result.setBackground(Color.white);
        }

        if (colunazero.equals("Mecanica")) {
            result.setFont(new Font("arial", Font.PLAIN, 12));
            result.setForeground(Color.darkGray);
            result.setBackground(Color.red);
        }

        if (isSelected) {
            result.setFont(new Font("arial", Font.PLAIN, 12));
            result.setForeground(Color.darkGray);
            result.setBackground(Color.CYAN);
        }

        return result;
    }

    public static void main(String[] args) {
        Object[] columns = new Object[]{"Num", "BR", "EN"};
        JTable tbl = new JTable(
                new Object[][]{
                    {5, "Cinco", 1},
                    {3, "Sete", 3},
                    {2, "Dois", 2},
                    {1, "Zero", 5},},
                columns);
        TableCellRenderer renderer = new PintarLinhaCalculada();
        for (int c = 0; c < tbl.getColumnCount(); c++) {
            tbl.setDefaultRenderer(tbl.getColumnClass(c), renderer);
        }

        JFrame dlg = new JFrame("Teste");
        Container c = dlg.getContentPane();
        c.add(tbl, BorderLayout.CENTER);
        dlg.setSize(300, 300);
        dlg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dlg.setVisible(true);
    }
}
