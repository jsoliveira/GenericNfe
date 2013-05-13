
package br.com.genericnfe.tools;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jsoliveira
 */
public class ValidaPlacas {
    
     public void validaPlaca(JTextField field) {

        if (!field.getText().isEmpty()) {

            if (field.getText().length() != 7) {
                JOptionPane.showMessageDialog(null, "Deve ser informados os 7 Caracteres da placa sem '-' para separar \n"
                        + "Exemplo 'ABC1234'");
                field.setText("");
                field.grabFocus();
                return;
            }

            String letras = field.getText().substring(0, 3).toString();
            String num = field.getText().substring(3,  field.getText().length()).toString();

            //System.out.println(letras);
            //System.out.println(num);

            ValidacoesParaString string = new ValidacoesParaString();
            if (!string.validaStringSoDeLetras(letras)) {

                JOptionPane.showMessageDialog(null, "Foi informado números nos lugares das letras \n"
                        + "Deve ser informado os 7 caracteres da placa sem '-' para separar \n"
                        + "Exemplo 'ABC123'");
                field.setText("");
                field.grabFocus();
                return;

            }

            if (!string.validaStringSoDeNumeros(num)) {

                JOptionPane.showMessageDialog(null, "Foi informado letras nos lugares dos números \n"
                        + "Deve ser informado os 7 caracteres da placa sem '-' para separar \n"
                        + "Exemplo 'ABC123'");
                field.setText("");
                field.grabFocus();
                return;
            }

        }
    }
    
}
