package br.com.genericnfe.tools;

import javax.swing.JTextField;
public class ValidaNegativo {

    public String valida;

    public void ValidaNegativo(JTextField Numero) {
        String texto = Numero.getText();

        if(texto.indexOf('-') != -1){
            valida = "F";
        }
        else{
            valida = "V";
        }
            

        /*int num = texto.length();

        for (int x=0; x < num; x++){
            if ("-".equals(texto.charAt(x))){
                valida = "F";
            }
            else{
                valida = "V";
            }
        } */
       
        /*int num = Integer.parseInt(Numero.getText());
        JOptionPane.showMessageDialog(null, num);
        if (num > 0) {
            try {
                valida = "V";
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Esse campo não aceita números negativos", "Informação", JOptionPane.INFORMATION_MESSAGE);
                Numero.grabFocus();
                Numero.setText("");
                valida = "F";
            }
        }*/



    }
}