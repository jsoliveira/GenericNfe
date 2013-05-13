/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.genericnfe.tools;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JTabbedPane;
import javax.swing.JFrame;
import javax.swing.JDialog;

/**
 *
 * @author acsantana
 */
public class ValidaEnter {

    public void ValidaEnter(JTabbedPane Numero) {
        HashSet conj = new HashSet(Numero.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        Numero.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

    }

    public void ValidaEnterFrame(JFrame Numero) {
        HashSet conj = new HashSet(Numero.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        Numero.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        
    }

    public void ValidaEnterDialog(JDialog Numero) {
        HashSet conj = new HashSet(Numero.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        Numero.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

    }
//    public static void main(String[] args) {
//
//    }
}
