package br.com.genericnfe.tools;


import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;



public class ValidaCPF {

  

    public void validacpf(String strCpf, JFormattedTextField campo) { // formato XXX.XXX.XXX-XX
        if (!strCpf.substring(0, 1).equals("")) {
            try {
                boolean validado = true;
                int d1, d2;
                int digito1, digito2, resto;
                int digitoCPF;
                String nDigResult;
                strCpf = strCpf.replace('.', ' ');
                strCpf = strCpf.replace('-', ' ');
                strCpf = strCpf.replaceAll(" ", "");
                d1 = d2 = 0;
                digito1 = digito2 = resto = 0;
                String verificador = strCpf.substring(9, 11);


                for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
                    digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount)).intValue();

                    //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
                    d1 = d1 + (11 - nCount) * digitoCPF;

                    //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
                    d2 = d2 + (12 - nCount) * digitoCPF;
                }
                ;

                //Primeiro resto da divisão por 11.
                resto = (d1 % 11);

                //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
                if (resto < 2) {
                    digito1 = 0;
                } else {
                    digito1 = 11 - resto;
                }

                d2 += 2 * digito1;

                //Segundo resto da divisão por 11.
                resto = (d2 % 11);

                //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
                if (resto < 2) {
                    digito2 = 0;
                } else {
                    digito2 = 11 - resto;
                }

                //Digito verificador do CPF que está sendo validado.
                String nDigVerific = strCpf.substring(strCpf.length() - 2, strCpf.length());

                //Concatenando o primeiro resto com o segundo.
                nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

                //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
                if (!verificador.equals(nDigResult)) {
                    JOptionPane.showMessageDialog(null, "CPF Invalido !");
                    campo.setText("");
                    campo.grabFocus();
                }


            } catch (Exception e) {
                System.err.println("Erro !" + e);

            }
        }
    }
    
//    public void consCpf(JFormattedTextField campo_cpf, String codPessoa) {
//
//        if (!campo_cpf.getText().equals("   .   .   -  ")) {
//
//            conecta_Oracle = new ConexaoOracle();
//            conecta_Oracle.conecta(TelaPrincipal.banco);
//
//            String strCpf = campo_cpf.getText();
//            strCpf = strCpf.replace('.', ' ');
//            strCpf = strCpf.replace('-', ' ');
//            strCpf = strCpf.replaceAll(" ", "");
//
//            try {
//                conecta_Oracle.executeSQL("SELECT NM_PESSOA FROM  CAD_FISICA"
//                        + " INNER JOIN CAD_PESSOA ON CAD_PESSOA.CD_PESSOA = CAD_FISICA.CD_PESSOA"
//                        + " WHERE NR_CPF = " + strCpf + (!codPessoa.equals("") ? " AND CAD_PESSOA.CD_PESSOA <> " + codPessoa : ""));
//                if (conecta_Oracle.resultset.first()) {
//                    JOptionPane.showMessageDialog(null, "O CPF já está sendo utilizado para a "
//                            + "pessoa : " + conecta_Oracle.resultset.getString("NM_PESSOA"));
//                    campo_cpf.setText("");
//                    campo_cpf.grabFocus();
//                    return;
//                } else {
//                    return;
//                }
//
//            } catch (SQLException erro) {
//                JOptionPane.showMessageDialog(null, erro);
//            }
//        }
//    }
}
