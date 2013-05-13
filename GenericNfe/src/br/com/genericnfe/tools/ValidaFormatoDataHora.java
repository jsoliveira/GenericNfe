package br.com.genericnfe.tools;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidaFormatoDataHora {

    public void validaformatohora(JTextField hora) {


       if (hora.getText().trim().replaceAll(":", "").equals("")) {
            hora.setText(":");
            return;
        }

        if (hora.getText().length() != 5) {
            JOptionPane.showMessageDialog(null, "Hora inválida!\n"
                    + "Formato válido: hh:mm 24h");
            hora.setText(":");
            return;
        }

        if (!hora.getText().substring(2, 3).equals(":")) {
            JOptionPane.showMessageDialog(null, "Hora inválida!\n"
                    + "Formato válido: hh:mm 24h");
            hora.setText(":");
            return;
        }

        String strHoras = hora.getText().substring(0, 2);
        String strMinutos = hora.getText().substring(3);

        int intHoras;
        int intMinutos;

        try {
            intHoras = Integer.parseInt(strHoras);
            intMinutos = Integer.parseInt(strMinutos);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hora inválida!\n"
                    + "Formato válido: hh:mm 24h");
            hora.setText(":");
            return;
        }

        if (intHoras > 23 || intMinutos > 59) {
            JOptionPane.showMessageDialog(null, "Hora inválida!\n"
                    + "Formato válido: hh:mm 24h");
            hora.setText(":");
            return;
        }


    

    }
}
