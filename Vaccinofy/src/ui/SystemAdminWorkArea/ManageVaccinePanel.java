/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.SystemAdminWorkArea;

import Business.Ecosystem;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meetdoshi
 */

public class ManageVaccinePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Ecosystem system;
    
    public ManageVaccinePanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) vaccineTable.getModel();
        dtm.setRowCount(0);
        for(Vaccine vaccine : system.getVaccineDirectory().getVaccineDirectory()){
            Object[] row = new Object[3];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineID();
            row[2] = vaccine.getDiseaseName();
            
            dtm.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        removeVaccineButton = new javax.swing.JButton();
        addVaccineButton = new javax.swing.JButton();
        viewVaccineButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        vaccineIDLabel = new javax.swing.JLabel();
        vaccineIdTextField = new javax.swing.JTextField();
        searchVaccineButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Vaccine");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 26, -1, -1));

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccine Id", "Diseases Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccineTable);
        if (vaccineTable.getColumnModel().getColumnCount() > 0) {
            vaccineTable.getColumnModel().getColumn(0).setResizable(false);
            vaccineTable.getColumnModel().getColumn(1).setResizable(false);
            vaccineTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 73, 710, 141));

        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh (2).png"))); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        removeVaccineButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removeVaccineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove (1).jpg"))); // NOI18N
        removeVaccineButton.setText("Remove Vaccine");
        removeVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeVaccineButtonActionPerformed(evt);
            }
        });
        add(removeVaccineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 210, 50));

        addVaccineButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addVaccineButton.setText("Add Vaccine");
        addVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccineButtonActionPerformed(evt);
            }
        });
        add(addVaccineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 262, 130, 50));

        viewVaccineButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewVaccineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View.jpg"))); // NOI18N
        viewVaccineButton.setText("View Vaccine");
        viewVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineButtonActionPerformed(evt);
            }
        });
        add(viewVaccineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 170, 50));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 396, 110, 40));

        vaccineIDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIDLabel.setText("Vaccine ID :");
        add(vaccineIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        vaccineIdTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vaccineIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 126, -1));

        searchVaccineButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchVaccineButton.setText("Search Vaccine");
        searchVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVaccineButtonActionPerformed(evt);
            }
        });
        add(searchVaccineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 343, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vaccine Doodle.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 3, 920, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void removeVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVaccineButtonActionPerformed
        int row = vaccineTable.getSelectedRow();
        if(row < 0) {
            JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else { 
            Vaccine vaccine = (Vaccine)vaccineTable.getValueAt(row, 0);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirm delete?", "warning", dialogButton);
            if(result == JOptionPane.YES_OPTION){
                system.getVaccineDirectory().removeOldVaccine(vaccine);
                JOptionPane.showMessageDialog(null, "Vaccine removed", "Vaccine Supplier",JOptionPane.INFORMATION_MESSAGE);
                populateTable();
            }
        }
    }//GEN-LAST:event_removeVaccineButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccineButtonActionPerformed
        AddVaccinePanel addVaccineJPanel = new AddVaccinePanel(userProcessContainer, system);
        userProcessContainer.add("AddVaccineJPanel", addVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addVaccineButtonActionPerformed

    private void viewVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineButtonActionPerformed
        int row = vaccineTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            Vaccine vaccine = (Vaccine)vaccineTable.getValueAt(row, 0);
            ViewVaccinePanel vpdjp = new ViewVaccinePanel(userProcessContainer, vaccine);
            userProcessContainer.add("ViewVaccineJPanel", vpdjp);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewVaccineButtonActionPerformed

    private void searchVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVaccineButtonActionPerformed
        if(vaccineIdTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Type the Vaccine ID to search.", "Search Vaccine", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{ 
            Vaccine vaccine;
            int vaccineId = Integer.parseInt(vaccineIdTextField.getText());
            vaccine = system.getVaccineDirectory().searchVaccine(vaccineId);
            if (vaccine == null){
                JOptionPane.showMessageDialog(null, "Use a valid Vaccine ID", "Warning", JOptionPane.WARNING_MESSAGE);
                vaccineIdTextField.setText(null);
                return;
            }
            ViewVaccinePanel vpdjp = new ViewVaccinePanel(userProcessContainer, vaccine);
            userProcessContainer.add("ViewVaccineJPanel", vpdjp);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid VaccineID", "Search Vaccine", JOptionPane.WARNING_MESSAGE);
            vaccineIdTextField.setText(null);
            return;
        }
    }//GEN-LAST:event_searchVaccineButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccineButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton removeVaccineButton;
    private javax.swing.JButton searchVaccineButton;
    private javax.swing.JLabel vaccineIDLabel;
    private javax.swing.JTextField vaccineIdTextField;
    private javax.swing.JTable vaccineTable;
    private javax.swing.JButton viewVaccineButton;
    // End of variables declaration//GEN-END:variables
}
