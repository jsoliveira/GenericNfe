package br.com.genericnfe.tools;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;

public class LimparCampos {

    public static void LimparCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setValue(null);
                field.setText("");
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            } else if (component instanceof JScrollPane) {
                JScrollPane js = (JScrollPane) component;
                Component scrollPane[] = js.getComponents();
                for (Component scroll : scrollPane) {
                    if (scroll instanceof JViewport) {
                        JViewport jv = (JViewport) scroll;
                        Component viewReport[] = jv.getComponents();
                        for (Component view : viewReport) {
                            if (view instanceof JTextArea) {
                                JTextArea field = (JTextArea) view;
                                field.setText("");
                            }
                        }
                    }
                }
            }else if (component instanceof JDateChooser) {
                JDateChooser data = (JDateChooser) component;
                data.setDate(null);
            } else if (component instanceof JComboBox) {
                JComboBox combo = (JComboBox) component;
                String conteudo = (String) combo.getModel().getSelectedItem().toString();
                if ((conteudo == null) || (combo.TOOL_TIP_TEXT_KEY.equals("A"))) {
                    combo.removeAllItems();
                }
            }
        }
    }
}
