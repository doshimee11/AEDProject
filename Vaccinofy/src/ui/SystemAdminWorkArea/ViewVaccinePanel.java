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
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleJLabel.setText("View Vaccine Detail");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vaccine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 94, -1, 30));

        vaccineNameJTextField.setEditable(false);
        vaccineNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineNameJTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(vaccineNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 96, 159, -1));

        diseaseJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diseaseJLabel.setForeground(new java.awt.Color(255, 255, 255));
        diseaseJLabel.setText("Disease Name:");
        add(diseaseJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 174, -1, 30));

        diseaseNameJTextField.setEditable(false);
        diseaseNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diseaseNameJTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(diseaseNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 174, 159, -1));

        updateJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Order History Icon.jpg"))); // NOI18N
        updateJButton.setText("Update Product");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 245, 190, 50));

        backJButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 130, 40));

        vaccineIdJTextField.setEditable(false);
        vaccineIdJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIdJTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(vaccineIdJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 136, 159, -1));

        vaccineIdJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineIdJLabel.setForeground(new java.awt.Color(255, 255, 255));
        vaccineIdJLabel.setText("Vaccine ID:");
        add(vaccineIdJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 134, -1, 30));

        saveJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveJButton.setText("SAVE");
        saveJButton.setEnabled(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vaccine Doodle.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 4, 1200, 1000));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JButton updateJButton;
    private javax.swing.JLabel vaccineIdJLabel;
    private javax.swing.JTextField vaccineIdJTextField;
    private javax.swing.JTextField vaccineNameJTextField;
    // End of variables declaration//GEN-END:variables
}
