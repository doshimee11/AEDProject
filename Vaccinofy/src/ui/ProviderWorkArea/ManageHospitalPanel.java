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
public class ManageHospitalPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManageHospitalWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private ProviderEnterprise providerEnterprise;
    
    public ManageHospitalPanel(JPanel userProcessContainer, ProviderEnterprise providerEnterprise) {
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
        manageEmployeeButton = new javax.swing.JButton();
        manageUserAccountButton = new javax.swing.JButton();
        addHospitalButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Hospital Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 21, -1, -1));

        manageEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageEmployeeButton.setText("Manage Hospital Employee ");
        manageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 112, 290, 50));

        manageUserAccountButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageUserAccountButton.setText("Manage Hospital User");
        manageUserAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountButtonActionPerformed(evt);
            }
        });
        add(manageUserAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 178, 290, 50));

        addHospitalButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addHospitalButton.setText("Add Hospital ");
        addHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospitalButtonActionPerformed(evt);
            }
        });
        add(addHospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 290, 50));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText(" Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 5, 1200, 990));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeButtonActionPerformed
        
        ManageHospitalEmployeePanel manageEmployeePanel = new ManageHospitalEmployeePanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("ManageEmploeePanel", manageEmployeePanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeButtonActionPerformed

    private void manageUserAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountButtonActionPerformed
        
        ManageHospitalUserAccountPanel manageUserAccountPanel = new ManageHospitalUserAccountPanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("ManageUserAccountPanel", manageUserAccountPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageUserAccountButtonActionPerformed

    private void addHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHospitalButtonActionPerformed
        
        AddHospitalPanel addHospitalPanel = new AddHospitalPanel(userProcessContainer, providerEnterprise);
        userProcessContainer.add("AddHospitalPanel", addHospitalPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_addHospitalButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHospitalButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeButton;
    private javax.swing.JButton manageUserAccountButton;
    // End of variables declaration//GEN-END:variables
}
