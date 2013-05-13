package br.com.genericnfe.tools;

/**
 *
 * @FERTY --- 27/09/2011 ---//
 *
 */
import java.awt.Component;
import java.awt.Container;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class UpperCase extends DocumentFilter {

    public void insertString(DocumentFilter.FilterBypass fb, int offset,
            String text, AttributeSet attr) throws BadLocationException {
        fb.insertString(offset, text.toUpperCase(), attr);
    }

    public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
            String text, AttributeSet attr) throws BadLocationException {
        fb.replace(offset, length, text.toUpperCase(), attr);
    }

    public void upperArea(JTextArea campo) {
        DocumentFilter dfilter = new UpperCase();
        ((AbstractDocument) campo.getDocument()).setDocumentFilter(dfilter);
    }

    public void upperJtextFiel(JTextField campo) {
       DocumentFilter dfilter = new UpperCase();
        ((AbstractDocument) campo.getDocument()).setDocumentFilter(dfilter); //---- SETA O FILTRO NO FIELD

    }

    public void UpperContainer(Container container) {
        DocumentFilter dfilter = new UpperCase(); //---- CRIA NOVO OBJETO DE FILTRO
        Component components[] = container.getComponents(); //---- RECEBE OS COMPONENTES DO CONTAINER
        for (Component component : components) { //--- PERCORRE O ARRAY
            if (component instanceof JPanel) { //---- SE FOR JPANEL ENTRA NO LAÇO
                JPanel jp = (JPanel) component; //--- CRIA UM NOVO OBJETO JPANEL
                Component jpanel[] = jp.getComponents(); //---- RECEBE OS COMPONENTES DO JPANEL
                for (Component panel : jpanel) { //--- PERCORRE O ARRAY DE PANEL
                    if (panel instanceof JTextField) { //---- SE FOR JTEXTFIELD OU TEXTAREA ENTRA NA CONDICAO
                        JTextField field = (JTextField) panel; //---- CRIA UM OBJETO FIELD / TEXT AREA
                        ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter); //---- SETA O FILTRO NO FIELD
                    }
                    if (panel instanceof JFormattedTextField) {
                        JFormattedTextField field = (JFormattedTextField) panel;
                        ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter);
                    }
                    if (panel instanceof JTextArea) {
                        JTextArea field = (JTextArea) panel;
                        ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter);
                    }
                    if (panel instanceof JScrollPane) {
                        JScrollPane js = (JScrollPane) panel;
                        Component scrollPane[] = js.getComponents();
                        for (Component scroll : scrollPane) {
                            if (scroll instanceof JViewport) {
                                JViewport jv = (JViewport) scroll;
                                Component viewReport[] = jv.getComponents();
                                for (Component view : viewReport) {
                                    if (view instanceof JTextArea) {
                                        JTextArea field = (JTextArea) view;
                                        ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter);
                                    }
                                }
                            }
                        }
                    }
                    if (panel instanceof JTabbedPane) {
                        JTabbedPane tb = (JTabbedPane) panel;
                        Component tbs[] = tb.getComponents();
                        for (Component tabbed : tbs) {
                            if (tabbed instanceof JPanel) {
                                JPanel jpTabbed = (JPanel) tabbed;
                                Component jpTb[] = jpTabbed.getComponents();
                                for (Component panelTb : jpTb) { //--- PERCORRE O ARRAY DE PANEL
                                    if (panelTb instanceof JTextField) { //---- SE FOR JTEXTFIELD OU TEXTAREA ENTRA NA CONDICAO
                                        JTextField field = (JTextField) panelTb; //---- CRIA UM OBJETO FIELD / TEXT AREA
                                        ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter); //---- SETA O FILTRO NO FIELD
                                    }
                                    if (panelTb instanceof JFormattedTextField) {
                                        JFormattedTextField field = (JFormattedTextField) panelTb;
                                        ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter);
                                    }
                                    if (panelTb instanceof JTextArea) {
                                        JTextArea field = (JTextArea) panelTb;
                                        ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter);
                                    }
                                    if (panelTb instanceof JScrollPane) {
                                        JScrollPane jsTb = (JScrollPane) panelTb;
                                        Component scrollPaneTb[] = jsTb.getComponents();
                                        for (Component scrollTb : scrollPaneTb) {
                                            if (scrollTb instanceof JViewport) {
                                                JViewport jvTb = (JViewport) scrollTb;
                                                Component viewReport[] = jvTb.getComponents();
                                                for (Component viewTb : viewReport) {
                                                    if (viewTb instanceof JTextArea) {
                                                        JTextArea fieldTb = (JTextArea) viewTb;
                                                        ((AbstractDocument) fieldTb.getDocument()).setDocumentFilter(dfilter);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //---- TESTA SE FOR TEXT FIELD OU TEXT AREA ----//
        for (Component component : components) {
            if (component instanceof JTextField || component instanceof JTextArea) {
                JTextField field = (JTextField) component;
                ((AbstractDocument) field.getDocument()).setDocumentFilter(dfilter);
            }
        }
    }
}
