
package InventoryManagement;

import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import static MainSystem.AutoSQLQuery.db_con;
import MainSystem.DB_Connect;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import MainSystem.MainWindow;

/**
 *
 * @author Dinushka
 */
public class Machinery extends javax.swing.JInternalFrame {






    /**
     * Creates new form SalesDesignInquiry
     */
    public Machinery() {
        
        initComponents();
        TableLoad();
        TableLoad2();
        
        
        
        generate_Asstid();
        generate_macid();
        
        
        datePicker2.setDateToToday();
      
    }

    /**
     * This method is called from within the constructor to initialised the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        typefield = new javax.swing.JTextField();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        deprate = new javax.swing.JTextField();
        costfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        macid = new javax.swing.JTextField();
        asstid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        accdep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dpp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        searchname = new javax.swing.JTextField();
        ViewAll = new javax.swing.JButton();
        ResetButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings2.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker(dateSettings2);
        jLabel5 = new javax.swing.JLabel();
        macid1 = new javax.swing.JTextField();
        asstid1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        typefield1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        costfield1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        deprate1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dpp1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        accdep1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Machine Parts");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        typefield.setEditable(false);
        typefield.setText("Machinery");
        typefield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(typefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 188, -1));

        datePicker2.setEnabled(false);
        datePicker2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datePicker2.setName(""); // NOI18N
        jPanel6.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 190, -1));

        jLabel21.setText("Purchased Date");
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel11.setText("Depreaciation Rate    %");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 150, -1));

        deprate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deprate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deprateKeyReleased(evt);
            }
        });
        jPanel6.add(deprate, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 188, -1));

        costfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(costfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 188, -1));

        jLabel1.setText("Cost");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 139, -1));

        macid.setEditable(false);
        macid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(macid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 188, -1));

        asstid.setEditable(false);
        asstid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(asstid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 188, -1));

        jLabel4.setText("Machine ID");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 58, -1, -1));

        jLabel2.setText("Fixed Asset ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 106, 133, -1));

        jLabel13.setText("Asset Type");
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 164, 120, -1));

        AddButton.setText("Add Machine");
        AddButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel6.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 40, -1, -1));

        ResetButton.setText("Reset All");
        ResetButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 100, 110, -1));

        jLabel3.setText("Accumulate Depreaciation");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        accdep.setEditable(false);
        accdep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(accdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 190, -1));

        jLabel6.setText("Depreciation");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        dpp.setEditable(false);
        dpp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(dpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, 190, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1310, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 1320, 310));

        jTabbedPane1.addTab("ADD Machine", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setText("Machine ID");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ViewAll.setText("View All");
        ViewAll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllActionPerformed(evt);
            }
        });

        ResetButton1.setText("Reset All");
        ResetButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton1ActionPerformed(evt);
            }
        });

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

        jButton1.setText("Search");
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel12)
                .addGap(142, 142, 142)
                .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResetButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ViewAll)
                        .addComponent(jButton1)
                        .addComponent(ResetButton1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1320, 280));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        EditButton.setText("Edit");
        EditButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel22.setText("Purchased Date");
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        datePicker3.setEnabled(false);
        datePicker3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        datePicker3.setName(""); // NOI18N

        jLabel5.setText("Machine ID");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        macid1.setEditable(false);
        macid1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        asstid1.setEditable(false);
        asstid1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setText("Fixed Asset ID");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setText("Asset Type");
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        typefield1.setEditable(false);
        typefield1.setText("Machinery");
        typefield1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setText("Cost");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        costfield1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setText("Depreaciation Rate    %");
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        deprate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deprate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deprate1KeyReleased(evt);
            }
        });

        jLabel9.setText("Depreciation");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dpp1.setEditable(false);
        dpp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setText("Accumulate Depreaciation");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        accdep1.setEditable(false);
        accdep1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22)
                        .addGap(83, 83, 83)
                        .addComponent(datePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(costfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(116, 116, 116)
                        .addComponent(macid1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(deprate1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(asstid1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(jLabel9)
                        .addGap(134, 134, 134)
                        .addComponent(dpp1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(typefield1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(jLabel10)
                        .addGap(52, 52, 52)
                        .addComponent(accdep1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(EditButton)
                        .addGap(60, 60, 60)
                        .addComponent(DeleteButton)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(datePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(costfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5))
                            .addComponent(macid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(deprate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))
                            .addComponent(asstid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(dpp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel14))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(typefield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(accdep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1320, 240));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        TextBoxClear();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here;
        
        AddMachine();
        TableLoad();
        TableLoad2();
        TextBoxClear();
        
        
        
    }//GEN-LAST:event_AddButtonActionPerformed


    
    private void ViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllActionPerformed
        // TODO add your handling code here:
        TableLoad2();
    }//GEN-LAST:event_ViewAllActionPerformed

    private void ResetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton1ActionPerformed
        // TODO add your handling code here:
        clear();

        
    }//GEN-LAST:event_ResetButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MachineIDSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row =jTable2.getSelectedRow();
        String date = jTable2.getValueAt(row,0).toString();
        String assetid = jTable2.getValueAt(row,1).toString();
        String type = jTable2.getValueAt(row,2).toString();
        String macid = jTable2.getValueAt(row,3).toString();
        String cost = jTable2.getValueAt(row,4).toString();
        String dprate = jTable2.getValueAt(row,5).toString();
        String depreciation = jTable2.getValueAt(row,6).toString();
        String accdepreciation = jTable2.getValueAt(row,7).toString();

        
        datePicker3.setText(date);
        macid1.setText(macid);
        asstid1.setText(assetid);
        typefield1.setText(type);
        costfield1.setText(cost);
        deprate1.setText(dprate);
        dpp1.setText(depreciation);
        accdep1.setText(accdepreciation);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        EditMachinery();
        clear();
        TableLoad2();
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        String id1 = macid1.getText();
        String id2 = asstid1.getText();
        
        boolean x = db_con.execute("DELETE FROM `garmentsystem`.`F_FIXASSETS`\n" +
"WHERE AssetID = '"+id1+"' and FixAssetsID = '"+id2+"';");
        
        try
        {
            if (x==true)
            {
                clear();
                TableLoad2();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
       


        

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void deprateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deprateKeyReleased
        
        double cst = Double.parseDouble(costfield.getText());
        
        double rate = Double.parseDouble(deprate.getText());
        
        double depreciation = cst*(rate/100);
        
        dpp.setText(Double.toString(depreciation));
        
        double acc = cst-depreciation;
        
        accdep.setText(Double.toString(acc));
        
    }//GEN-LAST:event_deprateKeyReleased

    private void deprate1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deprate1KeyReleased
        
        double cst = Double.parseDouble(costfield1.getText());
        
        double rate = Double.parseDouble(deprate1.getText());
        
        double depreciation = cst*(rate/100);
        
        dpp1.setText(Double.toString(depreciation));
        
        double acc = cst-depreciation;
        
        accdep1.setText(Double.toString(acc));
        
    }//GEN-LAST:event_deprate1KeyReleased
    private void generate_Asstid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    asstid.setText(aid.generate("ASST",Integer.toString(MainWindow.userid)));
    }
    
    private void generate_macid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    macid.setText(aid.generate("MAC",Integer.toString(MainWindow.userid)));
    }
    
    
    private void TableLoad()
    {

            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.F_FIXASSETS");
            jTable1.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));

    }
    private void TableLoad2()
    {

            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.F_FIXASSETS");
            jTable2.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));

    }
    private void TextBoxClear(){
            
            datePicker2.setDateToToday();
            generate_Asstid();
            generate_macid();
            costfield.setText("");
            deprate.setText("");
            dpp.setText("");
            accdep.setText("");
            
    }
    
    
    
    public void AddMachine()
    {
        String date = datePicker2.getText();
        String mac_id = macid.getText();
        String asst_id = asstid.getText();
        String type = typefield.getText();
        String cost = costfield.getText();
        String dprate = deprate.getText();
        String dppr = dpp.getText();
        String accmdep = accdep.getText();
        
        
        
        boolean x = db_con.execute("INSERT INTO `garmentsystem`.`F_FIXASSETS`\n" +
"(`Date`,\n" +
"`FixAssetsID`,\n" +
"`FixAssetType`,\n" +
"`AssetID`,\n" +
"`Cost`,\n" +
"`Rate`,\n" +
"`Depreaciation`,\n" +
"`Accumulate Depreaciation`)\n" +
"VALUES\n" +
"('"+date+"',\n" +
"'"+asst_id+"',\n" +
"'"+type+"',\n" +
"'"+mac_id+"',\n" +
"'"+cost+"',\n" +
"'"+dprate+"',\n" +
"'"+dppr+"',\n" +
"'"+accmdep+"');");
        
        
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
    
    public void EditMachinery()
    {
        String date = datePicker3.getText();
        String mac_id = macid1.getText();
        String asst_id = asstid1.getText();
        String type = typefield1.getText();
        String cost = costfield1.getText();
        String dprate = deprate1.getText();
        String dppr = dpp1.getText();
        String accmdep = accdep1.getText();
        
        boolean x = db_con.execute("UPDATE `garmentsystem`.`F_FIXASSETS`\n" +
"SET\n" +
"`Date` = '"+date+"',\n" +
"`FixAssetsID` = '"+asst_id+"',\n" +
"`FixAssetType` = '"+type+"',\n" +
"`AssetID` = '"+mac_id+"',\n" +
"`Cost` = '"+cost+"',\n" +
"`Rate` = '"+dprate+"',\n" +
"`Depreaciation` = '"+dppr+"',\n" +
"`Accumulate Depreaciation` = '"+accmdep+"'\n" +
"WHERE `FixAssetsID` = '"+asst_id+"' AND `AssetID` = '"+mac_id+"';");
        
        try
        {
            if (x==true)
            {
                clear();
                TableLoad2();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
        

    }
    
    
    
        private void MachineIDSearch()
    {
            String machineid = searchname.getText();
            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.F_FIXASSETS WHERE FixAssetsID LIKE '"+machineid+"%'");
            jTable2.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));       
    }
    
    public void ChangeMaterialTableHeader()
    {
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Matrial ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Material Name");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Material Cost");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Material Quantity");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Material Re-Order Level");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Material Added Date");

    }
    

    
    private void clear()
    {
        searchname.setText("");
        datePicker3.setDateToToday();
        macid1.setText("");
        asstid1.setText("");
        typefield1.setText("");
        costfield1.setText("");
        deprate.setText("");
        dpp.setText("");
        accdep.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton ResetButton1;
    private javax.swing.JButton ViewAll;
    private javax.swing.JTextField accdep;
    private javax.swing.JTextField accdep1;
    private javax.swing.JTextField asstid;
    private javax.swing.JTextField asstid1;
    private javax.swing.JTextField costfield;
    private javax.swing.JTextField costfield1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JTextField deprate;
    private javax.swing.JTextField deprate1;
    private javax.swing.JTextField dpp;
    private javax.swing.JTextField dpp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField macid;
    private javax.swing.JTextField macid1;
    private javax.swing.JTextField searchname;
    private javax.swing.JTextField typefield;
    private javax.swing.JTextField typefield1;
    // End of variables declaration//GEN-END:variables
}
