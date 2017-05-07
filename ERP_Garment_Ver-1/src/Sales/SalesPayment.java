
package Sales;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelSearchEditDeleteReportM1 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jTextFieldSearchTSDIID = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

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
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel3.setText("Customer ID");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel4.setText("Customer Name");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jTextFieldCustomerID.setEditable(false);
        jTextFieldCustomerID.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, -1));

        jTextFieldCustomerName.setEditable(false);
        jTextFieldCustomerName.setName("Company name"); // NOI18N
        jPanel6.add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, -1));

        jLabel2.setText("Sales Payment  ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jTextFieldSalesPaymentId.setEditable(false);
        jTextFieldSalesPaymentId.setName("Customer ID"); // NOI18N
        jTextFieldSalesPaymentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesPaymentIdActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldSalesPaymentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 110, -1));

        datePickerSalesPayment.setEnabled(false);
        datePickerSalesPayment.setName(""); // NOI18N
        jPanel6.add(datePickerSalesPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel5.setText("Sales Invoice ID");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jTextFieldSalesInvoiceID.setEditable(false);
        jTextFieldSalesInvoiceID.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldSalesInvoiceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 110, -1));

        jButton12.setText("Search Sales Invoice");
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 130));

        jButton4.setText("ADD Sales Payment");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jLabel1.setText("Payment Type");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jComboBoxPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheaque", "Credit" }));
        jPanel2.add(jComboBoxPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, -1));

        jLabel9.setText("Total Payable");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jTextFieldTotalPayable.setEditable(false);
        jPanel2.add(jTextFieldTotalPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, -1));

        jLabel10.setText("Payment Amount");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jTextFieldPaymentAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPaymentAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPaymentAmountKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldPaymentAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 100, -1));

        jLabel11.setText("Due Amount");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jTextFieldDueAmount.setEditable(false);
        jPanel2.add(jTextFieldDueAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 100, -1));

        jTablePayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PaymentID","Date","Total-Payable","Paid-Amount","Due-Amount"
            }
        ));
        jScrollPane1.setViewportView(jTablePayment);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 450, 250));

        jButton2.setText("Calculate");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, -1));

        jButton9.setText("Reset All");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, -1));

        jLabel6.setText("Sales Invoice ID");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelSalesInvoiceSearch.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        jPanelSalesInvoiceSearch.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 110, -1));

        jButton1.setText("Select");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelSalesInvoiceSearch.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jPanel1.add(jPanelSalesInvoiceSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 530, 510));

        jTabbedPane1.addTab("ADD Sales Payment", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jButton35.setText(" All Payment Report");
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
        jLabel13.setText("Sales Payment ID");
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

        jPanel3.add(jPanelSearchEditDeleteReportM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 950, 140));

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

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 950, 340));

        jPanelSearchEditDeleteReportM1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSearchEditDeleteReportM1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Report");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, -1));

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setText("Delete");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, -1));

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton30.setText("Clear");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 110, -1));

        jTextFieldSearchTSDIID.setEditable(false);
        jTextFieldSearchTSDIID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelSearchEditDeleteReportM1.add(jTextFieldSearchTSDIID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Sales  Payment ID");
        jPanelSearchEditDeleteReportM1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel3.add(jPanelSearchEditDeleteReportM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 240, 200));

        jTabbedPane1.addTab("Search &  Report || Delete ", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        jTextFieldCustomerID.setText("");
        jTextFieldCustomerName.setText("");
        jTextFieldSalesInvoiceID.setText("");
        jTextFieldPaymentAmount.setText("");
        jTextFieldTotalPayable.setText("");
        jTextFieldDueAmount.setText("");
        
        generate_spi();
        datePickerSalesPayment.setDateToToday();

        Paymentmodel = (DefaultTableModel) jTablePayment.getModel();
        Paymentmodel.getDataVector().removeAllElements();
        Paymentmodel.fireTableDataChanged();
    
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
        jTextField1.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    jTablesSalesInvoice.setModel(DbUtils.resultSetToTableModel(salesPaymentModel.SearchSalesInvoice(jTextField1.getText())));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         jPanelSalesInvoiceSearch.setVisible(false);
         jTextFieldSalesInvoiceID.setText(SalesInvoiceId);
         jTextFieldCustomerID.setText(CustomerID);
         
         AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_customer_table","CustomerId",CustomerID );
    
    try {
        AutoDB_Connect.DB_ResultSet.next();
        //SalesInvoiceId=DB_Connect.DB_ResultSet.getString("salesInvoiceId");
        CustomerName=AutoDB_Connect.DB_ResultSet.getString("Name");

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
       double tem =Double.parseDouble(jTextFieldTotalPayable.getText());
       double tem1=Double.parseDouble(jTextFieldPaymentAmount.getText());
       System.out.println(tem);
       System.out.println(tem1);
       double tem2=tem-tem1;
       jTextFieldDueAmount.setText(Double.toString(tem2)); 
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesPaymentModel.ViewAllSalesPayment()));
         clearSearch();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\payment.jrxml";
        System.err.println(FileLocation);
        //./Reports/ipr.jrxml
        String SQL="SELECT * FROM garmentsystem.d_salesPayment_table";
        autoReport.Query2Report(FileLocation, SQL); 
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\payment.jrxml";
        autoReport.Table2Report(FileLocation, jTable3);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
//        clearSearch();
//        cs1();
//        clearTable();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesPaymentModel.SearchPaymentID(jTextFieldSearchSDIID.getText())));
        clearSearch();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButtonSearchCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCustomerIDActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesPaymentModel.SearchCustomerID(jTextFieldSearchCustomerID.getText())));
        clearSearch();
    }//GEN-LAST:event_jButtonSearchCustomerIDActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesPaymentModel.SearchCustomerName(jTextFieldSearchCustomerName1.getText())));
        clearSearch();
//        cs1();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(salesPaymentModel.SearchCustomerPhone(jTextFieldSearchCustomerName1.getText())));
        clearSearch();
//        cs1();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jTextFieldSearchSDIIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchSDIIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchSDIIDActionPerformed

    private void jTextFieldSearchCustomerName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchCustomerName1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int x=jTable3.getSelectedRow();
        String y=(String) jTable3.getValueAt(x,0);
        jTextFieldSearchTSDIID.setText(y);

    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\payment.jrxml";
        String SQL="SELECT * FROM garmentsystem.d_salesPayment_table where salesPaymentId ='"+jTextFieldSearchTSDIID.getText()+"'";
        autoReport.Query2Report(FileLocation, SQL);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
//        Boolean result =salesinquirymodel.DeleteSII(jTextFieldSearchTSDIID.getText());
//        if(result){
//            JOptionPane.showMessageDialog(null,"Successfully Deleted SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//            //   clear();
//            clearSearch();
//            clearTable();
//        }
//        else{
//            JOptionPane.showMessageDialog(null,"Failed Deleted SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//        clearSearch();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jTextFieldSearchTSDIID.setText("");
    }//GEN-LAST:event_jButton30ActionPerformed
    
    public void clearSearch(){
    jTextFieldSearchSDIID.setText("");
    jTextFieldSearchCustomerID.setText("");
    jTextFieldSearchCustomerName1.setText("");
    jTextFieldSearchDesignName.setText("");
    jTextFieldSearchTSDIID.setText("");
    }
    
    
    private void generate_spi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextFieldSalesPaymentId.setText(aid.generate("spi",Integer.toString(MainWindow.userid)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePickerSalesPayment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonSearchCustomerID;
    private javax.swing.JComboBox<String> jComboBoxPaymentType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelSalesInvoiceSearch;
    private javax.swing.JPanel jPanelSearchEditDeleteReportM;
    private javax.swing.JPanel jPanelSearchEditDeleteReportM1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTablePayment;
    private javax.swing.JTable jTablesSalesInvoice;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCustomerID;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldDueAmount;
    private javax.swing.JTextField jTextFieldPaymentAmount;
    private javax.swing.JTextField jTextFieldSalesInvoiceID;
    private javax.swing.JTextField jTextFieldSalesPaymentId;
    private javax.swing.JTextField jTextFieldSearchCustomerID;
    private javax.swing.JTextField jTextFieldSearchCustomerName1;
    private javax.swing.JTextField jTextFieldSearchDesignName;
    private javax.swing.JTextField jTextFieldSearchSDIID;
    private javax.swing.JTextField jTextFieldSearchTSDIID;
    private javax.swing.JTextField jTextFieldTotalPayable;
    // End of variables declaration//GEN-END:variables
}
