package br.com.genericnfe.tools;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;

/**
 *
 * @author acsantana
 */
public class ValidaEstadoBotoes {

    public void ValidaCamposIncluir(Container container, Container container1) {


        Component components[] = container.getComponents();

        for (Component component : components) {
            if (component instanceof JComboBox) {
                JComboBox field = (JComboBox) component;
                field.setEnabled(true);

            }

            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setEnabled(true);

            }

            if (component instanceof JDateChooser) {
                JDateChooser field = (JDateChooser) component;
                field.setEnabled(true);

            }
//
//            if (component instanceof JTable) {
//                JTable field = (JTable) component;
//                field.setEnabled(true);
//            }

            if (component instanceof JScrollPane) {
                JScrollPane js = (JScrollPane) component;
                Component scrollPane[] = js.getComponents();
                for (Component scroll : scrollPane) {
                    if (scroll instanceof JViewport) {
                        JViewport jv = (JViewport) scroll;
                        Component viewReport[] = jv.getComponents();
                        for (Component view : viewReport) {
                            if (view instanceof JTextArea) {
                                JTextArea field = (JTextArea) view;
                                field.setEnabled(true);
                            }
//
//                            if (view instanceof JTable) {
//                                JTable field = (JTable) view;
//                                field.setEnabled(true);
//                            }


                        }
                    }
                }
            }

            if (component instanceof JTextArea) {
                JTextArea field = (JTextArea) component;
                // if (field.isEditable()) {
                field.setEnabled(true);
                //}
                //field.enable(true);

            }

            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                if (field.isEditable()) {
                    field.setEnabled(true);
                }
            }

            if (component instanceof JButton) {
                JButton field = (JButton) component;

                if ((field.getToolTipText() == null)) {
                    field.setEnabled(true);
                }
            }

            if (component instanceof JRadioButton) {
                JRadioButton field = (JRadioButton) component;
                field.setEnabled(true);
            }

            if (component instanceof JTextArea) {
                JTextArea field = (JTextArea) component;
                field.setEnabled(true);
            }

            if (component instanceof JMonthChooser) {
                JMonthChooser field = (JMonthChooser) component;
                field.setEnabled(true);
            }

            if (component instanceof JYearChooser) {
                JYearChooser field = (JYearChooser) component;
                field.setEnabled(true);
            }

            if (component instanceof JCheckBox) {
                JCheckBox field = (JCheckBox) component;
                field.setEnabled(true);
            }

        }

// testa painel de botoes        
        Component components1[] = container1.getComponents();
        for (Component component1 : components1) {

            if (component1 instanceof JButton) {
                JButton field = (JButton) component1;
                String nome = field.getText();
                if ("Incluir".equals(nome) | "Alterar".equals(nome) | "Excluir".equals(nome)) {
                    field.setEnabled(false);
                } else {
                    field.setEnabled(true);
                }
            }
        }
    }

    public void ValidaCamposCancelar(Container container, Container container1) {

        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JComboBox) {
                JComboBox field = (JComboBox) component;
                field.setEnabled(false);
                //field.setEditable(false);
            }

            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                if (field.isEditable()) {
                    field.setEnabled(false);

                }
            }


            if (component instanceof JDateChooser) {
                JDateChooser field = (JDateChooser) component;
                field.setEnabled(false);
            }

            if (component instanceof JTable) {
                JTable field = (JTable) component;
                field.setEnabled(false);

            }

            if (component instanceof JTextArea) {
                JTextArea field = (JTextArea) component;
                field.setEnabled(false);// --- não valida ass. ferty.
                //field.enable(false);

            }

            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                if (field.isEditable()) {
                    field.setEnabled(false);
                }
            }
            if (component instanceof JButton) {
                JButton field = (JButton) component;

                if ((field.getToolTipText() == null)) {
                    field.setEnabled(false);
                }
            }

            if (component instanceof JRadioButton) {
                JRadioButton field = (JRadioButton) component;
                field.setEnabled(false);
            }

            if (component instanceof JScrollPane) {
                JScrollPane js = (JScrollPane) component;
                Component scrollPane[] = js.getComponents();
                for (Component scroll : scrollPane) {
                    if (scroll instanceof JViewport) {
                        JViewport jv = (JViewport) scroll;
                        Component viewReport[] = jv.getComponents();
                        for (Component view : viewReport) {
                            if (view instanceof JTextArea) {
                                JTextArea field = (JTextArea) view;
                                field.setEnabled(false);
                            }

//                            if (view instanceof JTable) {
//                                JTable field = (JTable) view;
//                                field.setEnabled(false);
//                            }
                        }
                    }
                }
            }

            if (component instanceof JMonthChooser) {
                JMonthChooser field = (JMonthChooser) component;
                field.setEnabled(false);
            }

            if (component instanceof JYearChooser) {
                JYearChooser field = (JYearChooser) component;
                field.setEnabled(false);
            }


            if (component instanceof JCheckBox) {
                JCheckBox field = (JCheckBox) component;
                field.setEnabled(false);
            }


        }

        // testa painel de botoes       
        Component components1[] = container1.getComponents();
        for (Component component1 : components1) {


            if (component1 instanceof JButton) {
                JButton field = (JButton) component1;

                String nome = field.getText();
                if ("Incluir".equals(nome) | "Alterar".equals(nome) | "Excluir".equals(nome)| "Imprimir".equals(nome) | "Replicar".equals(nome)) {
                    field.setEnabled(true);
                } else {
                    field.setEnabled(false);

                }
            }

        }
    }

    public void ValidaCamposCancelarNivel(Container container, Container container1, String tela) {

        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JComboBox) {
                JComboBox field = (JComboBox) component;
                field.setEnabled(false);

            }

            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                if (field.isEditable()) {
                    field.setEnabled(false);

                }
            }


            if (component instanceof JDateChooser) {
                JDateChooser field = (JDateChooser) component;
                field.setEnabled(false);
            }

            if (component instanceof JTable) {
                JTable field = (JTable) component;
                field.setEnabled(false);

            }

            if (component instanceof JTextArea) {
                JTextArea field = (JTextArea) component;
                field.setEnabled(false);// --- não valida ass. ferty.
                //field.enable(false);

            }

            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                if (field.isEditable()) {
                    field.setEnabled(false);
                }
            }
            if (component instanceof JButton) {
                JButton field = (JButton) component;
                if ((field.getToolTipText() == null)) {
                    field.setEnabled(false);
                }
            }

            if (component instanceof JRadioButton) {
                JRadioButton field = (JRadioButton) component;
                field.setEnabled(false);
            }

            if (component instanceof JTextArea) {
                JTextArea field = (JTextArea) component;
                field.setEnabled(false);
            }

            if (component instanceof JMonthChooser) {
                JMonthChooser field = (JMonthChooser) component;
                field.setEnabled(false);
            }

            if (component instanceof JYearChooser) {
                JYearChooser field = (JYearChooser) component;
                field.setEnabled(false);
            }


        }


        Component components1[] = container1.getComponents();
        for (Component component1 : components1) {


            if (component1 instanceof JButton) {
                JButton field = (JButton) component1;
                String nome = field.getText();
//
//                valida_nivel vn = new valida_nivel(tela);
//                String incluir = vn.p_inclusao;
//                String excluir = vn.p_exclusao;
//                String alterar = vn.p_alteracao;
//
//
//                if ("Incluir".equals(nome) | "Alterar".equals(nome) | "Excluir".equals(nome)) {
//                    field.setEnabled(true);
//                } else {
//                    field.setEnabled(false);
//                }
//
//                if (incluir.equals("S") && "Incluir".equals(nome)) {
//                    field.setEnabled(true);
//                }
//                if (incluir.equals("N") && "Incluir".equals(nome)) {
//                    field.setEnabled(false);
//                }
//
//
//
//                if (alterar.equals("S") && "Alterar".equals(nome)) {
//                    field.setEnabled(true);
//                }
//                if (alterar.equals("N") && "Alterar".equals(nome)) {
//                    field.setEnabled(false);
//                }
//
//
//
//                if (excluir.equals("S") && "Excluir".equals(nome)) {
//                    field.setEnabled(true);
//                }
//                if (excluir.equals("N") && "Excluir".equals(nome)) {
//                    field.setEnabled(false);
//                }

            }
        }
    }

    public void ValidaCamposIncluirNivel(Container container, Container container1, String tela) {


        Component components[] = container.getComponents();

        for (Component component : components) {
            if (component instanceof JComboBox) {
                JComboBox field = (JComboBox) component;
                field.setEnabled(true);

            }

            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setEnabled(true);

            }

            if (component instanceof JDateChooser) {
                JDateChooser field = (JDateChooser) component;
                field.setEnabled(true);

            }

            if (component instanceof JTable) {
                JTable field = (JTable) component;
                field.setEnabled(true);

            }

            if (component instanceof JTextArea) {
                JTextArea field = (JTextArea) component;
                if (field.isEditable()) {
                    field.setEnabled(true);
                }
                //field.enable(true);

            }

            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                if (field.isEditable()) {
                    field.setEnabled(true);
                }
            }

            if (component instanceof JButton) {
                JButton field = (JButton) component;
                if ((field.getToolTipText() == null)) {
                    field.setEnabled(true);
                }
            }

            if (component instanceof JRadioButton) {
                JRadioButton field = (JRadioButton) component;
                field.setEnabled(true);
            }

            if (component instanceof JTextArea) {
                JTextArea field = (JTextArea) component;
                field.setEnabled(true);
            }

            if (component instanceof JMonthChooser) {
                JMonthChooser field = (JMonthChooser) component;
                field.setEnabled(true);
            }

            if (component instanceof JYearChooser) {
                JYearChooser field = (JYearChooser) component;
                field.setEnabled(true);
            }
        }

////        valida_nivel vn = new valida_nivel(tela);
//        String incluir = vn.p_inclusao;
//        String excluir = vn.p_exclusao;
//        String alterar = vn.p_alteracao;

        Component components1[] = container1.getComponents();
        for (Component component1 : components1) {

            if (component1 instanceof JButton) {
                JButton field = (JButton) component1;
                String nome = field.getText();

                if ("Incluir".equals(nome) | "Alterar".equals(nome) | "Excluir".equals(nome)) {
                    field.setEnabled(false);
                } else {
                    field.setEnabled(true);
                }
            }
        }
    }
}
