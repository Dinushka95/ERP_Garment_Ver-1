/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainSystem;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Dinushka
 */
public class AutoGetImage {
    File file;
    ImageIcon icon1;

    public AutoGetImage() {

   }
    
    public void load(){
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
        JFileChooser fileChooser121 = new JFileChooser();
        fileChooser121.setFileFilter(filter);
        int result = fileChooser121.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser121.getSelectedFile();
        System.out.println("Selected pattern file: " + selectedFile.getAbsolutePath());
        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
    
        file=selectedFile;
        icon1=icon;  
    }
        
    }
    
    
    public File getFile(){
        return file;
    }
    
    public ImageIcon getImageIcon(){
        return icon1;
    }
    
    
    
}
