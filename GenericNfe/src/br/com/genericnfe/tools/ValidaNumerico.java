package br.com.genericnfe.tools;

import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidaNumerico {

    public String valida;

    public void ValidaNumero(JTextField Numero) {
        //long valor;
        Double valor;

        if (Numero.getText().length() != 0) {
            try {
                //    valor = Long.parseLong(Numero.getText());
                valor = Double.parseDouble(Numero.getText());

                valida = "V";
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Esse Campo só aceita números do tipo : #,##", "Informação", JOptionPane.INFORMATION_MESSAGE);
                Numero.grabFocus();
                Numero.setText("");
                valida = "F";
            }
        }
    }

    public boolean validaInteiro(JTextField campo) {

        if (campo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Informe um valor inteiro");
            return false;
        }

        try {
            Integer i = Integer.parseInt(campo.getText());

            return true;
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Esse campo só aceita valores inteiros");
            campo.setText("");
            return false;
        }

    }

    public boolean validarCampoDecimalPositivo(JTextField campo) {
        Double valor;

        if (campo.getText().length() != 0) {
            try {
                valor = Double.parseDouble(campo.getText().replaceAll(",", "."));

                if (valor > 0) {
                    return true;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Esse campo só aceita números decimais", "Informação", JOptionPane.INFORMATION_MESSAGE);
                campo.selectAll();
                campo.setText("");
                return false;
            }
        }

        return true;
    }

    public void FormataNumero(JTextField campo) {
        int cont = -1;

        if (!campo.getText().equals("")) {

            String conteudo = campo.getText();
            try {
                conteudo = conteudo.replaceAll(",", ".");

                Double valor = Double.parseDouble(conteudo);

                for (int x = 0; x < conteudo.length(); x++) {
                    if (conteudo.charAt(x) == '.') {
                        cont = x;
                    }
                }

                if (conteudo.indexOf('-') != -1) {
                    JOptionPane.showMessageDialog(null, "Esse Campo só aceita valores positivos !", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    campo.setText("");
                    campo.grabFocus();
                    return;
                }

                int cont2 = cont + 1;
                int dif = conteudo.length() - cont2;
                if (cont == -1) {
                    conteudo = conteudo + ".00";
                    campo.setText(conteudo);
                    return;
                } else if (dif > 2) {
                    JOptionPane.showMessageDialog(null, "Este campo  aceita no máximo 2 digitos após a virgula!");
                    campo.setText("");
                    campo.grabFocus();
                    return;
                } else if (cont > 7) {
                    JOptionPane.showMessageDialog(null, "Este campo aceita no máximo 7 digitos antes da virgula!");
                    campo.setText("");
                    campo.grabFocus();
                    return;
                } else if (cont == 0) {
                    if (dif == 1) {
                        conteudo = "0" + conteudo + "0";
                        campo.setText(conteudo);
                        return;
                    } else {
                        conteudo = "0" + conteudo;
                        campo.setText(conteudo);
                        return;
                    }
                } else if (dif == 1) {
                    conteudo = conteudo + "0";
                    campo.setText(conteudo);
                    return;
                } else if (cont2 == conteudo.length()) {
                    conteudo = conteudo + "00";
                    campo.setText(conteudo);
                    return;
                } else {
                    campo.setText(conteudo);
                    return;
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Este campo só aceita valores numéricos !");
                campo.setText("");
                campo.grabFocus();
                return;
            }
        }
    }

    public void formatarNumero(JTextField campo, int qtdeCasasDec) {
        if (campo.getText().equals("")) {
            return;
        }

        String strValor = campo.getText().replaceAll(",", ".");

        Double valor = 0.0;

        try {
            valor = Double.parseDouble(strValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
            campo.setText("");
            return;
        }

        String strZeros = "";

        for (int cont = 0; cont < qtdeCasasDec; cont++) {
            strZeros += "0";
        }

        DecimalFormat decimalFormat = new DecimalFormat("######." + strZeros);
        decimalFormat.setMinimumFractionDigits(qtdeCasasDec);
        decimalFormat.setMaximumFractionDigits(qtdeCasasDec);

        strValor = decimalFormat.format(valor);

        campo.setText(strValor.replaceAll(",", "."));
    }
}
