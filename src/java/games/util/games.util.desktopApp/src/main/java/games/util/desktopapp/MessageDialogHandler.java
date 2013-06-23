package games.util.desktopapp;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Static class containing various messages handlers methods.
 * @author Gustavo
 */
public class MessageDialogHandler {
    
    /**
     * Displays messageDialog in the corresponding component.
     * @param component Jframe or JPanel in which  the message will be displayed.
     * @param message String to be desplayed.
     * @param title String defining type of message. "Error", "Information", "Warning" and "Plain".
     * Empty <code>title</code> will display (component, message) plain messageDialog.
     */
    public static void alertMessage(Component component, String message, String title){
        if(title.equals("Error")){
            JOptionPane.showMessageDialog(component, message, title, JOptionPane.ERROR_MESSAGE);
        }
        else if(title.equals("Information")){
            JOptionPane.showMessageDialog(component, message, title, JOptionPane.INFORMATION_MESSAGE);
        }
        else if(title.equals("Warning")){
            JOptionPane.showMessageDialog(component, message, title, JOptionPane.WARNING_MESSAGE);
        }
        else if(title.equals("Plain")){
            JOptionPane.showMessageDialog(component, message, title, JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(component, message);
        }
    }
    
}
