/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.SystemAdminWorkArea;

import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author meetdoshi
 */

public class ViewVaccinePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Vaccine vaccine;
    
    public ViewVaccinePanel(JPanel userProcessContainer, Vaccine vaccine) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.vaccine = vaccine;
        
        populateForm();
    }
    
    public void populateForm(){
        vaccineNameJTextField.setText(vaccine.getVaccineName());
        vaccineIdJTextField.setText(String.valueOf(vaccine.getVaccineID()));
        diseaseNameJTextField.setText(vaccine.getDiseaseName());
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
        jLabel2 = new javax.swing.JLabel();
        vaccineNameJTextField = new javax.swing.JTextField();
        diseaseJLabel = new javax.swing.JLabel();
        diseaseNameJTextField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        vaccineIdJTextField = new javax.swing.JTextField();
        vaccineIdJLabel = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("View Vaccine Detail");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Vaccine Name:");

        vaccineNameJTextField.setEditable(false);
        vaccineNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineNameJTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        diseaseJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diseaseJLabel.setText("Disease Name:");

        diseaseNameJTextField.setEditable(false);
        diseaseNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diseaseNameJTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        updateJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateJButton.setText("Update Product");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        backJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        vaccineIdJTextField.setEditable(false);
        vaccineIdJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIdJTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        vaccineIdJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIdJLabel.setText("Vaccine ID:");

        saveJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveJButton.setText("SAVE");
        saveJButton.setEnabled(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vaccineIdJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vaccineIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vaccineNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diseaseJLabel)
                        .addGap(71, 71, 71)
                        .addComponent(diseaseNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(318, 318, 318))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(titleJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(backJButton1)
                        .addGap(47, 47, 47)
                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleJLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaccineNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineIdJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaccineIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diseaseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diseaseNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton1)
                    .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateJButton))
                .addContainerGap(547, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        vaccineNameJTextField.setEditable(true);
        diseaseNameJTextField.setEditable(true);
        saveJButton.setEnabled(true);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        if (vaccineNameJTextField.getText().equals("") || diseaseNameJTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter all the fields !", "View Vaccine", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            vaccine.setVaccineName(vaccineNameJTextField.getText());
            vaccine.setDiseaseName(diseaseNameJTextField.getText());
            vaccineNameJTextField.setEditable(false);
            diseaseNameJTextField.setEditable(false);
            JOptionPane.showMessageDialog(null, "Data saved successfully", "Update Vaccine",JOptionPane.INFORMATION_MESSAGE);
            saveJButton.setEnabled(false);

        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel diseaseJLabel;
    private javax.swing.JTextField diseaseNameJTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JButton updateJButton;
    private javax.swing.JLabel vaccineIdJLabel;
    private javax.swing.JTextField vaccineIdJTextField;
    private javax.swing.JTextField vaccineNameJTextField;
    // End of variables declaration//GEN-END:variables
}
