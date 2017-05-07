/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

 
/**
 *
 * @author Dinushka
 */
public class Sample_Approval extends javax.swing.JInternalFrame {
 
    /**
     * Creates new form SalesDesignInquiry
     */
    public Sample_Approval() {
        initComponents();
        generate_Aid();
        TableLoad();
        TableLoad1();
        FillTextCombo();
 
    }
    
    
    
    private void generate_Aid(){
    AutoIdGenerator sid = new AutoIdGenerator();
    idApprove.setText(sid.generate("SAID",Integer.toString(MainWindow.userid)));
    }
    private void TableLoad()
    {

            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`T_Sample_Approval_Table`;");
            jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void TableLoad1()
    {

            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`T_Sample_Costing_Table`;");
            ViewSample.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
     private void FillTextCombo()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("SELECT *"
                    + " FROM garmentsystem.T_Request_Create_Sample_table");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String id = AutoDB_Connect.DB_ResultSet.getString("SampleId");
                Sampleids.addItem(id);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
     
     private void TextBoxClearAdd(){
            
            idApprove.setText("");
            NameApp.setSelectedItem("");
            appcomm1.setText("");
            //SampleApprove.setSelected(false);
            datePicker2.setText("");
    }
     private void TextBoxClearSampleDesign(){
            
            appid.setText("");
            appname.setText("");
            appby.setText("");
            appstatus1.setText("");
            appcomm.setText("");
            sampleid.setText("");
    }
    
   
     public void AddSampleApproval()
    {
        
        
        String id = idApprove.getText();
        String name = NameApp.getSelectedItem().toString();
        String SampleId = appstid1.getText();
        String comment =  appcomm.getText();
        jRadioButton1.setActionCommand("Approve");
        jRadioButton2.setActionCommand("NotApprove");
        String status = SampleApprove.getSelection().getActionCommand();
        String date = datePicker2.getText();
        
         if(id.isEmpty()||name.isEmpty()||comment.isEmpty()||SampleId.isEmpty()||status.isEmpty()||date.isEmpty())
        {
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        
        }
        
        else{
                if(comment.length()>10){
            
            JOptionPane.showMessageDialog(null, "WARNING YOU CAN'T ENTER MORE "
                    + "IN THE STYLE DESCRIPTION FIELD");
                }
                else if(!comment.matches("[a-zA-Z]+")){
                    
            JOptionPane.showMessageDialog(null, "WARNING YOU "
                    + "CAN ENTER ONLY ALPHABETS");
                    
                }
                
        
        //SQL Query
        else{
                    
                
         try
        {
        
       boolean  x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`T_Sample_Approval_Table`\n" +
"(`SAID`,\n" +
"`ApprovalName`,\n" +
"`SampleID`,\n" +
"`ApproveDate`,\n" +
"`ApprovedBy`,\n" +
"`Status`,\n" +
"`Comment`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+name+"',\n" +
"'"+SampleId+"',\n" +
"'"+date+"',\n" +
"'"+status+"',\n" +
"'"+comment+"');");
        
        
            if(x==true)
            {
                TableLoad();
                clearSampleApprove();
                JOptionPane.showMessageDialog(null,"Successfully Added");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
       }
        }
        
        
        }
      
    }
    
     public void EditApprovedDesigns()
    {
        String id = appid.getText();
        String by =  appname.getText();
        String stid = sampleid.getText();
        String status = appstatus1.getText();
        String comment =  appcomm.getText();
        String date = datePicker1.getText();
        
         if(id.isEmpty()||by.isEmpty()||stid.isEmpty()||status.
        isEmpty()||comment.isEmpty()||date.isEmpty()){
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        
        else if(comment.length()>10){
            
            JOptionPane.showMessageDialog(null, "WARNING YOU CAN'T ENTER MORE "
                    + "IN THE STYLE DESCRIPTION FIELD");
            
            
        }
        else{
             try
        {
        
        
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want"
                + " to Update?", "Update?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
        
        boolean x = autoSqlQuery.execute
        ("UPDATE `garmentsystem`.`T_Sample_Approval_Table`\n" +
"SET\n" +
"`ApprovalId` = '"+id+"',\n" +
"`ApprovedBy` = '"+by+"',\n" +
"`StyleId` = '"+stid+"',\n" +
"`Status` = '"+status+"',\n" +
"`Comment` = '"+comment+"',\n" +
"`Date` = '"+date+"'\n" +
"WHERE `ApprovalId` = '"+id+"'");
       
            if(x==true){
               clearSampleApprove();
               JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED");
             }
             else
             {
              
              
             }
        }
            }
            
       
        catch (Exception ex){
            System.out.println("else Update : "+ex);
        }
      
          }
       

    }
     
     private void DeleteApprovedDesigns()
    {
        String id =appid.getText();
         if(id.isEmpty()){
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
         else{
             try
        {
         
       int reply = JOptionPane.showConfirmDialog(null, 
               "Are you sure you want to Delete?", "Delete?", 
                            JOptionPane.YES_NO_OPTION);
        
        if (reply == JOptionPane.YES_OPTION){ 
        
        boolean x = autoSqlQuery.execute
        ("DELETE FROM `garmentsystem`.`T_Sample_Approval_Table`\n" +
        "WHERE ApprovalId = '"+id+"';");
        
        
            if (x==true)
            {
                clearSampleApprove();
                TableLoad();
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
            }
            
            }
        }
        catch (Exception ex){
            System.out.println("else Delete : "+ex);
        }
    }
    }
        
      
    

     
     public void CreateSampleSearch()
    {
            String SampleId = Sampleids.getSelectedItem().toString();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.T_Request_Create_Sample_table WHERE SampleId = '"+SampleId+"'");
            ViewSample.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));       
    }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SampleApprove = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewSample = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        AddSampleApp = new javax.swing.JButton();
        Sampleids = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        idApprove = new javax.swing.JTextField();
        byapp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Demo = new javax.swing.JButton();
        NameApp = new javax.swing.JComboBox<>();
        ViewSample1 = new javax.swing.JButton();
        appstid1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        appcomm1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DatePickerSettings dateSettings5 = new DatePickerSettings();
        dateSettings5.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings5.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings5);
        datePicker1.setName("");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        appcomm = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sampleid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        appby = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        appid = new javax.swing.JTextField();
        appname = new javax.swing.JTextField();
        appstatus1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DatePickerSettings dateSettings302= new DatePickerSettings();
        dateSettings302.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings302.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings302);
        datePicker1.setName("");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();

        setTitle("Sample Approval");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewSample.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sample Id", "Style Id", "Description", "Size", "Date", "Sample Type", "Name of Item", "Quantity", "Unit Price/Rtae", "Total Cost"
            }
        ));
        ViewSample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewSampleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ViewSample);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 780, 114));

        SampleApprove.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Approve");
        jRadioButton1.setToolTipText("Click Me");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 318, -1, -1));

        SampleApprove.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Not Approve");
        jRadioButton2.setToolTipText("Click Me");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 359, -1, -1));

        AddSampleApp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddSampleApp.setLabel("Add ");
        AddSampleApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSampleAppActionPerformed(evt);
            }
        });
        jPanel2.add(AddSampleApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 433, -1, -1));

        Sampleids.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SampleId" }));
        Sampleids.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sampleids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SampleidsActionPerformed(evt);
            }
        });
        jPanel2.add(Sampleids, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jButton5.setText("Generate Report");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 433, -1, -1));

        jLabel13.setText("SampleApproveId");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 218, -1, 20));

        idApprove.setEnabled(false);
        idApprove.setToolTipText("AutoGenerate");
        jPanel2.add(idApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 139, 30));

        byapp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Manager", "Customer", "Snr Sampling Executive", " " }));
        byapp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        byapp.setToolTipText("Please Select");
        jPanel2.add(byapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 121, 30));

        jLabel1.setText("SampleID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        Clear.setText("Reset");
        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 433, -1, -1));

        Demo.setText("Demo");
        Demo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoActionPerformed(evt);
            }
        });
        jPanel2.add(Demo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        NameApp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Approver" }));
        NameApp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(NameApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 30));

        ViewSample1.setText("View Sample");
        ViewSample1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViewSample1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSample1ActionPerformed(evt);
            }
        });
        jPanel2.add(ViewSample1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        appstid1.setToolTipText("Auto Fills");
        jPanel2.add(appstid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Comment");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, 23));

        appcomm1.setColumns(20);
        appcomm1.setRows(5);
        appcomm1.setToolTipText("Comment Please");
        jScrollPane4.setViewportView(appcomm1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Approval Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 276, -1, -1));

        jLabel10.setText("Status");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 322, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Approval Date");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 320, -1, -1));
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 18, 810, 511));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "S_App_Id", "App_Name", "App_Date", "ApprovedBy", "Status", "Comment"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 18, -1, 170));

        jButton6.setText("View");
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 446, -1, -1));

        jButton7.setText("Update");
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 446, -1, -1));

        jButton8.setText("Delete");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 446, -1, -1));

        jButton9.setText("Reset");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 446, -1, -1));

        jLabel8.setText("Comment");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, -1, 23));

        appcomm.setColumns(20);
        appcomm.setRows(5);
        appcomm.setToolTipText("Comment Please");
        jScrollPane3.setViewportView(appcomm);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("SampleApproveId");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SampleID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 210, -1, -1));

        sampleid.setToolTipText("Auto Fills");
        jPanel1.add(sampleid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 210, 130, 40));

        jLabel4.setText("Approval Name");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, -1, -1));

        jLabel6.setText("Status");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 270, -1, -1));

        appby.setToolTipText("Auto Fills");
        jPanel1.add(appby, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 140, 40));

        jLabel3.setText("ApprovedBy");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, -1));

        appid.setToolTipText("Auto Fills");
        jPanel1.add(appid, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 140, 40));

        appname.setToolTipText("Auto Fills");
        jPanel1.add(appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, 140, 40));

        appstatus1.setToolTipText("Auto Fills");
        jPanel1.add(appstatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 260, 130, 40));

        jLabel5.setText("Approval Date");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, -1));

        datePicker1.setEnabled(false);
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, -1, 30));

        jTabbedPane1.addTab("Sample Approval", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        int row =jTable2.getSelectedRow();
        String id = jTable2.getValueAt(row,0).toString();
        String name = jTable2.getValueAt(row,1).toString();
        String date = jTable2.getValueAt(row,2).toString();
        String by = jTable2.getValueAt(row,3).toString();
        String stid = jTable2.getValueAt(row,4).toString();
        String status = jTable2.getValueAt(row,5).toString();
        String comment = jTable2.getValueAt(row,6).toString();
       

        appid.setText(id);
        appname.setText(name);
        appby.setText(by);
        appcomm.setText(comment);
        appstatus1.setText(status);
        sampleid.setText(stid);
        datePicker1.setText(date);
    }//GEN-LAST:event_jTable2MouseClicked

    private void ViewSampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewSampleMouseClicked
        // TODO add your handling code here:
        
        int row =ViewSample.getSelectedRow();
        String stid = ViewSample.getValueAt(row,0).toString();
        
        appstid1.setText(stid);
        
        
    }//GEN-LAST:event_ViewSampleMouseClicked

    private void AddSampleAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSampleAppActionPerformed
        // TODO add your handling code here:
        
        AddSampleApproval();
        TableLoad();
        clearSampleApprove();
    }//GEN-LAST:event_AddSampleAppActionPerformed

    private void ViewSample1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSample1ActionPerformed
        // TODO add your handling code here:
        TableLoad1();
    }//GEN-LAST:event_ViewSample1ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        
        clearSampleApprove();
    }//GEN-LAST:event_ClearActionPerformed

    private void DemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemoActionPerformed
        // TODO add your handling code here:
        
        appcomm1.setText("Approved");
        //SampleApprove.setSelected(true);
        NameApp.setSelectedItem("Bhagya");
        datePicker2.setDateToToday();
        
    }//GEN-LAST:event_DemoActionPerformed

    private void SampleidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SampleidsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SampleidsActionPerformed
 
    
        public void clearSampleApprove(){
            
            idApprove.setText("");
            NameApp.setSelectedIndex(0);
            appcomm.setText("");
            appstid1.setText("");
            byapp.setSelectedIndex(0);
            datePicker1.setText("");
        }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSampleApp;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Demo;
    private javax.swing.JComboBox<String> NameApp;
    private javax.swing.ButtonGroup SampleApprove;
    private javax.swing.JComboBox<String> Sampleids;
    private javax.swing.JTable ViewSample;
    private javax.swing.JButton ViewSample1;
    private javax.swing.JTextField appby;
    private javax.swing.JTextArea appcomm;
    private javax.swing.JTextArea appcomm1;
    private javax.swing.JTextField appid;
    private javax.swing.JTextField appname;
    private javax.swing.JTextField appstatus1;
    private javax.swing.JTextField appstid1;
    private javax.swing.JComboBox<String> byapp;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JTextField idApprove;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField sampleid;
    // End of variables declaration//GEN-END:variables
}
