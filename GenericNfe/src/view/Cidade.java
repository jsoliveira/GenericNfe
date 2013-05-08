
package view;

/**
 *
 * @author jsoliveira
 */
public class Cidade extends javax.swing.JFrame {

    /**
     * Creates new form Uf
     */
    public Cidade() {
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

        bTnGroupOrdenacao = new javax.swing.ButtonGroup();
        jTabbed = new javax.swing.JTabbedPane();
        jPnCadastro = new javax.swing.JPanel();
        jTfCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTfNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPnBotoes = new javax.swing.JPanel();
        jBtIncluir = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtGravar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jCUf = new javax.swing.JComboBox();
        jTfUnidadeFederativa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPnConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTfCod.setEditable(false);

        jLabel4.setText("Código");

        jLabel5.setText("Nome");

        jLabel6.setText("UF");

        jPnBotoes.setBackground(new java.awt.Color(102, 102, 102));

        jBtIncluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtIncluir.setText("Incluir");
        jBtIncluir.setPreferredSize(new java.awt.Dimension(100, 40));
        jPnBotoes.add(jBtIncluir);

        jBtAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtAlterar.setText("Alterar");
        jBtAlterar.setPreferredSize(new java.awt.Dimension(100, 40));
        jPnBotoes.add(jBtAlterar);

        jBtExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtExcluir.setText("Excluir");
        jBtExcluir.setPreferredSize(new java.awt.Dimension(100, 40));
        jPnBotoes.add(jBtExcluir);

        jBtGravar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtGravar.setText("Gravar");
        jBtGravar.setPreferredSize(new java.awt.Dimension(100, 40));
        jPnBotoes.add(jBtGravar);

        jBtCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtCancelar.setText("Cancelar");
        jBtCancelar.setPreferredSize(new java.awt.Dimension(100, 40));
        jPnBotoes.add(jBtCancelar);

        jCUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTfUnidadeFederativa.setEditable(false);

        jLabel7.setText("Unidade Federativa");

        javax.swing.GroupLayout jPnCadastroLayout = new javax.swing.GroupLayout(jPnCadastro);
        jPnCadastro.setLayout(jPnCadastroLayout);
        jPnCadastroLayout.setHorizontalGroup(
            jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
            .addGroup(jPnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCUf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTfUnidadeFederativa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfUnidadeFederativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jPnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbed.addTab("Cadastro", jPnCadastro);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Sigla"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Tipo da Pesquisa");

        jCbTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Por Código", "Por Nome", "Por UF" }));

        jBtPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtPesquisar.setText("Pesquisar");

        jLabel2.setText("Valor");

        bTnGroupOrdenacao.add(jRBDesc);
        jRBDesc.setText("Descrecente");

        bTnGroupOrdenacao.add(jRbAsc);
        jRbAsc.setSelected(true);
        jRbAsc.setText("Acesdente");

        jCbOrdernar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "UF" }));

        jLabel3.setText("Ordenar");

        jBtAlterarSelecionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtAlterarSelecionado.setText("Alterar Selecionado");

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
                            .addComponent(jCbOrdernar, 0, 96, Short.MAX_VALUE))
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
                .addContainerGap(15, Short.MAX_VALUE))
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
            .addComponent(jTabbed)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Cidade().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bTnGroupOrdenacao;
    private javax.swing.JButton jBtAlterar;
    private javax.swing.JButton jBtAlterarSelecionado;
    private javax.swing.JButton jBtCancelar;
    private javax.swing.JButton jBtExcluir;
    private javax.swing.JButton jBtGravar;
    private javax.swing.JButton jBtIncluir;
    private javax.swing.JButton jBtPesquisar;
    private javax.swing.JComboBox jCUf;
    private javax.swing.JComboBox jCbOrdernar;
    private javax.swing.JComboBox jCbTipoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPnBotoes;
    private javax.swing.JPanel jPnCadastro;
    private javax.swing.JPanel jPnConsulta;
    private javax.swing.JRadioButton jRBDesc;
    private javax.swing.JRadioButton jRbAsc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbed;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTfCod;
    private javax.swing.JTextField jTfNome;
    private javax.swing.JTextField jTfUnidadeFederativa;
    private javax.swing.JTextField jTfValor;
    // End of variables declaration//GEN-END:variables
}
