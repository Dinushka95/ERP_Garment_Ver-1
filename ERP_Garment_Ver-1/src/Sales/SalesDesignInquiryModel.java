/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import com.github.lgooddatepicker.components.DatePicker;
import MainSystem.MainWindow;
import MainSystem.Validation;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesDesignInquiryModel {
    
    
    public boolean AddSDI(JTextField SDIID,JTextField CustomerId,DatePicker Date,JTable table,JTextField Description,DatePicker DueDate){
        Validation validation =new Validation();
        if(validation.ValidationCheck(SDIID, true,0,'@')&&validation.ValidationCheck(CustomerId, true,0,'@')&&validation.ValidationCheck(Description, true,0,'@')){
        boolean x =MainWindow.db_con.execute("");   
         return x;
        }
        return false;
        
    }
    
}
