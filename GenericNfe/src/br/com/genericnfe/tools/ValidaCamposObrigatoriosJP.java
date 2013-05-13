package br.com.genericnfe.tools;


import br.com.genericnfe.connections.Conexao;
import java.awt.Component;
import java.awt.Container;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;

/**
 * @author André Cardeal santana
 * validacao de campos obrigatorios
 */
public class ValidaCamposObrigatoriosJP {

    private Conexao conexao = new Conexao();
    private String tabela;
    private Container panel;
    private int qtdeColunas;
    public int retorno = 0;
    private ImplodeArray implodeArray = new ImplodeArray();

    public boolean ValidaCamposObrigatorios(Container panel, String tabela) {
        this.tabela = tabela;
        this.panel  = panel;
                                      
        conexao.executeSQL("SELECT * FROM " + tabela + " WHERE ROWNUM = 1");       
        
        try {
            this.qtdeColunas = conexao.metadata.getColumnCount();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar qtde de colunas: " + ex);
            return false;
        }

        Component[] componentes = panel.getComponents();

        // PERCORRE OS COMPONENTES DO panel..
        for (Component componente : componentes) {

            String nome         = null;     // NOME DO CAMPO NO BD
            String texto        = null;     // VALOR A SER GRAVADO NO CAMPO
            String descricao    = null;     // MSG A SER APRESENTADA (concatenada) SE O CAMPO FOR INVÁLIDO
            boolean valorGerado = false;    // INDICA SE O VALOR É GERADO PELA UltimaSequencia (AUTOINCREMENT)
            boolean unico       = false;    // INDICA SE O CAMPO É UNIQUE

            //.. PEGA AS PROPRIEDADES (nome, texto, descrição, valorGerado, unico) 
            //.. DE CADA CAMPO PERSISTIDO (jTextField, jTextArea) ..
            //.. PARA ENVIÁ-LAS AO MÉTODO validarCampoObrigatorio
            if (componente instanceof JTextField) {
                JTextField tf = (JTextField) componente;    
                nome          = tf.getName();               
                nome          = (nome == null) ? "" : nome; // SE nome == null ENTÃO NÃO É CAMPO PERSISTIDO
                texto         = tf.getText();               
                descricao     = tf.getToolTipText();        
                valorGerado   = (tf.getColumns() == 1) ? true : false;
                unico         = (tf.getColumns() == 2) ? true : false;
            } else if (componente instanceof JScrollPane) { // O JScrollPane CONTÉM VÁRIOS JViewports E ..                                                            
                JScrollPane js = (JScrollPane) componente;  //.. EM UM JViewport ESTÁ O BENDITO TEXTAREA
                Component scrollPane[] = js.getComponents();
                for (Component scroll : scrollPane) {
                    if (scroll instanceof JViewport) {
                        JViewport jv           = (JViewport) scroll;
                        Component viewReport[] = jv.getComponents();
                        for (Component view : viewReport) {
                            if (view instanceof JTextArea) {
                                JTextArea ta = (JTextArea) view;
                                nome         = ta.getName();
                                nome         = (nome == null) ? "" : nome;
                                texto        = ta.getText();
                                descricao    = ta.getToolTipText();
                            }
                        }
                    }
                }
            } else {      // SE O COMPONENTE NÃO FOR INSTÂNCIA DE NENHUMA DAS CLASSES ACIMA
                continue; //.. VAI PARA A PRÓXIMA POSIÇÃO DO ARRAY
            }

            if (valorGerado || nome == null) { // SE O CAMPO FOR GERADO PELA CLASSE UltimaSequencia NÃO PRECISA SER VALIDADO ..
                continue;      //.. VAI PARA A PRÓXIMA POSIÇÃO DO ARRAY 
            } else if (!this.validarCampoObrigatorio(nome, texto, descricao, unico)) { // SE O PREENCHIMENTO DO CAMPO FOR INVÁLIDO..
                                                                                       //.. obs: msg apresentada no método..
                                                                                       //.. validarCampoObrigatorio
                componente.requestFocus(); // requestFocus() APLICASSE A TODOS COMPONENTES TESTADOS ACIMA
                return false;
            }

        }

        this.retorno = 1;
        return true;
    }

    // VALIDA O CAMPO PASSADO EM nome, SE O VALOR ESPECIFICADO EM texto PODE SER ATRIBUÍDO À ELE, CASO NÃO PUDER ..
    // .. APRESENTA UMA MENSAGEM CONCATENADA COM descricao AO USUÁRIO. FAZ A VALIDAÇÃO DE UNIQUE NA APLICAÇÃO
    private boolean validarCampoObrigatorio(String nome, String texto, String descricao, boolean validarUnico) {      
        boolean achou       = false;
        boolean obrigatorio = false;  // isNullable
        String nomeNoBanco  = "";     // getColumnName
        String tipo         = "";     // getColumnTypeName  
        int tamanho         = 0;      // getColumnDisplaySize        
        int cont;        
        
        // PERCORRE AS COLUNAS RETORNADAS NO metaData ...
        // ... E BUSCA PELOS METADADOS(tamanho, notnull, tipo) DO CAMPO NO BD ...
        for (cont = 1; cont <= this.qtdeColunas; cont++) {
            try {
                nomeNoBanco = "";
                nomeNoBanco = conexao.metadata.getColumnName(cont);
                
                if (nome.equals(nomeNoBanco)) {
                    obrigatorio = conexao.metadata.isNullable(cont) == 0 ? true : false;
                    tamanho     = conexao.metadata.getColumnDisplaySize(cont);
                    tipo        = conexao.metadata.getColumnTypeName(cont);
                    break;
                }                                 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao tentar buscar metadados de um campo: " + ex);
                return false;
            }            
        }
        
        // VALIDAÇÃO DE UNIQUE NA APLICAÇÃO ...                
        if (validarUnico) { // SE true EXECUTA SELECT PARA VERIFICAR SE O VALOR INFORMADO JÁ FOI CADASTRADO
            // NECESSÁRIO NOVA INSTÂNCIA DE conexao PARA NÃO SOBRESCREVER O METADATA 
            // .. RETORNADO DO PRIMEIRO SELECT EXECUTADO            
            Conexao conexaoUnique = new Conexao();
           

            // PEGA OS CAMPOS DA CHAVE PRIMÁRIA
            String pk[]   = null ;///conexaoUnique.retornarPK(TelaPrincipal.banco, this.tabela);

            // MONTA STRING DO ARRAY (EX.: "CD_NF, SR_NF")
            String campos = implodeArray.implodeArray(pk, ",");

            conexaoUnique.executeSQL("SELECT " + campos + " FROM " + this.tabela + " WHERE " + nome + " = '" + texto + "'");

            try {
                if (conexaoUnique.resultset.next()) {  //SE true RETORNOU UM REGISTRO
                    Component[] componentes = panel.getComponents();

                    // PERCORRE OS COMPONENTES E VERIFICA SE O VALOR ESTÁ SENDO
                    // .. GRAVADO NO MESMO REGISTRO, SE SIM PERMITE A OPERAÇÃO
                    //.. SE NÃO APRES. "MENSAGEM DE VIOLAÇÃO DE UNIQUE" E RETORNA FALSE
                    for (String atributoDaPK : pk) {
                        String nome2            = null;
                        JTextField tf2          = null;

                        for (Component componente : componentes) {
                            if (componente instanceof JTextField) {
                                tf2   = (JTextField) componente;
                                nome2 = tf2.getName();

                                if (nome2.equals(atributoDaPK)) {
                                    break;
                                }
                            }
                        }

                        if (tf2 != null && nome2 != null) {
                            if (!tf2.getText().equals(conexaoUnique.resultset.getString(nome2))) {
                                JOptionPane.showMessageDialog(null, "O campo " + descricao + " deve ser único");
                                return false;
                            }
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao testar unique: " + ex);
                return false;
            }
        } 
        
        // APLICA AS VALIDAÇÕES NECESSÁRIAS DE ACORDO COM O TIPO DO CAMPO NO BD
        if (tipo.equals("CHAR") || tipo.equals("VARCHAR2") || tipo.equals("VARCHAR")) {
            if (texto.trim().length() == 0 && obrigatorio) {
                JOptionPane.showMessageDialog(null, "O campo " + descricao + " é obrigatório");                 
                return false;
            } else if (texto.length() > tamanho) {
                JOptionPane.showMessageDialog(null, "O campo " + descricao
                + " deve possuir no máximo " + tamanho + " caracter(es)");                 
                return false;
            }
        } else if (tipo.equals("NUMBER")) {
            if (texto.trim().length() == 0 && obrigatorio) {
                JOptionPane.showMessageDialog(null, "O campo " + descricao + " é obrigatório");                 
                return false;
            } // VALIDAR getPrecision E getScale!!!
        } else if (tipo.equals("DATE")) {
            if ((texto.equals("  /  /    ") || texto.equals("")) && obrigatorio) {
                JOptionPane.showMessageDialog(null, "O campo " + descricao + " é obrigatório");                
                return false;
            }
        }

        return true; 
    }

}