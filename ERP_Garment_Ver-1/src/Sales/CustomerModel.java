
package Sales;

import com.github.lgooddatepicker.components.DatePicker;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.aid;
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
            validation.ValidationCheck(CustomerName, true,0,'s')&&
            validation.ValidationCheck(CompanyName, true,0,'@')&&
            validation.ValidationCheck(Phone, true,0,'1')&&
            validation.ValidationCheck(Email, false,0,'@')&&
            validation.ValidationCheck(Address, false,0,'@')){
        
            boolean x =autoSqlQuery.executeAutoADD(new String[]  {"CustomerId="+CustomerId.getText(),
                                                            "Name="+CustomerName.getText(),
                                                            "CompanyName="+CompanyName.getText(),
                                                            "Phone="+Phone.getText(),
                                                            "Email="+Email.getText(),
                                                            "Address="+Address.getText(),
                                                            "AddedDate="+Date.getText(),
                                                            "userId="+userid,
                                                           }, "d_customer_table");
         return x;
        }
        return false;
    }

    public String generate_cid(){
        return aid.generate("cus",Integer.toString(MainWindow.userid));
    }
    
    public ResultSet ViewAll(){   
        return autoSqlQuery.executeAutoViewAll("d_customer_table");
    }
    
    public boolean EditCustomer(String CustomerId,JTextField CustomerName,JTextField CompanyName,JTextField Phone,JTextField Email,JTextField Address){
        if( validation.ValidationCheck(CustomerName, true,0,'@')&&
            validation.ValidationCheck(CompanyName, true,0,'@')&&
            validation.ValidationCheck(Phone, true,0,'1')&&
            validation.ValidationCheck(Email, false,0,'@')&&
            validation.ValidationCheck(Address, false,0,'@')){
            
            boolean x =autoSqlQuery.executeAutoEdit(new String[]{  "Name="+CustomerName.getText(),
                                                            "CompanyName="+CompanyName.getText(),
                                                            "Phone="+Phone.getText(),
                                                            "Email="+Email.getText(),
                                                            "Address="+Address.getText()},
                                                            "d_customer_table","CustomerId",CustomerId);      
            return x;
        }
        return false;  
    }
    
    public boolean DeleteCustomer(String CustomerId){   
        return autoSqlQuery.executeAutoDelete("d_customer_table","CustomerId",CustomerId);
    }
    
    public ResultSet SearchID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId",Key);
    }
    
    public ResultSet SearchName(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_customer_table","Name", Key);
    }
         
    public ResultSet Searchphone(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_customer_table","Phone", Key);
    }
    
    public ResultSet SearchDateRange(String TableName,String KeyName,DatePicker FromDate,DatePicker ToDate){
        return autoSqlQuery.executeAutoSearchDateRange(TableName, KeyName, FromDate.getText(), ToDate.getText());
    }
}
