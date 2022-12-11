/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalWorkArea;

import Business.Order.OrderItem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */

public class ViewOrderItemPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ViewOrderItemJPanel
     */
    
    private JPanel userProcessContainer;
    private OrderItem orderItem;
    
    public ViewOrderItemPanel(JPanel userProcessContainer, OrderItem orderItem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orderItem = orderItem;
        
        populateForm();
    }
    
    public void populateForm(){
        vaccineNameTextField.setText(orderItem.getVaccine().getVaccineName());
        vaccineIdTextField.setText(String.valueOf(orderItem.getVaccine().getVaccineID()));
        quantityTextField.setText(String.valueOf(orderItem.getItemQuantity()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quantityTextField = new javax.swing.JTextField();
        vaccineIDLabel = new javax.swing.JLabel();
        vaccineIdTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vaccineNameLabel = new javax.swing.JLabel();
        vaccineNameTextField = new javax.swing.JTextField();
        vaccineQuantityLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantityTextField.setEnabled(false);
        add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 180, -1));

        vaccineIDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIDLabel.setText("Vaccine ID :");
        add(vaccineIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        vaccineIdTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIdTextField.setEnabled(false);
        add(vaccineIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 180, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Order Item");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 21, -1, -1));

        vaccineNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineNameLabel.setText("Vaccine Name :");
        add(vaccineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        vaccineNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineNameTextField.setEnabled(false);
        add(vaccineNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 180, -1));

        vaccineQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineQuantityLabel.setText("Quantity :");
        add(vaccineQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BluePlain-4.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -2, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try{
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JLabel vaccineIDLabel;
    private javax.swing.JTextField vaccineIdTextField;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JTextField vaccineNameTextField;
    private javax.swing.JLabel vaccineQuantityLabel;
    // End of variables declaration//GEN-END:variables
}
