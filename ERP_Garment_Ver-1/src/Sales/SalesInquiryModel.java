package Sales;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import MainSystem.AutoValidation;
import com.github.lgooddatepicker.components.DatePicker;
import java.io.File;
import java.sql.ResultSet;
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
    
    public ResultSet ViewAllProducts(){
    
        return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("product_table");
    }
    
    public ResultSet ViewAllCustomer(){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_customer_table");
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
           validation.ValidationCheck(Total, true,0,'@')&&
           validation.ValidationCheck(GrandTotal, true,0,'@')){
            
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

}
