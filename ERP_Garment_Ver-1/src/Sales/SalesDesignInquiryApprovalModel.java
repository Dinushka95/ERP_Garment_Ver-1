
package Sales;

import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePicker;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesDesignInquiryApprovalModel {
    
    public ResultSet ViewAllSDI(){
    return autoSqlQuery.executeAutoViewAll("d_designinquiry_table order by 'AddedDate' desc");
    }
    
    public ResultSet SearchSDI(String key){
    return autoSqlQuery.executeAutoSearchAll("d_designinquiry_table","DesignInquiryId",key);
    }
    
        
    public boolean Update(DatePicker date ,JTextField SDI,JTextField Name,JComboBox combobox){
        
            if(validation.ValidationCheck(Name, true,0,'@')&&
               validation.ValidationCheck(SDI, true,0,'@')){
           
           
            boolean x = autoSqlQuery.executeAutoEdit(new String[]{
                                                                "StatusApproval="+combobox.getSelectedItem(),
                                                                "StatusApprovalName="+Name.getText(),
                                                                "StatusApprovalDate="+date.getText()
                                                                },"d_designinquiry_table","DesignInquiryId",SDI.getText());
                    
   
            return true;
            }
            else {
             return false;
            }
    }
    public String SearchEmployeeById(int key)  {
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("emp_table","emp_id",String.valueOf(key));
        try {
            AutoDB_Connect.DB_ResultSet.next();
            return AutoDB_Connect.DB_ResultSet.getString("f_name");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDesignInquiryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   
    return null;  
    }
}
