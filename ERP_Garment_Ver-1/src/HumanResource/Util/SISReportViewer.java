package HumanResource.Util;

import java.awt.Container;
import java.sql.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;

public class SISReportViewer extends javax.swing.JInternalFrame {
Connection con;

    public SISReportViewer(String fileName,Connection c) {
        this(c,fileName, null);
        this.con = c;     
    }

    public SISReportViewer(Connection c,String fileName,HashMap parameter) {
        super("View Report");
    try {
        this.con = c;
        JasperReport jasperReport = JasperCompileManager.compileReport(fileName);
        JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, con);
        JRViewer viewer = new JRViewer(print);
        Container container = getContentPane();
        container.add(viewer);
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }  
    }

    public SISReportViewer(String reportsreport5jasper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
