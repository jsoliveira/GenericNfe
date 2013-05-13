package br.com.genericnfe.tools;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.text.MaskFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author acsantana
 */
public class ValidaHoras {

    public int retorno = 0; //---- UTILIZADO NO MOV_MANEJO_TESTE, TESTA A HORA E NAO DEIXA SALVAR -----//
    public int horas_trabalhadas_talhao_maquina;
    public String maior;
    SimpleDateFormat sdf = new SimpleDateFormat("kk:mm");
    public String horas_trabalhadas, horas_trabalhadas_talhao;

    public void ValidaHoras(JTextField campo) {


        String pega = "";
        String hora = null;
        String minuto = null;
        int conta_pega = 0;
        int conta_hora = 0;
        int conta_minuto = 0;

        pega = campo.getText();
        pega = pega.trim();
//        if ( pega.equals(":")) {   
//            JOptionPane.showMessageDialog(null, "Digite a hora" ,"Operador",JOptionPane.ERROR_MESSAGE);   
//            jTHrInicio.setText("  :  ");   
//            return;   
//        }   
        if (!pega.equals(":")) {


            conta_pega = pega.length();
            if (conta_pega < 5) {
                campo.setText("");
                JOptionPane.showMessageDialog(null, "Digite uma hora valida", "SisIpe", JOptionPane.ERROR_MESSAGE);
                campo.grabFocus();
                return;
            }

            hora = pega.substring(0, 2);
            minuto = pega.substring(3, 5);
            conta_hora = Integer.parseInt(hora);
            conta_minuto = Integer.parseInt(minuto);

            if (conta_hora > 23) {
                campo.setText("");
                JOptionPane.showMessageDialog(null, "Digite uma hora valida", "SisIpe", JOptionPane.ERROR_MESSAGE);
                campo.grabFocus();
                return;
            }
            if (conta_minuto > 59) {
                campo.setText("");
                JOptionPane.showMessageDialog(null, "Digite uma hora valida", "SisIpe", JOptionPane.ERROR_MESSAGE);
                campo.grabFocus();
                return;
            }
        }


    }

    public void ValidaHoraJFT(JFormattedTextField campo, MaskFormatter mask, JTabbedPane Tabed, int indice) {

        //---- AUTOR FERTY             ----//
        //---- 23/08/2011              ----//
        //---- USO > MOV_MANEJO_TESTE  ----//

        String pega = "";
        String hora = null;
        String minuto = null;
        int conta_pega = 0;
        int conta_hora = 0;
        int conta_minuto = 0;
        pega = campo.getText();
        pega = pega.trim();
        if (!pega.equals(":")) {
            conta_pega = pega.length();
            if (conta_pega < 5) {
                JOptionPane.showMessageDialog(null, "Digite uma hora valida !");
                mask.install(campo);
                campo.grabFocus();
                retorno = 1;
                Tabed.setSelectedIndex(indice);
                return;
            }
            hora = pega.substring(0, 2);
            minuto = pega.substring(3, 5);
            conta_hora = Integer.parseInt(hora);
            conta_minuto = Integer.parseInt(minuto);
            if (conta_hora > 23) {
                JOptionPane.showMessageDialog(null, "Digite uma hora valida !");
                mask.install(campo);
                campo.grabFocus();
                retorno = 1;
                Tabed.setSelectedIndex(indice);
                return;
            }
            if (conta_minuto > 59) {
                JOptionPane.showMessageDialog(null, "Digite uma hora valida !");
                mask.install(campo);
                campo.grabFocus();
                retorno = 1;
                Tabed.setSelectedIndex(indice);
                return;
            }
        }
        retorno = 0;
    }

    public void calculaHoras(String hora_inicio, String hora_fim) {
        try {
            Date d1 = sdf.parse(hora_inicio);
            Date d2 = sdf.parse(hora_fim);


            if (d1.getTime() > d2.getTime()) {
                maior = "inicio";

            } else {
                maior = "fim";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular horas !");
        }
    }

    public long retornarHorasDeDiferenca(Date dtInic, Date dtFim) {
        return (dtFim.getTime() - dtInic.getTime()) / (1000 * 60 * 60);
    }

    public long qtdeDias(Date dtInicial, Date dtFinal) {
        return (dtFinal.getTime() - dtInicial.getTime()) / 86400000;
    }

    public String retornaDiferencaString(String hr_inicio, String hr_fim, int qtde_dias) {
        String hora1 = hr_inicio;
        String hora2 = hr_fim;

        String horas = "00";
        String minutos = "00";
        //String segundos = "00";

        int sub = 0;
        int horas_dias = 0;
        int subHoras = 0;
        int subMinutos = 0;

        int segundos1 = (Integer.parseInt(hora1.substring(0, 2)) * 3600) + (Integer.parseInt(hora1.substring(3, 5)) * 60);
        int segundos2 = (Integer.parseInt(hora2.substring(0, 2)) * 3600) + (Integer.parseInt(hora2.substring(3, 5)) * 60);
//      int segundos1    = (Integer.parseInt(hora1.substring(0,2))*3600)+(Integer.parseInt(hora1.substring(3,5))*60)+Integer.parseInt(hora1.substring(6,8));
//      int segundos2    = (Integer.parseInt(hora2.substring(0,2))*3600)+(Integer.parseInt(hora2.substring(3,5))*60)+Integer.parseInt(hora2.substring(6,8));


        //adiciona 24 horas para cada dia
        for (int x = 0; x < qtde_dias; x++) {
            horas_dias += 86400;
        }

        if (segundos1 > segundos2) {
            sub = (horas_dias + segundos2) - segundos1;
        } else if (segundos2 > segundos1) {
            sub = (horas_dias + segundos2) - segundos1;
        } else {
            sub = 0;
        }



        if (sub >= 3600) {
            subHoras = (sub - (sub % 3600)) / 3600;
            sub = sub - (subHoras * 3600);
            if (subHoras < 10) {
                horas = "0" + Integer.toString(subHoras);
            } else {
                horas = Integer.toString(subHoras);
            }
        }

        if (sub >= 60) {
            subMinutos = (sub - (sub % 60)) / 60;
            sub = sub - (subMinutos * 60);
            if (subMinutos < 10) {
                minutos = "0" + Integer.toString(subMinutos);
            } else {
                minutos = Integer.toString(subMinutos);
            }
        }


//        if (sub < 10) {
//            segundos = "0" + Integer.toString(sub);
//        } else {
//            segundos = Integer.toString(sub);
//        }



        System.out.println("HH:MM:SS : " + horas + ":" + minutos);
        horas_trabalhadas = horas + ":" + minutos;
        return horas_trabalhadas;
    }

    public String retornaHorasPercentual(double percentual, String total_hora) {
        String hora = total_hora;
        double seg;
        //String hora2 = hr_fim;

        String horas = "00";
        String minutos = "00";
        //String segundos = "00";

        int sub = 0;
        int subHoras = 0;
        int subMinutos = 0;

        int segundos1 = (Integer.parseInt(total_hora.substring(0, 2)) * 3600) + (Integer.parseInt(total_hora.substring(3, 5)) * 60);
        //int segundos2 = (Integer.parseInt(hora2.substring(0, 2)) * 3600) + (Integer.parseInt(hora2.substring(3, 5)) * 60);
//      int segundos1    = (Integer.parseInt(hora1.substring(0,2))*3600)+(Integer.parseInt(hora1.substring(3,5))*60)+Integer.parseInt(hora1.substring(6,8));
//      int segundos2    = (Integer.parseInt(hora2.substring(0,2))*3600)+(Integer.parseInt(hora2.substring(3,5))*60)+Integer.parseInt(hora2.substring(6,8));

        seg = segundos1 * percentual / 100;
        sub = (int) seg;

        if (sub >= 3600) {
            subHoras = (sub - (sub % 3600)) / 3600;
            sub = sub - (subHoras * 3600);
            if (subHoras < 10) {
                horas = "0" + Integer.toString(subHoras);
            } else {
                horas = Integer.toString(subHoras);
            }
        }

        if (sub >= 60) {
            subMinutos = (sub - (sub % 60)) / 60;
            sub = sub - (subMinutos * 60);
            if (subMinutos < 10) {
                minutos = "0" + Integer.toString(subMinutos);
            } else {
                minutos = Integer.toString(subMinutos);
            }
        }


//        if (sub < 10) {
//            segundos = "0" + Integer.toString(sub);
//        } else {
//            segundos = Integer.toString(sub);
//        }

        System.out.println("HH:MM:SS : " + horas + ":" + minutos);
        horas_trabalhadas_talhao = horas + ":" + minutos;
        return horas_trabalhadas_talhao;
    }

    public int retornaHorasMaquinaPercentual(double percentual, String total_hora) {
        String hora = total_hora;
        double seg;
        int sub = 0;
        int segundos1 = Integer.parseInt(total_hora);
        seg = segundos1 * percentual / 100;
        sub = (int) seg;

        // System.out.println("HH:MM:SS : " + horas + ":" + minutos );
        horas_trabalhadas_talhao_maquina = sub;
        return horas_trabalhadas_talhao_maquina;
    }

    public static void main(String[] args) {
        ValidaHoras v = new ValidaHoras();
        v.retornaDiferencaString("07:00", "07:10", 1);
        //v.retornaHorasPercentual(91.12, "06:05");
    }

    public static double diferencaEmMinutos(Date dataInicial, Date dataFinal) {
        double result = 0;
        long diferenca = dataFinal.getTime() - dataInicial.getTime();
        double diferencaEmMinutos = (diferenca / 1000) / 60; //resultado é diferença entre as datas em minutos  
        long segundosRestantes = (diferenca / 1000) % 60; //calcula os segundos restantes  
        result = diferencaEmMinutos + (segundosRestantes / 60d); //transforma os segundos restantes em minutos  
        return result;
    }
}
