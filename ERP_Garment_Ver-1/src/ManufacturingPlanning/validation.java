/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManufacturingPlanning;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

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
}

