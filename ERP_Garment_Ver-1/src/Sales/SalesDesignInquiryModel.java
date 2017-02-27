
package Sales;

import static MainSystem.AutoSQLQuery.db_con;
import MainSystem.DB_Connect;
import com.github.lgooddatepicker.components.DatePicker;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
 
import MainSystem.Validation;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesDesignInquiryModel {
    
    
    public boolean AddSDI(JTextField SDIID,JTextField DesignName,JTextField CustomerId,DatePicker Date,JTable table,JTextField Description,DatePicker DueDate,File Image){
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
        
        if(validation.ValidationCheck(SDIID, true,0,'@')&&
           validation.ValidationCheck(CustomerId, true,0,'@')&&
           validation.ValidationCheck(Description, true,0,'@')){
            
            boolean x =autoSqlQuery.executeAutoADD(new String[]{"DesignInquiryId="+SDIID.getText(),
                                                                "DesignName="+DesignName.getText(),           
                                                                "Description="+Description.getText(),
                                                                "AddedDate="+Date.getText(),
                                                                "DueDate="+DueDate.getText(),
                                                                "status-Approval=false",
                                                                "status-ApprovalName=null",
                                                                "status-DesignCreated=null",
                                                                "status-DesignCreatedName=false",
                                                                "customer_table_CustomerId="+CustomerId.getText(),                                                                
                                                                "users_table_userId="+Integer.toString(MainWindow.userid),
                                                                },"d_designinquiry_table");
        
            autoSqlQuery.executeAutoAddImage(SDIID.getText(),Image);
            
        boolean x3=false;    
        table.getRowCount();
        while(c<table.getRowCount()){
            y1=null;
            x1=null;
            z1=null;
            z2=null;
            try {
                y1=(String) table.getValueAt(c,0); 
                x1=(String) table.getValueAt(c,1);
                z1=(String) table.getValueAt(c,2);
                z2=(String) table.getValueAt(c,3);
                
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            
            x3 = autoSqlQuery.executeAutoADD(new String[]{  "DesignInquiryId="+SDIID.getText(),
                                                            "Size="+y1,
                                                            "Quantity="+x1,
                                                            "Colour="+z1,
                                                            "Description="+z2,
                                                            },"d_designinquiry_table1");
            }
        if(x&&x3){
         return x;}
        }
        return false;    
    }
    

    
    public ResultSet ViewAll(){
    DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_designinquiry_table");
            

    return DB_Connect.DB_ResultSet;
    }
    
    public ResultSet ViewAllCustomer(){
    return DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_customer_table");
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
    boolean x = db_con.execute("DELETE FROM garmentsystem.designinquiry_table`WHERE salesdesigninquiry_table_SalesDesignInquiryId='"+SDIId+"';"); 
    boolean y = db_con.execute("DELETE FROM garmentsystem.designinquiry_table`WHERE SalesDesignInquiryId='"+SDIId+"';"); 
      
         return x;
        }

    
}
