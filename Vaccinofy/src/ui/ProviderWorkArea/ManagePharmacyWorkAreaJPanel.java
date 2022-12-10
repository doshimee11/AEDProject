/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProviderWorkArea;

import Business.Enterprise.ProviderEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kalindjoshi
 */
public class ManagePharmacyWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private ProviderEnterprise providerEnterprise;
    
    /**
     * Creates new form ManagePharmacyWorkAreaJPanel
     */
    public ManagePharmacyWorkAreaJPanel(JPanel userProcessContainer, ProviderEnterprise providerEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.providerEnterprise = providerEnterprise;
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
        manageEmployeeJButton1 = new javax.swing.JButton();
        manageUserAccountJButton = new javax.swing.JButton();
        addPharmacyJButton = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Pharmacy Work Area");

        manageEmployeeJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageEmployeeJButton1.setText("Manage Pharmacy Employee >>");
        manageEmployeeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButton1ActionPerformed(evt);
            }
        });

        manageUserAccountJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageUserAccountJButton.setText("Manage Pharmacy UserAccount >>");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });

        addPharmacyJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addPharmacyJButton.setText("Add Pharmacy >>");
        addPharmacyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPharmacyJButtonActionPerformed(evt);
            }
        });

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageUserAccountJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEmployeeJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(addPharmacyJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(564, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(manageEmployeeJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageUserAccountJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(addPharmacyJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(backjButton1)
                .addContainerGap(657, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButton1ActionPerformed
        ManagePharmacyEmployeeJPanel manageEmployeeJPanel = new ManagePharmacyEmployeeJPanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("ManagePharmacyEmploeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButton1ActionPerformed

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed
        ManagePharmacyUserAccountJPanel ManageUserAccountJPanel = new ManagePharmacyUserAccountJPanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("ManagePharmacyUserAccountJPanel", ManageUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void addPharmacyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPharmacyJButtonActionPerformed
        AddPharmacyJPanel addPharmacyJPanel = new AddPharmacyJPanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("AddPharmacyJPanel", addPharmacyJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addPharmacyJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPharmacyJButton;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton1;
    private javax.swing.JButton manageUserAccountJButton;
    // End of variables declaration//GEN-END:variables
}
