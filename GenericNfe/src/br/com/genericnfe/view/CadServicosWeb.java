package br.com.genericnfe.view;

import br.com.genericnfe.dao.PaisDao;
import br.com.genericnfe.model.Pais;
import br.com.genericnfe.tools.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jsoliveira
 */
public class CadServicosWeb extends javax.swing.JFrame {

    private ValidaEstadoBotoes validaEstadoBotoes = new ValidaEstadoBotoes();
    private ValidaEstadoJTabbed validaEstadoJTabbed = new ValidaEstadoJTabbed();
    private LookAndFeelWindows lookAndFeel = new LookAndFeelWindows();
    private PreencherJtableGenerico generico = new PreencherJtableGenerico();
    private ValidaNumerico vn = new ValidaNumerico();
    private LimparCampos lc = new LimparCampos();
    private UpperCase uc = new UpperCase();
    private int estado;
    private Estado e = new Estado();
    private PaisDao pDao = new PaisDao();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public CadServicosWeb() {
        initComponents();

        lookAndFeel.Windows(this);
        validaEstadoBotoes.ValidaCamposCancelar(jPnCadastro, jPnBotoes);
        setEstado(e.padrao);
        generico.PreencherJtableTipos(jTablePesquisa, new int[]{80, 180, 80, 100});
        uc.UpperContainer(jPnCadastro);
        uc.UpperContainer(jPnConsulta);
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
        jPnBotoes = new javax.swing.JPanel();
        jBtIncluir = new javax.swing.JButton();
        jBtAlterar = new javax.swing.JButton();
        jBtExcluir = new javax.swing.JButton();
        jBtGravar = new javax.swing.JButton();
        jBtCancelar = new javax.swing.JButton();
        jTfDtTransacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTfVersao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTfUrl = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
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
        setTitle("Serviços Web");
        setResizable(false);

        jTabbed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedStateChanged(evt);
            }
        });

        jTfCod.setEditable(false);

        jLabel4.setText("Código");

        jLabel5.setText("Nome do Serviço");

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

        jLabel6.setText("Versão");

        jLabel8.setText("URL");

        jLabel9.setText("Servidor");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SVAN", "SVRS" }));

        javax.swing.GroupLayout jPnCadastroLayout = new javax.swing.GroupLayout(jPnCadastro);
        jPnCadastro.setLayout(jPnCadastroLayout);
        jPnCadastroLayout.setHorizontalGroup(
            jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(jPnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(jTfUrl)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfDtTransacao)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTfVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTfUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jTfDtTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbed.addTab("Cadastro", jPnCadastro);

        jTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome do Serviço", "Versão", "Servidor", "URL", "Data Transação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jCbTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Por Código", "Por Nome", " " }));

        jBtPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtPesquisar.setText("Pesquisar");
        jBtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        bTnGroupOrdenacao.add(jRBDesc);
        jRBDesc.setText("Descrecente");

        bTnGroupOrdenacao.add(jRbAsc);
        jRbAsc.setSelected(true);
        jRbAsc.setText("Acesdente");

        jCbOrdernar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Dt.Transação" }));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 25, Short.MAX_VALUE))
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
                .addContainerGap(12, Short.MAX_VALUE))
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

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-731)/2, (screenSize.height-419)/2, 731, 419);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtIncluirActionPerformed

        setEstado(e.incluir);
        lc.LimparCampos(jPnCadastro);
        validaEstadoBotoes.ValidaCamposIncluir(jPnCadastro, jPnBotoes);

    }//GEN-LAST:event_jBtIncluirActionPerformed

    private void jBtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCancelarActionPerformed
        setEstado(e.padrao);
        validaEstadoBotoes.ValidaCamposCancelar(jPnCadastro, jPnBotoes);
    }//GEN-LAST:event_jBtCancelarActionPerformed

    private void jBtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarActionPerformed

        if (jTfCod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma Unidade Federativa para alterar");
            return;
        }
        setEstado(e.alterar);
        validaEstadoBotoes.ValidaCamposIncluir(jPnCadastro, jPnBotoes);
    }//GEN-LAST:event_jBtAlterarActionPerformed

    private void jBtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGravarActionPerformed


        if (valida()) {

            if (getEstado() == e.incluir) {

                jTfCod.setText((valida()) ? Integer.toString(pDao.salvar(setPais())) : "");
                jTfDtTransacao.setText(sdf.format(new Date()));
                JOptionPane.showMessageDialog(null, pDao.getMsg());

            }
            if (getEstado() == e.alterar) {
                pDao.alterar(setPais());
                JOptionPane.showMessageDialog(null, pDao.getMsg());
            }
            validaEstadoBotoes.ValidaCamposCancelar(jPnCadastro, jPnBotoes);
        }
    }//GEN-LAST:event_jBtGravarActionPerformed

    private void jBtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExcluirActionPerformed
        if (jTfCod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma Unidade Federativa para excluir");
            return;
        }
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o País do '" + jTfNome.getText() + "' ?", "Exclusão", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            setEstado(e.padrao);
            pDao.excluir(setPais());
            JOptionPane.showMessageDialog(null, pDao.getMsg());
            lc.LimparCampos(jPnCadastro);
        }
    }//GEN-LAST:event_jBtExcluirActionPerformed

    private void jTabbedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedStateChanged
        validaEstadoJTabbed.ValidaEstadoJTabbed(jTabbed, jBtIncluir);
        if (jPnConsulta.isShowing()) {
            generico.limparJtabe(jTablePesquisa);
        }
    }//GEN-LAST:event_jTabbedStateChanged

    private void jBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPesquisarActionPerformed
        pDao.setOrderByOrd((jRbAsc.isSelected()) ? "ASC" : "DESC");

        switch (jCbOrdernar.getSelectedIndex()) {

            case 0:
                pDao.setOrderByCampoOrd("cd_pais");
                break;
            case 1:
                pDao.setOrderByCampoOrd("nm_pais");
                break;

            case 2:
                pDao.setOrderByCampoOrd("dt_transacao");
                break;

        }

        switch (jCbTipoPesquisa.getSelectedIndex()) {

            case 0:
                generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_pais", "nm_pais", "dt_transacao"}, pDao.listarTodos());
                break;

            case 1:
                if (vn.validaInteiro(jTfValor)) {
                    generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_pais", "nm_pais", "dt_transacao"}, pDao.listarCod(Integer.parseInt(jTfValor.getText())));
                }
                break;


            case 2:
                generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_pais", "nm_pais", "dt_transacao"}, pDao.listarNm(jTfValor.getText()));
                break;


            case 3:
                generico.PreencherJtableGenerico(jTablePesquisa, new String[]{"cd_pais", "nm_pais", "dt_transacao"}, pDao.listarSg(jTfValor.getText()));
                break;
        }

    }//GEN-LAST:event_jBtPesquisarActionPerformed

    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked


        if (evt.getClickCount() == 2) {

            jBtAlterarSelecionadoActionPerformed(null);
        }

    }//GEN-LAST:event_jTablePesquisaMouseClicked

    private void jBtAlterarSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAlterarSelecionadoActionPerformed

        if (jTablePesquisa.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para alterar!");
            return;
        }

        int cod = Integer.parseInt(jTablePesquisa.getValueAt(jTablePesquisa.getSelectedRow(), 0).toString());
        getPais(pDao.buscarCod(cod));
        jTabbed.setSelectedIndex(0);
    }//GEN-LAST:event_jBtAlterarSelecionadoActionPerformed

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
            java.util.logging.Logger.getLogger(CadServicosWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadServicosWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadServicosWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadServicosWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadServicosWeb().setVisible(true);
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
    private javax.swing.JComboBox jCbOrdernar;
    private javax.swing.JComboBox jCbTipoPesquisa;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField jTfUrl;
    private javax.swing.JTextField jTfValor;
    private javax.swing.JTextField jTfVersao;
    // End of variables declaration//GEN-END:variables

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    private Pais setPais() {



        int cod = (jTfCod.getText().isEmpty()) ? 0 : Integer.parseInt(jTfCod.getText());
        String nome = jTfNome.getText();
        Date date = null;
        try {
            date = (jTfDtTransacao.getText().isEmpty()) ? new Date() : sdf.parse(jTfDtTransacao.getText());
        } catch (ParseException ex) {
            Logger.getLogger(CadServicosWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        Pais p = new Pais(cod, nome, date);

        return p;

    }

    public void getPais(Pais p) {

        jTfCod.setText(Integer.toString(p.getCd_pais()));
        jTfNome.setText(p.getNm_pais());
        jTfDtTransacao.setText(sdf.format(p.getDt_transacao()));

    }

    public boolean valida() {

        if (jTfNome.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe o Nome do País");
            return false;
        }

        return true;
    }
}
