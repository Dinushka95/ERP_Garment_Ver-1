/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import MainSystem.DB_Connect;
import com.github.lgooddatepicker.components.DatePicker;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.db_con;
import MainSystem.Validation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesDesignInquiryModel {
    
    
    public boolean AddSDI(JTextField SDIID,JTextField CustomerId,DatePicker Date,JTable table,JTextField Description,DatePicker DueDate){
        String y1=null;
        String x1=null;
        String z1=null;
        String z2=null;
        boolean check =false;
        int c=0;
          //check for atleast one size value
        try {
        y1=(String) table.getValueAt(0,0); 
        
        } 
        catch (Exception e){
        return false;
        }
        
        Validation validation =new Validation();
        
        if(validation.ValidationCheck(SDIID, true,0,'@')&&validation.ValidationCheck(CustomerId, true,0,'@')&&validation.ValidationCheck(Description, true,0,'@')){
        boolean x =MainWindow.db_con.execute("INSERT INTO `garmentsystem`.`designinquiry_table`\n" +
"(\n" +
"`SalesDesignInquiryId`,\n" +
"" +
"`Description`,\n" +
"`AddedDate`,\n" +
"`DueDate`,\n" +
"`status-Approval`,\n" +
"`status-ApprovalName`,\n" +
"`status-DesignCreated`,\n" +
"`status-DesignCreatedName`,\n" +
"`users_table_userId`,\n" +
"`customer_table_CustomerId`)\n" +
"VALUES\n" +
"(\n" +
"'"+SDIID.getText()+"',\n" +
"\n" +
"'"+Description.getText()+"',\n" +
"'"+Date.getText()+"',\n" +
"'"+DueDate.getText()+"',\n" +
"'false',\n" +
"'null',\n" +
"'false',\n" +
"'null',\n" +
""+Integer.toString(MainWindow.userid)+",\n" +
"'"+CustomerId.getText()+"');");  
        
        int id=0;
        DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.designinquiry_table ORDER BY ID DESC;");
            try {
                DB_Connect.DB_ResultSet.next();
                 id=Integer.parseInt(DB_Connect.DB_ResultSet.getString("ID"));
                 System.err.println(id);
            } catch (SQLException ex) {
                Logger.getLogger(SalesDesignInquiryModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        boolean x3=false;    
        table.getRowCount();
        while(c<table.getRowCount()){
            y1=null;
            x1=null;
            z1=null;
            //z2=null;
            try {
                y1=(String) table.getValueAt(c,0); 
                x1=(String) table.getValueAt(c,1);
                z1=(String) table.getValueAt(c,2);
                //z2=(String) table.getValueAt(c,3);
                
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            System.err.println(id);
            x3 =MainWindow.db_con.execute("INSERT INTO `garmentsystem`.`designinquiry_table1`\n" +
"(`Size`,\n" +
"`Quantity`,\n" +
"`designinquiry_table_ID`,`Colour`,`status-DesignCreated`)\n" +
"VALUES\n" +
"('"+y1+"',\n" +
"'"+x1+"',\n" +
""+id+",'"+z1+"','false');"); 
        }
        
        if(x&&x3){
         return x;}
        }
    return false;    
    }
    
    public ResultSet ViewAll(){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.designinquiry_table where MarketDesignInquiryId IS NULL ORDER BY AddedDate desc;");

    return DB_Connect.DB_ResultSet;
    }
    
    public ResultSet ViewAllCustomer(){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT `customer_table`.`CustomerId`,\n" +
    "    `customer_table`.`CustomerName`,\n" +
    "    `customer_table`.`CustomerCompanyName`,\n" +
    "    `customer_table`.`CustomerPhone`,\n" +
    "    `customer_table`.`CustomerEmail`,\n" +
    "    `customer_table`.`CustomerAddress`,\n" +
    "    `customer_table`.`CustomerAddedDate`\n" +
    "FROM `garmentsystem`.`customer_table`;");

    return DB_Connect.DB_ResultSet;
    }
    
    public ResultSet SearchSDIID(String Key){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.designinquiry_table where SalesDesignInquiryId='"+Key+"';");

    return DB_Connect.DB_ResultSet;
    }
      
   
public ResultSet SearchCustomerID(String Key){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.designinquiry_table where customer_table_CustomerId='"+Key+"';");

    return DB_Connect.DB_ResultSet;
    }
         
public ResultSet SearchCustomerName(String Key){
   DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.designinquiry_table where customer_table_CustomerId=(SELECT `customer_table`.`CustomerId`\n" +
"FROM `garmentsystem`.`customer_table` where CustomerName='"+Key+"');");

    return DB_Connect.DB_ResultSet;
    }

public boolean DeleteSDI(String SDIId){
    boolean x =MainWindow.db_con.execute("DELETE FROM garmentsystem.designinquiry_table`WHERE salesdesigninquiry_table_SalesDesignInquiryId='"+SDIId+"';"); 
    boolean y =MainWindow.db_con.execute("DELETE FROM garmentsystem.designinquiry_table`WHERE SalesDesignInquiryId='"+SDIId+"';"); 
      
         return x;
        }

    
}
