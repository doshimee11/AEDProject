/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManufacturerWorkArea;

import Business.Ecosystem;
import Business.Enterprise.VaccineManufacturerEnterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */

public class ManufacturerWorkArea extends javax.swing.JPanel {
    
    /**
     * Creates new form ManufacturerWorkArea
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    private VaccineManufacturerEnterprise vaccineManufacturerEnterprise;
    
    public ManufacturerWorkArea(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, VaccineManufacturerEnterprise vaccineManufacturerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.vaccineManufacturerEnterprise = vaccineManufacturerEnterprise;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageManufacturerRqstButton = new javax.swing.JButton();
        manageManufactureOrgButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageManufacturerRqstButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageManufacturerRqstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ManufactureVaccine.jpg"))); // NOI18N
        manageManufacturerRqstButton.setText("Manage Manufacture Request ");
        manageManufacturerRqstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageManufacturerRqstButtonActionPerformed(evt);
            }
        });
        add(manageManufacturerRqstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 106, 360, 50));

        manageManufactureOrgButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageManufactureOrgButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ManufactureVaccine.jpg"))); // NOI18N
        manageManufactureOrgButton.setText("Manage Manufacture Organization ");
        manageManufactureOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageManufactureOrgButtonActionPerformed(evt);
            }
        });
        add(manageManufactureOrgButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 211, 370, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manufacturer Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 18, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vaccine Doodle.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -5, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void manageManufacturerRqstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageManufacturerRqstButtonActionPerformed
        
        ManageManufacturerRequestPanel manageManufactureReqPanel = new ManageManufacturerRequestPanel(userProcessContainer, system, userAccount, vaccineManufacturerEnterprise);
        userProcessContainer.add("ManageManufactureRequestPanel", manageManufactureReqPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageManufacturerRqstButtonActionPerformed

    private void manageManufactureOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageManufactureOrgButtonActionPerformed
        
        ManageManufacturerOrganizationPanel manageManufactureOrgPanel = new ManageManufacturerOrganizationPanel(userProcessContainer, vaccineManufacturerEnterprise);
        userProcessContainer.add("manageManufactureOrganizationPanel", manageManufactureOrgPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageManufactureOrgButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageManufactureOrgButton;
    private javax.swing.JButton manageManufacturerRqstButton;
    // End of variables declaration//GEN-END:variables
}
