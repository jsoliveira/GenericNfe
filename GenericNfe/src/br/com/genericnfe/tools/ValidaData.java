package br.com.genericnfe.tools;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author acsantana
 */
public class ValidaData {

    public void valida_data(String data, JTextField campo) {

        if (!data.equals("  /  /    ")) {

            if (Integer.parseInt(data.substring(6)) < 1850) {
                JOptionPane.showMessageDialog(null, "O Ano não pode ser menor que 1850 !");
                campo.setText("");
                campo.grabFocus();
                return;
            } else {

                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                formatador.setLenient(false);

                try {
                    formatador.parse(data);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data Invalida !");
                    campo.setText("");
                    campo.grabFocus();
                    return;
                }
            }
        }
    }

    public void valida_data(JDateChooser campo) {

        if (!campo.equals("")) {

            String data = String.valueOf(campo.getDate());

            if (Integer.parseInt(data.substring(6)) < 1850) {
                JOptionPane.showMessageDialog(null, "O Ano não pode ser menor que 1850 !");
                campo.setDate(new Date());
                campo.grabFocus();
                return;
            } else {

                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                formatador.setLenient(false);

                try {
                    formatador.parse(data);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data Invalida !");
                    campo.setDate(new Date());
                    campo.grabFocus();
                    return;
                }
            }
        }
    }

    public boolean validarDataJtextField(JTextField fields, int anoMin, int qtAnosAposDataAtual) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataAtual = dateFormat.format(date);
        String anoAtual = dataAtual.substring(6, 10);

        boolean retorno = false;

        String data = fields.getText();
        String data2 = fields.getText().replaceAll("/", "");

        String dia;
        String mes;
        String ano;

        String msg = "A data informada deve seguir o seguinte modelo 'DD/MM/YYYY' \n exemplo '25/12/2012' '01/01/2012'  ";

        if (data.length() != 10) {
            JOptionPane.showMessageDialog(null, msg);
            retorno = false;
        } else {
            dia = data.substring(0, 2);
            mes = data.substring(3, 5);
            ano = data.substring(6, 10);
            
            
            
//            System.out.println(dia);
//            System.out.println(mes);
//            System.out.println(ano);


            if (Integer.parseInt(dia) < 1 || Integer.parseInt(dia) > 31) {

                JOptionPane.showMessageDialog(null, "O dia deve ser entre 1 a 31");
                retorno = false;

            } else if (Integer.parseInt(mes) < 1 || Integer.parseInt(mes) > 12) {

                JOptionPane.showMessageDialog(null, "O mês deve ser entre 1 a 12");
                retorno = false;

            } else if (Integer.parseInt(ano) < anoMin || Integer.parseInt(ano) > Integer.parseInt(anoAtual) + qtAnosAposDataAtual) {
                JOptionPane.showMessageDialog(null, "O ano não podi ser menor que " + anoMin + " e maior que " + (Integer.parseInt(anoAtual) + qtAnosAposDataAtual));
                retorno = true;
            } else {

                retorno = true;
            }



        }
        return retorno;

    }

   
}
