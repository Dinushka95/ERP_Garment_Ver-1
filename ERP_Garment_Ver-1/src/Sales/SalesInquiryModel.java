package Sales;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import MainSystem.AutoValidation;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePicker;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesInquiryModel {
    
    public String generate_sii(){
    AutoIdGenerator aid = new AutoIdGenerator();
    return(aid.generate("sii",Integer.toString(MainWindow.userid)));
    }
    
    public ResultSet ViewAll(){
    return autoSqlQuery.executeAutoViewAll("d_salesInquiry_table");
    }
    
    public ResultSet SearchCustomerTPhone(String key){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","Phone",key);
    }
    
    public ResultSet SearchSIID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_salesInquiry_table","SalesInquiryId", Key);
    }
    public boolean DeleteSII(String SII){   
        boolean x = autoSqlQuery.executeAutoDelete("d_salesInquiry_table","SalesInquiryId",SII); 
        boolean y = autoSqlQuery.executeAutoDelete("d_salesInquiry_table1","SalesInquiryId",SII);
        return (y&x);
    }
    
    public ResultSet SearchCustomerID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_salesInquiry_table","CustomerId", Key);
    }
    public ResultSet ViewAllProducts(){
    
        return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("product_table");
    }
    
    public ResultSet ViewAllCustomer(){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_customer_table");
    }
    public ResultSet SearchID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId",Key);
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
    public ResultSet SearchCustomerTName(String key){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","Name",key);
    }
    
    public ResultSet SearchCusPhone(String key){
        String temn = null;
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","Phone",key);
     try {
            AutoDB_Connect.DB_ResultSet.next();
            temn=AutoDB_Connect.DB_ResultSet.getString("CustomerId");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDesignInquiryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return SearchCustomerID(temn);
    }
    public boolean AddSII(JTextField SalesInquiryId,JTextField CustomerId,DatePicker SalesInquiry,DatePicker PurchaseDue,JTextArea Note,JTextField Total,JComboBox DiscountRate,JTextField GrandTotal,JTable SalesInquiryTable){
        String y1=null;
        String x1=null;
        String z1=null;
        String z2=null;
        boolean check =false;
        int c=0;
          //check for atleast one size value
        try {
        y1=(String) SalesInquiryTable.getValueAt(0,0); 
        
        } 
        catch (Exception e){
        return false;
        }
        
        AutoValidation validation =new AutoValidation();
        
        if(validation.ValidationCheck(SalesInquiryId, true,0,'@')&&
           validation.ValidationCheck(CustomerId, true,0,'@')&&
           validation.ValidationCheck(Total, true,0,'1')&&
           validation.ValidationCheck(GrandTotal, true,0,'1')){
            
            boolean x =autoSqlQuery.executeAutoADD(new String[]{"SalesInquiryId="+SalesInquiryId.getText(),
                                                                "CustomerId="+CustomerId.getText(),           
                                                                "Date="+SalesInquiry.getText(),
                                                                "EstimatePurchaseDate="+PurchaseDue.getText(),
                                                                "Note="+Note.getText(),
                                                                "Total="+Total.getText(),
                                                                "DiscountRate="+DiscountRate.getSelectedItem().toString(),
                                                                "GrandTotal="+GrandTotal.getText(),                                                              
                                                                "userId="+Integer.toString(MainWindow.userid),
                                                                },"d_salesInquiry_table");
        
            
            
        boolean x3=false;    
        SalesInquiryTable.getRowCount();
        while(c<SalesInquiryTable.getRowCount()){
            y1=null;
            x1=null;
           // z1=null;
          //  z2=null;
            try {
                y1=(String) SalesInquiryTable.getValueAt(c,0); 
                x1=(String) SalesInquiryTable.getValueAt(c,3);
              //  z1=(String) SalesInquiryTable.getValueAt(c,2);
              //  z2=(String) SalesInquiryTable.getValueAt(c,3);
                
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            
            x3 = autoSqlQuery.executeAutoADD(new String[]{  "SalesInquiryId="+SalesInquiryId.getText(),
                                                            "ProductId="+y1,
                                                            "Quantity="+x1
                                                            //"Colour="+z1,
                                                           // "Description="+z2,
                                                            },"d_salesInquiry_table1");
            }
        if(x&&x3){
         return x;}
        }
        return false;    
    }

    
    
    
    
    
    public boolean EditSII(String ID,JTable table1,JTable table2){
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
    
}
