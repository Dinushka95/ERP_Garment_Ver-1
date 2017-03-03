
package Sales;

import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.aid;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePicker;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class SalesReturnModel {
    
    
    public String generate_sri(){
   
    return(aid.generate("sri",Integer.toString(MainWindow.userid)));
    }
    
    public ResultSet ViewAllSalesInvoice(){
    return AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_salesInvoice_table");
    }
    
    public boolean AddSRI(JTextField SRIID,JTextField CustomerId,JTextField SalesInvoiceID,DatePicker Date,JTable table,JTextField Total,JTextArea Notes ){
        String y1=null;
        String x1=null;
        String z1=null;
        String z2=null;
        String z3=null;
        String z4=null;
        boolean check =false;
        int c=0;
          //check for atleast one size value
        try {
        y1=(String) table.getValueAt(0,0); 
        
        } 
        catch (Exception e){
        return false;
        }
        

        
        if(validation.ValidationCheck(SRIID, true,0,'@')&&
           validation.ValidationCheck(CustomerId, true,0,'@')&&
           validation.ValidationCheck(SalesInvoiceID, true,0,'@')){
            
            boolean x =autoSqlQuery.executeAutoADD(new String[]{"salesReturnId="+SRIID.getText(),
                                                                "CustomerId="+CustomerId.getText(),           
                                                                "SalesInvoiceID="+SalesInvoiceID.getText(),
                                                                "Date="+Date.getText(),
                                                                "Note="+Total.getText(),
                                                                "TotalAmount="+Total.getText(),                                                               
                                                                "users_table_userId="+Integer.toString(MainWindow.userid),
                                                                },"d_salesReturn_table");
        
            
            
        boolean x3=false;    
        table.getRowCount();
        while(c<table.getRowCount()){
            y1=null;
            x1=null;
            z1=null;
            z2=null;
            z3=null;
            z4=null;
            try {
                y1=(String) table.getValueAt(c,0); 
                x1=(String) table.getValueAt(c,1);//product name
                z1=(String) table.getValueAt(c,2);//Quantity
                z2=(String) table.getValueAt(c,3);//price
                z3=(String) table.getValueAt(c,4);//Dprice
                z4=(String) table.getValueAt(c,5);//Subtotal
                
                //System.out.println("GGGGGGG");
            } 
            catch (Exception e){
            //System.out.println("emppppp");
            return false;
            }
            // System.out.println(x1+"GGGGGGG"+y1);
            c++;
            
            x3 = autoSqlQuery.executeAutoADD(new String[]{  "salesReturnId="+SRIID.getText(),
                                                            "ProductId="+y1,
                                                            "Quantity="+z1,
                                                            "Dprice="+z3,
                                                            "SubTotal="+z4,
                                                            },"d_salesReturn_table1");
            }
        if(x&&x3){
         return x;}
        }
        return false;    
    }

    
}
