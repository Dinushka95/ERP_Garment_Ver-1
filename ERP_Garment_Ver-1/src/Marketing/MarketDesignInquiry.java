
package Marketing;

import Sales.*;
import MainSystem.AutoDB_Connect;
import static MainSystem.MainWindow.aid;
import static MainSystem.MainWindow.autoSqlQuery; 
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static MainSystem.MainWindow.autogetimage;
import static MainSystem.MainWindow.validation;
import MainSystem.MainWindow;        
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.userid;

/**
 *
 * @author Dinushka
 */
public class MarketDesignInquiry extends javax.swing.JInternalFrame {
DefaultTableModel model;
DefaultTableModel model2;
DefaultTableModel model3;
DefaultTableModel model4;
int RowCountjTable1;
CustomerModel customerModeSDI;
String EmployeeId;
String EmployeeName;
MarketDesignInquiryModel marketDesignInquiryModel;

    /**
     * Creates new form SalesDesignInquiry
     */
    public MarketDesignInquiry() {
        initComponents();
        generate_mdi();
        datePicker2.setDateToToday();
        model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(0);
        model2=(DefaultTableModel) jTable2.getModel();
        model3=(DefaultTableModel) jTable4.getModel();
        jPanelEmployeeSearch.setVisible(false);
        customerModeSDI = new CustomerModel();
        datePicker2.setDateToToday();
        marketDesignInquiryModel= new MarketDesignInquiryModel();
        datePicker1.setDateToToday();
        jButtonADDImage.setEnabled(false);
        jPanelEdit.setVisible(false);
        jTextFieldCustomerId.setText(Integer.toString(userid));
        jTextFieldCustomerName.setText(marketDesignInquiryModel.SearchEmployeeById(userid));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelSDIAdd = new javax.swing.JPanel();
        jPanelAddDesignInquiryMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMainDescription = new javax.swing.JTextField();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jButtonADDImage = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldQuantatiy = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldDecription = new javax.swing.JTextField();
        jComboBoxSize = new javax.swing.JComboBox<>();
        jComboBoxColour = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        JTextFieldDesignName = new javax.swing.JTextField();
        jPanelEmployeeSearch = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextFieldSDICustomerId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanelSDISearch = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabelSearchPreview = new javax.swing.JLabel();
        jPanelSearchEditDeleteReportM1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jTextFieldSearchTSDIID = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanelSearchEditDeleteReportM = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButtonSearchCustomerID = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldSearchSDIID = new javax.swing.JTextField();
        jTextFieldSearchCustomerID = new javax.swing.JTextField();
        jTextFieldSearchCustomerName = new javax.swing.JTextField();
        jTextFieldSearchDesignName = new javax.swing.JTextField();
        jPanelEdit = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Market Design Inquiry Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanelSDIAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAddDesignInquiryMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelAddDesignInquiryMain.setMaximumSize(new java.awt.Dimension(1310, 530));
        jPanelAddDesignInquiryMain.setMinimumSize(new java.awt.Dimension(1310, 530));
        jPanelAddDesignInquiryMain.setName(""); // NOI18N
        jPanelAddDesignInquiryMain.setPreferredSize(new java.awt.Dimension(1310, 530));
        jPanelAddDesignInquiryMain.setToolTipText("");
        jPanelAddDesignInquiryMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Main Description");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelAddDesignInquiryMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jTextFieldMainDescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldMainDescription.setName("Description"); // NOI18N
        jPanelAddDesignInquiryMain.add(jTextFieldMainDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 740, 70));

        datePicker1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelAddDesignInquiryMain.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        jLabel4.setText("Due Date");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelAddDesignInquiryMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jButton4.setText("ADD Design Inquiry");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelAddDesignInquiryMain.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 160, -1));

        jButton6.setText("Reset All");
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelAddDesignInquiryMain.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 130, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImage.setText("           Please upload Skech Image   ");
        jLabelImage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel9.add(jLabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 190));

        jButtonADDImage.setText("ADD a skech Image");
        jButtonADDImage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADDImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDImageActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonADDImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jCheckBox1.setText("ADD Image");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jPanel9.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jPanelAddDesignInquiryMain.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 260, 280, 250));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        datePicker2.setEnabled(false);
        datePicker2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel2.setText("Market Design Inquiry ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jTextFieldSalesDesignInquiryId.setEditable(false);
        jTextFieldSalesDesignInquiryId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSalesDesignInquiryId.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryIdActionPerformed(evt);
            }
        });
        jPanel10.add(jTextFieldSalesDesignInquiryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 110, -1));

        jLabel3.setText("Employee ID");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTextFieldCustomerId.setEditable(false);
        jTextFieldCustomerId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCustomerId.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerIdActionPerformed(evt);
            }
        });
        jPanel10.add(jTextFieldCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, -1));

        jLabel15.setText("Employee Name");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jTextFieldCustomerName.setEditable(false);
        jTextFieldCustomerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCustomerName.setName("Customer Name"); // NOI18N
        jPanel10.add(jTextFieldCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 110, -1));

        jPanelAddDesignInquiryMain.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 390, 180));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            }
            ,
            new String [] {
                "Size","Quantity","Colour","Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 120));

        jButton2.setText("Add  Row");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 110, -1));

        jLabel5.setText("Size");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel6.setText("Quantity");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jTextFieldQuantatiy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldQuantatiy.setName("Quantity"); // NOI18N
        jPanel5.add(jTextFieldQuantatiy, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 100, -1));

        jButton3.setText("Delete Row");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 110, -1));

        jButton5.setText("Clear");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 110, -1));

        jLabel17.setText("Colour");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jLabel20.setText("Description");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTextFieldDecription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(jTextFieldDecription, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 400, 30));

        jComboBoxSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size", "MS", "M", "L", "XL", "2XL", "3XL", "4XL" }));
        jPanel5.add(jComboBoxSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, -1));

        jComboBoxColour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Color", "Red", "Blood Red", "Magenta", "Blue", "Light Blue", "Sky Blue", "Peacock Blue", "Green", "Tamil Green", "Light Green", "Orange", "Light Orange", "Pink", "Rose Pink", "Beige", "Brown", "Desert Brown" }));
        jPanel5.add(jComboBoxColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 100, -1));

        jPanelAddDesignInquiryMain.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 820, 180));

        jLabel19.setText("Design Name");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelAddDesignInquiryMain.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        JTextFieldDesignName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTextFieldDesignName.setName("Design Name"); // NOI18N
        jPanelAddDesignInquiryMain.add(JTextFieldDesignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 220, -1));

        jPanelSDIAdd.add(jPanelAddDesignInquiryMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1310, 530));

        jPanelEmployeeSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEmployeeSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanelEmployeeSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 960, 330));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("Select");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanelEmployeeSearch.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, -1, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanelEmployeeSearch.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 140, -1));

        jTextFieldSDICustomerId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelEmployeeSearch.add(jTextFieldSDICustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 140, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Employee ID");
        jPanelEmployeeSearch.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Employee Name");
        jPanelEmployeeSearch.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanelEmployeeSearch.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setText("Search");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanelEmployeeSearch.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("Reset All");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanelEmployeeSearch.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 130, -1));

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setText("View All");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanelEmployeeSearch.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 130, -1));

        jPanelSDIAdd.add(jPanelEmployeeSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 1020, 530));

        jTabbedPane1.addTab("ADD Design Inquiry ", jPanelSDIAdd);

        jPanelSDISearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel12.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 950, 140));

        jLabelSearchPreview.setText("                        Skech Preview");
        jLabelSearchPreview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.add(jLabelSearchPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, 240, 220));

        jPanelSearchEditDeleteReportM1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSearchEditDeleteReportM1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Report");
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, -1));

        jButton9.setText("Edit");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, -1));

        jButton10.setText("Delete");
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 110, -1));

        jButton26.setText("Clear");
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 110, -1));

        jTextFieldSearchTSDIID.setEditable(false);
        jTextFieldSearchTSDIID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelSearchEditDeleteReportM1.add(jTextFieldSearchTSDIID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Market Design Inquiry ID");
        jPanelSearchEditDeleteReportM1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel12.add(jPanelSearchEditDeleteReportM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 240, 240));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel12.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 950, 200));

        jPanelSearchEditDeleteReportM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelSearchEditDeleteReportM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton20.setText("View All");
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 210, -1));

        jButton18.setText(" All MDI Report");
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 210, -1));

        jButton23.setText(" Table Values Report");
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 210, -1));

        jButton21.setText("Reset All");
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 210, -1));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setText("Search");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, -1));

        jButtonSearchCustomerID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSearchCustomerID.setText("Search");
        jButtonSearchCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCustomerIDActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButtonSearchCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 120, -1));

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton25.setText("Search");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 120, -1));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setText("Search");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Market Design Inquiry ID");
        jPanelSearchEditDeleteReportM.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Employee ID");
        jPanelSearchEditDeleteReportM.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Employee Name");
        jPanelSearchEditDeleteReportM.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel22.setText("Design Name");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelSearchEditDeleteReportM.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextFieldSearchSDIID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSearchSDIID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchSDIIDActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchSDIID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 150, -1));

        jTextFieldSearchCustomerID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, -1));

        jTextFieldSearchCustomerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldSearchCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchCustomerNameActionPerformed(evt);
            }
        });
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, -1));

        jTextFieldSearchDesignName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelSearchEditDeleteReportM.add(jTextFieldSearchDesignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, -1));

        jPanel12.add(jPanelSearchEditDeleteReportM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 950, 140));

        jPanelEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Finish Editing");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelEdit.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 190, -1));

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton27.setText("Quit Editing ");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanelEdit.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 190, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("You can ONLY edit \"Design Name\",\"Description\",\"Status_Approval\",\"StatusApprovalName\",\"Size\",\"Quantity\",\"Colour\"");
        jPanelEdit.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 620, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Edit Mode ");
        jPanelEdit.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, 60));

        jPanel12.add(jPanelEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 950, 140));

        jPanelSDISearch.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1270, 540));

        jTabbedPane1.addTab("Search & Edit ||  Delete ||Reports ", jPanelSDISearch);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      boolean result=marketDesignInquiryModel.AddSDI(jTextFieldSalesDesignInquiryId,JTextFieldDesignName,jTextFieldCustomerId,datePicker2,jTable1,jTextFieldMainDescription,datePicker1,jCheckBox1,autogetimage.getFile());
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
             generate_mdi();
             clear();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBoxSize.getSelectedIndex()==0|| jComboBoxColour.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Size OR Colour Not Selected", "ErrorBox", JOptionPane.ERROR_MESSAGE);
        }
        else{
        if(validation.ValidationCheck(jTextFieldQuantatiy, true,0,'1')){
            model.addRow(new Object[]{ jComboBoxSize.getSelectedItem(),jTextFieldQuantatiy.getText(),jComboBoxColour.getSelectedItem(),jTextFieldDecription.getText()});
            jComboBoxSize.setSelectedIndex(0);
            jTextFieldQuantatiy.setText("");
            jComboBoxColour.setSelectedIndex(0);
            jTextFieldDecription.setText("");
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldSalesDesignInquiryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryIdActionPerformed

    private void jTextFieldSearchSDIIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchSDIIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchSDIIDActionPerformed

    private void jTextFieldSearchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchCustomerNameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        model.removeRow(RowCountjTable1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        RowCountjTable1=jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jTextFieldCustomerId.setText(EmployeeId);
        jTextFieldCustomerName.setText(EmployeeName);
        jPanelEmployeeSearch.setVisible(false);
        jPanelAddDesignInquiryMain.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchEID(jTextFieldSDICustomerId.getText()))); 
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
    
        int x=jTable3.getSelectedRow();
        int y=(int) jTable3.getValueAt(x,0);
        String z=Integer.toString(y);
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("emp_table","emp_id", z);
    
    try {
        AutoDB_Connect.DB_ResultSet.next();
        int cc=AutoDB_Connect.DB_ResultSet.getInt("emp_id");
        EmployeeId=String.valueOf(cc);
        EmployeeName=AutoDB_Connect.DB_ResultSet.getString("f_name");

        
       
    } catch (SQLException ex) {
        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        model4 = (DefaultTableModel) jTable3.getModel();
        model4.getDataVector().removeAllElements();
        model4.fireTableDataChanged();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        model.setRowCount(0);
        jComboBoxSize.setSelectedIndex(0);
        jTextFieldQuantatiy.setText("");
        jComboBoxColour.setSelectedIndex(0);
        jTextFieldDecription.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.ViewAll()));
        clearSearch();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        clearSearch();
        clearTable();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchSDIID(jTextFieldSearchSDIID.getText())));  
        clearSearch();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButtonSearchCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCustomerIDActionPerformed
        jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchEID(jTextFieldSearchCustomerID.getText())));    
        clearSearch();
    }//GEN-LAST:event_jButtonSearchCustomerIDActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchDesignName(jTextFieldSearchDesignName.getText())));    
        clearSearch();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int x=jTable2.getSelectedRow();
        String y=(String) jTable2.getValueAt(x,0);
        jTextFieldSearchTSDIID.setText(y);
       
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeAutoSearchAll("d_designinquiry_table1","DesignInquiryId", y);
        jTable4.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet)); 
        jLabelSearchPreview.setIcon(autoSqlQuery.executeAutoGetImage(y));
    }//GEN-LAST:event_jTable2MouseClicked
    
    private void clearTable(){
        model2 = (DefaultTableModel) jTable2.getModel();
        model2.getDataVector().removeAllElements();
        model2.fireTableDataChanged();
        
        model3 = (DefaultTableModel) jTable4.getModel();
        model3.getDataVector().removeAllElements();
        model3.fireTableDataChanged();
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       Boolean result =marketDesignInquiryModel.DeleteSDII(jTextFieldSearchTSDIID.getText());
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully Deleted SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            clear();
            clearSearch();
            clearTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed Deleted SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }  
        clearSearch();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jTextFieldSearchTSDIID.getText().equals("")){
                //do nothing
        }
        else{
        jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchSDIID(jTextFieldSearchTSDIID.getText())));  
        jTable4.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchAll("d_designinquiry_table1","DesignInquiryId", jTextFieldSearchTSDIID.getText())));     
        jPanelSearchEditDeleteReportM.setVisible(false);
        jPanelSearchEditDeleteReportM1.setVisible(false);
        jLabelSearchPreview.setVisible(false);
        jPanelEdit.setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextFieldCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerIdActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchCustomerTName(jTextFieldSearchCustomerName.getText())));    
        clearSearch();
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButtonADDImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDImageActionPerformed
    
        autogetimage.load();
        jLabelImage.setIcon(autogetimage.getImageIcon());   
    }//GEN-LAST:event_jButtonADDImageActionPerformed
    
    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
       if (jCheckBox1.isSelected()){jButtonADDImage.setEnabled(true);}
       else{jButtonADDImage.setEnabled(false);}
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jTextFieldSearchTSDIID.setText("");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
                                               try {

   String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\SDII.jrxml";
        String SQL="SELECT * FROM garmentsystem.d_designinquiry_table";
        autoReport.Query2Report(FileLocation, SQL);
        }
        catch (Exception e )
        {}      
                                                                                              try {

   String FileLocation="\\src\\Sales\\Reports\\SDII.jrxml";
        String SQL="SELECT * FROM garmentsystem.d_designinquiry_table";
        autoReport.Query2Report(FileLocation, SQL);
        }
        catch (Exception e )
        {} 
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

                                                       try {

        String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\SDII.jrxml";
        autoReport.Table2Report(FileLocation, jTable2);
        }
        catch (Exception e )
        {} 
                                                                                                              try {

        String FileLocation="\\src\\Sales\\Reports\\SDII.jrxml";
        autoReport.Table2Report(FileLocation, jTable2);
        }
        catch (Exception e )
        {} 
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                                                               try {

 String FileLocation=System.getProperty("user.dir")+"\\src\\Sales\\Reports\\SDII.jrxml";
        String SQL="SELECT * FROM garmentsystem.d_designinquiry_table where DesignInquiryId ='"+jTextFieldSearchTSDIID.getText()+"'";
        autoReport.Query2Report(FileLocation, SQL);
        String FileLocation1="C:\\Users\\Dinu-Laptop\\Documents\\NetBeansProjects\\ERP_Garment_Ver-1\\ERP_Garment_Ver-1\\src\\Sales\\Reports\\SDII2.jrxml";
        String SQL1="SELECT * FROM garmentsystem.d_designinquiry_table1 where DesignInquiryId ='"+jTextFieldSearchTSDIID.getText()+"'";
        autoReport.Query2Report(FileLocation1, SQL1);
        }
        catch (Exception e )
        {} 
        
                                                               
                                                                                                                              try {

 String FileLocation="\\src\\Sales\\Reports\\SDII.jrxml";
        String SQL="SELECT * FROM garmentsystem.d_designinquiry_table where DesignInquiryId ='"+jTextFieldSearchTSDIID.getText()+"'";
        autoReport.Query2Report(FileLocation, SQL);
        String FileLocation1="\\src\\Sales\\Reports\\SDII2.jrxml";
        String SQL1="SELECT * FROM garmentsystem.d_designinquiry_table1 where DesignInquiryId ='"+jTextFieldSearchTSDIID.getText()+"'";
        autoReport.Query2Report(FileLocation1, SQL1);
        }
        catch (Exception e )
        {} 
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jPanelSearchEditDeleteReportM.setVisible(true);
        jPanelSearchEditDeleteReportM1.setVisible(true);
        jLabelSearchPreview.setVisible(true);
        jPanelEdit.setVisible(false);
        clearTable();
        clearSearch();
        clear();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Boolean result =marketDesignInquiryModel.EditSDI(jTextFieldSearchTSDIID.getText(),jTable2,jTable4);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully Edited SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            clear();
            clearSearch();
            clearTable();
            jPanelSearchEditDeleteReportM.setVisible(true);
            jPanelSearchEditDeleteReportM1.setVisible(true);
            jLabelSearchPreview.setVisible(true);
            jPanelEdit.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed Edite SDII", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }  
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchCustomerTName(jTextField10.getText())));    
        clearSearch();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jTable3.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.ViewAllCustomer())); 
    }//GEN-LAST:event_jButton28ActionPerformed
    private void generate_mdi(){
    //AutoIdGenerator aid = new AutoIdGenerator();
        jTextFieldSalesDesignInquiryId.setText(aid.generate("mdi",Integer.toString(MainWindow.userid)));
        }
    private void clear(){
        generate_mdi();
        jTextFieldCustomerId.setText("");
        jTextFieldCustomerName.setText("");
        jTextFieldMainDescription.setText("");
        datePicker2.setDateToToday();
        datePicker1.setDateToToday();
        model.setRowCount(0);
        JTextFieldDesignName.setText("");
        jLabelImage.setIcon(null);
        jLabelImage.setText("        Please Add Image");
    }
    private void clearSearch(){
        jTextFieldSearchSDIID.setText("");
        jTextFieldSearchCustomerID.setText("");
        jTextFieldSearchCustomerName.setText("");
        jTextFieldSearchDesignName.setText("");
        jTextFieldSearchTSDIID.setText("");
        jLabelSearchPreview.setIcon(null);

    }
    
    private void clearSTable(){
        model4 = (DefaultTableModel) jTable3.getModel();
        model4.getDataVector().removeAllElements();
        model4.fireTableDataChanged();
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldDesignName;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonADDImage;
    private javax.swing.JButton jButtonSearchCustomerID;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxColour;
    private javax.swing.JComboBox<String> jComboBoxSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelSearchPreview;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAddDesignInquiryMain;
    private javax.swing.JPanel jPanelEdit;
    private javax.swing.JPanel jPanelEmployeeSearch;
    private javax.swing.JPanel jPanelSDIAdd;
    private javax.swing.JPanel jPanelSDISearch;
    private javax.swing.JPanel jPanelSearchEditDeleteReportM;
    private javax.swing.JPanel jPanelSearchEditDeleteReportM1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldDecription;
    private javax.swing.JTextField jTextFieldMainDescription;
    private javax.swing.JTextField jTextFieldQuantatiy;
    private javax.swing.JTextField jTextFieldSDICustomerId;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId;
    private javax.swing.JTextField jTextFieldSearchCustomerID;
    private javax.swing.JTextField jTextFieldSearchCustomerName;
    private javax.swing.JTextField jTextFieldSearchDesignName;
    private javax.swing.JTextField jTextFieldSearchSDIID;
    private javax.swing.JTextField jTextFieldSearchTSDIID;
    // End of variables declaration//GEN-END:variables


        
        


}







