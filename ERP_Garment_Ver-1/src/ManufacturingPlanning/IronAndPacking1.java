
package ManufacturingPlanning;
 
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
public class IronAndPacking1 extends javax.swing.JInternalFrame {



    /**
     * Creates new form SalesDesignInquiry
     */
    public IronAndPacking1() {
        initComponents();
        generate_cdi();
        FillComboSupervisor();
      
   
    }
    public void AddSewingSchedule(){
        
        //String
    
    }
     
    
    private void generate_cdi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField6.setText(aid.generate("IAP-SHI",Integer.toString(MainWindow.userid)));
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
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        DatePickerSettings setting8 = new DatePickerSettings();
        setting8.setFormatForDatesCommonEra("yyyy-MM-dd");
        setting8.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker7 = new com.github.lgooddatepicker.components.DatePicker(setting8);
        jLabel34 = new javax.swing.JLabel();
        DatePickerSettings setting9 = new DatePickerSettings();
        setting9.setFormatForDatesCommonEra("yyyy-MM-dd");
        setting9.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker8 = new com.github.lgooddatepicker.components.DatePicker(setting9);
        jLabel35 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        DatePickerSettings setting11 = new DatePickerSettings();
        setting11.setFormatForDatesCommonEra("yyyy-MM-dd");
        setting11.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker4 = new com.github.lgooddatepicker.components.DatePicker(setting11);
        DatePickerSettings setting10 = new DatePickerSettings();
        setting10.setFormatForDatesCommonEra("yyyy-MM-dd");
        setting10.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(setting10);
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        DatePickerSettings setting12 = new DatePickerSettings();
        setting12.setFormatForDatesCommonEra("yyyy-MM-dd");
        setting12.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker5 = new com.github.lgooddatepicker.components.DatePicker(setting12);
        DatePickerSettings setting13 = new DatePickerSettings();
        setting13.setFormatForDatesCommonEra("yyyy-MM-dd");
        setting13.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker6 = new com.github.lgooddatepicker.components.DatePicker(setting13);
        jLabel20 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Iron And Packing Schedule");
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

        jLabel7.setText("No of Lines");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, -1, -1));

        jButton4.setText("ADD schedule");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        jLabel33.setText("No of Labourers");
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        jLabel16.setText("Room No");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, 140, -1));

        jLabel1.setText("Schedule ID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 140, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Days", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("End Date");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel7.add(datePicker7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel34.setText("Start Date");
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel7.add(datePicker8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel35.setText("No of Minutes per Sample");
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField16MouseExited(evt);
            }
        });
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 140, -1));

        jLabel24.setText("Total No of Days");
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 420, 180));

        jLabel36.setText("Iron type");
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No ironing/ pressing", "Minimuum ironing/ pressing", "Under ironing/ pressing", "Final ironinng/ pressing", "Permanent ironing/ pressing", " " }));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, -1, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Style ID");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, -1));

        jLabel2.setText("Washing ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

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

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 700, 280));

        jButton1.setText("Search");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 130, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 750, 380));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "I001", "I002", "I003", "I004", "I005" }));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 140, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "1", "2", "3", "4", "5", "6", " " }));
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 140, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Sup ID");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, -1));

        jPanel2.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1260, 520));

        jTabbedPane1.addTab("Add Iron & Packing Details", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 170, 700, 310));

        datePicker4.setEnabled(false);
        jPanel12.add(datePicker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        datePicker2.setEnabled(false);
        jPanel12.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No ironing/ pressing", "Minimuum ironing/ pressing", "Under ironing/ pressing", "Final ironinng/ pressing", "Permanent ironing/ pressing", " " }));
        jComboBox2.setEnabled(false);
        jPanel12.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 140, -1));

        jTextField7.setEnabled(false);
        jPanel12.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 140, -1));

        jLabel4.setText("Schedule ID");
        jLabel4.setEnabled(false);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 90, -1));

        jLabel5.setText("Type");
        jLabel5.setEnabled(false);
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 40, -1));

        jLabel6.setText("Start Date");
        jLabel6.setEnabled(false);
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, -1));

        jLabel9.setText("End Date");
        jLabel9.setEnabled(false);
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 60, -1));

        jLabel12.setText("Search By");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Schedule ID", "Start Date", "End Date", "Type", " " }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });
        jComboBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox5MouseClicked(evt);
            }
        });
        jPanel12.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, -1));

        jButton3.setText("Search");
        jButton3.setEnabled(false);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 750, 500));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Schedule ID");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 140, -1));

        jLabel17.setText("No of Labourers");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 140, -1));

        jLabel18.setText("Room No");
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));
        jPanel6.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 140, -1));

        jLabel11.setText("No of Lines");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        jPanel6.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 140, -1));

        jLabel14.setText("Start Date");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel19.setText("End Date");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        jPanel6.add(datePicker5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));
        jPanel6.add(datePicker6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel20.setText("Iron type");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No ironing/ pressing", "Minimuum ironing/ pressing", "Under ironing/ pressing", "Final ironinng/ pressing", "Permanent ironing/ pressing", " " }));
        jPanel6.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel21.setText("Style No");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));
        jPanel6.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, -1));

        jLabel22.setText("Type");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No ironing/ pressing", "Minimuum ironing/ pressing", "Under ironing/ pressing", "Final ironinng/ pressing", "Permanent ironing/ pressing", " " }));
        jPanel6.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 140, -1));

        jButton6.setText("Edit");
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jButton8.setText("Delete");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jLabel25.setText("Quantity");
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));
        jPanel6.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 140, -1));

        jLabel26.setText("Supervisor ID");
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
        jPanel6.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Minutes per Sample");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 470, 500));

        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //System.err.print("guhk"); 
        AddIronSchedule();
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jComboBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox5MouseClicked

    }//GEN-LAST:event_jComboBox5MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField1.setEnabled(false);
        jTextField1.setText("");
        jTextField2.setEnabled(true);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField2.setEnabled(false);
        jTextField2.setText("");
        jTextField1.setEnabled(true);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                     
        try{
        
        if(jTextField2.getText().equals(""))
        {
            String search=jTextField1.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT Schedule_ID,Style_ID,Start_Date,End_Date,Qty FROM garmentsystem.r_Washing_Schedule_table WHERE Schedule_ID ='"+search+"'");
            jTable4.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        if(jTextField1.getText().equals(""))
        {
            String search=jTextField2.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT Schedule_ID,Style_ID,Start_Date,End_Date,Qty FROM garmentsystem.r_Washing_Schedule_table WHERE Style_ID ='"+search+"'");
            jTable4.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        }
        catch(Exception e){
                System.out.println(e);
                
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
    try{
        int r=jTable4.getSelectedRow();
        String schid=jTable4.getValueAt(r, 0).toString();
        String styleID=jTable4.getValueAt(r, 1).toString();
        
        jTextField1.setText(schid);
        jTextField2.setText(styleID);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTextField16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseExited
         try{
        int r=jTable4.getSelectedRow();
        int qty=Integer.valueOf(jTable4.getValueAt(r,4).toString());
        int sample=Integer.valueOf(jTextField16.getText());
        int days=(qty*sample)/60;
        if(days<=24)
            days=1;
        else
            days=days/24;
        
        jTextField17.setText(Integer.toString(days));
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField16MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                String id = jTextField5.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`r_Iron_and_Packing_Schedule`\n" +
"WHERE Schedule_ID='"+id+"';");
       if(x==true)
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        String search=jComboBox5.getSelectedItem().toString();
        System.out.println(search);
        if(search.equals("Schedule ID"))
        {
            jLabel4.setEnabled(true);
            jTextField7.setEnabled(true);
            jButton3.setEnabled(true);
            
        }
        
        else if (search.equals("Start Date"))
        {
            jLabel6.setEnabled(true);
            datePicker2.setEnabled(true);
            jButton3.setEnabled(true);
        }
        else if (search=="End Date")
        {
            jLabel9.setEnabled(true);
            datePicker4.setEnabled(true);
            jButton3.setEnabled(true);
        }
        
        else if(search=="Type")
        {
            jLabel5.setEnabled(true);
            jComboBox2.setEnabled(true);
            jButton3.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Select a category");
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try{
        String search=jComboBox5.getSelectedItem().toString();
        if(search=="Schedule ID")
        {
            String schID=jTextField7.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.r_Iron_and_Packing_Schedule WHERE Schedule_ID ='"+schID+"'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        else if(search=="Start Date")
        {
            String schID=datePicker2.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.r_Iron_and_Packing_Schedule WHERE Start_Date ='"+schID+"'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        else if(search=="End Date")
        {
            String schID=datePicker4.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.r_Iron_and_Packing_Schedule WHERE End_Date ='"+schID+"'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
       
        else if(search=="Type")
        {
            String schID=jComboBox3.getSelectedItem().toString();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.r_Iron_and_Packing_Schedule WHERE Type ='"+schID+"'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

   private void FillComboSupervisor()
    {
         try
         {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.emp_table WHERE depid='iron&packing' ");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String id = AutoDB_Connect.DB_ResultSet.getString("emp_id");
                jComboBox8.addItem(id);
                              
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    
        public void AddIronSchedule(){
            
            
        String id=jTextField6.getText();
        String style=jTextField2.getText();
        String wshid=jTextField1.getText();
        String type=jComboBox1.getSelectedItem().toString();
        int sample=Integer.parseInt(jTextField16.getText());
        String stdate=datePicker7.getText();
        String enddate=datePicker8.getText();
        int lab=Integer.parseInt(jTextField4.getText());
        String room=jComboBox6.getSelectedItem().toString();
        int line=Integer.parseInt(jComboBox7.getSelectedItem().toString());
        String sup=jComboBox8.getSelectedItem().toString();
//        int r=jTable4.getSelectedRow();
//        String qty=jTable4.getValueAt(r, 4).toString();
        
        
        
        try{
//       boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`r_Iron_and_Packing_Schedule`\n" +
//"(`Schedule_ID`,\n" +
//"`Style_ID`,\n" +
//"`Type`,\n" +
//"`Room_No`,\n" +
//"`No_of_Sample`,\n" +
//"`No_of_Labourers`,\n" +
//"`Start_Date`,\n" +
//"`End_Date`,\n" +
//"`Supervisor_ID`,\n" +
//"`Qty`,\n" +               
//"`Washing_ID`)\n" +
//"VALUES\n" +
//"('"+id+"',\n" +
//"'"+style+"',\n" +
//"'"+type+"',\n" +
//"'"+room+"',\n" +
//"'"+sample+"',\n" +
//"'"+lab+"',\n" +
//"'"+stdate+"',\n" +
//"'"+enddate+"',\n" +
//"'"+sup+"',\n" +
//"'"+qty+"',\n" +        
//"'"+wshid+"');");
       
       JOptionPane.showMessageDialog(null,"Successful");
        }
        catch(Exception e){
            System.out.println(e); 
            
        
    }
        
    }
 

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker4;
    private com.github.lgooddatepicker.components.DatePicker datePicker5;
    private com.github.lgooddatepicker.components.DatePicker datePicker6;
    private com.github.lgooddatepicker.components.DatePicker datePicker7;
    private com.github.lgooddatepicker.components.DatePicker datePicker8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.ButtonGroup myGroup;
    // End of variables declaration//GEN-END:variables
}
