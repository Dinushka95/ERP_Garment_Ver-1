
package Sales;

import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;


/**
 *
 * @author Dinushka
 */
public class SalesInquiry extends javax.swing.JInternalFrame {



    /**
     * Creates new form SalesInquiry
     */
    public SalesInquiry() {
        initComponents();
         jPanelcustomerSearch4.setVisible(false);
         jPanelproductSearch.setVisible(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jTextFieldCompanyName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCustomerId = new javax.swing.JTextField();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jButton11 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanelproductSearch = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextFieldSDICustomerId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanelcustomerSearch4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextFieldSDICustomerId1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextFieldSearchCustomerName = new javax.swing.JTextField();
        jTextFieldSearchCustomerPhone = new javax.swing.JTextField();
        jTextFieldSearchCustomerId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldCustomerId1 = new javax.swing.JTextField();
        jTextFieldCustomerName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Sales Inquiry Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 600, 280));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

        jLabel4.setText("Company Name");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jTextFieldCustomerName.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, -1));
        jTextFieldCustomerName.getAccessibleContext().setAccessibleName("");

        jTextFieldCompanyName.setName("Company name"); // NOI18N
        jPanel6.add(jTextFieldCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, -1));
        jTextFieldCompanyName.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Sales Inquiry ID");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel7.setText("Date");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextFieldCustomerId.setEditable(false);
        jTextFieldCustomerId.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerIdActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, -1));
        jTextFieldCustomerId.getAccessibleContext().setAccessibleName("");

        datePicker2.setName(""); // NOI18N
        jPanel6.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jButton11.setText("Search Customer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 670, 100));

        jButton4.setText("ADD Customer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jButton13.setText("Add");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 60, -1));

        jButton18.setText("Delete");
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 740, 510));

        jPanelproductSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelproductSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanelproductSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 430, 330));

        jButton12.setText("Select");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, -1));
        jPanelproductSearch.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 60, -1));
        jPanelproductSearch.add(jTextFieldSDICustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel12.setText("Product ID");
        jPanelproductSearch.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel14.setText("Design ID");
        jPanelproductSearch.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel19.setText("Product Type");
        jPanelproductSearch.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton14.setText("Search");
        jPanelproductSearch.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton16.setText("Search");
        jPanelproductSearch.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jButton17.setText("View All");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jPanel1.add(jPanelproductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 480, 510));

        jPanelcustomerSearch4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelcustomerSearch4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        jPanelcustomerSearch4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 430, 330));

        jButton19.setText("Select");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, -1));
        jPanelcustomerSearch4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 60, -1));
        jPanelcustomerSearch4.add(jTextFieldSDICustomerId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel20.setText("Customer ID");
        jPanelcustomerSearch4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel21.setText("Customer name");
        jPanelcustomerSearch4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel22.setText("Customer phone");
        jPanelcustomerSearch4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton20.setText("Search");
        jPanelcustomerSearch4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jButton21.setText("Search");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton22.setText("Search");
        jPanelcustomerSearch4.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jButton23.setText("New Customer");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jButton24.setText("View All");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jPanel1.add(jPanelcustomerSearch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 480, 510));

        jTabbedPane1.addTab("ADD Sales Inquiry", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanelcustomerSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 770, 330));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jTextFieldSearchCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchCustomerNameActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jTextFieldSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, -1));
        jPanelcustomerSearch.add(jTextFieldSearchCustomerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, -1));
        jPanelcustomerSearch.add(jTextFieldSearchCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel9.setText("Customer ID");
        jPanelcustomerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Customer name");
        jPanelcustomerSearch.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel11.setText("Customer phone");
        jPanelcustomerSearch.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jButton8.setText("View All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton9.setText("Reset All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

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
        jPanel5.add(jTextFieldCustomerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel8.setText("Customer ID");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel13.setText("Customer Name");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton7.setText("Reset All");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel15.setText("Company Name");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextFieldCompanyName1.setName("Company name"); // NOI18N
        jPanel5.add(jTextFieldCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        jLabel16.setText("Phone");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextFieldPhone1.setName("Phone number"); // NOI18N
        jPanel5.add(jTextFieldPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        jLabel17.setText("E-Mail");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextFieldEmail1.setName("Email"); // NOI18N
        jPanel5.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, -1));

        jLabel18.setText("Address");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldAddress1.setName("Address"); // NOI18N
        jPanel5.add(jTextFieldAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 410, 520));

        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerIdActionPerformed

    }//GEN-LAST:event_jTextFieldCustomerIdActionPerformed

    private void jTextFieldSearchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerNameActionPerformed

    }//GEN-LAST:event_jTextFieldSearchCustomerNameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldCustomerId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerId1ActionPerformed

    }//GEN-LAST:event_jTextFieldCustomerId1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    jPanelcustomerSearch4.setVisible(true);
    jPanelproductSearch.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
jPanelproductSearch.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
    
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
     
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked

    }//GEN-LAST:event_jTable7MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    jPanelcustomerSearch4.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
       
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed


    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    jPanelproductSearch.setVisible(true);
    jPanelcustomerSearch4.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed
    private void generate_sdi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextFieldCustomerId.setText(aid.generate("cus",Integer.toString(MainWindow.userid)));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JPanel jPanelcustomerSearch1;
    private javax.swing.JPanel jPanelcustomerSearch2;
    private javax.swing.JPanel jPanelcustomerSearch3;
    private javax.swing.JPanel jPanelcustomerSearch4;
    private javax.swing.JPanel jPanelproductSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextFieldAddress1;
    private javax.swing.JTextField jTextFieldCompanyName;
    private javax.swing.JTextField jTextFieldCompanyName1;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerId1;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldCustomerName1;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldSDICustomerId;
    private javax.swing.JTextField jTextFieldSDICustomerId1;
    private javax.swing.JTextField jTextFieldSearchCustomerId;
    private javax.swing.JTextField jTextFieldSearchCustomerName;
    private javax.swing.JTextField jTextFieldSearchCustomerPhone;
    // End of variables declaration//GEN-END:variables
}
