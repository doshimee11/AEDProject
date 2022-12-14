/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.NationalDistributorWorkArea;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */

public class NationalDistributorPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form NationalDistributorWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    
    public NationalDistributorPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
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
        manageVaccineOrderRqstButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("National Distributor ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 270, 40));

        manageVaccineOrderRqstButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageVaccineOrderRqstButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OrderVacccine.jpg"))); // NOI18N
        manageVaccineOrderRqstButton.setText("Manage Vaccine Order Request ");
        manageVaccineOrderRqstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccineOrderRqstButtonActionPerformed(evt);
            }
        });
        add(manageVaccineOrderRqstButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 380, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NationalDistributor.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1210, 1010));
    }// </editor-fold>//GEN-END:initComponents

    private void manageVaccineOrderRqstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccineOrderRqstButtonActionPerformed
        try{
            VaccineOrderRequestApprovalPanel vaccineOrderRequestApprovalPanel = new VaccineOrderRequestApprovalPanel(userProcessContainer, userAccount, system);
            userProcessContainer.add("VaccineOrderRequestApprovalPanel", vaccineOrderRequestApprovalPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_manageVaccineOrderRqstButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageVaccineOrderRqstButton;
    // End of variables declaration//GEN-END:variables
}
