/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanResource.Util;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author vihplk
 */
public class Common {
    
    public static Boolean CheckNull(JPanel panel) {
        
        for(Component c : panel.getComponents()) {
            if(c instanceof JTextField) {
                if(((JTextField)c).getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are mandatory!");
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
