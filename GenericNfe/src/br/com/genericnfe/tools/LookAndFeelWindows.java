

package br.com.genericnfe.tools;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author acsantana
 */
public class LookAndFeelWindows {

    
      public void Windows(JFrame frame) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(frame);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LookAndFeelWindows.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LookAndFeelWindows.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LookAndFeelWindows.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LookAndFeelWindows.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   
      }
    
    
}
