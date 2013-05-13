package br.com.genericnfe.tools;

/**
 *
 * @author jsoliveira
 */
public class ValidaNumerosNaString {

    public boolean SoTemNumeros(String texto) {
        try {
            Long.parseLong(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
