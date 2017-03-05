
package Sales;

import MainSystem.AutoDB_Connect;
import static MainSystem.MainWindow.autoReport;
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
 DefaultTableModel CustomerModel;
 DefaultTableModel sedmodel1;
 DefaultTableModel sedmodel2;
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
        jPanelEdit.setVisible(false); 
        datePickerSalesInquiry.setDateToToday();
        ProductModel = (DefaultTableModel) jTableSalesInuiry.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelMainSI = new javax.swing.JPanel();
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
        jLabel8 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePickerPurchaseDue = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaNote = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
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
        jLabelsProductPreview = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
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
        jButton26 = new javax.swing.JButton();
        jPanelSDISearch = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanelSearchEditDeleteReportM1 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jTextFieldSearchTSDIID = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelSearchEditDeleteReportM = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButtonSearchCustomerID = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldSearchSDIID = new javax.swing.JTextField();
        jTextFieldSearchCustomerID = new javax.swing.JTextField();
        jTextFieldSearchCustomerName1 = new javax.swing.JTextField();
        jTextFieldSearchDesignName = new javax.swing.JTextField();
        jPanelEdit = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        setResizable(true);
        setTitle("Sales Inquiry Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMainSI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMainSI.setMaximumSize(new java.awt.Dimension(1310, 530));
        jPanelMainSI.setMinimumSize(new java.awt.Dimension(1310, 530));
        jPanelMainSI.setPreferredSize(new java.awt.Dimension(1310, 530));
        jPanelMainSI.setToolTipText("");
        jPanelMainSI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanelMainSI.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1110, 200));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Reset All");
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 140, -1));

        jLabel3.setText("Customer ID");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel4.setText("Customer Name");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jTextFieldCustomerId.setEditable(false);
        jTextFieldCustomerId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCustomerId.setName("Customer Name"); // NOI18N
        jTextFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerIdActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 110, -1));
        jTextFieldCustomerId.getAccessibleContext().setAccessibleName("");

        jTextFieldCustomerName.setEditable(false);
        jTextFieldCustomerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCustomerName.setName("Company name"); // NOI18N
        jPanel6.add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 110, -1));
        jTextFieldCustomerName.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Sales Inquiry ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextFieldSalesInquiryId.setEditable(false);
        jTextFieldSalesInquiryId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSalesInquiryId.setName("Customer ID"); // NOI18N
        jTextFieldSalesInquiryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesInquiryIdActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldSalesInquiryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, -1));
        jTextFieldSalesInquiryId.getAccessibleContext().setAccessibleName("");

        datePickerSalesInquiry.setEnabled(false);
        datePickerSalesInquiry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        datePickerSalesInquiry.setName(""); // NOI18N
        jPanel6.add(datePickerSalesInquiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jButton11.setText("Search Customer");
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel8.setText("Estimated date of purchase");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        datePickerPurchaseDue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel6.add(datePickerPurchaseDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, -1, -1));

        jPanelMainSI.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1200, 100));

        jButton4.setText("ADD Invoice ");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelMainSI.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 470, 140, 30));

        jButton13.setText("Add");
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanelMainSI.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 200, 80, -1));

        jButton18.setText("Delete");
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMainSI.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 240, 80, -1));

        jTextAreaNote.setColumns(20);
        jTextAreaNote.setRows(5);
        jTextAreaNote.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jTextAreaNote);

        jPanelMainSI.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 500, 130));

        jLabel1.setText("Note");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMainSI.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel15.setText("Total ");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMainSI.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelMainSI.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 100, -1));

        jLabel17.setText("Discount Rate");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMainSI.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 110, 20));

        jButton2.setText("Calculate Total");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelMainSI.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 370, 140, -1));

        jLabel18.setText("Grand Total");
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelMainSI.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 100, 20));

        jTextFieldGrandTotal.setEditable(false);
        jTextFieldGrandTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelMainSI.add(jTextFieldGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, 100, -1));

        jComboBoxDiscountRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"","2.5", "5", "7.5", "10","12.5","15" }));
        jComboBoxDiscountRate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelMainSI.add(jComboBoxDiscountRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 100, -1));

        jPanel1.add(jPanelMainSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1310, 530));

        jPanelproductSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelproductSearch.setMaximumSize(new java.awt.Dimension(1020, 530));
        jPanelproductSearch.setMinimumSize(new java.awt.Dimension(1020, 530));
        jPanelproductSearch.setPreferredSize(new java.awt.Dimension(1020, 530));
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

        jPanelproductSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 950, 250));

        jButton12.setText("Select");
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 483, 90, 30));

        jTextFieldsDesignId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldsDesignId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsDesignIdActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jTextFieldsDesignId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, -1));

        jTextFieldsProductType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelproductSearch.add(jTextFieldsProductType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 100, -1));

        jTextFieldsProductId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelproductSearch.add(jTextFieldsProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));

        jLabel12.setText("Product ID");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelproductSearch.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel14.setText("Design ID");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelproductSearch.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel19.setText("Product Type");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelproductSearch.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButton14.setText("Search");
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 90, -1));

        jButton15.setText("Search");
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 90, -1));

        jButton16.setText("Search");
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 90, -1));

        jButton17.setText("View All");
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 100, -1));

        jLabelsProductPreview.setText("              Product Preview");
        jPanelproductSearch.add(jLabelsProductPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 240, 170));

        jButton3.setText("Reset ALL");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelproductSearch.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 100, -1));

        jPanel1.add(jPanelproductSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 1020, 530));

        jPanelcustomerSearch4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelcustomerSearch4.setMaximumSize(new java.awt.Dimension(1020, 530));
        jPanelcustomerSearch4.setMinimumSize(new java.awt.Dimension(1020, 530));
        jPanelcustomerSearch4.setPreferredSize(new java.awt.Dimension(1020, 530));
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

        jPanelcustomerSearch4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 960, 320));

        jButton19.setText("Select");
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 80, 30));

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelcustomerSearch4.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 130, -1));

        jTextFieldSDICustomerId1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelcustomerSearch4.add(jTextFieldSDICustomerId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, -1));

        jLabel20.setText("Customer ID");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel21.setText("Customer Name");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel22.setText("Customer Phone");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jButton20.setText("Search");
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 90, -1));

        jButton21.setText("Search");
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, -1));

        jButton22.setText("Search");
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 90, -1));

        jButton23.setText("New Customer");
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 130, -1));

        jButton24.setText("View All");
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 130, -1));

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setText("Reset All");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch4.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 130, -1));

        jPanel1.add(jPanelcustomerSearch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 1020, 530));

        jTabbedPane1.addTab("ADD Sales Inquiry", jPanel1);

        jPanelSDISearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jPanel12.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 950, 140));

        jPanelSearchEditDeleteReportM1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSearchEditDeleteReportM1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Report");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, -1));

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setText("Edit");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, -1));

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setText("Delete");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 110, -1));

        jButton30.setText("Clear");
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 110, -1));

        jTextFieldSearchTSDIID.setEditable(false);
        jTextFieldSearchTSDIID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelSearchEditDeleteReportM1.add(jTextFieldSearchTSDIID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Sales  Inquiry ID");
        jPanelSearchEditDeleteReportM1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel12.add(jPanelSearchEditDeleteReportM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 240, 240));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable3);

        jPanel12.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 950, 200));

        jPanelSearchEditDeleteReportM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSearchEditDeleteReportM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton34.setText("View All");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 210, -1));

        jButton35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton35.setText(" All SII Report");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 210, -1));

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton36.setText(" Table Values Report");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 210, -1));

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton37.setText("Reset All");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 210, -1));

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton38.setText("Search");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, -1));

        jButtonSearchCustomerID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSearchCustomerID.setText("Search");
        jButtonSearchCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCustomerIDActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButtonSearchCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 120, -1));

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton39.setText("Search");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 120, -1));

        jButton40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton40.setText("Search");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Sales Inquiry ID");
        jPanelSearchEditDeleteReportM.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setText("Customer ID");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelSearchEditDeleteReportM.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Customer Name");
        jPanelSearchEditDeleteReportM.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Customer Phone");
        jPanelSearchEditDeleteReportM.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextFieldSearchSDIID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSearchSDIID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchSDIIDActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchSDIID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, -1));

        jTextFieldSearchCustomerID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 150, -1));

        jTextFieldSearchCustomerName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSearchCustomerName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchCustomerName1ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchCustomerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, -1));

        jTextFieldSearchDesignName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchDesignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));

        jPanel12.add(jPanelSearchEditDeleteReportM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 950, 140));

        jPanelEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton41.setText("Finish Editing");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanelEdit.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 190, -1));

        jButton42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton42.setText("Quit Editing ");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanelEdit.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 190, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("Edit Mode ");
        jPanelEdit.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, 60));

        jPanel12.add(jPanelEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 950, 140));

        jPanelSDISearch.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1270, 540));

        jTabbedPane1.addTab("Search & Edit ||  Delete ||Reports ", jPanelSDISearch);

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    jPanelcustomerSearch4.setVisible(true);     
    jPanelproductSearch.setVisible(false);
    jPanelMainSI.setVisible(false);
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
        jPanelMainSI.setVisible(true);
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextFieldsDesignIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsDesignIdActionPerformed
    
    }//GEN-LAST:event_jTextFieldsDesignIdActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    jTablesProduct.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchAll("product_table","ProductId",jTextFieldsProductId.getText())));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
     jTablesProduct.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchAll("product_table","ProductId",jTextFieldsDesignId.getText())));
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    jPanelcustomerSearch4.setVisible(false);     
    jPanelproductSearch.setVisible(true);
    jPanelMainSI.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

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

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jTablesCustomer.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.ViewAllCustomer()));
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    jTablesCustomer.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.SearchID(jTextFieldSDICustomerId1.getText()))); 
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed

    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jTextFieldCustomerId.setText(CustomerId);
        jTextFieldCustomerName.setText(CustomerName);
        jPanelcustomerSearch4.setVisible(false);
        jPanelMainSI.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTablesCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablesCustomerMouseClicked

        int x=jTablesCustomer.getSelectedRow();
        String y=(String) jTablesCustomer.getValueAt(x,0);

        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId", y);

        try {
            AutoDB_Connect.DB_ResultSet.next();
            CustomerId=AutoDB_Connect.DB_ResultSet.getString("CustomerId");
            CustomerName=AutoDB_Connect.DB_ResultSet.getString("Name");
 

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTablesCustomerMouseClicked

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        CustomerModel = (DefaultTableModel) jTablesCustomer.getModel();
        CustomerModel.getDataVector().removeAllElements();
        CustomerModel.fireTableDataChanged();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jTablesCustomer.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.SearchCustomerTName(jTextField12.getText())));    
        clearSearch();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTablesCustomer.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.SearchCustomerTPhone(jTextField13.getText())));    
        clearSearch();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ProductModel = (DefaultTableModel) jTablesProduct.getModel();
        ProductModel.getDataVector().removeAllElements();
        ProductModel.fireTableDataChanged();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
         jTablesProduct.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchAll("product_table","DesignId",jTextFieldsDesignId.getText())));
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTablesProduct.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchAll("product_table","ProductType",jTextFieldsProductType.getText())));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\SDII.jrxml";
        String SQL="SELECT * FROM garmentsystem.d_designinquiry_table where DesignInquiryId ='"+jTextFieldSearchTSDIID.getText()+"'";
        autoReport.Query2Report(FileLocation, SQL);
        String FileLocation1="C:\\Users\\Dinu-Laptop\\Documents\\NetBeansProjects\\ERP_Garment_Ver-1\\ERP_Garment_Ver-1\\src\\Sales\\Reports\\SDII2.jrxml";
        String SQL1="SELECT * FROM garmentsystem.d_designinquiry_table1 where DesignInquiryId ='"+jTextFieldSearchTSDIID.getText()+"'";
        autoReport.Query2Report(FileLocation1, SQL1);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(jTextFieldSearchTSDIID.getText().equals("")){
            //do nothing
        }
        else{
   //         jTable1.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchAll("d_designinquiry_table1","d_salesInquiry_table1", jTextFieldSearchTSDIID.getText())));
            jPanelSearchEditDeleteReportM.setVisible(false);
            jPanelSearchEditDeleteReportM1.setVisible(false);
            jPanelEdit.setVisible(true);
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        Boolean result =salesinquirymodel.DeleteSII(jTextFieldSearchTSDIID.getText());
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully Deleted SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
         //   clear();
            clearSearch();
            clearTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed Deleted SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);

        }
        clearSearch();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jTextFieldSearchTSDIID.setText("");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int x=jTable3.getSelectedRow();
        String y=(String) jTable3.getValueAt(x,0);
        jTextFieldSearchTSDIID.setText(y);

        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_salesInquiry_table1","SalesInquiryId", y);
        jTable5.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.ViewAll()));
        clearSearch();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\report1.jrxml";
        String SQL="SELECT * FROM garmentsystem.d_designinquiry_table";
        autoReport.Query2Report(FileLocation, SQL);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\SalesInquiry.jrxml";
        autoReport.Table2Report(FileLocation, jTable3);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        clearSearch();
   //     clearTable();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.SearchSIID(jTextFieldSearchSDIID.getText())));
        clearSearch();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButtonSearchCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCustomerIDActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.SearchCustomerID(jTextFieldSearchCustomerID.getText())));
        clearSearch();
    }//GEN-LAST:event_jButtonSearchCustomerIDActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.SearchCustomerName(jTextFieldSearchCustomerName1.getText())));
        clearSearch();

    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesinquirymodel.SearchCusPhone(jTextFieldSearchDesignName.getText())));
        clearSearch();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jTextFieldSearchSDIIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchSDIIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchSDIIDActionPerformed

    private void jTextFieldSearchCustomerName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchCustomerName1ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed

    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        jPanelSearchEditDeleteReportM.setVisible(true);
        jPanelSearchEditDeleteReportM1.setVisible(true);
         
        jPanelEdit.setVisible(false);
        clearTable();
        clearSearch();
        //clear();
    }//GEN-LAST:event_jButton42ActionPerformed
    private void clearSearch(){
        jTextFieldSDICustomerId1.setText("");
        jTextField12.setText("");
        jTextField13.setText("");


    }
    
    private void clearTable(){
        sedmodel1= (DefaultTableModel) jTable3.getModel();
        sedmodel1.getDataVector().removeAllElements();
        sedmodel1.fireTableDataChanged();
        
        sedmodel2 = (DefaultTableModel) jTable5.getModel();
        sedmodel2.getDataVector().removeAllElements();
        sedmodel2.fireTableDataChanged();
    }
    
    
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
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonSearchCustomerID;
    private javax.swing.JComboBox<String> jComboBoxDiscountRate;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelsProductPreview;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelEdit;
    private javax.swing.JPanel jPanelMainSI;
    private javax.swing.JPanel jPanelSDISearch;
    private javax.swing.JPanel jPanelSearchEditDeleteReportM;
    private javax.swing.JPanel jPanelSearchEditDeleteReportM1;
    private javax.swing.JPanel jPanelcustomerSearch4;
    private javax.swing.JPanel jPanelproductSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTableSalesInuiry;
    private javax.swing.JTable jTablesCustomer;
    private javax.swing.JTable jTablesProduct;
    private javax.swing.JTextArea jTextAreaNote;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldGrandTotal;
    private javax.swing.JTextField jTextFieldSDICustomerId1;
    private javax.swing.JTextField jTextFieldSalesInquiryId;
    private javax.swing.JTextField jTextFieldSearchCustomerID;
    private javax.swing.JTextField jTextFieldSearchCustomerName1;
    private javax.swing.JTextField jTextFieldSearchDesignName;
    private javax.swing.JTextField jTextFieldSearchSDIID;
    private javax.swing.JTextField jTextFieldSearchTSDIID;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldsDesignId;
    private javax.swing.JTextField jTextFieldsProductId;
    private javax.swing.JTextField jTextFieldsProductType;
    // End of variables declaration//GEN-END:variables
}
