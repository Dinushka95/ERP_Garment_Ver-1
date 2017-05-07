/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distribution;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author chathu
 */
public class validation {
    
     public static boolean checkDate(String strtdate,String enddt)
    {
        try{
                SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
                Date date=new Date();
                Date date1 = dformat.parse(strtdate);
                Date date2 = dformat.parse(enddt);
                if(date1.after(date2) ){
                     JOptionPane.showMessageDialog(null, "Shipped date can't be before Delivery Date  ");
                     
                }
                else{
                    
                        return true;
                     }
        }
        catch(Exception e)
        {
                System.out.println(e);
                        
        }
        return false;
    }
     
        
        public static  boolean isLetter(String word)
    {
        char c;
        int i=0;
        boolean l=false;    
        while(i<word.length())
        {
            c=word.charAt(i);
            if(Character.isLetter(c))
            {
                i++;
                
                
            }
            else{
                   
                l=true;
                i++;
            }
        }
            if(l)
            {
                JOptionPane.showMessageDialog(null, "The data enetered  "+word+" is not a Letter");
                return false;
            }
            
            
        
        return true;
    } 
        
           
        public static  boolean isDigit(String word)
    {
        char d;
        int i=0;
        boolean l=false;    
        while(i<word.length())
        {
            d=word.charAt(i);
            if(Character.isDigit(d))
            {
                i++;
                
                
            }
            else{
                   
                l=true;
                i++;
            }
        }
            if(l)
            {
                JOptionPane.showMessageDialog(null, "The data enetered  "+word+" is not a digit");
                return false;
            }
            
            
        
        return true;
    }    
        
          public static  boolean isAlphanumeric(String word)
    {
        char d;
        int i=0;
        boolean l=false;    
        while(i<word.length())
        {
            d=word.charAt(i);
            if(Character.isLetter(d)||Character.isDigit(d))
            {
                                
                i++;
            }
            else{
                
                
                l=true;
                i++;
                
                
            }
        }
            if(l)
            {
                JOptionPane.showMessageDialog(null, "The data enetered  "+word+" is not a charactors digit");
                return false;
            }
            
            
        
        return true;
    }    
}
