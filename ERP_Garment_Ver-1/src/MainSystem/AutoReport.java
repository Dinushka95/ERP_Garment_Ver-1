/*
This class is able to be used in any project, you have to install all jasper ireport plugein for netbean
It was tested in netbeans 8.2 and ireport 5.6.0 version.
VERY IMPORTANT you have added all the required  .JAR files (libary files) need for iReport to work
you can find them in my Github page --- https://github.com/Dinushka95/Jasper_IReport_JAR_Files.git
Author -Dinushka95@yahoo.com
3/3/2017
*/
package MainSystem;

import static MainSystem.AutoDB_Connect.DB_connection;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dinushka
 */


public class AutoReport {
    Connection x;
    //Constructor you have to give the the DB connection
    public AutoReport(Connection Connection) {
        x=Connection;
    }
    
    // use the pulgin and create a REPORT(.jrxml) file with and bulit in SQL code
    // and use it to open that file
    public void SimpleAllReport(String FileLocation){
        try {
            JasperReport jr =JasperCompileManager.compileReport(FileLocation);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,DB_connection);
            JasperViewer.viewReport(jp);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    // this method is used when you want to in put custom values and get custom reports
    public void Query2Report(String FileLocation,String SQLquery){
        try {
            JasperDesign jd=JRXmlLoader.load(FileLocation);
            JRDesignQuery newQuery =new JRDesignQuery();
            newQuery.setText(SQLquery);
            jd.setQuery(newQuery);          
            JasperReport jr =JasperCompileManager.compileReport(jd);
            JasperPrint jp =JasperFillManager.fillReport(jr,null,DB_connection);
            JasperViewer.viewReport(jp);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    // this method is used when you want to generate a report using a JTable 
    // VERY IMPORTANT that the file has the table colum names coded inside the .jrxml
    // easy way is to generate a report using the ireport wizard with the values names (table colums) selected and then use it in the menthod
    // it will overide the default SQL query inside the .jrxml file and display the values in the table.
    public void Table2Report(String FileLocation,JTable Table){

        JasperReport jasperReport = null;
        try {
            jasperReport = JasperCompileManager.compileReport(FileLocation);
        } catch (JRException ex) {
            System.out.println(ex);
        }
        
        JasperPrint jasperPrint = null;
        try {
            jasperPrint = JasperFillManager.fillReport(jasperReport,null, new JRTableModelDataSource((DefaultTableModel) Table.getModel()));
        } catch (JRException ex) {
            System.out.println(ex);
        }
        JasperViewer.viewReport(jasperPrint, false);
    }
}
