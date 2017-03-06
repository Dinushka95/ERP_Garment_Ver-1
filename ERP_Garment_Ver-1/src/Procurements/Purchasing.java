
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
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
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

        jLabel4.setText("Purchase Description");
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
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, -1));

        jButton8.setText("Delete");
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jTabbedPane1.addTab("Foriegn Purchases", jPanel2);

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DeleteOrder();
    }//GEN-LAST:event_jButton6ActionPerformed


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
    private javax.swing.JTextField adv;
    private javax.swing.JTextField adv1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField odno;
    private javax.swing.JTextField odno1;
    private javax.swing.ButtonGroup paymentMethodGroup;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField qty1;
    private javax.swing.JComboBox<String> spp;
    private javax.swing.JComboBox<String> spp1;
    private javax.swing.JTextField tot;
    private javax.swing.JTextField tot1;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField unit1;
    // End of variables declaration//GEN-END:variables
}
