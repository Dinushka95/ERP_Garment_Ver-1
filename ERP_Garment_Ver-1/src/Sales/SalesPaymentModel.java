
package Sales;

import MainSystem.DB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import MainSystem.Validation;
import com.github.lgooddatepicker.components.DatePicker;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesPaymentModel {
    
    
    
    
    public boolean AddSPI(JTextField salesPaymentId,JTextField customerId,JTextField salesInvoiceId,DatePicker Date,JComboBox paymentType,JTextField totalPayable,JTextField paymentAmount,JTextField dueAmount){
        
          //check for atleast one size value

      validation =new Validation();
        
        if(validation.ValidationCheck(salesPaymentId, true,0,'@')&&
           validation.ValidationCheck(customerId, true,0,'@')&&
           validation.ValidationCheck(salesInvoiceId, true,0,'@')){
            
            boolean x =autoSqlQuery.executeAutoADD(new String[]{"salesPaymentId="+salesPaymentId.getText(),
                                                                "customerId="+customerId.getText(),           
                                                                "salesInvoiceId="+salesInvoiceId.getText(),
                                                                "Date="+Date.getText(),
                                                                "paymentType="+paymentType.getSelectedItem().toString(),
                                                                "totalPayable="+totalPayable.getText(),
                                                                "paymentAmount="+paymentAmount.getText(),
                                                                "dueAmount="+dueAmount.getText(),
                                                                "users_table_userId="+Integer.toString(MainWindow.userid),
                                                                },"d_salesPayment_table");

            }

        return false;    
    }
    
 public ResultSet ViewAllSalesInvoice(){
    return DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_salesInvoice_table");
    }
    
}
