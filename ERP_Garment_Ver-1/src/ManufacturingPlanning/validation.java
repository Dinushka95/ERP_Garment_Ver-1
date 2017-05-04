/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManufacturingPlanning;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeString;


/**
 *
 * @author ruman
 */
public  class validation {
    
    public static boolean checkDate(String startDate,String EndDate)
    {
        try{
                SimpleDateFormat dformat = new SimpleDateFormat("yyyy/MM/dd");
                Date date=new Date();
                Date date1 = dformat.parse(startDate);
                Date date2 = dformat.parse(EndDate);
                
                if(date1.after(date2) ){
                     JOptionPane.showMessageDialog(null, "End date can't be before start Date  ");
                     
                }
                else{
                    if( date1.before(date)){
                        JOptionPane.showMessageDialog(null, "Start Date can't be before Current Date  ");
                        
                    }
                    else{
                        return true;
                        
                    
                    }
                }
        }
        catch(Exception e)
        {
                System.out.println(e);
                        
        }
        return false;
    }
    public static boolean checkDate(String startDate,String EndDate,String prevEndDate )
    {
        try{
                SimpleDateFormat dformat = new SimpleDateFormat("yyyy/MM/dd");
                Date date=new Date();
                Date date1 = dformat.parse(startDate);
                Date date2 = dformat.parse(EndDate);
                Date preDate = dformat.parse(prevEndDate);
                
                
                if(date1.after(date2) ){
                     JOptionPane.showMessageDialog(null, "End date can't be before start Date  ");
                     
                }
                else{
                    if( date1.before(date)){
                        JOptionPane.showMessageDialog(null, "Start Date can't be before Current Date  ");
                        if(preDate.after(date1))
                            JOptionPane.showMessageDialog(null, "The rocesses should takeplace in order Cutting->Sewing->Washing->Iron&Packing ");
                    }
                    else{
                        return true;
                        
                    
                    }
                }
        }
        catch(Exception e)
        {
                System.out.println(e);
                        
        }
        return false;
    }
    
       
        
        public static  boolean isDigit(String word)
    {
        char c;
        int i=0;
        boolean l=false;    
        while(i<word.length())
        {
            c=word.charAt(i);
            if(Character.isDigit(c))
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
                JOptionPane.showMessageDialog(null, "The data enetered is not a digit");
                return false;
            }
            
            
        
        return true;
    }    
//        try {
//            double d = Double.parseDouble(word);
//            
//        }
//        catch (NumberFormatException nfe)
//        {
//            JOptionPane.showMessageDialog(null, "The data enetered is not a digit");
//            return false;
//        }
//        return true;
    

    
    
    
    
}

