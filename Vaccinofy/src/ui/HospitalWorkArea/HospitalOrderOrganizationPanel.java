/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalWorkArea;

import Business.Ecosystem;
import Business.Enterprise.ProviderEnterprise;
import Business.Organization.OrderOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */

public class HospitalOrderOrganizationPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form HospitalOrderOrganizationWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    private OrderOrganization orderOrganization;
    private ProviderEnterprise providerEnterprise;
    
    public HospitalOrderOrganizationPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, OrderOrganization orderOrganization, ProviderEnterprise providerEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.orderOrganization = orderOrganization;
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
        orderVaccineJButton = new javax.swing.JButton();
        viewOrderHistoryJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Hospital Order Organization Work Area");

        orderVaccineJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderVaccineJButton.setText("Order Vaccine >>");
        orderVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderVaccineJButtonActionPerformed(evt);
            }
        });

        viewOrderHistoryJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewOrderHistoryJButton.setText("View Order History >>");
        viewOrderHistoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderHistoryJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(508, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderVaccineJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(viewOrderHistoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addComponent(orderVaccineJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(viewOrderHistoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(748, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderVaccineJButtonActionPerformed
        
        try{
            if(userAccount.getEmployee().getHospital().getHospitalStatus().equalsIgnoreCase("Approved")){
                OrderVaccinePanel orderVaccineJPanel = new OrderVaccinePanel(userProcessContainer, system, userAccount, orderOrganization, providerEnterprise);
                userProcessContainer.add("OrderVaccineJPanel",orderVaccineJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else if(userAccount.getEmployee().getHospital().getHospitalStatus().equalsIgnoreCase("Rejected")){
                JOptionPane.showMessageDialog(null, "The Hospital registration has been REJECTED by State Public Health Department", "Hospital Rejected", JOptionPane.ERROR_MESSAGE);
                return;
            } else if(userAccount.getEmployee().getHospital().getHospitalStatus().equalsIgnoreCase("Processing")){
                JOptionPane.showMessageDialog(null, "The hospital registration request is still pending with State Public Health Department", "Hospital Registration Pending", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Please send a hospital registration request to State Public Health Department", "Hospital Registration Not Initialized", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_orderVaccineJButtonActionPerformed

    private void viewOrderHistoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderHistoryJButtonActionPerformed
        
        ViewHospitalOrderPanel hospOrderPanel = new ViewHospitalOrderPanel(userProcessContainer, userAccount);
        userProcessContainer.add("ViewOrderHistoryJPanel", hospOrderPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewOrderHistoryJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orderVaccineJButton;
    private javax.swing.JButton viewOrderHistoryJButton;
    // End of variables declaration//GEN-END:variables
}
