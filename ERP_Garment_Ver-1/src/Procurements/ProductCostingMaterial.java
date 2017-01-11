
package Procurements;

import StyleManagement.*;
import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */
public class ProductCostingMaterial extends javax.swing.JInternalFrame {
DefaultTableModel model;
int RowCountjTable2;
CreateDesignModel NewSalesDesignModel ;


        String LogNo;
        String CustomerId;
        String CustomerName;
        String CustomerCompanyName;
        String CustomerPhone;
        String CustomerEmail;
        String CustomerAddres;


    /**
     * Creates new form SalesDesignInquiry
     */
    public ProductCostingMaterial() {
        initComponents();
        generate_sdi();
        datePicker2.setDateToToday();
    NewSalesDesignModel = new CreateDesignModel();
     jTable1.setModel(DbUtils.resultSetToTableModel(NewSalesDesignModel.ViewAll()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextFieldSalesDesignInquiryId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Product Costing Material");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 740, 450));

        jButton1.setText(" Select to Create New Product");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 470, -1, -1));

        jTextField3.setText("jTextField3");
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, -1, -1));

        jButton2.setText("Filter by design id");
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, -1));

        jLabel8.setText("Design Id");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        jButton3.setText("View All");
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, -1, -1));

        jButton5.setText("Search");
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, -1, -1));

        jTabbedPane1.addTab("Main ", jPanel5);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCustomerId.setEditable(false);
        jTextFieldCustomerId.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerIdActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, -1));
        jTextFieldCustomerId.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Design ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel7.setText("Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        datePicker2.setName(""); // NOI18N
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jButton4.setText("ADD Product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        jButton6.setText("Reset All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jTextFieldSalesDesignInquiryId.setEditable(false);
        jTextFieldSalesDesignInquiryId.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryIdActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldSalesDesignInquiryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, -1));

        jLabel12.setText("Product ID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Accessories Quantity"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            }
            ,
            new String [] {
                "Size","Quantity"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 80));

        jButton11.setText("Add  Row");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 90, -1));

        jButton12.setText("Delete Row");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 510, 140));

        jLabel13.setText("Size");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jTextFieldSalesDesignInquiryId1.setEditable(false);
        jTextFieldSalesDesignInquiryId1.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryId1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldSalesDesignInquiryId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));

        jLabel15.setText("Gender");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextFieldSalesDesignInquiryId2.setEditable(false);
        jTextFieldSalesDesignInquiryId2.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryId2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldSalesDesignInquiryId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, -1));

        jLabel16.setText("Colour");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jTextFieldSalesDesignInquiryId3.setEditable(false);
        jTextFieldSalesDesignInquiryId3.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryId3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldSalesDesignInquiryId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Material Quantity"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            }
            ,
            new String [] {
                "Size","Quantity"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 80));

        jButton14.setText("Add  Row");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 90, -1));

        jButton15.setText("Delete Row");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 510, 130));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 740, 450));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1290, 520));

        jTabbedPane1.addTab("ADD Material Cost", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
      //  boolean result=customerModel.AddCustomer(jTextFieldCustomerId, jTextFieldCustomerName, jTextFieldCompanyName,jTextFieldPhone,jTextFieldEmail,datePicker2);
     //   if(result)
     {
            JOptionPane.showMessageDialog(null,"Successfully To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
             generate_sdi();
             clear();
        }
       // else
        {
            JOptionPane.showMessageDialog(null,"Failed To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerIdActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    clear();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextFieldSalesDesignInquiryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryIdActionPerformed

    private void jTextFieldSalesDesignInquiryId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryId1ActionPerformed

    private void jTextFieldSalesDesignInquiryId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryId2ActionPerformed

    private void jTextFieldSalesDesignInquiryId3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryId3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryId3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed
    private void generate_sdi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextFieldCustomerId.setText(aid.generate("cus",Integer.toString(MainWindow.userid)));
    }
    
    private void clear(){
            generate_sdi();

            
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId1;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId2;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId3;
    // End of variables declaration//GEN-END:variables
}
