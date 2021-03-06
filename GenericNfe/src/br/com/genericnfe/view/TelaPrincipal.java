package br.com.genericnfe.view;

import br.com.genericnfe.connections.Conexao;
import br.com.genericnfe.model.Usuario;

/**
 *
 * @author jsoliveira
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    
    private Usuario u ;
    

    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelUsuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelBanco = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabelBase = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabelDataLogin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelHoraLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuNotaFiscal = new javax.swing.JMenu();
        jMenuNota = new javax.swing.JMenuItem();
        jMenuGerenciarNotas = new javax.swing.JMenuItem();
        jMenuInutilizcoes = new javax.swing.JMenu();
        jMenuEmitente = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuLocalidades2 = new javax.swing.JMenu();
        jMenuUf2 = new javax.swing.JMenuItem();
        jMenuItemCidade2 = new javax.swing.JMenuItem();
        jMenuLocalidades1 = new javax.swing.JMenu();
        jMenuUf1 = new javax.swing.JMenuItem();
        jMenuItemCidade1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuLocalidades = new javax.swing.JMenu();
        jMenuUf = new javax.swing.JMenuItem();
        jMenuItemCidade = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuLocalidades3 = new javax.swing.JMenu();
        jMenuUf3 = new javax.swing.JMenuItem();
        jMenuUf4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemParametros = new javax.swing.JMenuItem();
        jMenuItemCertificados = new javax.swing.JMenuItem();
        jMenuItemParametros1 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuClose = new javax.swing.JMenuItem();
        jMenuLogoff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GenericNfe");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelUsuario.setText("jLabel3");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Usuário:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Banco de Dados:");

        jLabelBanco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBanco.setText("jLabel3");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Base:");

        jLabelBase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBase.setText("jLabel3");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Data do login:");

        jLabelDataLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDataLogin.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Hora do login:");

        jLabelHoraLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelHoraLogin.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuario)
                .addGap(135, 135, 135)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBanco)
                .addGap(39, 39, 39)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBase)
                .addGap(64, 64, 64)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDataLogin)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoraLogin)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addComponent(jSeparator3)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabel4)
                    .addComponent(jLabelBanco)
                    .addComponent(jLabel5)
                    .addComponent(jLabelBase)
                    .addComponent(jLabel6)
                    .addComponent(jLabelDataLogin)
                    .addComponent(jLabel7)
                    .addComponent(jLabelHoraLogin))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/genericnfe/view/logo-nfe.jpg"))); // NOI18N

        jMenuNotaFiscal.setMnemonic('N');
        jMenuNotaFiscal.setText("Notas Fiscais");

        jMenuNota.setMnemonic('E');
        jMenuNota.setText("Emitir Notas");
        jMenuNotaFiscal.add(jMenuNota);

        jMenuGerenciarNotas.setMnemonic('G');
        jMenuGerenciarNotas.setText("Gerenciar Notas");
        jMenuNotaFiscal.add(jMenuGerenciarNotas);

        jMenuInutilizcoes.setMnemonic('I');
        jMenuInutilizcoes.setText("Inutilizações");
        jMenuNotaFiscal.add(jMenuInutilizcoes);

        jMenuBar.add(jMenuNotaFiscal);

        jMenuEmitente.setMnemonic('E');
        jMenuEmitente.setText("Emitente");
        jMenuBar.add(jMenuEmitente);

        jMenuCadastro.setMnemonic('C');
        jMenuCadastro.setText("Cadastros");

        jMenuLocalidades2.setText("Emitente");

        jMenuUf2.setMnemonic('L');
        jMenuUf2.setText("Regime Tributario");
        jMenuUf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUf2ActionPerformed(evt);
            }
        });
        jMenuLocalidades2.add(jMenuUf2);

        jMenuItemCidade2.setMnemonic('C');
        jMenuItemCidade2.setText("Emitente");
        jMenuItemCidade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidade2ActionPerformed(evt);
            }
        });
        jMenuLocalidades2.add(jMenuItemCidade2);

        jMenuCadastro.add(jMenuLocalidades2);

        jMenuLocalidades1.setText("Transporte");

        jMenuUf1.setMnemonic('L');
        jMenuUf1.setText("Modalidade de Transporte");
        jMenuUf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUf1ActionPerformed(evt);
            }
        });
        jMenuLocalidades1.add(jMenuUf1);

        jMenuItemCidade1.setMnemonic('C');
        jMenuItemCidade1.setText("Transportadora");
        jMenuItemCidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidade1ActionPerformed(evt);
            }
        });
        jMenuLocalidades1.add(jMenuItemCidade1);

        jMenuCadastro.add(jMenuLocalidades1);

        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem4);

        jMenuLocalidades.setText("Localidades");

        jMenuUf.setMnemonic('L');
        jMenuUf.setText("Unidade Federativa (UF)");
        jMenuUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUfActionPerformed(evt);
            }
        });
        jMenuLocalidades.add(jMenuUf);

        jMenuItemCidade.setMnemonic('C');
        jMenuItemCidade.setText("Cidade");
        jMenuItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadeActionPerformed(evt);
            }
        });
        jMenuLocalidades.add(jMenuItemCidade);

        jMenuItem1.setText("País");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuLocalidades.add(jMenuItem1);

        jMenuCadastro.add(jMenuLocalidades);

        jMenuItem3.setText("Usúario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem3);

        jMenuLocalidades3.setText("Nota Fiscal");

        jMenuUf3.setMnemonic('L');
        jMenuUf3.setText("Operação");
        jMenuUf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUf3ActionPerformed(evt);
            }
        });
        jMenuLocalidades3.add(jMenuUf3);

        jMenuUf4.setMnemonic('L');
        jMenuUf4.setText("Nota Fiscal");
        jMenuUf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUf4ActionPerformed(evt);
            }
        });
        jMenuLocalidades3.add(jMenuUf4);

        jMenuCadastro.add(jMenuLocalidades3);

        jMenuItem5.setText("Produto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem5);

        jMenuBar.add(jMenuCadastro);

        jMenuSistema.setMnemonic('S');
        jMenuSistema.setText("Sistema");

        jMenuItemParametros.setMnemonic('P');
        jMenuItemParametros.setText("Parâmetros");
        jMenuItemParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemParametrosActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemParametros);

        jMenuItemCertificados.setMnemonic('C');
        jMenuItemCertificados.setText("Certificados");
        jMenuItemCertificados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCertificadosActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemCertificados);

        jMenuItemParametros1.setMnemonic('P');
        jMenuItemParametros1.setText("Serviços Web");
        jMenuItemParametros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemParametros1ActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemParametros1);

        jMenuBar.add(jMenuSistema);

        jMenuSair.setMnemonic('r');
        jMenuSair.setText("Sair");

        jMenuClose.setMnemonic('T');
        jMenuClose.setText("Trocar de Usuario");
        jMenuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCloseActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuClose);

        jMenuLogoff.setMnemonic('S');
        jMenuLogoff.setText("Sair");
        jMenuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogoffActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuLogoff);

        jMenuBar.add(jMenuSair);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1223)/2, (screenSize.height-759)/2, 1223, 759);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUfActionPerformed
        new CadUf().setVisible(true);
    }//GEN-LAST:event_jMenuUfActionPerformed

    private void jMenuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogoffActionPerformed
       dispose();
    }//GEN-LAST:event_jMenuLogoffActionPerformed

    private void jMenuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCloseActionPerformed
        new Conexao().desconecta();
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuCloseActionPerformed

    private void jMenuItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadeActionPerformed
       new CadCidade().setVisible(true);
    }//GEN-LAST:event_jMenuItemCidadeActionPerformed

    private void jMenuUf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUf1ActionPerformed
        new CadModalidadeTransporte().setVisible(true);
    }//GEN-LAST:event_jMenuUf1ActionPerformed

    private void jMenuItemCidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidade1ActionPerformed
       new CadTransportadora().setVisible(true);
    }//GEN-LAST:event_jMenuItemCidade1ActionPerformed

    private void jMenuUf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUf2ActionPerformed
       new CadRegimeTributario().setVisible(true);
    }//GEN-LAST:event_jMenuUf2ActionPerformed

    private void jMenuItemCidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidade2ActionPerformed
        new CadEmitente().setVisible(true);
    }//GEN-LAST:event_jMenuItemCidade2ActionPerformed

    private void jMenuUf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUf3ActionPerformed
       new CadOperacao().setVisible(true);
    }//GEN-LAST:event_jMenuUf3ActionPerformed

    private void jMenuUf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuUf4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      new CadPais().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       new CadProdutoServico().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CadUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemParametrosActionPerformed
        new CadParametros().setVisible(true);
    }//GEN-LAST:event_jMenuItemParametrosActionPerformed

    private void jMenuItemCertificadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCertificadosActionPerformed
       new CadCertificados().setVisible(true);
    }//GEN-LAST:event_jMenuItemCertificadosActionPerformed

    private void jMenuItemParametros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemParametros1ActionPerformed
        new CadServicosWeb().setVisible(true);
    }//GEN-LAST:event_jMenuItemParametros1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       new CadCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabelBanco;
    public javax.swing.JLabel jLabelBase;
    public javax.swing.JLabel jLabelDataLogin;
    public javax.swing.JLabel jLabelHoraLogin;
    public javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuClose;
    private javax.swing.JMenu jMenuEmitente;
    private javax.swing.JMenuItem jMenuGerenciarNotas;
    private javax.swing.JMenu jMenuInutilizcoes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemCertificados;
    private javax.swing.JMenuItem jMenuItemCidade;
    private javax.swing.JMenuItem jMenuItemCidade1;
    private javax.swing.JMenuItem jMenuItemCidade2;
    private javax.swing.JMenuItem jMenuItemParametros;
    private javax.swing.JMenuItem jMenuItemParametros1;
    private javax.swing.JMenu jMenuLocalidades;
    private javax.swing.JMenu jMenuLocalidades1;
    private javax.swing.JMenu jMenuLocalidades2;
    private javax.swing.JMenu jMenuLocalidades3;
    private javax.swing.JMenuItem jMenuLogoff;
    private javax.swing.JMenuItem jMenuNota;
    private javax.swing.JMenu jMenuNotaFiscal;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSistema;
    private javax.swing.JMenuItem jMenuUf;
    private javax.swing.JMenuItem jMenuUf1;
    private javax.swing.JMenuItem jMenuUf2;
    private javax.swing.JMenuItem jMenuUf3;
    private javax.swing.JMenuItem jMenuUf4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }


}
