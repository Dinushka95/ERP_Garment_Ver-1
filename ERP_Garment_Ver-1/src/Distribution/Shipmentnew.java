
package Distribution;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dinushka
 */
public class Shipmentnew extends javax.swing.JInternalFrame {


    /**
     * Creates new form SalesDesignInquiry
     */
    public Shipmentnew() {
        initComponents();
        
        generate_shipmentid();
        TabelLoad();
        
        TabelLoad();
        startdate.setDateToToday();
        
        TabelLoad();
        enddate.setDateToToday();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        shipid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        startdate = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings2.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        enddate = new com.github.lgooddatepicker.components.DatePicker(dateSettings2);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        recieved = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        descriptionarea = new javax.swing.JTextField();
        fromCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        supplier = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelShipSearch = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        fromCombo2 = new javax.swing.JComboBox<>();
        DatePickerSettings dateSettings3 = new DatePickerSettings();
        dateSettings3.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings3.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings3);
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        shipid1 = new javax.swing.JTextField();
        supplier1 = new javax.swing.JTextField();
        address1 = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        descriptionarea1 = new javax.swing.JTextField();
        recieved1 = new javax.swing.JTextField();
        phone2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Shipment Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 46, -1, -1));

        shipid.setEditable(false);
        shipid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        shipid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipidActionPerformed(evt);
            }
        });
        jPanel6.add(shipid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 219, -1));

        jLabel2.setText("Shipment ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 29, -1, -1));

        startdate.setEnabled(false);
        jPanel6.add(startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 230, -1));

        jLabel3.setText("Shipped Date");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 211, -1, -1));

        jLabel4.setText("Delivery Date");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        enddate.setEnabled(false);
        jPanel6.add(enddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 230, -1));

        jLabel5.setText("From");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 180, -1, -1));

        jLabel6.setText("Recieved By");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 286, -1, -1));
        jPanel6.add(recieved, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 230, -1));

        jLabel7.setText("Discription");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 321, -1, -1));
        jPanel6.add(descriptionarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 321, 254, 50));

        fromCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "USA", "UK", "India", "Pakisthan", " " }));
        fromCombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fromCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromComboActionPerformed(evt);
            }
        });
        jPanel6.add(fromCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 121, 31));

        jLabel14.setText("Suplier ");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 64, -1, -1));

        jLabel19.setText("Address");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 105, -1, -1));
        jPanel6.add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, -1));
        jPanel6.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 220, -1));

        jLabel20.setText("Phone");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 40, -1));
        jPanel6.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 220, -1));

        AddButton.setText("ADD");
        AddButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel6.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jButton4.setText("Clear All");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 480));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 760, 480));

        jTabbedPane1.addTab("ADD Shipment", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelShipSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelShipSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Shipment Date");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelShipSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("country");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelShipSearch.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 20));

        jButton8.setText("Reset All");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 90, -1));

        jButton9.setText("Reset All");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jButton10.setText("Search");
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

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
        jScrollPane3.setViewportView(jTable3);

        jPanelShipSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 580, 320));

        fromCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "USA", "UK", "India", "Pakisthan", " " }));
        fromCombo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fromCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromCombo2ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(fromCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 121, 31));
        jPanelShipSearch.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanel3.add(jPanelShipSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 530));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Shipment ID");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 29, -1, -1));

        shipid1.setEditable(false);
        shipid1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        shipid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipid1ActionPerformed(evt);
            }
        });
        jPanel5.add(shipid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 25, 219, -1));
        jPanel5.add(supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 64, 121, -1));
        jPanel5.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 102, 121, -1));
        jPanel5.add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 121, -1));

        jLabel15.setText("Suplier ");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 64, -1, -1));

        jLabel21.setText("Address");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 105, -1, -1));

        jLabel22.setText("Phone");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 132, -1, -1));

        jLabel11.setText("From");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel12.setText("Shipped Date");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 211, -1, -1));

        jLabel13.setText("Delivery Date");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 242, -1, -1));

        jLabel16.setText("Recieved By");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 286, -1, -1));

        jLabel17.setText("Discription");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 321, -1, -1));

        descriptionarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionarea1ActionPerformed(evt);
            }
        });
        jPanel5.add(descriptionarea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 321, 254, 50));
        jPanel5.add(recieved1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 283, 121, -1));
        jPanel5.add(phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 126, 121, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 560, 530));

        jTabbedPane1.addTab("Search & Update || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));
        jTabbedPane1.getAccessibleContext().setAccessibleName("ADD Discription");

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shipidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipidActionPerformed

    private void fromComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromComboActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        AddShipment();
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            search();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        search1();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
        TextBoxClear();
        generate_shipmentid();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void shipid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shipid1ActionPerformed

    private void descriptionarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionarea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionarea1ActionPerformed

    private void fromCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromCombo2ActionPerformed

     private void generate_shipmentid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    shipid.setText(aid.generate("SHPMT",Integer.toString(MainWindow.userid)));
    }
    
    private void TabelLoad()
    {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Shipment");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void TextBoxClear()
    {
        shipid.setText("");
        supplier.setText("");
        address.setText("");
        phone.setText("");
        fromCombo.setSelectedItem(0);
        startdate.setText("");
        enddate.setText("");
        recieved.setText("");
        descriptionarea.setText("");
        
    }
    
    private void AddShipment()
    {
        String id = shipid.getText();
        String supp = supplier.getText();
        String addrs = address.getText();
        String phn = phone.getText();
        String frm = fromCombo.getSelectedItem().toString();
        String strtdate = startdate.getText();
        String enddt = enddate.getText();
        String rcvd = recieved.getText();
        String dsc = descriptionarea.getText();
        
        boolean x =autoSqlQuery.execute("INSERT INTO `garmentsystem`.`C_Shipment`\n" +
"(`Shipment_id`,\n" +
"`Supplier`,\n" +
"`Adress`,\n" +
"`Phone`,\n" +
"`From`,\n" +
"`Shipped_date`,\n" +
"`Dlivery_date`,\n" +
"`Recieved_by`,\n" +
"`Discription`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+supp+"',\n" +
"'"+addrs+"',\n" +
"'"+phn+"',\n" +
"'"+frm+"',\n" +
"'"+strtdate+"',\n" +
"'"+enddt+"',\n" +
"'"+rcvd+"',\n" +
"'"+dsc+"');");
        
        try
        {
            if(x==true)
            {
                TabelLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
     private void search()
 {
        String frm=fromCombo2.getSelectedItem().toString();
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Shipment WHERE C_Shipment.From='"+frm+"'");
        jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
 }
      private void search1()
      {
           String strtdate=datePicker1.getText();

        jTable3.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchDate("C_Shipment","Shipped_date", strtdate)));
      }
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField address;
    private javax.swing.JTextField address1;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JTextField descriptionarea;
    private javax.swing.JTextField descriptionarea1;
    private com.github.lgooddatepicker.components.DatePicker enddate;
    private javax.swing.JComboBox<String> fromCombo;
    private javax.swing.JComboBox<String> fromCombo2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanelShipSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField phone2;
    private javax.swing.JTextField recieved;
    private javax.swing.JTextField recieved1;
    private javax.swing.JTextField shipid;
    private javax.swing.JTextField shipid1;
    private com.github.lgooddatepicker.components.DatePicker startdate;
    private javax.swing.JTextField supplier;
    private javax.swing.JTextField supplier1;
    // End of variables declaration//GEN-END:variables
}
