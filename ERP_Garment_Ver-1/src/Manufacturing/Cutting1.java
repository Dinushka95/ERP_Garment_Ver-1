
package Manufacturing;
 
import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.autoSqlQuery;
import ManufacturingPlanning.validation;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;




/**
 *
 * @author Dinushka
 */
public class Cutting1 extends javax.swing.JInternalFrame {



    /**
     * Creates new form SalesDesignInquiry
     */
    public Cutting1() {
        initComponents();
        generate_cdi();
      
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT Shedule_ID,Style_ID,Material_ID,Start_Date,End_Date,Quantity,Length_per_Sample FROM garmentsystem.r_Cutting_Schedule_table");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
   
        
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.cutting");
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

        myGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jTextFiel1 = new javax.swing.JTextField();
        jTextFieldCustomerName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCompanyName1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldCustomerName2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setResizable(true);
        setTitle("Cutting Details");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cutting ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jTextField1.setEditable(false);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 120, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 120, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Style ID");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 31, -1, -1));

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

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 61, 660, 136));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Schedule ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 740, 210));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("Add Cutting Details");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Length");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jTextField8.setEnabled(false);
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 270, 80, -1));

        jLabel7.setText("meters");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 340, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("(");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 10, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText(")");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 10, 20));

        jTextField5.setEditable(false);
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 380, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Total Length Used");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, 20));

        jLabel23.setText("meters");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel21.setText("meters");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField9MouseExited(evt);
            }
        });
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 310, 90, -1));

        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField10MouseExited(evt);
            }
        });
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 340, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Wastages");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Damages");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 440, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total No of Qualified Pieces");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField3MouseExited(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 80, -1));

        jLabel10.setText("meters");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jButton4.setText("Search style");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jButton6.setText("Search schedule_ID");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 850, 520));

        jTabbedPane1.addTab("ADD Cutting Details", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Cutting ID", "Style ID", "Schedule ID" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox4MouseClicked(evt);
            }
        });
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Search By");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Cutting ID");
        jLabel20.setEnabled(false);
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jTextField7.setEnabled(false);
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 140, -1));

        jTextField11.setEnabled(false);
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 140, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Style ID");
        jLabel24.setEnabled(false);
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Schedule ID");
        jLabel56.setEnabled(false);
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jTextField37.setEnabled(false);
        jPanel3.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 140, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Search");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 810, 250));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFiel1.setEditable(false);
        jTextFiel1.setName("Customer ID"); // NOI18N
        jTextFiel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiel1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFiel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 140, -1));

        jTextFieldCustomerName1.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldCustomerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cutting ID");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Style ID");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Quantity");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jTextFieldCompanyName1.setName("Company name"); // NOI18N
        jPanel6.add(jTextFieldCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 140, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Total wastages");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextFieldEmail1.setName("Email"); // NOI18N
        jPanel6.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 140, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        jLabel11.setText("meters");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Length");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel6.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));

        jLabel27.setText("meters");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Cut Shedule ID");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextFieldCustomerName2.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldCustomerName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 410, 430));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Full report");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Filtered report");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseClicked

    }//GEN-LAST:event_jComboBox4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
        
        if(jTextField7.getText()!=null)
        {
            String search=jTextField7.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.cutting WHERE Cutting_ID ='"+search+"'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        else if(jTextField11.getText()!=null)
        {
            String search=jTextField11.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.cutting WHERE Style_ID ='"+search+"'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
         else if(jTextField37.getText()!=null)
        {
            String search=jTextField37.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.cutting WHERE CutShedue_ID ='"+search+"'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        }
        catch(Exception e){
                System.out.println(e);
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        try{
        int r=jTable3.getSelectedRow();
        String schid=jTable3.getValueAt(r, 0).toString();
        String cutid=jTable3.getValueAt(r, 1).toString();
        String styleID=jTable3.getValueAt(r, 2).toString();
        String qty=jTable3.getValueAt(r, 6).toString();
        String length=jTable3.getValueAt(r, 4).toString();
        String wastages=jTable3.getValueAt(r, 5).toString();
        
        
        
        jTextFiel1.setText(schid);
        jTextFieldCustomerName1.setText(cutid);
        jTextFieldCustomerName2.setText(styleID);
        jTextFieldCompanyName1.setText(qty);
        jTextField12.setText(length);
        jTextFieldEmail1.setText(wastages);
        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTextFiel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiel1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            int reply = JOptionPane.showConfirmDialog(null, 
                 "Are you sure you want to Delete?", "Delete?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
        String id = jTextFiel1.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`cutting`\n" +
"WHERE Cutting_ID='"+id+"';");
       if(x==true)
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
          }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int reply = JOptionPane.showConfirmDialog(null, 
                 "Are you sure you want to Update?", "Update?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){

        String id=jTextFiel1.getText();
        String cut_sch=jTextFieldCustomerName1.getText();
        String style=jTextFieldCustomerName2.getText();
        String qty=jTextFieldCompanyName1.getText();
        String length=jTextField12.getText();
        String wastages=jTextFieldEmail1.getText();
           
        if(id.isEmpty()||cut_sch.isEmpty()||style.isEmpty()||qty.isEmpty()||length.isEmpty()||wastages.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY","Failure",JOptionPane.ERROR_MESSAGE);
        
        }
        else{
        
        try
       {
        
        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`cutting`\n" +
"SET\n" +
"`Style_ID` = '"+style+"',\n" +
"`CutShedue_ID` = '"+cut_sch+"',\n" +
"`Total_Wastages` = '"+wastages+"',\n" +
"`Total_Length_Used` = '"+length+"',\n" +
"`Qualified_pieces` = '"+qty+"'\n" +
"WHERE `Cutting_ID` = '"+id+"';");
        
        JOptionPane.showMessageDialog(null, "Updated Successfully");
       }
        catch(Exception e){
                System.out.println(e);
                
        }
       }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
        
        if(jTextField4.getText()!=null)
        {
            String search=jTextField4.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT Shedule_ID,Style_ID,Material_ID,Start_Date,End_Date,Quantity,Length_per_Sample FROM garmentsystem.r_Cutting_Schedule_table WHERE Style_ID ='"+search+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        else if(jTextField6.getText()!=null)
        {
            String search=jTextField6.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT Shedule_ID,Style_ID,Material_ID,Start_Date,End_Date,Quantity,Length_per_Sample FROM garmentsystem.r_Cutting_Schedule_table WHERE Shedule_ID ='"+search+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        }
        catch(Exception e){
                System.out.println(e);
                
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       
        String id=jTextField1.getText();
        String style=jTextField4.getText();
        String sch=jTextField6.getText();
        String tot=jTextField8.getText();
        String waste=jTextField2.getText();
        String used=jTextField5.getText();
        String pcs=jTextField3.getText();
        String wastages=jTextField9.getText();
        String damages=jTextField10.getText();
        int r=jTable1.getSelectedRow();
        String qty=jTable1.getValueAt(r, 5).toString();
        String length=jTable1.getValueAt(r, 6).toString();
        if(id.isEmpty()||style.isEmpty()||sch.isEmpty()||tot.isEmpty()||waste.isEmpty()||used.isEmpty()||pcs.isEmpty()){
            JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY","Failure",JOptionPane.ERROR_MESSAGE);
        }
        else{
        if(validation.isDigit(pcs)){
        
            if(Integer.parseInt(pcs)>Integer.parseInt(qty))
            {
                        JOptionPane.showMessageDialog(null, "The qualified pieces can't be greater than expected quantity");
            }
            else{
                if(Double.parseDouble(used)>Double.parseDouble(length))
                {
                    JOptionPane.showMessageDialog(null, "The total wastages can't be greater than the total length used");
                }
                else{
                                       
                    
        try{
       boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`cutting`\n" +
"(`Cutting_ID`,\n" +
"`Style_ID`,\n" +
"`CutShedue_ID`,\n" +
"`Total_Length`,\n" +
"`Total_Wastages`,\n" +
"`Total_Length_Used`,\n" +
"`Qualified_pieces`)\n"+
"VALUES\n" +
"('"+id+"',\n" +
"'"+style+"',\n" +
"'"+sch+"',\n" +
"'"+tot+"',\n" +
"'"+waste+"',\n" +
"'"+used+"',\n" +
"'"+pcs+"');");
       
       JOptionPane.showMessageDialog(null,"Successful");
       textBoxclear();
       
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
                }       
                
            }
            
        }
    
    }//GEN-LAST:event_jButton14ActionPerformed

    public void textBoxclear()
    {
        jTextField4.setText("");
        jTextField6.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField3.setText("");
        generate_cdi();
    }
    
    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField6.setEnabled(false);
        jTextField6.setText("");
        jTextField4.setEnabled(true);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        jTextField4.setEnabled(false);
        jTextField4.setText("");
        jTextField6.setEnabled(true);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseExited
        String damage=jTextField10.getText();
        if(validation.isDigit(damage)){
                double wastage=Double.valueOf(jTextField9.getText());
                double damages=Double.valueOf(jTextField10.getText());
                double length=Double.valueOf(jTextField8.getText());
                double totaldamages=wastage+damages;
                jTextField2.setText(Double.toString(totaldamages));
                double totalusage=length-totaldamages;
                jTextField5.setText(Double.toString(totalusage));
        }
    }//GEN-LAST:event_jTextField10MouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
        int r=jTable1.getSelectedRow();
        
        System.err.print(r);
        String schid=jTable1.getValueAt(r, 0).toString();
        String styleID=jTable1.getValueAt(r, 1).toString();
        String length=jTable1.getValueAt(r, 6).toString();
        
        
        jTextField4.setText(styleID);
        jTextField6.setText(schid);
        jTextField8.setText(length);
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        String search=jComboBox4.getSelectedItem().toString();
        System.out.println(search);
        if(search.equals("Cutting ID"))
        {
            jLabel20.setEnabled(true);
            jTextField7.setEnabled(true);
            jButton5.setEnabled(true);
            
        }
        
        else if (search.equals("Style ID"))
        {
            jLabel24.setEnabled(true);
            jTextField11.setEnabled(true);
            jButton5.setEnabled(true);
        }
        else if (search.equals("Schedule ID"))
        {
            jLabel56.setEnabled(true);
            jTextField37.setEnabled(true);
            jButton5.setEnabled(true);
        }
        
         else
            JOptionPane.showMessageDialog(null, "Select a category");
        
        
        



    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField4.setText("STY124c9f493");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField6.setText("CUT-SHI1252445de");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //String x=System.getProperty("user.dir");
        String FileLocation=System.getProperty("user.dir")+"\\src\\Manufacturing\\Reports\\report1.jrxml";
        System.err.println(FileLocation);
        //./Reports/ipr.jrxml
        String SQL="SELECT * FROM garmentsystem.cutting";
        autoReport.Query2Report(FileLocation, SQL);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Manufacturing\\Reports\\report2.jrxml";
        autoReport.Table2Report(FileLocation, jTable3);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseExited
        String waste=jTextField9.getText();
        validation.isDigit(waste);
    }//GEN-LAST:event_jTextField9MouseExited

    private void jTextField3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseExited
        
    }//GEN-LAST:event_jTextField3MouseExited
private void generate_cdi(){
        AutoIdGenerator aid = new AutoIdGenerator();
        jTextField1.setText(aid.generate("CUT-",Integer.toString(MainWindow.userid)));
    }
   
        
       
        
    
    
      
    
    
    
    
    
    

        
    
    
   


    
    
 
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextFiel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldCompanyName1;
    private javax.swing.JTextField jTextFieldCustomerName1;
    private javax.swing.JTextField jTextFieldCustomerName2;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.ButtonGroup myGroup;
    // End of variables declaration//GEN-END:variables

    
    
}
