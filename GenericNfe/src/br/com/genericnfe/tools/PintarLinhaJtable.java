
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
import javax.swing.JOptionPane;
  
import javax.swing.JTable;   
import javax.swing.table.DefaultTableCellRenderer;   
import javax.swing.table.TableCellRenderer;
  
public class PintarLinhaJtable extends DefaultTableCellRenderer   
{   
  
    @Override   
    public Component getTableCellRendererComponent(   
        JTable table,   
        Object value,   
        boolean isSelected,   
        boolean hasFocus,   
        int row,   
        int column)   
    {   
        Component result = super.getTableCellRendererComponent(   
            table,   
            value,   
            isSelected,   
            hasFocus,   
            row,   
            column   
        );   
           
        
       if (row % 2 == 0){
        result.setFont(new Font("arial", Font.PLAIN, 12));   
            result.setForeground(Color.darkGray);   
            result.setBackground(Color.lightGray);   
        }else {   
            result.setFont(new Font("arial", Font.PLAIN, 12));   
            result.setForeground(Color.darkGray);   
            result.setBackground(Color.white);   
        }   
       if(isSelected) {   
        result.setFont(new Font("arial", Font.PLAIN, 12));   
            result.setForeground(Color.darkGray);   
            result.setBackground(Color.CYAN);   
        }   
       
       
        return result;   
    } 
    
    
  public static void main(String[] args) {   
        Object[] columns = new Object[] {"Num", "BR", "EN"};   
        JTable tbl = new JTable(   
            new Object[][] {   
                {5, "Cinco", "Five"},   
                {7, "Sete", "Seven"},   
                {2, "Dois", "Two"},   
                {0, "Zero", "Zero"},   
            },   
            columns   
        );   
        TableCellRenderer renderer = new PintarLinhaJtable();   
        for (int c = 0; c < tbl.getColumnCount() ; c++) {   
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
