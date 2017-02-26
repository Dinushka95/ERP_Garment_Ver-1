
package Sales;

import com.github.lgooddatepicker.components.DatePicker;
import MainSystem.DB_Connect;
import static MainSystem.MainWindow.userid;
import java.sql.ResultSet;
import javax.swing.JTextField;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
/**
 *
 * @author Dinushka
 */
public class CustomerModel {
   
public boolean AddCustomer(JTextField CustomerId,JTextField CustomerName,JTextField CompanyName,JTextField Phone,JTextField Email,JTextField Address,DatePicker Date){
        
        if( validation.ValidationCheck(CustomerId, true,0,'@')&&
            validation.ValidationCheck(CustomerName, true,0,'@')&&
            validation.ValidationCheck(CompanyName, true,0,'@')&&
            validation.ValidationCheck(Phone, true,0,'1')&&
            validation.ValidationCheck(Email, false,0,'@')&&
            validation.ValidationCheck(Address, false,0,'@')){
        
            boolean x =autoSqlQuery.executeAutoADD(new String[]  {"CustomerId="+CustomerId.getText(),
                                                            "CustomerName="+CustomerName.getText(),
                                                            "CustomerCompanyName="+CompanyName.getText(),
                                                            "CustomerPhone="+Phone.getText(),
                                                            "CustomerEmail="+Email.getText(),
                                                            "CustomerAddress="+Address.getText(),
                                                            "CustomerAddedDate="+Date.getText(),
                                                            "users_table_userId="+userid,
                                                           }, "d_customer_table");
         return x;
        }
        return false;
    }
public ResultSet ViewAll(){
    
   
   DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_customer_table");
   
    return DB_Connect.DB_ResultSet;
    }
    
public boolean EditCustomer(String CustomerId,JTextField CustomerName,JTextField CompanyName,JTextField Phone,JTextField Email,JTextField Address){
        if( validation.ValidationCheck(CustomerName, true,0,'@')&&
            validation.ValidationCheck(CompanyName, true,0,'@')&&
            validation.ValidationCheck(Phone, true,0,'1')&&
            validation.ValidationCheck(Email, false,0,'@')&&
            validation.ValidationCheck(Address, false,0,'@')){
        boolean x =autoSqlQuery.executeAutoEdit(new String[]{  "CustomerName="+CustomerName.getText(),
                                                            "CustomerCompanyName="+CompanyName.getText(),
                                                            "CustomerPhone="+Phone.getText(),
                                                            "CustomerEmail="+Email.getText(),
                                                            "CustomerAddress="+Address.getText()},
                                                            "d_customer_table","CustomerId",CustomerId);      
         return x;
        }
        return false;  
    }
    
public boolean DeleteCustomer(String CustomerId){
    boolean x =autoSqlQuery.executeAutoDelete("d_customer_table","CustomerId",CustomerId);     
         return x;
        }
    
public ResultSet SearchID(String Key){
    DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId",Key);
        return DB_Connect.DB_ResultSet;
    }
      
   
public ResultSet SearchName(String Key){
    DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerName=", Key);

    return DB_Connect.DB_ResultSet;
    }
         
public ResultSet Searchphone(String Key){
DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerPhone=", Key);
    return DB_Connect.DB_ResultSet;
    }
}
