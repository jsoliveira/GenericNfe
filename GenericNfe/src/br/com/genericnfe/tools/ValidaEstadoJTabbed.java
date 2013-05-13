package br.com.genericnfe.tools;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JViewport;

public class ValidaEstadoJTabbed {

    public String valida;

    public void ValidaEstadoJTabbed(JTabbedPane Tabed, JButton botao) {
        if (Tabed.getSelectedIndex() > 0) {
            if (botao.isEnabled() == false) {
                JOptionPane.showMessageDialog(null, "Existe um registro ativo na aba de cadastro !");
                Tabed.setSelectedIndex(0);
            }
        }
    }

    public void ValidaEstadoJTabbed(JTabbedPane Tabbed, JButton botao, int indexConsulta) {
        if (Tabbed.getSelectedIndex() > 0) {
            if (!botao.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Existe um registro ativo na aba de cadastro !");
                Tabbed.setSelectedIndex(0);
            }
        }
        
        // limpa consulta
        if (Tabbed.getSelectedIndex() == indexConsulta) {
            Container container = (Container) Tabbed.getComponentAt(indexConsulta);            
            LimparCampos.LimparCampos(container);            
            
            LimpaTabela limpaTabela = new LimpaTabela();
            
            java.awt.Component[] components = container.getComponents();
            
            for (java.awt.Component componente : components) {
                
                if (componente instanceof JScrollPane) {                    
                    JScrollPane jScrollPane = (JScrollPane) componente;                    
                    java.awt.Component[] componentesDoJScroll = jScrollPane.getComponents();
                    
                    for (java.awt.Component componenteDoJScroll : componentesDoJScroll) {
                        if (componenteDoJScroll instanceof JViewport) {
                            
                            JViewport jViewport = (JViewport) componenteDoJScroll;
                            
                            java.awt.Component[] componentesDoJViewport = jViewport.getComponents();
                            
                            for (java.awt.Component componenteDoJViewport : componentesDoJViewport) {
                                if (componenteDoJViewport instanceof JTable) {
                                    JTable jTable = (JTable) componenteDoJViewport;
                                    limpaTabela.LimparTabela(jTable);                                    
                                }
                            }                            
                        }
                    }                    
                }
            }
        }
    }

    public void ValidaEstadoJTabbedMvtos(JTabbedPane Tabed, JButton botao) {
        //---- AUTOR FERTY             ----//
        //---- 19/09/2011              ----//
        //---- USO > MOV_MANEJO_TESTE  ----//
        if (Tabed.getSelectedIndex() > 0) {
            if (botao.isEnabled() == true) {
                JOptionPane.showMessageDialog(null, "Existe um registro ativo na aba de cadastro !");
                Tabed.setSelectedIndex(0);
            }
        }
    }
}
