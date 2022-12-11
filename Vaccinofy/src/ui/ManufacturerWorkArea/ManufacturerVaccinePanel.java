/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManufacturerWorkArea;

import Business.Inventory.Inventory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */

public class ManufacturerVaccinePanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManufactureVaccineJPanel
     */
    
    private JPanel userProcessContainer;
    private Inventory inventory;
    private int requestedQuantity;
    
    public ManufacturerVaccinePanel(JPanel userProcessContainer, Inventory inventory, int requestedQuantity) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.requestedQuantity = requestedQuantity;
        this.inventory = inventory;
        vaccineIDTextField.setText(String.valueOf(inventory.getVaccine().getVaccineID()));
        vaccineNameTextField.setText(inventory.getVaccine().getVaccineName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expiryDateTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        vaccineIDLabel = new javax.swing.JLabel();
        vaccineNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vaccineIDTextField = new javax.swing.JTextField();
        manufacturerDateLabel = new javax.swing.JLabel();
        vaccineNameTextField = new javax.swing.JTextField();
        expiryDateLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        manufacturerDateTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        expiryDateTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(expiryDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 258, 211, -1));

        priceTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 338, 211, -1));

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Submit.jpg"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 160, 50));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 546, 110, 40));

        vaccineIDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIDLabel.setText("Vaccine ID :");
        add(vaccineIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 79, -1, -1));

        vaccineNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineNameLabel.setText("Vaccine Name :");
        add(vaccineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 139, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manufacture Vaccine");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 19, -1, -1));

        vaccineIDTextField.setEditable(false);
        vaccineIDTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vaccineIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 76, 211, -1));

        manufacturerDateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manufacturerDateLabel.setText("Manufacture Date:");
        add(manufacturerDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 195, -1, -1));

        vaccineNameTextField.setEditable(false);
        vaccineNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vaccineNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 136, 211, -1));

        expiryDateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expiryDateLabel.setText("Expiry Date :");
        add(expiryDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 261, -1, -1));

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLabel.setText("Price :");
        add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 341, -1, -1));

        manufacturerDateTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(manufacturerDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 192, 211, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vaccine Doodle.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 2, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try{
            String manufactureDate = manufacturerDateTextField.getText();
            String expiryDate = expiryDateTextField.getText();
            float price = Float.parseFloat(priceTextField.getText());
            
            inventory.getVaccine().setVaccineManufactureDate(manufactureDate);
            inventory.getVaccine().setVaccineExpiryDate(expiryDate);
            inventory.getVaccine().setVaccinePrice(price);
            inventory.getVaccine().setAvailablity(inventory.getVaccine().getAvailablity() + requestedQuantity);
            
            manufacturerDateTextField.setText(null);
            expiryDateTextField.setText(null);
            priceTextField.setText(null);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
    private javax.swing.JLabel expiryDateLabel;
    private javax.swing.JTextField expiryDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel manufacturerDateLabel;
    private javax.swing.JTextField manufacturerDateTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel vaccineIDLabel;
    private javax.swing.JTextField vaccineIDTextField;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JTextField vaccineNameTextField;
    // End of variables declaration//GEN-END:variables
}
