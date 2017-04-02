
package Sales;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import MainSystem.AutoDB_Connect;
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.autoSqlQuery;



/**
 *
 * @author Dinushka
 */
public class Customer extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelCustomer;
    int RowCountjTable2;
    CustomerModel customerModel;


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
    public Customer() {
        initComponents();
        customerModel = new CustomerModel();
        modelCustomer = (DefaultTableModel) jTablesCustomer.getModel();
        jTextFieldCustomerId.setText(customerModel.generate_cid());
        datePicker2.setDateToToday();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCompanyName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jButtonResetAll = new javax.swing.JButton();
        jButtonADDCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch = new javax.swing.JPanel();
        DatePickerSettings dateSettings321 = new DatePickerSettings();
        dateSettings321.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings321.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePickersFrom = new com.github.lgooddatepicker.components.DatePicker(dateSettings321);
        DatePickerSettings dateSettingsq321 = new DatePickerSettings();
        dateSettingsq321.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettingsq321.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePickersTo = new com.github.lgooddatepicker.components.DatePicker(dateSettingsq321);
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablesCustomer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextFieldSearchCustomerName = new javax.swing.JTextField();
        jTextFieldSearchCustomerPhone = new javax.swing.JTextField();
        jTextFieldSearchCustomerId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldCustomerId1 = new javax.swing.JTextField();
        jTextFieldCustomerName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCompanyName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldAddress1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setResizable(true);
        setTitle("Customer Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Customer ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jTextFieldCustomerId.setEditable(false);
        jTextFieldCustomerId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCustomerId.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerIdActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, -1));
        jTextFieldCustomerId.getAccessibleContext().setAccessibleName("");

        jLabel3.setText("Customer Name");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextFieldCustomerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCustomerName.setName("Customer Name"); // NOI18N
        jPanel2.add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 240, -1));
        jTextFieldCustomerName.getAccessibleContext().setAccessibleName("");

        jLabel4.setText("Company Name");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextFieldCompanyName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCompanyName.setName("Company name"); // NOI18N
        jPanel2.add(jTextFieldCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 240, -1));
        jTextFieldCompanyName.getAccessibleContext().setAccessibleName("");

        jLabel5.setText("Phone");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextFieldPhone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPhone.setName("Phone number"); // NOI18N
        jPanel2.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 240, -1));
        jTextFieldPhone.getAccessibleContext().setAccessibleName("");

        jLabel6.setText("E-Mail");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldEmail.setName("Email"); // NOI18N
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, -1));
        jTextFieldEmail.getAccessibleContext().setAccessibleName("");

        jLabel12.setText("Address");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextFieldAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldAddress.setName("Address"); // NOI18N
        jPanel2.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 330, -1));
        jTextFieldAddress.getAccessibleContext().setAccessibleName("");

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        datePicker2.setEnabled(false);
        datePicker2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        datePicker2.setName(""); // NOI18N
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jButtonResetAll.setText("Reset All Fields ");
        jButtonResetAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 30));

        jButtonADDCustomer.setText("ADD New Customer");
        jButtonADDCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADDCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonADDCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("To Add A New Customer Please Fill The Information Below");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 380, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 560, 450));

        jTabbedPane1.addTab("ADD Customer", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelcustomerSearch.add(datePickersFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));
        jPanelcustomerSearch.add(datePickersTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jTablesCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablesCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablesCustomer);

        jPanelcustomerSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 790, 300));

        jButton1.setText("Search");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jTextFieldSearchCustomerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSearchCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchCustomerNameActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jTextFieldSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, -1));

        jTextFieldSearchCustomerPhone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelcustomerSearch.add(jTextFieldSearchCustomerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));

        jTextFieldSearchCustomerId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelcustomerSearch.add(jTextFieldSearchCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 120, -1));

        jLabel9.setText("Customer ID");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Customer Name");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel11.setText("Added Date");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jButton8.setText("View All Customers");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 210, -1));

        jButton9.setText("Reset All");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 210, -1));

        jButton10.setText("Search");
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton14.setText(" Table Values Report");
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 210, -1));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText(" All Customers Report");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 210, -1));

        jLabel14.setText("Customer Phone");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton4.setText("Search");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 830, 510));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCustomerId1.setEditable(false);
        jTextFieldCustomerId1.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerId1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldCustomerId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        jTextFieldCustomerName1.setName("Customer Name"); // NOI18N
        jPanel5.add(jTextFieldCustomerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 210, -1));

        jLabel8.setText("Customer ID");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel13.setText("Customer Name");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel15.setText("Company Name");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextFieldCompanyName1.setName("Company name"); // NOI18N
        jPanel5.add(jTextFieldCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 210, -1));

        jLabel16.setText("Phone");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextFieldPhone1.setName("Phone number"); // NOI18N
        jPanel5.add(jTextFieldPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));

        jLabel17.setText("E-Mail");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextFieldEmail1.setName("Email"); // NOI18N
        jPanel5.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 210, -1));

        jLabel18.setText("Address");
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldAddress1.setName("Address"); // NOI18N
        jPanel5.add(jTextFieldAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jButton3.setText("Delete");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 110, -1));

        jButton2.setText("Edit");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 90, -1));

        jButton11.setText("Reset All");
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 110, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 410, 520));

        jTabbedPane1.addTab("Search & Edit || Delete || Reports", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDCustomerActionPerformed
        
        boolean result=customerModel.AddCustomer(jTextFieldCustomerId, jTextFieldCustomerName, jTextFieldCompanyName,jTextFieldPhone,jTextFieldEmail, jTextFieldAddress, datePicker2);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
             jTextFieldCustomerId.setText(customerModel.generate_cid());
             clear();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }  
    }//GEN-LAST:event_jButtonADDCustomerActionPerformed

    private void jTextFieldCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerIdActionPerformed
  
    }//GEN-LAST:event_jTextFieldCustomerIdActionPerformed

    private void jTextFieldSearchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerNameActionPerformed
     
    }//GEN-LAST:event_jTextFieldSearchCustomerNameActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed
        clear();        
    }//GEN-LAST:event_jButtonResetAllActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean result=customerModel.EditCustomer(CustomerId, jTextFieldCustomerName1, jTextFieldCompanyName1,jTextFieldPhone1, jTextFieldEmail1, jTextFieldAddress1);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully To edited Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
             jTablesCustomer.setModel(DbUtils.resultSetToTableModel(customerModel.ViewAll()));
             
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed To edit Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }
        clearSearch();
        modelCustomer.setRowCount(0);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldCustomerId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerId1ActionPerformed

    }//GEN-LAST:event_jTextFieldCustomerId1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTablesCustomer.setModel(DbUtils.resultSetToTableModel(customerModel.SearchDateRange("d_customer_table","AddedDate",datePickersFrom,datePickersTo)));
       clearSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jTablesCustomer.setModel(DbUtils.resultSetToTableModel(customerModel.ViewAll()));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTablesCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesCustomerMouseClicked
        int x=jTablesCustomer.getSelectedRow();
        String y=(String) jTablesCustomer.getValueAt(x,0);
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId",y);

        try {
            AutoDB_Connect.DB_ResultSet.next();
        
            CustomerId=AutoDB_Connect.DB_ResultSet.getString("CustomerId");
            jTextFieldCustomerId1.setText(CustomerId);
            CustomerName=AutoDB_Connect.DB_ResultSet.getString("Name");
            jTextFieldCustomerName1.setText(CustomerName);
            CustomerCompanyName=AutoDB_Connect.DB_ResultSet.getString("CompanyName");
            jTextFieldCompanyName1.setText(CustomerCompanyName);
            CustomerPhone=AutoDB_Connect.DB_ResultSet.getString("Phone");
            jTextFieldPhone1.setText(CustomerPhone);
            CustomerEmail=AutoDB_Connect.DB_ResultSet.getString("Email");
            jTextFieldEmail1.setText(CustomerEmail);
            CustomerAddres=AutoDB_Connect.DB_ResultSet.getString("Address");
            jTextFieldAddress1.setText(CustomerAddres);    
        } 
        catch (SQLException ex){
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTablesCustomerMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clear();
        clearSearch();
        clearTable();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Boolean result =customerModel.DeleteCustomer(CustomerId);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully Deleted Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            clear();
            clearSearch();
            clearTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed Deleted Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }  
        clearSearch();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTablesCustomer.setModel(DbUtils.resultSetToTableModel(customerModel.SearchName(jTextFieldSearchCustomerName.getText())));
        clearSearch();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //String x=System.getProperty("user.dir");
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\CustomerDateRange.jrxml";
        System.err.println(FileLocation);
        //./Reports/ipr.jrxml
        String SQL="SELECT * FROM garmentsystem.d_customer_table";
        autoReport.Query2Report(FileLocation, SQL); 
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTablesCustomer.setModel(DbUtils.resultSetToTableModel(customerModel.SearchID(jTextFieldSearchCustomerId.getText())));
        clearSearch();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\CustomerDateRange.jrxml";
        autoReport.Table2Report(FileLocation, jTablesCustomer);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    private void clear(){
        jTextFieldCustomerId.setText(customerModel.generate_cid());
        jTextFieldCustomerName.setText("");
        jTextFieldCompanyName.setText("");
        jTextFieldPhone.setText("");
        jTextFieldEmail.setText("");
        jTextFieldAddress.setText("");
    }
    
    private void clearSearch(){
        datePickersFrom.setText("");
        datePickersTo.setText("");
        jTextFieldSearchCustomerId.setText("");
        jTextFieldCustomerId1.setText("");
        jTextFieldCustomerName1.setText("");
        jTextFieldSearchCustomerName.setText("");
        jTextFieldCompanyName1.setText("");
        jTextFieldSearchCustomerPhone.setText("");
        jTextFieldPhone1.setText("");
        jTextFieldEmail1.setText("");
        jTextFieldAddress1.setText("");
    }
    
    private void clearTable(){
        modelCustomer = (DefaultTableModel) jTablesCustomer.getModel();
        modelCustomer.getDataVector().removeAllElements();
        modelCustomer.fireTableDataChanged();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePickersFrom;
    private com.github.lgooddatepicker.components.DatePicker datePickersTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonADDCustomer;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablesCustomer;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldAddress1;
    private javax.swing.JTextField jTextFieldCompanyName;
    private javax.swing.JTextField jTextFieldCompanyName1;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerId1;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldCustomerName1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldSearchCustomerId;
    private javax.swing.JTextField jTextFieldSearchCustomerName;
    private javax.swing.JTextField jTextFieldSearchCustomerPhone;
    // End of variables declaration//GEN-END:variables
}
