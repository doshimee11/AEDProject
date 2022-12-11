/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PublicHealthDepartmentWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.PublicHealthEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnrollmentRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */

public class EnrollmentApprovalPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form EnrollmentApprovalJPanel
     */
    
    private JPanel userProcessContainer;
    private PublicHealthEnterprise publicHealthEnterprise;
    private UserAccount userAccount;
    
    public EnrollmentApprovalPanel(JPanel userProcessContainer, PublicHealthEnterprise publicHealthEnterprise, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.publicHealthEnterprise = publicHealthEnterprise;
        this.userAccount = userAccount;
        
        populateProviderComboBox();
    }
    
    public void populateProviderComboBox(){
        providerJComboBox.removeAllItems();
        providerJComboBox.addItem("Hospital");
        providerJComboBox.addItem("Pharmacy");
    }
    
    public void populateHosptialTable(){
        DefaultTableModel dtm = (DefaultTableModel) messageJTable.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest request : publicHealthEnterprise.getWorkQueue().getWorkRequestList()){
            if(request.getRequestType().equalsIgnoreCase("Enrollment Request")){
                if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = request.getSender().getEmployee().getHospital();
                    row[2] = request.getSender();
                    row[3] = request.getReceiver() == null? null : request.getReceiver();
                    row[4] = request.getStatus();
                    dtm.addRow(row);
                }
            }
        }
    }
    
    public void populatePharmacyTable(){
        DefaultTableModel dtm = (DefaultTableModel) messageJTable.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest request : publicHealthEnterprise.getWorkQueue().getWorkRequestList()){
            if(request.getRequestType().equalsIgnoreCase("Enrollment Request")){
                if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Pharmacy")){
                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = request.getSender().getEmployee().getPharmacy();
                    row[2] = request.getSender();
                    row[3] = request.getReceiver() == null? null : request.getReceiver();
                    row[4] = request.getStatus();
                    dtm.addRow(row);
                }
            }
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

        assignJButton = new javax.swing.JButton();
        approveJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageJTable = new javax.swing.JTable();
        providerJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Assign.jpg"))); // NOI18N
        assignJButton.setText("Assign to Me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 180, 40));

        approveJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        approveJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Order History Icon.jpg"))); // NOI18N
        approveJButton.setText("Approve Enrollment");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        add(approveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 230, 40));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 130, 50));

        rejectJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rejectJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove (1).jpg"))); // NOI18N
        rejectJButton.setText("Reject Enrollment");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });
        add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 230, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enrollment Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 31, -1, -1));

        messageJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Provider Name", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(messageJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 133, 476, 191));

        providerJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        providerJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerJComboBoxActionPerformed(evt);
            }
        });
        add(providerJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 87, 171, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        try{
            int selectedRow = messageJTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if(messageJTable.getValueAt(selectedRow, 3) != null){
                JOptionPane.showMessageDialog(null, "This request is assigned", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            EnrollmentRequest request = (EnrollmentRequest) messageJTable.getValueAt(selectedRow, 0);
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                populateHosptialTable();
            } else if(request.getSender().getEmployee().getCheck().equalsIgnoreCase("Pharmacy")){
                populatePharmacyTable();
            }
            JOptionPane.showMessageDialog(null, "This request is assigned to " + request.getReceiver());
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        try{
            int selectedRow = messageJTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row from table.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(messageJTable.getValueAt(selectedRow, 4) == "Approved"){
                JOptionPane.showMessageDialog(null, "The request is approved", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(messageJTable.getValueAt(selectedRow, 4) == "Rejected"){
                JOptionPane.showMessageDialog(null, "This request is rejected", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            EnrollmentRequest request = (EnrollmentRequest) messageJTable.getValueAt(selectedRow, 0);
            if(messageJTable.getValueAt(selectedRow, 3) == null){
                JOptionPane.showMessageDialog(null, "This request is yet to be assigned to the Health Dept", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            UserAccount userAccount = (UserAccount) request.getSender();
            Employee employee = (Employee) userAccount.getEmployee();
            employee.setEnrollmentStatus("Approved");
            request.setStatus("Approved");
            request.setEnrollmentRequest("Approved");
            if(employee.getCheck().equalsIgnoreCase("hospital")){
                employee.getHospital().setHospitalStatus("Approved");
                populateHosptialTable();
            } else if(employee.getCheck().equalsIgnoreCase("Pharmacy")){
                employee.getPharmacy().setPharmacyStatus("Approved");
                populatePharmacyTable();
            }
            JOptionPane.showMessageDialog(null, "This request is approved", "Enrollment Request", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try{
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.remove(this);
            layout.previous(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
        try{
            int selectedRow = messageJTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(messageJTable.getValueAt(selectedRow, 4) == "Rejected"){
                JOptionPane.showMessageDialog(null, "This request is rejected", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(messageJTable.getValueAt(selectedRow, 4) == "Approved"){
                JOptionPane.showMessageDialog(null, "This request is approved", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            EnrollmentRequest request = (EnrollmentRequest) messageJTable.getValueAt(selectedRow, 0);
            if(messageJTable.getValueAt(selectedRow, 3) == null){
                JOptionPane.showMessageDialog(null, "The request is yet to be assigned to the Health Dept", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirm reject?", "warning", dialogButton);
            if(result == JOptionPane.YES_OPTION){
                UserAccount userAccount = (UserAccount) request.getSender();
                Employee employee = (Employee) userAccount.getEmployee();
                employee.setEnrollmentStatus("Rejected");
                request.setStatus("Reject");
                request.setEnrollmentRequest("Rejected");
                if(employee.getCheck().equalsIgnoreCase("Hospital")){
                    employee.getHospital().setHospitalStatus("Rejected");
                    populateHosptialTable();
                } else if(employee.getCheck().equalsIgnoreCase("Pharmacy")){
                    employee.getPharmacy().setPharmacyStatus("Rejected");
                    populatePharmacyTable();
                }

                JOptionPane.showMessageDialog(null, "This request is rejected", "Enrollment Request", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void providerJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_providerJComboBoxActionPerformed
        String provider = (String) providerJComboBox.getSelectedItem();
        if(provider != null){
            if(provider.equalsIgnoreCase("Hospital")){
                populateHosptialTable();
            } else if(provider.equalsIgnoreCase("Pharmacy")){
                populatePharmacyTable();
            }
        }
    }//GEN-LAST:event_providerJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable messageJTable;
    private javax.swing.JComboBox providerJComboBox;
    private javax.swing.JButton rejectJButton;
    // End of variables declaration//GEN-END:variables
}
