
package Procurements;

import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;

import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import net.proteanit.sql.DbUtils;





public class Purchasing extends javax.swing.JInternalFrame {

    public Purchasing() {
        initComponents();
        generate_purid();
        TableLoad();
        datePicker1.setDateToToday();
        FillCombo();
        
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentMethodGroup = new javax.swing.ButtonGroup();
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
        jPanel2 = new javax.swing.JPanel();

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

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
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 750, 600));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 800, 640));
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, -1));

        jButton2.setText("Reset All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jPanel1.add(spp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 210, -1));

        jTabbedPane1.addTab("Local Puchases", jPanel1);
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
    
    private void generate_purid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    odno.setText(aid.generate("PUR",Integer.toString(MainWindow.userid)));
    }
    
    private void TableLoad()
    {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * from `garmentsystem`.`Purchasing` where Type='Local'");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adv;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JTextField des;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField odno;
    private javax.swing.ButtonGroup paymentMethodGroup;
    private javax.swing.JTextField qty;
    private javax.swing.JComboBox<String> spp;
    private javax.swing.JTextField tot;
    private javax.swing.JTextField unit;
    // End of variables declaration//GEN-END:variables
}
