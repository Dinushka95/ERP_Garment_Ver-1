/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StyleManagement;

import static MainSystem.AutoSQLQuery.db_con;
import MainSystem.DB_Connect;

import com.github.lgooddatepicker.components.DatePicker;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Dinushka
 */
public class CreateDesignModel {

    static boolean AddDesign(JTextField id, JTextArea styleDes, JTextField jTextField2, JTextField jTextField3, char gender, DatePicker datePicker2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean AddDesign(JTextField id, JTextArea styleDes, JTextField jTextField2, JTextField jTextField3, JComboBox<String> jComboBox1, DatePicker datePicker2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean AddDesign(JTextField id, JTextArea styleDes, JTextField jTextField2, JTextField jTextField3, JComboBox<String> jComboBox1, JComboBox<String> jComboBox2, DatePicker datePicker2, JCheckBox jCheckBox3, JCheckBox jCheckBox1, JCheckBox jCheckBox2, JCheckBox jCheckBox30, JCheckBox jCheckBox4, JTextField jTextField4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public ResultSet ViewAll(){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.designinquiry_table where `status-Approval`='true' ORDER BY AddedDate desc;");

    return DB_Connect.DB_ResultSet;
    }
    
}
