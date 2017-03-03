
package Sales;

import MainSystem.AutoDB_Connect;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.autogetimage;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */
public class SalesInquiry extends javax.swing.JInternalFrame {

 SalesInquiryModel  salesinquirymodel;
 DefaultTableModel sProductModel;
 DefaultTableModel ProductModel;
 String ProductID;
 String ProductName;
 String Price;
 String Quantity="";
 String  CustomerId;
 String  CustomerName;
 int RowCountjTable;
 
    public SalesInquiry() {
        initComponents();
        salesinquirymodel=new  SalesInquiryModel();
        jTextFieldSalesInquiryId.setText(salesinquirymodel.generate_sii());
        jPanelcustomerSearch4.setVisible(false);
        jPanelproductSearch.setVisible(false);
        datePickerSalesInquiry.setDateToToday();
        ProductModel = (DefaultTableModel) jTableSalesInuiry.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId1 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSalesInuiry = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSalesInquiryId = new javax.swing.JTextField();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePickerSalesInquiry = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jButton11 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaNote = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePickerPurchaseDue = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldGrandTotal = new javax.swing.JTextField();
        jComboBoxDiscountRate = new javax.swing.JComboBox<>();
        jPanelproductSearch = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablesProduct = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jTextFieldsDesignId = new javax.swing.JTextField();
        jTextFieldsProductType = new javax.swing.JTextField();
        jTextFieldsProductId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelsProductPreview = new javax.swing.JLabel();
        jPanelcustomerSearch4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTablesCustomer = new javax.swing.JTable();
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
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Sales Inquiry Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable5);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1230, 360));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 80, -1));

        jLabel23.setText("Sales Inquiry ID");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton26.setText("Search");
        jPanel8.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton27.setText("View All");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel16.setText("Sales Inquiry ID");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jTextFieldSalesDesignInquiryId1.setEditable(false);
        jTextFieldSalesDesignInquiryId1.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryId1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextFieldSalesDesignInquiryId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 110, -1));

        jButton28.setText("Select to edit");
        jPanel8.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1310, 520));

        jTabbedPane1.addTab("Main", jPanel7);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableSalesInuiry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity","SubTotal"
            }
        ));
        jTableSalesInuiry.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableSalesInuiryComponentAdded(evt);
            }
        });
        jTableSalesInuiry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSalesInuiryMouseClicked(evt);
            }
        });
        jTableSalesInuiry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableSalesInuiryKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSalesInuiry);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 600, 180));

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
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel4.setText("Customer Name");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jTextFieldCustomerId.setEditable(false);
        jTextFieldCustomerId.setName("Customer Name"); // NOI18N
        jTextFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerIdActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, -1));
        jTextFieldCustomerId.getAccessibleContext().setAccessibleName("");

        jTextFieldCustomerName.setEditable(false);
        jTextFieldCustomerName.setName("Company name"); // NOI18N
        jPanel6.add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, -1));
        jTextFieldCustomerName.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Sales Inquiry ID");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setText("Date");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextFieldSalesInquiryId.setEditable(false);
        jTextFieldSalesInquiryId.setName("Customer ID"); // NOI18N
        jTextFieldSalesInquiryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesInquiryIdActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldSalesInquiryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, -1));
        jTextFieldSalesInquiryId.getAccessibleContext().setAccessibleName("");

        datePickerSalesInquiry.setEnabled(false);
        datePickerSalesInquiry.setName(""); // NOI18N
        jPanel6.add(datePickerSalesInquiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jButton11.setText("Search Customer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 670, 100));

        jButton4.setText("ADD Invoice (do u want to print)");
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

        jTextAreaNote.setColumns(20);
        jTextAreaNote.setRows(5);
        jScrollPane4.setViewportView(jTextAreaNote);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 230, 80));

        jLabel1.setText("Note");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanel2.add(datePickerPurchaseDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jLabel8.setText("Estimated date of purchase");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel15.setText("Total ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jTextFieldTotal.setEditable(false);
        jPanel2.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 100, -1));

        jLabel17.setText("Discount Rate");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 80, 20));

        jButton2.setText("Calculate Total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));

        jLabel18.setText("Grand Total");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 70, 20));

        jTextFieldGrandTotal.setEditable(false);
        jPanel2.add(jTextFieldGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 80, -1));

        jComboBoxDiscountRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"","2.5", "5", "7.5", "10","12.5","15" }));
        jPanel2.add(jComboBoxDiscountRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 740, 510));

        jPanelproductSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelproductSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablesProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablesProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesProductMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablesProduct);

        jPanelproductSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 430, 260));

        jButton12.setText("Select");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jTextFieldsDesignId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsDesignIdActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jTextFieldsDesignId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, -1));
        jPanelproductSearch.add(jTextFieldsProductType, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 60, -1));
        jPanelproductSearch.add(jTextFieldsProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel12.setText("Product ID");
        jPanelproductSearch.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel14.setText("Design ID");
        jPanelproductSearch.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel19.setText("Product Type");
        jPanelproductSearch.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton14.setText("Search");
        jPanelproductSearch.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jButton16.setText("Search");
        jPanelproductSearch.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jButton17.setText("View All");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel6.setText("Should add more search parameteres");
        jPanelproductSearch.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 40));

        jLabelsProductPreview.setText("              Product Preview");
        jPanelproductSearch.add(jLabelsProductPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 160, 130));

        jPanel1.add(jPanelproductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 480, 510));

        jPanelcustomerSearch4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelcustomerSearch4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablesCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablesCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablesCustomerMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTablesCustomer);

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
        jPanelcustomerSearch.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

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

        jLabel5.setText("Sales Inquiry ID");
        jPanelcustomerSearch.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanelcustomerSearch.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, -1));

        jButton25.setText("Search");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Report");
        jPanel11.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jButton31.setText("Edit");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, -1));

        jButton32.setText("Delete");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jButton33.setText("Clear");
        jPanel11.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        jPanel11.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, -1));

        jLabel24.setText("Sales  Inquiry ID");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelcustomerSearch.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 330, 70));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 830, 510));

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
        jScrollPane5.setViewportView(jTable4);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, -1, 410));

        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Edit", jPanel9);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
              boolean result=salesinquirymodel.AddSII(jTextFieldSalesInquiryId,jTextFieldCustomerId,datePickerSalesInquiry,datePickerPurchaseDue,jTextAreaNote,jTextFieldTotal,jComboBoxDiscountRate,jTextFieldGrandTotal, jTableSalesInuiry);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
             salesinquirymodel.generate_sii();
             //clear();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldSalesInquiryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesInquiryIdActionPerformed

    }//GEN-LAST:event_jTextFieldSalesInquiryIdActionPerformed

    private void jTextFieldSearchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerNameActionPerformed

    }//GEN-LAST:event_jTextFieldSearchCustomerNameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    jPanelcustomerSearch4.setVisible(true);     
    jPanelproductSearch.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTablesProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesProductMouseClicked
    
    int x=jTablesProduct.getSelectedRow();
    String y=(String) jTablesProduct.getValueAt(x,0);
    
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("product_table","ProductId", y);
    
    try {
        AutoDB_Connect.DB_ResultSet.next();
        ProductID=AutoDB_Connect.DB_ResultSet.getString("ProductId");
        ProductName=AutoDB_Connect.DB_ResultSet.getString("ProductName");
        Price=AutoDB_Connect.DB_ResultSet.getString("Price");
        //Quantity=DB_Connect.DB_ResultSet.getString("ProductId");
        
    } catch (SQLException ex) {
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
    }    
    jLabelsProductPreview.setIcon(autoSqlQuery.executeAutoGetImage(ProductID));
    }//GEN-LAST:event_jTablesProductMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ProductModel.addRow(new Object[]{ ProductID,ProductName,Price,Quantity});
        jPanelproductSearch.setVisible(false);
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextFieldsDesignIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsDesignIdActionPerformed
    
    }//GEN-LAST:event_jTextFieldsDesignIdActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
     
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
     jTablesProduct.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.ViewAllProducts()));
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTablesCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesCustomerMouseClicked
        
    int x=jTablesCustomer.getSelectedRow();
    String y=(String) jTablesCustomer.getValueAt(x,0);
    
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId", y);
    
    try {
        AutoDB_Connect.DB_ResultSet.next();
        CustomerId=AutoDB_Connect.DB_ResultSet.getString("CustomerId");
        CustomerName=AutoDB_Connect.DB_ResultSet.getString("CustomerName");

        
       
    } catch (SQLException ex) {
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }//GEN-LAST:event_jTablesCustomerMouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    jTextFieldCustomerId.setText(CustomerId);
    jTextFieldCustomerName.setText(CustomerName);
    jPanelcustomerSearch4.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
       
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    jTablesCustomer.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.ViewAllCustomer()));
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    jPanelcustomerSearch4.setVisible(false);     
    jPanelproductSearch.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jTextFieldSalesDesignInquiryId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryId1ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed

        
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jTextFieldCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    getSubTotal();
    getTotal();
    getGrandTotal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableSalesInuiryComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableSalesInuiryComponentAdded
     
    }//GEN-LAST:event_jTableSalesInuiryComponentAdded

    private void jTableSalesInuiryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableSalesInuiryKeyTyped
       
    }//GEN-LAST:event_jTableSalesInuiryKeyTyped

    private void jTableSalesInuiryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSalesInuiryMouseClicked
        RowCountjTable=jTableSalesInuiry.getSelectedRow();
    }//GEN-LAST:event_jTableSalesInuiryMouseClicked
    
    public void getSubTotal(){
     
     double total = 0;
     double mut1 = 0;
     double mut2 = 0;
     String value1;
     String value2;
     int column1 = 2;
     int column2 = 3;

    for (int i = 0; i < ProductModel.getRowCount(); i++){
    if (ProductModel.getValueAt(i, column1) != null&&ProductModel.getValueAt(i, column2) != null)       
        {//System.out.println(ProductModel.getValueAt(i, column1));
        value1= (String) ProductModel.getValueAt(i, column1);
        value2= (String) ProductModel.getValueAt(i, column2);
        mut1=Double.valueOf(value1);
        mut2=Double.valueOf(value2);
        total= mut1*mut2;
        ProductModel.setValueAt(total, i, 4);
        }
    else {//error message box
        
    }
  
    }
    }
    
    public void getTotal(){
     
     double total = 0;
     double value;
     int column = 4; 

    for (int i = 0; i < ProductModel.getRowCount(); i++){
    if (ProductModel.getValueAt(i, column) != null)       
        {//System.out.println(ProductModel.getValueAt(i, column));
        value=  (double) ProductModel.getValueAt(i, column);
        total=total+value;
        } 
  
    }
    jTextFieldTotal.setText(String.valueOf(total));
    }
    
        public void getGrandTotal(){
     

    if (jComboBoxDiscountRate.getSelectedItem().equals("")){
        jTextFieldGrandTotal.setText(jTextFieldTotal.getText());
        } 
    else{
        double x=Double.valueOf(jTextFieldTotal.getText());
        double y=Double.valueOf(jComboBoxDiscountRate.getSelectedItem().toString());
        y=((100-y)/100);
        jTextFieldGrandTotal.setText(String.valueOf(x*y));
    }
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePickerPurchaseDue;
    private com.github.lgooddatepicker.components.DatePicker datePickerSalesInquiry;
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
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBoxDiscountRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelsProductPreview;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelcustomerSearch;
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
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTableSalesInuiry;
    private javax.swing.JTable jTablesCustomer;
    private javax.swing.JTable jTablesProduct;
    private javax.swing.JTextArea jTextAreaNote;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldGrandTotal;
    private javax.swing.JTextField jTextFieldSDICustomerId1;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId1;
    private javax.swing.JTextField jTextFieldSalesInquiryId;
    private javax.swing.JTextField jTextFieldSearchCustomerId;
    private javax.swing.JTextField jTextFieldSearchCustomerName;
    private javax.swing.JTextField jTextFieldSearchCustomerPhone;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldsDesignId;
    private javax.swing.JTextField jTextFieldsProductId;
    private javax.swing.JTextField jTextFieldsProductType;
    // End of variables declaration//GEN-END:variables
}
