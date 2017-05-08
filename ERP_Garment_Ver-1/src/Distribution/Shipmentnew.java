
package Distribution;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JOptionPane;
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

        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Shipment");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Shipment");
        jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        
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
        fromCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        supplier = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelShipSearch = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

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
        jPanel6.add(startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 230, -1));

        jLabel3.setText("Shipped Date");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 211, -1, -1));

        jLabel4.setText("Delivery Date");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        jPanel6.add(enddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 230, -1));

        jLabel5.setText("From");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 180, -1, -1));

        jLabel6.setText("Recieved By");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 286, -1, -1));

        recieved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recievedActionPerformed(evt);
            }
        });
        jPanel6.add(recieved, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 230, -1));

        jLabel7.setText("Discription");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 321, -1, -1));

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
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jButton3.setText("Demo");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 230, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 480));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 28, 756, 388));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 780, 480));

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

        jButton8.setText("View All");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 90, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jButton10.setText("Search");
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

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

        jPanelShipSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 720, 320));

        fromCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "USA", "UK", "India", "Pakisthan", " " }));
        fromCombo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fromCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromCombo2ActionPerformed(evt);
            }
        });
        jPanelShipSearch.add(fromCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 121, 31));
        jPanelShipSearch.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanel3.add(jPanelShipSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 750, 530));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Shipment ID");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 29, -1, -1));

        supplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier1ActionPerformed(evt);
            }
        });
        jPanel5.add(supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 121, -1));

        address1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address1ActionPerformed(evt);
            }
        });
        jPanel5.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 121, -1));

        phone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone1ActionPerformed(evt);
            }
        });
        jPanel5.add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 121, -1));

        jLabel15.setText("Suplier ");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 20));

        jLabel21.setText("Address");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 60, 20));

        jLabel22.setText("Phone");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 50, 20));

        jLabel11.setText("From");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 40, 20));

        jLabel12.setText("Shipped Date");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel13.setText("Delivery Date");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel16.setText("Recieved By");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 20));

        jLabel17.setText("Discription");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        descriptionarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionarea1ActionPerformed(evt);
            }
        });
        jPanel5.add(descriptionarea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 254, 50));
        jPanel5.add(recieved1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 121, -1));
        jPanel5.add(phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 121, -1));

        jButton1.setText("Delete");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jButton2.setText("Update");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, -1));
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 120, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 120, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 560, 530));

        jTabbedPane1.addTab("Search & Update || Delete", jPanel3);

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
        tableLoad();
    }//GEN-LAST:event_jButton8ActionPerformed

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

    private void descriptionarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionarea1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionarea1ActionPerformed

    private void fromCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromCombo2ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
         try{
            int r=jTable3.getSelectedRow();
            String id= jTable3.getValueAt(r, 0).toString();
            String supp=jTable3.getValueAt(r, 1).toString();
            String addrs=jTable3.getValueAt(r, 2).toString();
            String phn=jTable3.getValueAt(r, 3).toString();
            String frm=jTable3.getValueAt(r, 4).toString();
            String strdate=jTable3.getValueAt(r, 5).toString();
            String enddt=jTable3.getValueAt(r, 6).toString();
            String rcvd=jTable3.getValueAt(r, 7).toString();
            String dsc=jTable3.getValueAt(r, 8).toString();
            boolean type = false;
            
            System.err.print(type);
            
            jTextField3.setText(id);
            supplier1.setText(supp);
            address1.setText(addrs);
            phone2.setText(phn);
            phone1.setText(frm);
            jTextField1.setText(strdate);
            jTextField2.setText(enddt);
            recieved1.setText(rcvd);
            descriptionarea1.setText(dsc);
        
        
        }
        
         catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void supplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplier1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          DeleteDesigns();
          tableLoad();
          clearDeleteDesign();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateAddedShipment();
        clearUpdateShipment();
        tableLoad();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         shipid.setText("SHI4879g56");
        supplier.setText("Arise");
        address.setText("Dilli");
        phone.setText("1048952");
        fromCombo.setSelectedItem(0);
        startdate.setText("");
        enddate.setText("");
        recieved.setText("Chathu");
      jTextField4.setText("Low Qulity");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void recievedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recievedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recievedActionPerformed

    private void phone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone1ActionPerformed

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
       jTextField4.setText("");
        
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
       String dsc = jTextField4.getText();
        
         if(id.isEmpty()||supp.isEmpty()||addrs.isEmpty()||phn.
        isEmpty()||frm.isEmpty()||rcvd.isEmpty())
        {
       JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
          else{
             if(validation.checkDate(strtdate,enddt)&& validation.isDigit(phn)&&validation.isLetter(frm)&&validation.isAlphanumeric(addrs)&&validation.isLetter(dsc))
               {
               
        
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
                JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED");
                TabelLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
               }
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
           AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Shipment WHERE C_Shipment.Shipped_date='"+strtdate+"'");
      jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

      //  jTable3.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchDate("C_Shipment","Shipped_date", strtdate)));
      }
      private void tableLoad(){
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM garmentsystem.C_Shipment");
            jTable3.setModel(DbUtils.resultSetToTableModel
        (AutoDB_Connect.DB_ResultSet));

        
    }
     private void DeleteDesigns()
    {
                int reply = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to Delete?", "Delete?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
        String id =jTextField3.getText();
        
        boolean x = autoSqlQuery.execute
        ("DELETE FROM `garmentsystem`.`C_Shipment` WHERE Shipment_id = '"+id+"';");
        
        try
        {
            if (x==true)
            {
                clearDeleteDesign();
                tableLoad();
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    }
     public void clearDeleteDesign(){
        
       jTextField3.setText("");
        supplier1.setText("");
        address1.setText("");
        phone2.setText("");
        phone1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        recieved1.setText("");
        jTextField4.setText("");
       
        
    }
      public void UpdateAddedShipment(){
          
            
        String id,supp,addrs,phn,frm,strtdate,enddt,rcvd,dsc;
        id = jTextField3.getText();
        supp = supplier1.getText();
        addrs = address1.getText();
        phn = phone2.getText();
        frm = phone1.getText();
        strtdate = jTextField1.getText();
        enddt = jTextField2.getText();
        rcvd = recieved1.getText();
        dsc = descriptionarea1.getText();
        
        
        if(id.isEmpty()||supp.isEmpty()||addrs.isEmpty()||phn.
        isEmpty()||frm.isEmpty()||strtdate.isEmpty()||enddt.isEmpty()||rcvd.isEmpty())
        {
       JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        
        else{
               
            if(validation.isDigit(phn)&&validation.isLetter(addrs)&&validation.isLetter(frm)&&validation.isLetter(rcvd))
               {
                
            
            try{
            
        
        
         int reply = JOptionPane.showConfirmDialog(null, 
                 "Are you sure you want to Update?", "Update?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
              

                boolean x = autoSqlQuery.execute
        ("UPDATE `garmentsystem`.`C_Shipment`\n" +
            "SET\n" +
            "`Shipment_id` = '"+id+"',\n" +
            "`Supplier` = '"+supp+"',\n" +
            "`Adress` = '"+addrs+"',\n" +
            "`Phone` = '"+phn+"',\n" +
            "`From` = '"+frm+"',\n" +
            "`Shipped_date` = '"+strtdate+"',\n" +
            "`Dlivery_date` = '"+enddt+"',\n" +
            "`Recieved_by` = '"+rcvd+"',\n" +
            "`Discription` = '"+dsc+"'\n" +
            "WHERE `Shipment_id` = '"+id+"';");
        
            if(x==true){
               clearUpdateShipment();
               JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED");
             }
             else
             {
              
              
             }
        }
            }
        
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
         
       
    }
    }
        }
    public void clearUpdateShipment(){
        
        jTextField3.setText("");
        supplier1.setText("");
        address1.setText("");
        phone2.setText("");
        phone1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        recieved1.setText("");
        jTextField4.setText("");
        descriptionarea1.setText("");
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField address;
    private javax.swing.JTextField address1;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JTextField descriptionarea1;
    private com.github.lgooddatepicker.components.DatePicker enddate;
    private javax.swing.JComboBox<String> fromCombo;
    private javax.swing.JComboBox<String> fromCombo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelShipSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField phone2;
    private javax.swing.JTextField recieved;
    private javax.swing.JTextField recieved1;
    private javax.swing.JTextField shipid;
    private com.github.lgooddatepicker.components.DatePicker startdate;
    private javax.swing.JTextField supplier;
    private javax.swing.JTextField supplier1;
    // End of variables declaration//GEN-END:variables
}
