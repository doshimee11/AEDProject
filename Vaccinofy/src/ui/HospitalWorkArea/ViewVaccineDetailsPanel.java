/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalWorkArea;

import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */

public class ViewVaccineDetailsPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ViewVaccineDetailsJPanel
     */
    
    private JPanel userProcessContainer;
    private Vaccine vaccine;
    
    public ViewVaccineDetailsPanel(JPanel userProcessContainer, Vaccine vaccine) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.vaccine = vaccine;
        
        populateForm();
    }
    
    public void populateForm(){
        vaccineNameTextField.setText(vaccine.getVaccineName());
        vaccineIDTextField.setText(String.valueOf(vaccine.getVaccineID()));
        diseasesNameTextField.setText(vaccine.getDiseaseName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diseasesNameLabel = new javax.swing.JLabel();
        vaccineQuantityLabel = new javax.swing.JLabel();
        vaccineNameTextField = new javax.swing.JTextField();
        diseasesNameTextField = new javax.swing.JTextField();
        vaccineIDTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        vaccineNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diseasesNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diseasesNameLabel.setText("Diseases Name :");
        add(diseasesNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 169, -1, -1));

        vaccineQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineQuantityLabel.setText("Vaccine ID :");
        add(vaccineQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 242, -1, -1));

        vaccineNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vaccineNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 182, -1));

        diseasesNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(diseasesNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 182, -1));

        vaccineIDTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(vaccineIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 182, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText(" Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 309, 120, 50));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("View Vaccine Details");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 29, -1, -1));

        vaccineNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaccineNameLabel.setText("Vaccine Name :");
        add(vaccineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 97, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Vaccine Details.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel diseasesNameLabel;
    private javax.swing.JTextField diseasesNameTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JTextField vaccineIDTextField;
    private javax.swing.JLabel vaccineNameLabel;
    private javax.swing.JTextField vaccineNameTextField;
    private javax.swing.JLabel vaccineQuantityLabel;
    // End of variables declaration//GEN-END:variables
}
