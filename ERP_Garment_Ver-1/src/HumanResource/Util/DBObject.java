/*
IT15048738
M.R.Aaquiff Ahnaff
 */
package HumanResource.Util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public abstract class DBObject {

    public static final ResultSet Search(Connection con, PreparedStatement st) {
        try {
            return st.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public static final ResultSet GetAll(Connection con, String tab) {
        try {
            PreparedStatement st = con.prepareStatement("SELECT * FROM " + tab);
            return st.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }
    
    public static final DefaultComboBoxModel GetComboBox(Connection con, ResultSet ts)
    {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            
            Statement stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT dep_id FROM department_table");
            while(rs.next())
            {
                String dep_id = rs.getString("dep_id");
                model.addElement(dep_id);
            }
            
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(DBObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static final DefaultTableModel GetTable(Connection con, ResultSet rs) throws SQLException {
        ResultSetMetaData meta = rs.getMetaData();
        DefaultTableModel model = new DefaultTableModel();
        int colCount = meta.getColumnCount();
        SISTableColumn[] cols = new SISTableColumn[colCount];
        for (int i = 1; i <= colCount; i++) {
            cols[i - 1] = new SISTableColumn(meta.getColumnName(i), meta.getColumnType(i));
            model.addColumn(cols[i - 1].columnName);
        }
        while (rs.next()) {
            Object[] row = new Object[colCount];
            for (int i = 0; i < colCount; i++) {
                switch (cols[i].columnType) {
                    case java.sql.Types.VARCHAR:
                        row[i] = rs.getString(cols[i].columnName);
                        break;
                    case java.sql.Types.INTEGER:
                        row[i] = rs.getInt(cols[i].columnName);
                        break;
                    case java.sql.Types.DOUBLE:
                        row[i] = rs.getDouble(cols[i].columnName);
                        break;
                    case java.sql.Types.NUMERIC:
                        row[i] = rs.getInt(cols[i].columnName);
                        break;
                    case java.sql.Types.DATE:
                        row[i] = rs.getDate(cols[i].columnName);
                        break;
                }
            }
            model.addRow(row);
        }
        return model;
    }

    public abstract void Insert(Connection con) throws SQLException;

    public abstract int Delete(Connection con) throws SQLException;

    public abstract void Update(Connection con) throws SQLException;

    public abstract void Get(Connection con) throws SQLException;
}
