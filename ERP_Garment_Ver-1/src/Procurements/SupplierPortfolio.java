
package Procurements;

import StyleManagement.*;
import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import static MainSystem.AutoSQLQuery.db_con;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */
public class SupplierPortfolio extends javax.swing.JInternalFrame {

    public SupplierPortfolio() {
        initComponents();
        generate_Supid();
        
        TableLoad();
        TableLoad2();
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setResizable(true);
        setTitle("Suppliers");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 1315, 483));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Supplier Details");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTabbedPane1.addTab("View supplier details", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setName(""); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 57, 456, 11));

        jLabel1.setText("General");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 32, -1, -1));

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 77, -1, -1));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 103, -1, -1));

        jLabel4.setText("Propreitor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 77, -1, -1));

        jLabel5.setText("Website");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 108, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 74, 107, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 100, 107, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 74, 107, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 105, 107, -1));

        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 143, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 163, 456, 10));

        jLabel7.setText("Address 1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 182, -1, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 102, -1));

        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 102, -1));

        jLabel10.setText("Country");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 182, -1, -1));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 179, 102, -1));

        jLabel11.setText("Postal code");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 102, -1));

        jLabel12.setText("Contact");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 277, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 297, 456, 10));

        jLabel13.setText("Tel No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 328, -1, -1));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 325, 119, -1));

        jLabel14.setText("E-mail");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 366, -1, -1));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 363, 119, -1));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 394, 119, -1));

        jLabel15.setText("Account No");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 435, -1, -1));
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 432, 119, -1));

        jLabel16.setText("Fax");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 400, -1, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 500));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 770, 520));

        jButton5.setText("Resel All");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        jTabbedPane1.addTab("Add new supplier", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Supplier ID");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 55, -1));

        jLabel22.setText("Name");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel4.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 110, -1));
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, -1));

        jLabel23.setText("Propreitor");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel4.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, -1));

        jLabel24.setText("Website");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel4.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 110, -1));

        jLabel25.setText("Address 1");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel4.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, -1));

        jLabel27.setText("City");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel4.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 110, -1));

        jLabel28.setText("Country");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel4.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 110, -1));

        jLabel29.setText("Postal code");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel4.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 110, -1));

        jLabel30.setText("Tel No");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        jPanel4.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 110, -1));

        jLabel31.setText("E-mail");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel4.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, -1));

        jLabel32.setText("Fax");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel4.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 110, -1));

        jLabel33.setText("Account No");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        jPanel4.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 110, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 300, 520));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Name");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel6.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 210, -1));

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

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

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 970, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 1000, 520));

        jTabbedPane1.addTab("Update/Delete supplier details", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1340, 570));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        AddSupplier();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        TextBoxClear();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        
        int row =jTable3.getSelectedRow();
        
        String id = jTable3.getValueAt(row,0).toString();
        String name = jTable3.getValueAt(row,1).toString();
        String propreiter = jTable3.getValueAt(row,2).toString();
        String web = jTable3.getValueAt(row,3).toString();
        String address = jTable3.getValueAt(row,4).toString();
        String city = jTable3.getValueAt(row,5).toString();
        String country = jTable3.getValueAt(row,6).toString();
        String post = jTable3.getValueAt(row,7).toString();
        String telephone = jTable3.getValueAt(row,8).toString();
        String mail = jTable3.getValueAt(row,9).toString();
        String fax = jTable3.getValueAt(row,10).toString();
        String acc = jTable3.getValueAt(row,11).toString();
        
        
        jTextField16.setText(id);
        jTextField17.setText(name);
        jTextField18.setText(propreiter);
        jTextField19.setText(web);
        jTextField20.setText(address);
        jTextField22.setText(city);
        jTextField23.setText(country);
        jTextField24.setText(post);
        jTextField25.setText(telephone);
        jTextField26.setText(mail);
        jTextField27.setText(fax);
        jTextField28.setText(acc);

        
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SupplierEdit();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String id = jTextField16.getText();
        
        boolean x = db_con.execute("DELETE FROM `garmentsystem`.`Supplier`\n" +
"WHERE Supplier_id = '"+id+"';");
        
        try
        {
            if (x==true)
            {
                TextBoxClear2();
                TableLoad2();
                TableLoad();
                MainTableLoad();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        SupplierNameSearch();
        
    }//GEN-LAST:event_jButton4ActionPerformed
    private void generate_Supid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1.setText(aid.generate("SUP",Integer.toString(MainWindow.userid)));
    }
    
    private void MainTableLoad()
    {
        AutoDB_Connect.DB_ResultSet = db_con.executeQuery("Select * from Supplier");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void TableLoad()
    {
        AutoDB_Connect.DB_ResultSet = db_con.executeQuery("Select * from Supplier");
        jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void TableLoad2()
    {
        AutoDB_Connect.DB_ResultSet = db_con.executeQuery("Select * from Supplier");
        jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
        private void SupplierNameSearch()
    {
            String name = jTextField15.getText();
            AutoDB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.Supplier WHERE Supplier_id LIKE '"+name+"%'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));       
    }
    
    private void SupplierEdit()
    {
        String id = jTextField16.getText();
        String name = jTextField17.getText();
        String propreiter = jTextField18.getText();
        String web = jTextField19.getText();
        String address = jTextField20.getText();
        String city = jTextField22.getText();
        String country = jTextField23.getText();
        String post = jTextField24.getText();
        String phone = jTextField25.getText();
        String mail = jTextField26.getText();
        String fax = jTextField27.getText();
        String account = jTextField28.getText();
        
        boolean x = db_con.execute("UPDATE `garmentsystem`.`Supplier`\n" +
"SET\n" +
"`Supplier_id` = '"+id+"',\n" +
"`Supplier_name` = '"+name+"',\n" +
"`Propreiter` = '"+propreiter+"',\n" +
"`Supplier_WebSite` = '"+web+"',\n" +
"`Address` = '"+address+"',\n" +
"`City` = '"+city+"',\n" +
"`Country` = '"+country+"',\n" +
"`Post_Code` = '"+post+"',\n" +
"`Telephone` = '"+phone+"',\n" +
"`Email` = '"+mail+"',\n" +
"`Fax` = '"+fax+"',\n" +
"`Account_Number` = '"+account+"'\n" +
"WHERE `Supplier_id` = '"+id+"';");
        
        
        try
        {
            if(x==true)
            {
                TableLoad();
                TableLoad2();
                TextBoxClear2();
                MainTableLoad();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    
    
    private void TextBoxClear(){
        generate_Supid();
        
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField13.setText("");
        jTextField14.setText("");

            
    }
    private void TextBoxClear2(){
        
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");

            
    }
    
    
    private void AddSupplier()
    {
        String id = jTextField1.getText();
        String name = jTextField2.getText();
        String propreiter = jTextField3.getText();
        String web = jTextField4.getText();
        String address = jTextField5.getText();
        String city = jTextField7.getText();
        String country = jTextField8.getText();
        String post = jTextField9.getText();
        String phone = jTextField10.getText();
        String mail = jTextField11.getText();
        String fax = jTextField13.getText();
        String account = jTextField14.getText();
        
        boolean x = db_con.execute("INSERT INTO `garmentsystem`.`Supplier`\n" +
"(`Supplier_id`,\n" +
"`Supplier_name`,\n" +
"`Propreiter`,\n" +
"`Supplier_WebSite`,\n" +
"`Address`,\n" +
"`City`,\n" +
"`Country`,\n" +
"`Post_Code`,\n" +
"`Telephone`,\n" +
"`Email`,\n" +
"`Fax`,\n" +
"`Account_Number`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+name+"',\n" +
"'"+propreiter+"',\n" +
"'"+web+"',\n" +
"'"+address+"',\n" +
"'"+city+"',\n" +
"'"+country+"',\n" +
"'"+post+"',\n" +
"'"+phone+"',\n" +
"'"+mail+"',\n" +
"'"+fax+"',\n" +
"'"+account+"');");
        
        try
        {
            if(x==true)
            {
                TableLoad();
                TableLoad2();
                TextBoxClear();
                MainTableLoad();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
