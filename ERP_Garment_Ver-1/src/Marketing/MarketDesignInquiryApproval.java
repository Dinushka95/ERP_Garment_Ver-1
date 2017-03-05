
package Marketing;

import Sales.*;
import MainSystem.AutoDB_Connect;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.autogetimage;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JOptionPane;


/**
 *
 * @author Dinushka
 */
public class MarketDesignInquiryApproval extends javax.swing.JInternalFrame {
    
MarketDesignInquiryApprovalModel salesdesigninquiryapprovalmodel;

    public MarketDesignInquiryApproval() {
        initComponents();
        salesdesigninquiryapprovalmodel=new MarketDesignInquiryApprovalModel();
        ViewAllSDI();
        datePicker1.setDateToToday();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId = new javax.swing.JTextField();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Market Design Inquiry Approval Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, -1));

        jLabel11.setText("Market Design ID");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton8.setText("Search");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, -1));

        jButton1.setText("View All");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 120, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Update Approval");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 20, 160, -1));

        jLabel2.setText("Market Design Inquiry ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jTextFieldSalesDesignInquiryId.setEditable(false);
        jTextFieldSalesDesignInquiryId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSalesDesignInquiryId.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryIdActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldSalesDesignInquiryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 110, -1));

        datePicker1.setEnabled(false);
        datePicker1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "NOT Approved" }));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 21, 120, 20));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 150, -1));

        jLabel1.setText("Approved Name");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 110, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1240, 60));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 360, 170));

        jLabel21.setText("                                               Skech Preview");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 370, 170));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 840, 350));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1310, 520));

        jTabbedPane1.addTab("Market  Design Inquiry Approval", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSalesDesignInquiryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryIdActionPerformed

    }//GEN-LAST:event_jTextFieldSalesDesignInquiryIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewAllSDI();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        boolean result=salesdesigninquiryapprovalmodel.Update(datePicker1,jTextFieldSalesDesignInquiryId,jTextField2,jComboBox1);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            
             clear();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int x=jTable1.getSelectedRow();
        String y=(String) jTable1.getValueAt(x,0);
        jTextFieldSalesDesignInquiryId.setText(y);
       
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_designinquiry_table1","DesignInquiryId", y);
        jTable4.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet)); 
        jLabel21.setIcon(autoSqlQuery.executeAutoGetImage(y));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTable1.setModel(DbUtils.resultSetToTableModel(salesdesigninquiryapprovalmodel.SearchSDI(jTextField1.getText())));
    }//GEN-LAST:event_jButton8ActionPerformed
    
    private  void ViewAllSDI(){
        jTable1.setModel(DbUtils.resultSetToTableModel(salesdesigninquiryapprovalmodel.ViewAllSDI()));
      //  jTable1.setDefaultRenderer(Object.class, new MyCellRenderer());
    }
    private void clear(){
    jTextFieldSalesDesignInquiryId.setText("");
    jTextField2.setText("");
    
    }
            
      
    
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId;
    // End of variables declaration//GEN-END:variables


public class MyCellRenderer extends javax.swing.table.DefaultTableCellRenderer {
    @Override
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        final java.awt.Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     { 
         System.out.println(jTable1.getModel().getValueAt(row,5));
         if ((jTable1.getModel().getValueAt(row,5).equals("false")))
         {
         cellComponent.setBackground(Color.red);
         cellComponent.setForeground(Color.black);
         }
 
           else if ((jTable1.getModel().getValueAt(row,5).equals("true")))
         {
         cellComponent.setBackground(Color.GREEN);
         cellComponent.setForeground(Color.black);
         }  
     }
         
        return cellComponent;
}
}




}
