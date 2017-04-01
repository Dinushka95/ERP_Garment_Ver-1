/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanResource;

import HumanResource.Util.Common;
import MainSystem.AutoDB_Connect;
import static MainSystem.AutoDB_Connect.DB_connection;
import HumanResource.Util.DBObject;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JTextField;

/**
 *
 * @author Vihangi
 */
public class Leave extends javax.swing.JInternalFrame {

    /**
     * Creates new form vihplk_LeaveForm
     */
    Connection con;
    Calendar cals = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    AutoDB_Connect conn = new AutoDB_Connect();
    public Leave() {
        
        initComponents();
        con = AutoDB_Connect.DB_connection;
        Populate();
        txtRequstedDate.setText(dateFormat.format(cals.getTime()));
    }

    private void Populate() {
        try {
            jTable1.setModel(DBObject.GetTable(con, DBObject.GetAll(con, "leaves_table")));
        } catch (SQLException ex) {
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Insert() {
    Statement stmnt = null;
        try {
            stmnt = con.createStatement();
            String sql = "INSERT INTO leaves_table (leave_id, emp_id, start_date, end_date, requested_date, type, approval, no_of_days, reason) "
                    + "VALUES ("
                    + "'" + txtLeaveId.getText() + "',"
                    + "'" + txtEmployeeId.getText() + "'," 
                    + "'" + dateFormat.format(dtpStartDate.getDate()) + "',"
                    + "'" + dateFormat.format(dtpEndDate.getDate()) + "'," 
                    + "'" + txtRequstedDate.getText() + "',"
                    + "'" + txtType1.getText() + "',"
                    + "'" + txtApproval.getText() + "',"
                    + "'" + txtNoofDays.getText() + "'," 
                    + "'" + txtReason.getText() + "'" +
                    ")";
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Department Added");
            Populate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmnt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void Update() {
    try {
        Statement stmnt = con.createStatement();
        String sql = 
                "UPDATE leaves_table " +
                "SET emp_id = '" + txtEmployeeId.getText() + "'" +
                ",start_date = '" + dateFormat.format(dtpStartDate.getDate())+ "' " +
                ",end_date = '" + dateFormat.format(dtpEndDate.getDate()) + "' " +
                ",requested_date = '" + txtRequstedDate.getText() + "' " +
                ",type = '" + txtType1.getText() + "' " +
                ",approval = '" + txtApproval.getText() + "' " +
                ",no_of_days = '" + txtNoofDays.getText() + "' " +
                ",reason = '" + txtReason.getText() + "' " +
                "WHERE leave_id = " + txtLeaveId.getText();
        stmnt.executeUpdate(sql);
        JOptionPane.showMessageDialog(this, "Updated Successfully");
        Populate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Delete() {
        try {
            Statement stmnt = con.createStatement();
            String sql = "DELETE FROM leaves_table WHERE leave_id = '" + txtLeaveId.getText() + "'";
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Record Deleted");
            Populate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void ClearAll() {
        for(Component c : jPanel1.getComponents()) {
            if(c instanceof JTextField){
                JTextField f = (JTextField) c;
                f.setText("");
            }
        }
    }
    
    boolean CheckDates() {
        if(dtpStartDate.getDate().before(dtpEndDate.getDate())) {
            JOptionPane.showMessageDialog(this, "Start date cannot be greater than end date");
            return false;
        }
        if(cals.getTime().before(dtpStartDate.getDate())) {
            JOptionPane.showMessageDialog(this, "Start date cannot be less than current date");
            return false;
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtLeaveId = new javax.swing.JTextField();
        txtRequstedDate = new javax.swing.JTextField();
        txtNoofDays = new javax.swing.JTextField();
        txtType = new javax.swing.JComboBox<>();
        txtType1 = new javax.swing.JTextField();
        dtpEndDate = new org.jdesktop.swingx.JXDatePicker();
        txtApproval = new javax.swing.JTextField();
        dtpStartDate = new org.jdesktop.swingx.JXDatePicker();
        txtEmployeeId = new javax.swing.JTextField();
        txtReason = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtLeaveId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeaveIdActionPerformed(evt);
            }
        });

        txtRequstedDate.setEditable(false);

        txtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sick Leave", "Casual Leave" }));

        dtpEndDate.setFormats(new String[]{"yyyy-MM-dd"});

        dtpStartDate.setFormats(new String[]{"yyyy-MM-dd"});

        jLabel1.setText("Leave ID:");

        jLabel2.setText("Reason:");

        jLabel3.setText("No of days:");

        jLabel4.setText("Approval:");

        jLabel5.setText("Type:");

        jLabel6.setText("Requested Date:");

        jLabel7.setText("End date:");

        jLabel8.setText("Start date:");

        jLabel9.setText("Employee ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtType1)
                    .addComponent(txtApproval)
                    .addComponent(txtEmployeeId)
                    .addComponent(txtReason)
                    .addComponent(txtLeaveId)
                    .addComponent(txtNoofDays))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33)
                        .addComponent(dtpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39)
                        .addComponent(dtpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(txtRequstedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLeaveId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoofDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApproval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtRequstedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(dtpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(dtpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLeaveIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeaveIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLeaveIdActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if(Common.CheckNull(jPanel1)) {
            Insert();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(Common.CheckNull(jPanel1)) {
            Update();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        ClearAll();
        
        String leaveId = jTable1.getValueAt(row, 0).toString();
        String empId = jTable1.getValueAt(row, 1).toString();
        Date startDate = (Date)jTable1.getValueAt(row, 2);
        Date endDate = (Date)jTable1.getValueAt(row, 3);
        String reqDate = jTable1.getValueAt(row, 4).toString();
        String type = jTable1.getValueAt(row, 5).toString();
        String approval = jTable1.getValueAt(row, 6).toString();
        String numfDays = jTable1.getValueAt(row, 7).toString();
        String reason = jTable1.getValueAt(row, 8).toString();
        
        if(!leaveId.isEmpty()) {
            txtLeaveId.setText(leaveId);
        }
        if(!empId.isEmpty()) {
            txtEmployeeId.setText(empId);
        }
        if(!startDate.toString().isEmpty()) {
            dtpStartDate.setDate(startDate);
        }
        if(!endDate.toString().isEmpty()) {
            dtpEndDate.setDate(endDate);
        }
        if(!reqDate.isEmpty()) {
            txtRequstedDate.setText(reqDate);
        }
        if(!type.isEmpty()) {
            txtType1.setText(type);
        }
        if(!approval.isEmpty()) {
            txtApproval.setText(approval);
        }
        if(!numfDays.isEmpty()) {
            txtNoofDays.setText(numfDays);
        }
        if(!reason.isEmpty()) {
            txtReason.setText(reason);
        } 
       
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private org.jdesktop.swingx.JXDatePicker dtpEndDate;
    private org.jdesktop.swingx.JXDatePicker dtpStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApproval;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtLeaveId;
    private javax.swing.JTextField txtNoofDays;
    private javax.swing.JTextField txtReason;
    private javax.swing.JTextField txtRequstedDate;
    private javax.swing.JComboBox<String> txtType;
    private javax.swing.JTextField txtType1;
    // End of variables declaration//GEN-END:variables
}
