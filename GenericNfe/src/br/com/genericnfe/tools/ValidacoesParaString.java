package br.com.genericnfe.tools;

/**
 *
 * @author jsoliveira
 */
public class ValidacoesParaString {

    public boolean validaStringSoDeLetras(String string) {

        return string.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$");

    }

    public boolean validaStringSoDeNumeros(String string) {
        
        return string.matches("^[0-9]*$");
    }

    public static void main(String[] args) {

        
       ValidacoesParaString string =new ValidacoesParaString();
       String validar="a";

        System.out.println("ValidaSoNumeros->"+string.validaStringSoDeNumeros(validar));
        System.out.println("ValidaSoLetras->"+string.validaStringSoDeLetras(validar));
        
     
    

    }
}
