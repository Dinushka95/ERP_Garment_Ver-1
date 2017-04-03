/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
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
public class SalesInvoiceModel {
    
    public String generate_sin(){
    AutoIdGenerator aid = new AutoIdGenerator();
    return(aid.generate("sin",Integer.toString(MainWindow.userid)));
    }
    
    public boolean AddSIN(JTextField SalesInvoiceId,JTextField CustomerId,JTextField SalesInquiryId,DatePicker SalesInvoice,JTextField Total,JComboBox DiscountRate,JTextField GrandTotal,JTable SalesInvoiceTable){
        String y1=null;
        String x1=null;
        String z1=null;
        String z2=null;
        boolean check =false;
        int c=0;
          //check for atleast one size value
        try {
        y1=(String) SalesInvoiceTable.getValueAt(0,0); 
        
        } 
        catch (Exception e){
        return false;
        }
        
        AutoValidation validation =new AutoValidation();
        
        if(validation.ValidationCheck(SalesInvoiceId, true,0,'@')&&
           validation.ValidationCheck(CustomerId, true,0,'@')&&
           validation.ValidationCheck(Total, true,0,'@')&&
           validation.ValidationCheck(GrandTotal, true,0,'@'))
        {
            
            boolean x =autoSqlQuery.executeAutoADD(new String[]{"salesInvoiceId="+SalesInvoiceId.getText(),
                                                                "CustomerId="+CustomerId.getText(),           
                                                                "SalesInquiryId="+SalesInquiryId.getText(),
                                                                "discount="+DiscountRate.getSelectedItem(),
                                                                "date="+SalesInvoice.getText(),
                                                                "total="+Total.getText(),
                                                                "GrandTotal="+GrandTotal.getText(),                                                              
                                                                "userId="+Integer.toString(MainWindow.userid),
                                                                },"d_salesInvoice_table");
        
            
            
        boolean x3=false; 
        boolean x4=false;
        SalesInvoiceTable.getRowCount();
        while(c<SalesInvoiceTable.getRowCount()){
            y1=null;
            x1=null;
           // z1=null;
          //  z2=null;
            try {
                y1=(String) SalesInvoiceTable.getValueAt(c,0); 
                x1=(String) SalesInvoiceTable.getValueAt(c,4);
              //  z1=(String) SalesInquiryTable.getValueAt(c,2);
                z2=(String) SalesInvoiceTable.getValueAt(c,3);
                
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            int z22=Integer.parseInt(z2);
            int z33=Integer.parseInt(x1);
            int fq=z22-z33;
            String finalquantity=Integer.toString(fq);
            x4=  autoSqlQuery.executeAutoEdit(new String[]{"Quantity="+finalquantity},"product_table","ProductId", y1);
            x3 = autoSqlQuery.executeAutoADD(new String[]{  "salesInvoiceId="+SalesInvoiceId.getText(),
                                                            "ProductId="+y1,
                                                            "Quantity="+x1
                                                            //"Colour="+z1,
                                                           // "Description="+z2,
                                                            },"d_salesInvoice_table1");
            }
        if(x&&x3){
         
         return x;}
        }
        return false;    
    }
    
    public ResultSet ViewAllCustomer(){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_customer_table");
    }
    
     public ResultSet ViewAllProducts(){
    
        return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("product_table");
    }
    
    public ResultSet SearchID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId",Key);
    }
    
    public ResultSet SearchCustomerTPhone(String key){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","Phone",key);
    }
    public ResultSet SearchCustomerID(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_salesInvoice_table","CustomerId", Key);
        
    }
    
    public boolean DeleteSII(String SII){   
        boolean y = autoSqlQuery.executeAutoDelete("d_salesInvoice_table1","salesInvoiceId",SII);
        boolean x = autoSqlQuery.executeAutoDelete("d_salesInvoice_table","salesInvoiceId",SII); 
        
        return (y&x);
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
    public ResultSet SearchSInI(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_salesInvoice_table","salesInvoiceId", Key);
    }
    public ResultSet SearchSII(String Key){
        return autoSqlQuery.executeAutoSearchAll("d_salesInvoice_table","SalesInquiryId", Key);
    }
    public ResultSet SearchCustomerTName(String key){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","Name",key);
    }
    public ResultSet ViewAllInquiry(){
    
        return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_salesInvoice_table");
    }
  
    public boolean EditSINI(JTextField SalesInquiryId,JTextField CustomerId,DatePicker SalesInquiry,JTextArea Note,JTextField Total,JComboBox DiscountRate,JTextField GrandTotal,JTable SalesInquiryTable){
        
        DeleteSII(SalesInquiryId.getText());
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
           validation.ValidationCheck(Total, true,0,'@')&&
           validation.ValidationCheck(GrandTotal, true,0,'@')
                ){
            
            boolean x =autoSqlQuery.executeAutoADD(new String[]{"SalesInquiryId="+SalesInquiryId.getText(),
                                                                "CustomerId="+CustomerId.getText(),           
                                                                "Date="+SalesInquiry.getText(),
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
                y1=(String) SalesInquiryTable.getValueAt(c,1); 
                x1=(String) SalesInquiryTable.getValueAt(c,2);
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
    
}
