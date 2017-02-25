/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import static MainSystem.AutoQuery.db_con;
import com.github.lgooddatepicker.components.DatePicker;
import MainSystem.DB_Connect;
import static MainSystem.MainWindow.autoQuery;
import MainSystem.Validation;
import static MainSystem.MainWindow.userid;
import java.sql.ResultSet;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class CustomerModel {
    
    
public boolean AddCustomer(JTextField CustomerId,JTextField CustomerName,JTextField CompanyName,JTextField Phone,JTextField Email,JTextField Address,DatePicker Date){
        Validation validation =new Validation();
        if(validation.ValidationCheck(CustomerId, true,0,'@')&&validation.ValidationCheck(CustomerName, true,0,'@')&&validation.ValidationCheck(CompanyName, true,0,'@')&&validation.ValidationCheck(Phone, true,0,'1')&&validation.ValidationCheck(Email, false,0,'@')&&validation.ValidationCheck(Address, false,0,'@')){
        
            boolean x =autoQuery.executeAutoADD(new String[]  {"CustomerId="+CustomerId.getText(),
                                                            "CustomerName="+CustomerName.getText(),
                                                            "CustomerCompanyName="+CompanyName.getText(),
                                                            "CustomerPhone="+Phone.getText(),
                                                            "CustomerEmail="+Email.getText(),
                                                            "CustomerAddress="+Address.getText(),
                                                            "CustomerAddedDate="+Date.getText(),
                                                            "users_table_userId="+userid,
                                                           }, "d_customer_table");
              
      //   return x;
        }
        return false;
        
    }
public ResultSet ViewAll(){
    
   
   DB_Connect.DB_ResultSet = autoQuery.executeAutoViewAll("d_customer_table");
   
    return DB_Connect.DB_ResultSet;
    }
    
public boolean EditCustomer(String logNo,String Customerid,JTextField CustomerName,JTextField CompanyName,JTextField Phone,JTextField Email,JTextField Address){
    Validation validation =new Validation();
        if(validation.ValidationCheck(CustomerName, true,0,'@')&&validation.ValidationCheck(CompanyName, true,0,'@')&&validation.ValidationCheck(Phone, true,0,'1')&&validation.ValidationCheck(Email, false,0,'@')&&validation.ValidationCheck(Address, false,0,'@')){
        boolean x =autoQuery.executeAutoEdit(new String[]{"CustomerName="+CustomerName.getText()},"d_customer_table","CustomerId",Customerid);
                  
         return x;
        }
        return false;
        
    }
    
    public boolean DeleteCustomer(String CustomerId){
    boolean x =db_con.execute("DELETE FROM `garmentsystem`.`customer_table` \n" +
    "WHERE\n" +
    "CustomerId = '"+CustomerId+"';");   
         return x;
        }
    
public ResultSet SearchID(String Key){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT `customer_table`.`CustomerId`,\n" +
    "    `customer_table`.`CustomerName`,\n" +
    "    `customer_table`.`CustomerCompanyName`,\n" +
    "    `customer_table`.`CustomerPhone`,\n" +
    "    `customer_table`.`CustomerEmail`,\n" +
    "    `customer_table`.`CustomerAddress`,\n" +
    "    `customer_table`.`CustomerAddedDate`\n" +
    "FROM `garmentsystem`.`customer_table` where `CustomerId`= '"+Key+"';");

    return DB_Connect.DB_ResultSet;
    }
      
   
public ResultSet SearchName(String Key){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT `customer_table`.`CustomerId`,\n" +
    "    `customer_table`.`CustomerName`,\n" +  
    "    `customer_table`.`CustomerCompanyName`,\n" +
    "    `customer_table`.`CustomerPhone`,\n" +
    "    `customer_table`.`CustomerEmail`,\n" +
    "    `customer_table`.`CustomerAddress`,\n" +
    "    `customer_table`.`CustomerAddedDate`\n" +
    "FROM `garmentsystem`.`customer_table` where `CustomerName`= '"+Key+"';");

    return DB_Connect.DB_ResultSet;
    }
         
public ResultSet Searchphone(String Key){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT `customer_table`.`CustomerId`,\n" +
    "    `customer_table`.`CustomerName`,\n" +
    "    `customer_table`.`CustomerCompanyName`,\n" +
    "    `customer_table`.`CustomerPhone`,\n" +
    "    `customer_table`.`CustomerEmail`,\n" +
    "    `customer_table`.`CustomerAddress`,\n" +
    "    `customer_table`.`CustomerAddedDate`\n" +
    "FROM `garmentsystem`.`customer_table` where `CustomerPhone`= '"+Key+"';");

    return DB_Connect.DB_ResultSet;
    }
   
 
}
