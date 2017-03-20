
package Procurements;

import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;

import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.ButtonModel;
import net.proteanit.sql.DbUtils;





public class Purchasing extends javax.swing.JInternalFrame {

    public Purchasing() {
        initComponents();
        generate_purid();
        generate_purid2();
        TableLoad();
        TableLoad2();
        datePicker1.setDateToToday();
        datePicker2.setDateToToday();
        FillCombo();
        FillCombo2();
        
        
        
        
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentMethodGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        odno = new javax.swing.JTextField();
        des = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tot = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        adv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DatePickerSettings dateSettings01 = new DatePickerSettings();
        dateSettings01.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings01.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings01);
        jButton2 = new javax.swing.JButton();
        spp = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        odno1 = new javax.swing.JTextField();
        des1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        qty1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        unit1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tot1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        adv1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings2.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings2);
        jButton4 = new javax.swing.JButton();
        spp1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        TypeCombo = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        materialPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        costfield = new javax.swing.JTextField();
        quantityfield = new javax.swing.JTextField();
        reorderfield = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        valuefield = new javax.swing.JTextField();
        DatePickerSettings dateSettings4 = new DatePickerSettings();
        dateSettings4.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings4.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker(dateSettings4);
        jButton9 = new javax.swing.JButton();
        accessoryPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        valuefield1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        DatePickerSettings dateSettings5 = new DatePickerSettings();
        dateSettings5.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings5.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker4 = new com.github.lgooddatepicker.components.DatePicker(dateSettings5);
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        typefield = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        namefield1 = new javax.swing.JTextField();
        reorderfield1 = new javax.swing.JTextField();
        costfield1 = new javax.swing.JTextField();
        quantityfield1 = new javax.swing.JTextField();
        machinepartPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        qtyfield = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        valuefield2 = new javax.swing.JTextField();
        namefield2 = new javax.swing.JTextField();
        machineCombo = new javax.swing.JComboBox<>();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker5 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);

        setTitle("Purchases");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Order No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Purchase Description");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(odno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 210, -1));
        jPanel1.add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, -1));

        jLabel6.setText("Quantity");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 210, -1));

        jLabel7.setText("Unit price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        unit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitKeyReleased(evt);
            }
        });
        jPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 210, -1));

        jLabel8.setText("Supplier");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel11.setText("Total amount");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        tot.setEditable(false);
        tot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totKeyTyped(evt);
            }
        });
        jPanel1.add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, -1));

        jLabel12.setText("Advance");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        jPanel1.add(adv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, -1));

        jLabel13.setText("Estimated delivery");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel14.setText("Payment method");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        paymentMethodGroup.add(jRadioButton1);
        jRadioButton1.setText("Credit");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        paymentMethodGroup.add(jRadioButton2);
        jRadioButton2.setText("Cash");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jButton1.setText("Add Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 750, 600));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 890, 640));
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, -1));

        jButton2.setText("Reset All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jPanel1.add(spp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 210, -1));

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        jTabbedPane1.addTab("Local Puchases", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Order No");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel4.setText("Purchase Item Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel2.add(odno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 210, -1));
        jPanel2.add(des1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, -1));

        jLabel9.setText("Quantity");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel2.add(qty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 210, -1));

        jLabel10.setText("Unit price");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        unit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unit1KeyReleased(evt);
            }
        });
        jPanel2.add(unit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 210, -1));

        jLabel15.setText("Supplier");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel16.setText("Total amount");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        tot1.setEditable(false);
        tot1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tot1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tot1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tot1KeyTyped(evt);
            }
        });
        jPanel2.add(tot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, -1));

        jLabel17.setText("Advance");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        jPanel2.add(adv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, -1));

        jLabel18.setText("Estimated delivery");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel19.setText("Payment method");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Credit");
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Cash");
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jButton3.setText("Add Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 750, 600));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 890, 640));
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, -1));

        jButton4.setText("Reset All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jPanel2.add(spp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 210, -1));

        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));

        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jTabbedPane1.addTab("Foriegn Purchases", jPanel2);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Purchased Item Type");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Raw Materials", "Accessories", "Machine Parts" }));
        TypeCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TypeComboMouseClicked(evt);
            }
        });
        TypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboActionPerformed(evt);
            }
        });
        jPanel5.add(TypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 160, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 850, 600));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 890, 640));
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 210, -1));

        jPanel6.setLayout(new java.awt.CardLayout());

        materialPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Re-Order Quantity");
        materialPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Date");
        materialPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));
        materialPanel.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 140, -1));
        materialPanel.add(costfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, -1));

        quantityfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityfieldActionPerformed(evt);
            }
        });
        quantityfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityfieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityfieldKeyTyped(evt);
            }
        });
        materialPanel.add(quantityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, -1));
        materialPanel.add(reorderfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Material Name");
        materialPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Material Cost Per Unit");
        materialPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Value");
        materialPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Quantity");
        materialPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        valuefield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valuefield.setEnabled(false);
        valuefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valuefieldKeyReleased(evt);
            }
        });
        materialPanel.add(valuefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 140, -1));

        datePicker3.setEnabled(false);
        datePicker3.setName(""); // NOI18N
        materialPanel.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jButton9.setText("Add Material");
        materialPanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jPanel6.add(materialPanel, "card2");

        accessoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Stock Value");
        accessoryPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Accessory Name");
        accessoryPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        valuefield1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valuefield1.setEnabled(false);
        valuefield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valuefield1KeyReleased(evt);
            }
        });
        accessoryPanel.add(valuefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 140, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Cost Per Unit");
        accessoryPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        datePicker4.setEnabled(false);
        datePicker4.setName(""); // NOI18N
        accessoryPanel.add(datePicker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 360, 140, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Quantity");
        accessoryPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Accessory Type");
        accessoryPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Date");
        accessoryPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        typefield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accessoryPanel.add(typefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 140, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Re-Order Level");
        accessoryPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        accessoryPanel.add(namefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 140, -1));

        reorderfield1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accessoryPanel.add(reorderfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));
        accessoryPanel.add(costfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 140, -1));

        quantityfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityfield1ActionPerformed(evt);
            }
        });
        quantityfield1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityfield1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityfield1KeyTyped(evt);
            }
        });
        accessoryPanel.add(quantityfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, -1));

        jPanel6.add(accessoryPanel, "card3");

        machinepartPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Machine Part Name");
        machinepartPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Machine Number");
        machinepartPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Part Value");
        machinepartPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Quantity");
        machinepartPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        qtyfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        machinepartPanel.add(qtyfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Purchased Date");
        machinepartPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        valuefield2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        machinepartPanel.add(valuefield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 50, -1));

        namefield2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        machinepartPanel.add(namefield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, -1));

        machineCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        machinepartPanel.add(machineCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, -1));

        datePicker5.setEnabled(false);
        datePicker5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datePicker5.setName(""); // NOI18N
        machinepartPanel.add(datePicker5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jPanel6.add(machinepartPanel, "card4");

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 430, 490));

        jTabbedPane1.addTab("Recieved Purchases", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1390, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        AddOrder();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        TextBoxClear();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totKeyReleased
        
    }//GEN-LAST:event_totKeyReleased

    private void totKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totKeyTyped
        
    }//GEN-LAST:event_totKeyTyped

    private void totKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totKeyPressed
        
    }//GEN-LAST:event_totKeyPressed

    private void unitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitKeyReleased
        
        double qty1 = Double.parseDouble(qty.getText());
        double perunit = Double.parseDouble(unit.getText());
        
        double tot1 = perunit * qty1;
        
        tot.setText(Double.toString(tot1));
        
    }//GEN-LAST:event_unitKeyReleased

    private void unit1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unit1KeyReleased
        double qty2 = Double.parseDouble(qty1.getText());
        double perunit = Double.parseDouble(unit1.getText());
        
        double tot3 = perunit * qty2;
        
        tot1.setText(Double.toString(tot3));
    }//GEN-LAST:event_unit1KeyReleased

    private void tot1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tot1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tot1KeyPressed

    private void tot1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tot1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tot1KeyReleased

    private void tot1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tot1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tot1KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ForeignAdd();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TextBoxClear2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        UpdateOrder();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(row,0).toString();
        String description = jTable1.getValueAt(row,1).toString();
        String quantity = jTable1.getValueAt(row,3).toString();
        String unitprice = jTable1.getValueAt(row,4).toString();
        String total = jTable1.getValueAt(row,5).toString();
        String advance = jTable1.getValueAt(row,6).toString();
        String paymenttype = jTable1.getValueAt(row,7).toString();
        String spplier = jTable1.getValueAt(row,8).toString();
        String date = jTable1.getValueAt(row,9).toString();
        
        
        odno.setText(id);
        des.setText(description);
        qty.setText(quantity);
        unit.setText(unitprice);
        tot.setText(total);
        adv.setText(advance);
        
        
        jRadioButton1.setActionCommand("Credit");
        jRadioButton2.setActionCommand("Cash");
        
        if("Credit".equals(paymenttype))
        {
            jRadioButton1.setSelected(true);
        }
        else if("Cash".equals(paymenttype))
        {
            jRadioButton2.setSelected(true);
        }
        
        
        
        spp.setSelectedItem(spplier);
        datePicker1.setDateToToday();
    }//GEN-LAST:event_jTable1MouseClicked

    private void PurchaseTypeCheck()
    {
        if(TypeCombo.getSelectedItem().equals("Raw Materials"))
        {
            jLabel25.setText("Material ID");
            generate_mid();
            materialPanel.setVisible(true);
            accessoryPanel.setVisible(false);
            machinepartPanel.setVisible(false);
        }
        else if(TypeCombo.getSelectedItem().equals("Accessories"))
        {
            jLabel25.setText("Accessory  ID");
            generate_accid();
            materialPanel.setVisible(false);
            accessoryPanel.setVisible(true);
            machinepartPanel.setVisible(false);
        }
        else if(TypeCombo.getSelectedItem().equals("Machine Parts"))
        {
            jLabel25.setText("Machine Part ID");
            generate_mac_prtid();
            materialPanel.setVisible(false);
            accessoryPanel.setVisible(false);
            machinepartPanel.setVisible(true);
            
        }
        
        
        
    }
    
    private void generate_mac_prtid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1.setText(aid.generate("MAC_PRT",Integer.toString(MainWindow.userid)));
    }
    
    
    private void generate_accid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1.setText(aid.generate("ACC",Integer.toString(MainWindow.userid)));
    }
    
    private void generate_mid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1.setText(aid.generate("MAT",Integer.toString(MainWindow.userid)));
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DeleteOrder();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ForeignUpdate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        ForeignDelete();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int row = jTable2.getSelectedRow();
        String id = jTable2.getValueAt(row,0).toString();
        String description = jTable2.getValueAt(row,1).toString();
        String quantity = jTable2.getValueAt(row,3).toString();
        String unitprice = jTable2.getValueAt(row,4).toString();
        String total = jTable2.getValueAt(row,5).toString();
        String advance = jTable2.getValueAt(row,6).toString();
        String paymenttype = jTable2.getValueAt(row,7).toString();
        String spplier = jTable2.getValueAt(row,8).toString();
        String date = jTable2.getValueAt(row,9).toString();
        
        
        odno1.setText(id);
        des1.setText(description);
        qty1.setText(quantity);
        unit1.setText(unitprice);
        tot1.setText(total);
        adv1.setText(advance);
        
        
        jRadioButton3.setActionCommand("Credit");
        jRadioButton4.setActionCommand("Cash");
        
        if("Credit".equals(paymenttype))
        {
            jRadioButton3.setSelected(true);
        }
        else if("Cash".equals(paymenttype))
        {
            jRadioButton4.setSelected(true);
        }
        
        
        
        spp1.setSelectedItem(spplier);
        datePicker2.setDateToToday();
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void TypeComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TypeComboMouseClicked
        
    }//GEN-LAST:event_TypeComboMouseClicked

    private void quantityfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityfieldActionPerformed

    private void quantityfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfieldKeyReleased
        // TODO add your handling code here:
        double qty = Double.parseDouble(quantityfield.getText());
        double perunit = Double.parseDouble(costfield.getText());

        double val = perunit * qty;

        valuefield.setText(Double.toString(val));
    }//GEN-LAST:event_quantityfieldKeyReleased

    private void quantityfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfieldKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_quantityfieldKeyTyped

    private void valuefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valuefieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_valuefieldKeyReleased

    private void valuefield1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valuefield1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_valuefield1KeyReleased

    private void quantityfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityfield1ActionPerformed

    private void quantityfield1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfield1KeyReleased
        // TODO add your handling code here:
        double qty = Double.parseDouble(quantityfield.getText());
        double perunit = Double.parseDouble(costfield.getText());

        double val = perunit * qty;

        valuefield.setText(Double.toString(val));
    }//GEN-LAST:event_quantityfield1KeyReleased

    private void quantityfield1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfield1KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_quantityfield1KeyTyped

    private void TypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboActionPerformed
        PurchaseTypeCheck();
    }//GEN-LAST:event_TypeComboActionPerformed


    private void TextBoxClear()
    {
        generate_purid();
        des.setText("");
        qty.setText("");
        unit.setText("");
        tot.setText("");
        adv.setText("");
        
                
        spp.setSelectedIndex(0);
        datePicker1.setDateToToday();
    }
    
    private void TextBoxClear2()
    {
        generate_purid2();
        des1.setText("");
        qty1.setText("");
        unit1.setText("");
        tot1.setText("");
        adv1.setText("");
        
                
        spp1.setSelectedIndex(0);
        datePicker2.setDateToToday();
    }
    
    
    private void ForeignAdd()
    {
        String id = odno1.getText();
        String description = des1.getText();
        
        String type = "Foreign";
        
        String quantity = qty1.getText();
        double prc = Double.parseDouble(unit1.getText());
        double total = Double.parseDouble(tot1.getText());
        double advance = Double.parseDouble(adv1.getText());
        
        jRadioButton3.setActionCommand("Credit");
        jRadioButton4.setActionCommand("Cash");
        
        String method = buttonGroup1.getSelection().getActionCommand();
        
        String supplier = spp1.getSelectedItem().toString();
        String delivery = datePicker2.getText();
        
        boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`Purchasing`\n" +
"(`Order_ID`,\n" +
"`Description`,\n" +
"`Type`,\n" +
"`Quantity`,\n" +
"`Unit_Price`,\n" +
"`Total`,\n" +
"`Advance`,\n" +
"`Payment_type`,\n" +
"`Supplier`,\n" +
"`Est_Delivery`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+description+"',\n" +
"'"+type+"',\n" +
"'"+quantity+"',\n" +
"'"+prc+"',\n" +
"'"+total+"',\n" +
"'"+advance+"',\n" +
"'"+method+"',\n" +
"'"+supplier+"',\n" +
"'"+delivery+"');");
        
        try
        {
            if(x==true)
            {
                TableLoad2();
                TextBoxClear2();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    
    }
    
    private void ForeignUpdate()
    {
        String id = odno1.getText();
        String description = des1.getText();
        
        String type = "Foreign";
        
        String quantity = qty1.getText();
        double prc = Double.parseDouble(unit1.getText());
        double total = Double.parseDouble(tot1.getText());
        double advance = Double.parseDouble(adv1.getText());
        
        jRadioButton3.setActionCommand("Credit");
        jRadioButton4.setActionCommand("Cash");
        
        String method = buttonGroup1.getSelection().getActionCommand();
        
        String supplier = spp1.getSelectedItem().toString();
        String delivery = datePicker2.getText();
        
        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`Purchasing`\n" +
"SET\n" +
"`Order_ID` = '"+id+"',\n" +
"`Description` = '"+description+"',\n" +
"`Type` = '"+type+"',\n" +
"`Quantity` = '"+quantity+"',\n" +
"`Unit_Price` = '"+prc+"',\n" +
"`Total` = '"+total+"',\n" +
"`Advance` = '"+advance+"',\n" +
"`Payment_type` = '"+method+"',\n" +
"`Supplier` = '"+supplier+"',\n" +
"`Est_Delivery` = '"+delivery+"'\n" +
"WHERE `Order_ID` = '"+id+"';");
        
        
        try
        {
            if(x==true)
            {
                TableLoad2();
                TextBoxClear2();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    private void ForeignDelete()
    {
        String id = odno1.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`Purchasing`\n" +
"WHERE Order_ID='"+id+"';");
        
        try
        {
            if(x==true)
            {
                TableLoad2();
                TextBoxClear2();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    
    private void FillCombo()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Supplier`");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String name = AutoDB_Connect.DB_ResultSet.getString("Supplier_name");
                spp.addItem(name);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    private void FillCombo2()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Supplier`");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String name = AutoDB_Connect.DB_ResultSet.getString("Supplier_name");
                spp1.addItem(name);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    private void generate_purid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    odno.setText(aid.generate("PURLC",Integer.toString(MainWindow.userid)));
    }
    
    private void generate_purid2(){
    AutoIdGenerator aid = new AutoIdGenerator();
    odno1.setText(aid.generate("PURFR",Integer.toString(MainWindow.userid)));
    }
    
    private void TableLoad()
    {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * from `garmentsystem`.`Purchasing` where Type='Local'");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void TableLoad2()
    {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * from `garmentsystem`.`Purchasing` where Type='Foreign'");
        jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void AllTableLoad()
    {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * from `garmentsystem`.`Purchasing`");
        jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void AddOrder()
    {
        String id = odno.getText();
        String description = des.getText();
        
        String type = "Local";
        
        String quantity = qty.getText();
        double prc = Double.parseDouble(unit.getText());
        double total = Double.parseDouble(tot.getText());
        double advance = Double.parseDouble(adv.getText());
        
        jRadioButton1.setActionCommand("Credit");
        jRadioButton2.setActionCommand("Cash");
        
        String method = paymentMethodGroup.getSelection().getActionCommand();
        
        String supplier = spp.getSelectedItem().toString();
        String delivery = datePicker1.getText();
        
        boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`Purchasing`\n" +
"(`Order_ID`,\n" +
"`Description`,\n" +
"`Type`,\n" +
"`Quantity`,\n" +
"`Unit_Price`,\n" +
"`Total`,\n" +
"`Advance`,\n" +
"`Payment_type`,\n" +
"`Supplier`,\n" +
"`Est_Delivery`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+description+"',\n" +
"'"+type+"',\n" +
"'"+quantity+"',\n" +
"'"+prc+"',\n" +
"'"+total+"',\n" +
"'"+advance+"',\n" +
"'"+method+"',\n" +
"'"+supplier+"',\n" +
"'"+delivery+"');");
        
        try
        {
            if(x==true)
            {
                TableLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
    }
    
    private void UpdateOrder()
    {
        String id = odno.getText();
        String description = des.getText();
        
        String type = "Local";
        
        String quantity = qty.getText();
        double prc = Double.parseDouble(unit.getText());
        double total = Double.parseDouble(tot.getText());
        double advance = Double.parseDouble(adv.getText());
        
        jRadioButton1.setActionCommand("Credit");
        jRadioButton2.setActionCommand("Cash");
        
        String method = paymentMethodGroup.getSelection().getActionCommand();
        
        String supplier = spp.getSelectedItem().toString();
        String delivery = datePicker1.getText();
        
        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`Purchasing`\n" +
"SET\n" +
"`Order_ID` = '"+id+"',\n" +
"`Description` = '"+description+"',\n" +
"`Type` = '"+type+"',\n" +
"`Quantity` = '"+quantity+"',\n" +
"`Unit_Price` = '"+prc+"',\n" +
"`Total` = '"+total+"',\n" +
"`Advance` = '"+advance+"',\n" +
"`Payment_type` = '"+method+"',\n" +
"`Supplier` = '"+supplier+"',\n" +
"`Est_Delivery` = '"+delivery+"'\n" +
"WHERE `Order_ID` = '"+id+"';");
        
        
        try
        {
            if(x==true)
            {
                TableLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    
    private void DeleteOrder()
    {
        String id = odno.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`Purchasing`\n" +
"WHERE Order_ID='"+id+"';");
        
        try
        {
            if(x==true)
            {
                TableLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TypeCombo;
    private javax.swing.JPanel accessoryPanel;
    private javax.swing.JTextField adv;
    private javax.swing.JTextField adv1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField costfield;
    private javax.swing.JTextField costfield1;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private com.github.lgooddatepicker.components.DatePicker datePicker4;
    private com.github.lgooddatepicker.components.DatePicker datePicker5;
    private javax.swing.JTextField des;
    private javax.swing.JTextField des1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> machineCombo;
    private javax.swing.JPanel machinepartPanel;
    private javax.swing.JPanel materialPanel;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField namefield1;
    private javax.swing.JTextField namefield2;
    private javax.swing.JTextField odno;
    private javax.swing.JTextField odno1;
    private javax.swing.ButtonGroup paymentMethodGroup;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField qty1;
    private javax.swing.JTextField qtyfield;
    private javax.swing.JTextField quantityfield;
    private javax.swing.JTextField quantityfield1;
    private javax.swing.JTextField reorderfield;
    private javax.swing.JTextField reorderfield1;
    private javax.swing.JComboBox<String> spp;
    private javax.swing.JComboBox<String> spp1;
    private javax.swing.JTextField tot;
    private javax.swing.JTextField tot1;
    private javax.swing.JTextField typefield;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField unit1;
    private javax.swing.JTextField valuefield;
    private javax.swing.JTextField valuefield1;
    private javax.swing.JTextField valuefield2;
    // End of variables declaration//GEN-END:variables
}
