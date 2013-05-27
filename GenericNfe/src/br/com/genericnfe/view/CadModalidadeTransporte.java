/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.genericnfe.view;

/**
 *
 * @author Usuario
 */
public class CadModalidadeTransporte extends javax.swing.JFrame {

    /**
     * Creates new form CadModalidadeTransporte
     */
    public CadModalidadeTransporte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbed = new javax.swing.JTabbedPane();
        jPnCadastro = new javax.swing.JPanel();
        jTfCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTfNome = new javax.swing.JTextField();
        jPnBotoes = new javax.swing.JPanel();
        jBtIncluir = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtGravar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jTfDtTransacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPnConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCbTipoPesquisa = new javax.swing.JComboBox();
        jTfValor = new javax.swing.JTextField();
        jBtPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRBDesc = new javax.swing.JRadioButton();
        jRbAsc = new javax.swing.JRadioButton();
        jCbOrdernar = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtAlterarSelecionado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modalidade de Transporte");

        jTabbed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedStateChanged(evt);
            }
        });

        jTfCod.setEditable(false);

        jLabel4.setText("Código");

        jLabel5.setText("Modalidade de Transporte");

        jPnBotoes.setBackground(new java.awt.Color(102, 102, 102));

        jBtIncluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtIncluir.setText("Incluir");
        jBtIncluir.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtIncluirActionPerformed(evt);
            }
        });
        jPnBotoes.add(jBtIncluir);

        jBtAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtAlterar.setText("Alterar");
        jBtAlterar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarActionPerformed(evt);
            }
        });
        jPnBotoes.add(jBtAlterar);

        jBtExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExcluirActionPerformed(evt);
            }
        });
        jPnBotoes.add(jBtExcluir);

        jBtGravar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtGravar.setText("Gravar");
        jBtGravar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGravarActionPerformed(evt);
            }
        });
        jPnBotoes.add(jBtGravar);

        jBtCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtCancelar.setText("Cancelar");
        jBtCancelar.setPreferredSize(new java.awt.Dimension(100, 40));
        jBtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCancelarActionPerformed(evt);
            }
        });
        jPnBotoes.add(jBtCancelar);

        jTfDtTransacao.setEditable(false);

        jLabel7.setText("Data da Transação");

        javax.swing.GroupLayout jPnCadastroLayout = new javax.swing.GroupLayout(jPnCadastro);
        jPnCadastro.setLayout(jPnCadastroLayout);
        jPnCadastroLayout.setHorizontalGroup(
            jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
            .addGroup(jPnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTfDtTransacao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnCadastroLayout.setVerticalGroup(
            jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnCadastroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jTfDtTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jPnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbed.addTab("Cadastro", jPnCadastro);

        jTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Modalidade de Transporte", "Data Transação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisa);

        jLabel1.setText("Tipo da Pesquisa");

        jCbTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Por Código", "Por Nome" }));

        jBtPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtPesquisar.setText("Pesquisar");
        jBtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        jRBDesc.setText("Descrecente");

        jRbAsc.setSelected(true);
        jRbAsc.setText("Acesdente");

        jCbOrdernar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Sigla", "Dt.Transação" }));

        jLabel3.setText("Ordenar");

        jBtAlterarSelecionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtAlterarSelecionado.setText("Alterar Selecionado");
        jBtAlterarSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAlterarSelecionadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnConsultaLayout = new javax.swing.GroupLayout(jPnConsulta);
        jPnConsulta.setLayout(jPnConsultaLayout);
        jPnConsultaLayout.setHorizontalGroup(
            jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnConsultaLayout.createSequentialGroup()
                        .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCbTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCbOrdernar, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPnConsultaLayout.createSequentialGroup()
                                .addComponent(jRbAsc)
                                .addGap(105, 105, 105))
                            .addGroup(jPnConsultaLayout.createSequentialGroup()
                                .addComponent(jRBDesc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtPesquisar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtAlterarSelecionado)))
                .addContainerGap())
        );
        jPnConsultaLayout.setVerticalGroup(
            jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jRbAsc)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtPesquisar)
                    .addComponent(jRBDesc)
                    .addComponent(jCbOrdernar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtAlterarSelecionado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbed.addTab("Consulta", jPnConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-714)/2, (screenSize.height-418)/2, 714, 418);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtIncluirActionPerformed

//        setEstado(e.incluir);
//        lc.LimparCampos(jPnCadastro);
//        validaEstadoBotoes.ValidaCamposIncluir(jPnCadastro, jPnBotoes);
   }//GEN-LAST:event_jBtIncluirActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed

//        if (jTfCod.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Selecione uma Unidade Federativa para alterar");
//            return;
//        }
//        setEstado(e.alterar);
//        validaEstadoBotoes.ValidaCamposIncluir(jPnCadastro, jPnBotoes);
   }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
//        if (jTfCod.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Selecione uma Unidade Federativa para excluir");
//            return;
//        }
//        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o estado do '" + jTfSigla.getText() + "' ?", "Exclusão", JOptionPane.YES_NO_OPTION);
//
//        if (op == JOptionPane.YES_OPTION) {
//            setEstado(e.padrao);
//            ufDao.excluir(setUf());
//            JOptionPane.showMessageDialog(null, ufDao.getMsg());
//            lc.LimparCampos(jPnCadastro);
//        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jBtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGravarActionPerformed

//
//        if (valida()) {
//
//            if (getEstado() == e.incluir) {
//
//                jTfCod.setText((valida()) ? Integer.toString(ufDao.salvar(setUf())) : "");
//                jTfDtTransacao.setText(sdf.format(new Date()));
//                JOptionPane.showMessageDialog(null, ufDao.getMsg());
//
//            }
//            if (getEstado() == e.alterar) {
//                ufDao.alterar(setUf());
//                JOptionPane.showMessageDialog(null, ufDao.getMsg());
//            }
//            validaEstadoBotoes.ValidaCamposCancelar(jPnCadastro, jPnBotoes);
//        }
   }//GEN-LAST:event_jBtGravarActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
//        setEstado(e.padrao);
//        validaEstadoBotoes.ValidaCamposCancelar(jPnCadastro, jPnBotoes);
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked


        if (evt.getClickCount() == 2) {

            jBtAlterarSelecionadoActionPerformed(null);
        }
    }//GEN-LAST:event_jTablePesquisaMouseClicked

    private void jBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisarActionPerformed
//        ufDao.setOrderByOrd((jRbAsc.isSelected()) ? "ASC" : "DESC");
//
//        switch (jCbOrdernar.getSelectedIndex()) {
//
//            case 0:
//                ufDao.setOrderByCampoOrd("cd_uf");
//                break;
//            case 1:
//                ufDao.setOrderByCampoOrd("nm_uf");
//                break;
//            case 2:
//                ufDao.setOrderByCampoOrd("sg_uf");
//                break;
//            case 3:
//                ufDao.setOrderByCampoOrd("dt_transacao");
//                break;
//
//        }
//
//        switch (jCbTipoPesquisa.getSelectedIndex()) {
//
//            case 0:
//                generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_uf", "nm_uf", "sg_uf", "dt_transacao"}, ufDao.listarTodos());
//                break;
//
//            case 1:
//                if (vn.validaInteiro(jTfValor)) {
//                    generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_uf", "nm_uf", "sg_uf", "dt_transacao"}, ufDao.listarCod(Integer.parseInt(jTfValor.getText())));
//                }
//                break;
//
//
//            case 2:
//                generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_uf", "nm_uf", "sg_uf", "dt_transacao"}, ufDao.listarNm(jTfValor.getText()));
//                break;
//
//
//            case 3:
//                generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_uf", "nm_uf", "sg_uf", "dt_transacao"}, ufDao.listarSg(jTfValor.getText()));
//                break;
//        }
    }//GEN-LAST:event_jBtPesquisarActionPerformed

    private void jBtAlterarSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarSelecionadoActionPerformed

//        int cod = Integer.parseInt(jTablePesquisa.getValueAt(jTablePesquisa.getSelectedRow(), 0).toString());
//        getUf(ufDao.buscarCod(cod));
//        jTabbed.setSelectedIndex(0);
   }//GEN-LAST:event_jBtAlterarSelecionadoActionPerformed

    private void jTabbedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedStateChanged
//        validaEstadoJTabbed.ValidaEstadoJTabbed(jTabbed, jBtIncluir);
//        if (jPnConsulta.isShowing()) {
//            generico.limparJtabe(jTablePesquisa);
//        }
    }//GEN-LAST:event_jTabbedStateChanged

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
            java.util.logging.Logger.getLogger(CadModalidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadModalidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadModalidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadModalidadeTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadModalidadeTransporte().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtAlterarSelecionado;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtGravar;
    private javax.swing.JButton jBtIncluir;
    private javax.swing.JButton jBtPesquisar;
    private javax.swing.JComboBox jCbOrdernar;
    private javax.swing.JComboBox jCbTipoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPnBotoes;
    private javax.swing.JPanel jPnCadastro;
    private javax.swing.JPanel jPnConsulta;
    private javax.swing.JRadioButton jRBDesc;
    private javax.swing.JRadioButton jRbAsc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbed;
    private javax.swing.JTable jTablePesquisa;
    private javax.swing.JTextField jTfCod;
    private javax.swing.JTextField jTfDtTransacao;
    private javax.swing.JTextField jTfNome;
    private javax.swing.JTextField jTfValor;
    // End of variables declaration//GEN-END:variables
}
