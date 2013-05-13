package br.com.genericnfe.tools;

import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;



public class ValidaCNPJ {


    public ValidaCNPJ() {
    }

    public void validaCnpj(JFormattedTextField campo) {

        if (!campo.getText().equals("  .   .   /    -  ")) {

            String cnpj = campo.getText();

            cnpj = cnpj.replace('.', ' ');
            cnpj = cnpj.replace('/', ' ');
            cnpj = cnpj.replace('-', ' ');
            cnpj = cnpj.replaceAll(" ", "");

            if (cnpj.length() == 14) {

                int soma = 0, aux, dig;
                String cnpj_calc = cnpj.substring(0, 12);

                char[] chr_cnpj = cnpj.toCharArray();

                /* Primeira parte */
                for (int i = 0; i < 4; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                        soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);

                cnpj_calc += (dig == 10 || dig == 11)
                        ? "0" : Integer.toString(dig);

                /* Segunda parte */
                soma = 0;
                for (int i = 0; i < 5; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                        soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11)
                        ? "0" : Integer.toString(dig);

                if (!cnpj_calc.equals(cnpj)) {
                    JOptionPane.showMessageDialog(null, "CNPJ digitado inválido !");
                    campo.setText("");
                    campo.grabFocus();
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "CNPJ digitado inválido !");
                campo.setText("");
                campo.grabFocus();
                return;
            }
        }
    }
//
//     public void consCNPJ(JFormattedTextField campo_cnpj) {
//
//        if (!campo_cnpj.getText().equals("  .   .   /    -  ")) {
//
//            conecta_Oracle = new ConexaoOracle();
//            conecta_Oracle.conecta(TelaPrincipal.banco);
//
//            String strCnpj = campo_cnpj.getText();
//            strCnpj = strCnpj.replace('.', ' ');
//            strCnpj = strCnpj.replace('/', ' ');
//            strCnpj = strCnpj.replace('-', ' ');
//            strCnpj = strCnpj.replaceAll(" ", "");
//
//            try {
//                conecta_Oracle.executeSQL("SELECT NM_PESSOA FROM  CAD_JURIDICA"
//                        + " INNER JOIN CAD_PESSOA ON CAD_PESSOA.CD_PESSOA = CAD_JURIDICA.CD_PESSOA"
//                        + " WHERE NR_CNPJ = " + strCnpj);
//                if (conecta_Oracle.resultset.first()) {
//                    JOptionPane.showMessageDialog(null, "O CNPJ já está sendo utilizado para a "
//                            + "pessoa : " + conecta_Oracle.resultset.getString("NM_PESSOA"));
//                    campo_cnpj.setText("");
//                    campo_cnpj.grabFocus();
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