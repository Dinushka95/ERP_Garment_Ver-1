package Maintance;

import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;

/**
 *
 * @author chethana
 */
public class MaintenancesRequest1 extends javax.swing.JInternalFrame {

    public MaintenancesRequest1() {

        initComponents();
        generate_MaintenancesID();
        TableLoad1();
        TableLoad2();
        
        FillTextCombo1();
        TextBoxClear2();
        TextBoxClear1();
        datePicker2.setDateToToday();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings3 = new DatePickerSettings();
        dateSettings3.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings3.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings3);
        jButtonADD = new javax.swing.JButton();
        jButtonResetAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMachinePart = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextFieldMaintenancesID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldDescription1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jButtonADD1 = new javax.swing.JButton();
        jButtonResetAll1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldMachinePart1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jTextFieldSearchMaintenancesID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("MaintenancesRequest");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDescription.setName("Customer Name"); // NOI18N
        jPanel2.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel2.setText("Maintenances ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel3.setText("Description");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        datePicker2.setName(""); // NOI18N
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jButtonADD.setText("ADD ");
        jButtonADD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jButtonResetAll.setText("Reset All");
        jButtonResetAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel4.setText("Department");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setText("Machine part ");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldMachinePart.setName("Phone number"); // NOI18N
        jPanel2.add(jTextFieldMachinePart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maintenance", "Human Resource", "Inventory", "Finance" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, -1));
        jPanel2.add(jTextFieldMaintenancesID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 130, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 510, 520));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaintenancesID", "Description", "Department", "Machine/PartNo", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 460, 300));

        jTabbedPane1.addTab("ADD ", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDescription1.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel11.setText("Description");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel12.setText("Date");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        datePicker3.setName(""); // NOI18N
        jPanel6.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jButtonADD1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD1.setText("Delete");
        jButtonADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADD1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonADD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jButtonResetAll1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetAll1.setText("Edit");
        jButtonResetAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAll1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonResetAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel14.setText("Department");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel16.setText("Machine part ");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldMachinePart1.setName("Phone number"); // NOI18N
        jPanel6.add(jTextFieldMachinePart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maintenance", "Human Resource", "Inventory", "Finance" }));
        jPanel6.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 510, 520));

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelcustomerSearch.add(jTextFieldSearchMaintenancesID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, -1));

        jLabel9.setText("Maintenances ID");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setText("Reset All");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("View All");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaintenancesID", "Description", "Department", "Machine/PartNo", "Date"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanelcustomerSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 460, 300));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 600, 510));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        AddMaintenances();
        TableLoad1();
       
     


    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed

    }//GEN-LAST:event_jButtonResetAllActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButtonADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADD1ActionPerformed
        DeleteMaintenance();
    }//GEN-LAST:event_jButtonADD1ActionPerformed

    private void jButtonResetAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAll1ActionPerformed
        EditMaintenance();
        TableLoad2();
    }//GEN-LAST:event_jButtonResetAll1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        String m_id = jTable1.getValueAt(row, 0).toString();
        String des = jTable1.getValueAt(row, 1).toString();
        String dep = jTable1.getValueAt(row, 2).toString();
        String m_p = jTable1.getValueAt(row, 3).toString();
        String date = jTable1.getValueAt(row, 4).toString();

        jTextFieldMaintenancesID.setText(m_id);
        jTextFieldDescription.setText(des);
        jComboBox1.setSelectedItem(dep);
        jTextFieldMachinePart.setText(m_p);
        datePicker2.setText(date);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void generate_MaintenancesID() {
        AutoIdGenerator m_id = new AutoIdGenerator();
        jTextFieldMaintenancesID.setText(m_id.generate("ACC", Integer.toString(MainWindow.userid)));
    }
    
    public void AddMaintenances() {
        String m_id = jTextFieldMaintenancesID.getText();
        String des = jTextFieldDescription.getText();
        String dep = jComboBox1.getSelectedItem().toString();
        String m_p = jTextFieldMachinePart.getText();
        String date = datePicker2.getText();
        
         boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`Maintanance_Request`\n"
                 
  
                 
                    + "(`MaintenancesID`,\n"
                    + "`Description`,\n"
                    + "`Department`,\n"
                    + "`MachineID`,\n"
                    + "`Date`)\n"
                    + "VALUES\n"
                    + "('" + m_id + "',\n"
                    + "'" + des + "',\n"
                    + "'" + dep + "',\n"
                    +"'"  + m_p + "',\n"
                    + "'" + date + "');");

         
    

        try {
            if (x == true) {
                TableLoad1();
                TextBoxClear1();
                JOptionPane.showMessageDialog(null, "Susseccfuly Added");

            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    private void TextBoxClear1() {

        jTextFieldMaintenancesID.setText("");
        jTextFieldDescription.setText("");
        jComboBox1.setSelectedIndex(0);

        jTextFieldMachinePart.setText("");
        datePicker2.setDateToToday();
    }

    private void TableLoad1() {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Maintanance_Request`");

        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

    }

    
  
    
    private void FillTextCombo1() {
        try {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("select  part_id from MachineParts_Table   ");

            while (AutoDB_Connect.DB_ResultSet.next()) {
                String m_p = AutoDB_Connect.DB_ResultSet.getString("part_id");
                jComboBox2.addItem(m_p);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    
    

    private void EditMaintenance() {

        String m_id = jTextFieldSearchMaintenancesID.getText();
        String des = jTextFieldDescription1.getText();
        String dep = jComboBox2.getSelectedItem().toString();
        String m_p = jTextFieldMachinePart1.getText();
        String date = datePicker3.getText();

        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`Maintanance_Request`\n"
                + "SET\n"
               
                + "`Description` = '" + des + "',\n"
                + "`Department` = '" + dep + "',\n"
                + "`Machine part ` = '" + m_p + "',\n"
                + "`Date` = '" + date + "'\n"
                + "WHERE `MaintenancesID` = '" + m_id + "';");

        try {
            if (x == true) {
                TableLoad2();
                TextBoxClear2();
                JOptionPane.showMessageDialog(null, "Susseccfuly Update");

            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    private void TableLoad2() {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Maintanance_Request`");

        jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

    }

    
    
    private void DeleteMaintenance() {
        String m_id = jTextFieldSearchMaintenancesID.getText();

        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`Maintanance_Request`\n"
                + "WHERE Description LIKE '" + m_id + "';");

        try {
            if (x == true) {
                TextBoxClear2();
                TableLoad2();
                JOptionPane.showMessageDialog(null, "Susseccfuly Deleted");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void TextBoxClear2() {

        jTextFieldSearchMaintenancesID.setText("");
        jTextFieldDescription1.setText("");
        jComboBox2.setSelectedIndex(0);
        jTextFieldMachinePart1.setText("");
        datePicker3.setDateToToday();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonADD1;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JButton jButtonResetAll1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldDescription1;
    private javax.swing.JTextField jTextFieldMachinePart;
    private javax.swing.JTextField jTextFieldMachinePart1;
    private javax.swing.JTextField jTextFieldMaintenancesID;
    private javax.swing.JTextField jTextFieldSearchMaintenancesID;
    // End of variables declaration//GEN-END:variables

}
