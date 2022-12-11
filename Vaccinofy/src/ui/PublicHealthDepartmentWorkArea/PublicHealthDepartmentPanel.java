/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PublicHealthDepartmentWorkArea;

import Business.Ecosystem;
import Business.Enterprise.PublicHealthEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */

public class PublicHealthDepartmentPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form PublicHealthDepartmentWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private PublicHealthEnterprise publicHealthEnterprise;
    private UserAccount userAccount;
    private Ecosystem system;
    
    public PublicHealthDepartmentPanel(JPanel userProcessContainer, PublicHealthEnterprise publicHealthEnterprise, UserAccount userAccount, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.publicHealthEnterprise = publicHealthEnterprise;
        this.system = system;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLabel = new javax.swing.JLabel();
        enrollmentApprovalJButton = new javax.swing.JButton();
        manageOrderJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("Public Health Department ");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 30, -1, -1));

        enrollmentApprovalJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enrollmentApprovalJButton.setText("Enrollment Request Approval");
        enrollmentApprovalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollmentApprovalJButtonActionPerformed(evt);
            }
        });
        add(enrollmentApprovalJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, 39));

        manageOrderJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageOrderJButton1.setText("Manage Vaccine Order");
        manageOrderJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrderJButton1ActionPerformed(evt);
            }
        });
        add(manageOrderJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 258, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/kalindjoshi/Downloads/BluePlain-4.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 3, 1190, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void enrollmentApprovalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollmentApprovalJButtonActionPerformed
        EnrollmentApprovalPanel enrollmentApprovalPanel = new EnrollmentApprovalPanel(userProcessContainer, publicHealthEnterprise, userAccount);
        userProcessContainer.add("EnrollmentApprovalPanel", enrollmentApprovalPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_enrollmentApprovalJButtonActionPerformed

    private void manageOrderJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrderJButton1ActionPerformed
        ManageVaccineOrderPanel manageVaccineOrderPanel = new ManageVaccineOrderPanel(userProcessContainer, userAccount, system, publicHealthEnterprise);
        userProcessContainer.add("ManageVaccineOrderPanel", manageVaccineOrderPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrderJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrollmentApprovalJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageOrderJButton1;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
