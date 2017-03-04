/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
 
import com.github.lgooddatepicker.components.DatePicker;
import java.sql.ResultSet;

/**
 *
 * @author Dinushka
 */
public class SalesDesignInquiryApprovalModel {
        public ResultSet ViewAllSDI(){
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.designinquiry_table where MarketDesignInquiryId IS NULL ORDER BY AddedDate desc;");

    return AutoDB_Connect.DB_ResultSet;
    }
    
        
        public boolean Update(String SDI){
            DatePicker mydatePicker =new DatePicker();
            mydatePicker.setDateToToday();
            boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`designinquiry_table`\n" +
            "SET\n" +
            "`status-Approval` = 'true',\n" +
            "`status-ApprovalName` = '"+MainWindow.username+"',\n" +
            "`status-ApprovalDate` = '"+mydatePicker.getDate()+"'\n" +
            "WHERE `SalesDesignInquiryId` = '"+SDI+"';"); 
        
    return false;    
    }
}
