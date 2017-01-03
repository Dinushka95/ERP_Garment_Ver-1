/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StyleManagement;

import MainSystem.DB_Connect;
import static MainSystem.MainWindow.db_con;
import java.sql.ResultSet;

/**
 *
 * @author Dinushka
 */
public class CreateDesignModel {
    
        public ResultSet ViewAll(){
    DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.salesdesigninquiry_table;");

    return DB_Connect.DB_ResultSet;
    }
    
}
