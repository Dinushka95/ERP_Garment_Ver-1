
package Sales;

import MainSystem.AutoDB_Connect;
import com.github.lgooddatepicker.components.DatePicker;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
 
import MainSystem.AutoValidation;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesDesignInquiryModel {
    
    
    public boolean AddSDI(JTextField SDIID,JTextField DesignName,JTextField CustomerId,DatePicker Date,JTable table,JTextField Description,DatePicker DueDate,JCheckBox checkbox,File Image){
        String y1=null;
        String x1=null;
        String z1=null;
        String z2=null;
        String z3=null;
        boolean check =false;
        int c=0;
          //check for atleast one size value
        try {
        y1=(String) table.getValueAt(0,0); 
        
        } 
        catch (Exception e){
        return false;
        }
        
        AutoValidation validation =new AutoValidation();
        
        if(validation.ValidationCheck(SDIID, true,0,'@')&&
           validation.ValidationCheck(CustomerId, true,0,'@')&&
           validation.ValidationCheck(DesignName, true,0,'@')&&
           validation.ValidationCheck(Description, false,0,'@')){
            
            boolean x =autoSqlQuery.executeAutoADD(new String[]{"DesignInquiryId="+SDIID.getText(),
                                                                "DesignName="+DesignName.getText(),           
                                                                "Description="+Description.getText(),
                                                                "AddedDate="+Date.getText(),
                                                                "DueDate="+DueDate.getText(),
                                                                "StatusApproval=false",
                                                                "StatusApprovalName=null",
                                                                "customer_table_CustomerId="+CustomerId.getText(),                                                                
                                                                "users_table_userId="+Integer.toString(MainWindow.userid),
                                                                },"d_designinquiry_table");
        
            
            
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
        
        if (checkbox.isSelected()){autoSqlQuery.executeAutoAddImage(SDIID.getText(),Image);}
        }
        return false;    
    }
    
    //########################################################################
        public boolean EditSDI(String ID,JTable table1,JTable table2){
        String y1=null;
        String x1=null;
        String z1=null;
        String z2=null;
        String z3=null;
        boolean check =false;
        int c=0;
          //check for atleast one size value
        try {
        y1=(String) table2.getValueAt(0,0); 
        
        } 
        catch (Exception e){
        return false;
        }
        
        String A1=(String) table1.getValueAt(0,1);
        String A2=(String) table1.getValueAt(0,2);
        String A3=(String) table1.getValueAt(0,5);
        String A4=(String) table1.getValueAt(0,6);
 
 
        
            {
            
            boolean x =autoSqlQuery.executeAutoEdit(new String[]{"DesignName="+A1,           
                                                                "Description="+A2, 
                                                                "StatusApproval="+A3,
                                                                "StatusApprovalName="+A4,                                                         
                                                                "users_table_userId="+Integer.toString(MainWindow.userid),
                                                                },"d_designinquiry_table","DesignInquiryId",ID);
        
            
            
        boolean x3=false;    
        //table2.getRowCount();
        while(c<table2.getRowCount()){
            y1=null;
            x1=null;
            z1=null;
            z2=null;
            z3=null;
            
            try {
                y1=(String) table2.getValueAt(c,0); 
                x1=(String) table2.getValueAt(c,1);
                z1=(String) table2.getValueAt(c,2);
                z2=(String) table2.getValueAt(c,3);
                z3=(String) table2.getValueAt(c,4);
                
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            
            x3 = autoSqlQuery.executeAutoEdit(new String[]{ 
                                                            "Size="+x1,
                                                            "Quantity="+z1,
                                                            "Colour="+z2,
                                                            "Description="+z3,
                                                            },"d_designinquiry_table1","DesignInquiryId",ID);
            }
        if(x&&x3){
         return x;}
        
        
        }
        return false;    
    }
        
    public boolean DeleteSDII(String SDII){   
        boolean x = autoSqlQuery.executeAutoDelete("d_designinquiry_table","DesignInquiryId",SDII); 
        boolean y = autoSqlQuery.executeAutoDelete("d_designinquiry_table1","DesignInquiryId",SDII);
        return (y&x);
    }
    
    public ResultSet ViewAll(){
    return autoSqlQuery.executeAutoViewAll("d_designinquiry_table");
    }
    
    public ResultSet ViewAllCustomer(){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_customer_table");
    }
    
    public ResultSet SearchCustomerTName(String key){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","Name",key);
    }
    
    public ResultSet SearchCustomerTPhone(String key){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","Phone",key);
    }
    
    public ResultSet SearchSDIID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_designinquiry_table","DesignInquiryId", Key);
    }
 
    public ResultSet SearchDesignName(String Key){
    return autoSqlQuery.executeAutoSearchAll("d_designinquiry_table","DesignName", Key);
    }     
   
    public ResultSet SearchCustomerID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_designinquiry_table","customer_table_CustomerId", Key);
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

    public boolean DeleteSDI(String SDIId){
    boolean x = autoSqlQuery.execute("DELETE FROM garmentsystem.designinquiry_table`WHERE salesdesigninquiry_table_SalesDesignInquiryId='"+SDIId+"';"); 
    boolean y = autoSqlQuery.execute("DELETE FROM garmentsystem.designinquiry_table`WHERE SalesDesignInquiryId='"+SDIId+"';"); 
      
    return x;
    }
    

    
}
