/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import MainSystem.AutoIdGenerator;
import MainSystem.DB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import MainSystem.Validation;
import com.github.lgooddatepicker.components.DatePicker;
import java.sql.ResultSet;
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
        
        Validation validation =new Validation();
        
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
              //  z2=(String) SalesInquiryTable.getValueAt(c,3);
                
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            
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
    return DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_customer_table");
    }
    
     public ResultSet ViewAllProducts(){
    
        return DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("product_table");
    }
     
    public ResultSet ViewAllInquiry(){
    
        return DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_salesInquiry_table");
    }
    
    
}
