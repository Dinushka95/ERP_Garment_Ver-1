
package Sales;

import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import MainSystem.AutoValidation;
import static MainSystem.MainWindow.autoSqlQuery;
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
public class SalesPaymentModel {
    
    
    
    
    public boolean AddSPI(JTextField salesPaymentId,JTextField customerId,JTextField salesInvoiceId,DatePicker Date,JComboBox paymentType,JTextField totalPayable,JTextField paymentAmount,JTextField dueAmount){
        
          //check for atleast one size value

      validation =new AutoValidation();
        
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
            return x;
            }

        return false;    
    }
    
    public ResultSet ViewAllSalesInvoice(){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_salesInvoice_table");
    }
    
    public ResultSet ViewAllSalesPayment(){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_salesPayment_table");
    }
    
    public ResultSet SearchSalesInvoice(String salesivoice){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_salesInvoice_table","salesInvoiceId",salesivoice);
    }
    
    public ResultSet SearchCustomerID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_salesPayment_table","customerId", Key);
        
    }
    
    public ResultSet SearchPaymentID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_salesPayment_table","salesPaymentId", Key);
        
    }
    public ResultSet SearchCustomerName(String Key){
        String temn = null;
        AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeAutoSearchAll("d_customer_table","Name", Key);
        try {
            AutoDB_Connect.DB_ResultSet.next();
            temn=AutoDB_Connect.DB_ResultSet.getString("CustomerId");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDesignInquiryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SearchCustomerID(temn);
    }
    
        public ResultSet SearchCustomerPhone(String Key){
        String temn = null;
        AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeAutoSearchAll("d_customer_table","Phone", Key);
        try {
            AutoDB_Connect.DB_ResultSet.next();
            temn=AutoDB_Connect.DB_ResultSet.getString("CustomerId");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDesignInquiryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SearchCustomerID(temn);
    }
}


    
