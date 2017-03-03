
package Sales;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.autogetimage;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */

public class SalesPayment extends javax.swing.JInternalFrame {
DefaultTableModel Paymentmodel;
String SalesInvoiceId;
String CustomerID;
String CustomerName;
SalesPaymentModel salesPaymentModel;

    /**
     * Creates new form SalesDesignInquiry
     */
    public SalesPayment() {
        initComponents();
        Paymentmodel=(DefaultTableModel) jTablePayment.getModel();
        salesPaymentModel = new SalesPaymentModel();
        generate_spi();
        datePickerSalesPayment.setDateToToday();
        jPanelSalesInvoiceSearch.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCustomerID = new javax.swing.JTextField();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSalesPaymentId = new javax.swing.JTextField();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePickerSalesPayment = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSalesInvoiceID = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPaymentType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTotalPayable = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPaymentAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDueAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePayment = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanelSalesInvoiceSearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablesSalesInvoice = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Sales Payment Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Reset All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel3.setText("Customer ID");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel4.setText("Customer Name");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jTextFieldCustomerID.setEditable(false);
        jTextFieldCustomerID.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, -1));

        jTextFieldCustomerName.setEditable(false);
        jTextFieldCustomerName.setName("Company name"); // NOI18N
        jPanel6.add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, -1));

        jLabel2.setText("Sales Payment  ID");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel7.setText("Date");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jTextFieldSalesPaymentId.setEditable(false);
        jTextFieldSalesPaymentId.setName("Customer ID"); // NOI18N
        jTextFieldSalesPaymentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesPaymentIdActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldSalesPaymentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 110, -1));

        datePickerSalesPayment.setEnabled(false);
        datePickerSalesPayment.setName(""); // NOI18N
        jPanel6.add(datePickerSalesPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel5.setText("Sales Invoice ID");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jTextFieldSalesInvoiceID.setEditable(false);
        jTextFieldSalesInvoiceID.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldSalesInvoiceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 110, -1));

        jButton12.setText("Search Sales Invoice");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 690, 130));

        jButton4.setText("ADD Sales Payment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jLabel1.setText("Payment Type");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jComboBoxPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheaque", "Credit" }));
        jPanel2.add(jComboBoxPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, -1));

        jLabel9.setText("Total Payable");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jTextFieldTotalPayable.setEditable(false);
        jPanel2.add(jTextFieldTotalPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 50, -1));

        jLabel10.setText("Payment Amount");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jTextFieldPaymentAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPaymentAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPaymentAmountKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldPaymentAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 60, -1));

        jLabel11.setText("Due Amount");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jTextFieldDueAmount.setEditable(false);
        jPanel2.add(jTextFieldDueAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, -1));

        jTablePayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PaymentID","Date","Total-Payable","Paid-Amount","Due-Amount"
            }
        ));
        jScrollPane1.setViewportView(jTablePayment);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 430, 250));

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 750, 510));

        jPanelSalesInvoiceSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSalesInvoiceSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablesSalesInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablesSalesInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesSalesInvoiceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablesSalesInvoice);

        jPanelSalesInvoiceSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 470, 330));

        jButton8.setText("View All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton9.setText("Reset All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel6.setText("Sales Invoice ID");
        jPanelSalesInvoiceSearch.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanelSalesInvoiceSearch.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 70, -1));

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jPanel1.add(jPanelSalesInvoiceSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 530, 510));

        jTabbedPane1.addTab("ADD Sales Payment", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextFieldSalesPaymentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesPaymentIdActionPerformed

    }//GEN-LAST:event_jTextFieldSalesPaymentIdActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
 jPanelSalesInvoiceSearch.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 boolean result=salesPaymentModel.AddSPI(jTextFieldSalesPaymentId,jTextFieldCustomerID,jTextFieldSalesInvoiceID,datePickerSalesPayment,jComboBoxPaymentType,jTextFieldTotalPayable,jTextFieldPaymentAmount,jTextFieldDueAmount);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully To Added Sales payment", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed To Added Sales Payment", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTablesSalesInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesSalesInvoiceMouseClicked
        int x=jTablesSalesInvoice.getSelectedRow();
    String y=(String) jTablesSalesInvoice.getValueAt(x,0);
    
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_salesInvoice_table","salesInvoiceId", y);
    
    try {
        AutoDB_Connect.DB_ResultSet.next();
        SalesInvoiceId=AutoDB_Connect.DB_ResultSet.getString("salesInvoiceId");
        CustomerID=AutoDB_Connect.DB_ResultSet.getString("CustomerId");

    } catch (SQLException ex) {
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
    }  
    }//GEN-LAST:event_jTablesSalesInvoiceMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 
        jTablesSalesInvoice.setModel(DbUtils.resultSetToTableModel(salesPaymentModel.ViewAllSalesInvoice()));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         jPanelSalesInvoiceSearch.setVisible(false);
         jTextFieldSalesInvoiceID.setText(SalesInvoiceId);
         jTextFieldCustomerID.setText(CustomerID);
         
         AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId",CustomerID );
    
    try {
        AutoDB_Connect.DB_ResultSet.next();
        //SalesInvoiceId=DB_Connect.DB_ResultSet.getString("salesInvoiceId");
        CustomerName=AutoDB_Connect.DB_ResultSet.getString("CustomerName");

    } catch (SQLException ex) {
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
    }
    jTextFieldCustomerName.setText(CustomerName);
    
    //get past payment details
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchSelected(new String[]{"salesPaymentId","date","totalPayable","paymentAmount","dueAmount"},"d_salesPayment_table","salesInvoiceId",SalesInvoiceId );

   
    TableModel  cc=DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet);

    try {
        if (AutoDB_Connect.DB_ResultSet.first())
        
        {jTablePayment.setModel(cc);
         AutoDB_Connect.DB_ResultSet.last();
        jTextFieldTotalPayable.setText(AutoDB_Connect.DB_ResultSet.getString("dueAmount"));
        }
        
        else {
        
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchSelected(new String[]{"GrandTotal"},"d_salesInvoice_table","salesInvoiceId",SalesInvoiceId );
             
        try {
                 
                 AutoDB_Connect.DB_ResultSet.next();
                 jTextFieldTotalPayable.setText(AutoDB_Connect.DB_ResultSet.getString("GrandTotal"));
             
             } catch (SQLException ex) {
                 Logger.getLogger(SalesPayment.class.getName()).log(Level.SEVERE, null, ex);
             }
        }    
    } catch (SQLException ex) {
        Logger.getLogger(SalesPayment.class.getName()).log(Level.SEVERE, null, ex);
    }
    


    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldPaymentAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPaymentAmountKeyTyped
     
    }//GEN-LAST:event_jTextFieldPaymentAmountKeyTyped

    private void jTextFieldPaymentAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPaymentAmountKeyReleased
       if(jTextFieldPaymentAmount.getText().equals("")){jTextFieldDueAmount.setText("");}
       else{
       int tem =Integer.parseInt(jTextFieldTotalPayable.getText());
       int tem1=Integer.parseInt(jTextFieldPaymentAmount.getText());
       int tem2=tem-tem1;
       jTextFieldDueAmount.setText(Integer.toString(tem2)); 
       }
       
    }//GEN-LAST:event_jTextFieldPaymentAmountKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(jTextFieldPaymentAmount.getText().equals("")){jTextFieldDueAmount.setText("");}
       else{
       int tem =Integer.parseInt(jTextFieldTotalPayable.getText());
       int tem1=Integer.parseInt(jTextFieldPaymentAmount.getText());
       int tem2=tem-tem1;
       jTextFieldDueAmount.setText(Integer.toString(tem2)); 
       }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void generate_spi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextFieldSalesPaymentId.setText(aid.generate("spi",Integer.toString(MainWindow.userid)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePickerSalesPayment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxPaymentType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanelSalesInvoiceSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablePayment;
    private javax.swing.JTable jTablesSalesInvoice;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCustomerID;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldDueAmount;
    private javax.swing.JTextField jTextFieldPaymentAmount;
    private javax.swing.JTextField jTextFieldSalesInvoiceID;
    private javax.swing.JTextField jTextFieldSalesPaymentId;
    private javax.swing.JTextField jTextFieldTotalPayable;
    // End of variables declaration//GEN-END:variables
}
