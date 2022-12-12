/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PharmacyWorkArea;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ProviderEnterprise;
import Business.Enterprise.PublicHealthEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnrollmentRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalindjoshi
 */

public class RegisterPharmacyPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form RegisterPharmacyJPanel
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    private ProviderEnterprise providerEnterprise;
    
    public RegisterPharmacyPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, ProviderEnterprise providerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.providerEnterprise = providerEnterprise;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) hospitalEnrollmentTable.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest workRequest: userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = workRequest;
            row[1] = workRequest.getSender();
            row[2] = workRequest.getReceiver();
            EnrollmentRequest enrollmentRequest = (EnrollmentRequest) workRequest;
            row[3] = enrollmentRequest.getEnrollmentRequest() == null ? "Waiting": enrollmentRequest.getEnrollmentRequest();
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
        hospitalEnrollmentTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        enrollmentButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Register Pharmacy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 6, -1, -1));

        hospitalEnrollmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hospitalEnrollmentTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 59, 580, 160));

        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh (2).png"))); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 170, 50));

        enrollmentButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enrollmentButton.setText("Enrollment Request");
        enrollmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollmentButtonActionPerformed(evt);
            }
        });
        add(enrollmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 190, 50));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 170, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/high-angle-view-white-blue-candy-capsules-green-background_23-2147877557.jpg-2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -11, 1210, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void enrollmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollmentButtonActionPerformed
        try{
            for(WorkRequest workRequest: userAccount.getWorkQueue().getWorkRequestList()){
                if(workRequest.getStatus().equalsIgnoreCase("Approved")){
                    JOptionPane.showMessageDialog(null, "Enrollment request is approved", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                } else if(workRequest.getStatus().equalsIgnoreCase("sent")){
                    JOptionPane.showMessageDialog(null, "Enrollment request is sent and waiting to be approved", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            EnrollmentRequest enrollmentRequest = new EnrollmentRequest();
            enrollmentRequest.setRequestType("Enrollment Request");
            enrollmentRequest.setStatus("Sent");
            enrollmentRequest.setSender(userAccount);
            UserAccount ua = (UserAccount) enrollmentRequest.getSender();
            Employee employee = (Employee) ua.getEmployee();
            employee.setEnrollmentStatus("Processing");
            employee.getPharmacy().setPharmacyStatus("Processing");
            Enterprise enterprise = null;
            Network net = null;

            for(Network network : system.getNetworkDirectory()){
                for(Enterprise ent : network.getEnterpriseDirectory().getEnterprisesDirectory()){
                    if(ent == providerEnterprise){
                        net = network;
                    }
                }
            }

            for(Enterprise ent : net.getEnterpriseDirectory().getEnterprisesDirectory()){
                if(ent instanceof PublicHealthEnterprise){
                    enterprise = ent;
                    break;
                }
            }

            if(enterprise!=null){
                enterprise.getWorkQueue().getWorkRequestList().add(enrollmentRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(enrollmentRequest);
                populateTable();
            }

            JOptionPane.showMessageDialog(null, "Enrollment is requested successfully", "Enrollment Request", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_enrollmentButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try{
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.remove(this);
            layout.previous(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton enrollmentButton;
    private javax.swing.JTable hospitalEnrollmentTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
