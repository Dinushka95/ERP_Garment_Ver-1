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
import static MainSystem.MainWindow.userid;
import MainSystem.Validation;
import java.sql.ResultSet;
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
        boolean x =MainWindow.db_con.execute("INSERT INTO `garmentsystem`.`salesdesigninquiry_table`\n" +
        "(`SalesDesignInquiryId`,\n" +
        "`customer_table_CustomerId`,\n" +
        "`Description`,\n" +
        "`AddedDate`,\n" +
        "`DueDate`,\n" +
        "`users_table_userId`)\n" +
        "VALUES\n" +
        "('"+SDIID.getText()+"',\n" +
        "'"+CustomerId.getText()+"',\n" +
        "'"+Description.getText()+"',\n" +
        "'"+Date.getText()+"',\n" +
        "'"+DueDate.getText()+"',\n" +
        ""+userid+");");  
   
        boolean x3=false;    
        table.getRowCount();
        while(c<table.getRowCount()){
            y1=null;
            x1=null;
            try {
                y1=(String) table.getValueAt(c,0); 
                x1=(String) table.getValueAt(c,1);  // TODO add your handling code here:
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            x3 =MainWindow.db_con.execute("INSERT INTO `garmentsystem`.`salesdesigninquiry_table1`\n" +
            "(`salesdesigninquiry_table_SalesDesignInquiryId`,\n" +
            "`Size`,\n" +
            "`Quantity`)\n" +
            "VALUES\n" +
            "('"+SDIID.getText()+"',\n" +
            "'"+y1+"',\n" +
            "'"+x1+"');");
        }
        
        if(x&&x3){
         return x;}
        }
    return false;    
    }
    
    public ResultSet ViewAll(){
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
    
}
