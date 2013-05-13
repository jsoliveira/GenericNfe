package br.com.genericnfe.tools;

import javax.swing.JOptionPane;

/**
 * @author jpribeiro
 */
public class ValidaEmail {

    
    /*
     * valida se o email contém "@", se contém "." e se o "." não vem logo após o "@"
     */
    public boolean validaEmail(String email) {
                        
        if (!(email.indexOf("@") != -1 && email.indexOf(".") != -1 && email.indexOf("@.") == -1)) {
            JOptionPane.showMessageDialog(null, "Email Inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
        
    }
}
