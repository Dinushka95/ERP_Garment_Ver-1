/*
IT15048738
M.R.Aaquiff Ahnaff
 */
package HumanResource.Util;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class SISUtility {

    public static DefaultTableModel GetDefaultTableModel(ResultSetMetaData meta) throws SQLException {
        int cc = meta.getColumnCount();
        DefaultTableModel model = new DefaultTableModel();
        for (int i = 1; i <= cc; i++) {
            model.addColumn(meta.getColumnName(i));
        }
        return model;
    }

    public static DefaultComboBoxModel GetDefaultComboBoxModel(ResultSet rs, String column) throws SQLException {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        while (rs.next()) {
            model.addElement(rs.getString(column));
        }
        return model;
    }
}
