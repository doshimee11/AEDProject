/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProviderWorkArea;

import Business.Enterprise.ProviderEnterprise;
import Business.Hospital.Hospital;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalindjoshi
 */

public class AddHospitalPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form AddHospitalJPanel
     */
    
    private JPanel userProcessContainer;
    private ProviderEnterprise providerEnterprise;
    
    public AddHospitalPanel(JPanel userProcessContainer, ProviderEnterprise providerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.providerEnterprise = providerEnterprise;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) hospitalTable.getModel();
        dtm.setRowCount(0);
        for(Hospital hospital : providerEnterprise.getHospitalDirectory().getHospitalDirecotry()){
            Object[] row = new Object[3];
            row[0] = hospital;
            row[1] = hospital.getHospitalID();
            row[2] = hospital.getHospitalAddress();
            dtm.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        hospitalNameLabel = new javax.swing.JLabel();
        hospitalNameTextField = new javax.swing.JTextField();
        hospitalAddressLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hospitalAddressTextArea = new javax.swing.JTextArea();
        addHospitalButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("Add Hospital");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 25, -1, -1));

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital ID", "Hospital Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hospitalTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 72, 510, 90));

        hospitalNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hospitalNameLabel.setText("Hospital Name :");
        add(hospitalNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        hospitalNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(hospitalNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 304, -1));

        hospitalAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hospitalAddressLabel.setText("Hospital Address :");
        add(hospitalAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 238, -1, -1));

        hospitalAddressTextArea.setColumns(20);
        hospitalAddressTextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hospitalAddressTextArea.setRows(5);
        jScrollPane2.setViewportView(hospitalAddressTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 238, -1, -1));

        addHospitalButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addHospitalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterHospital.jpg"))); // NOI18N
        addHospitalButton.setText("Add Hospital");
        addHospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospitalButtonActionPerformed(evt);
            }
        });
        add(addHospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 407, 180, 38));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText(" back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 447, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void addHospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHospitalButtonActionPerformed
        
        String hospitalName = hospitalNameTextField.getText();
        String hospitalAddress = hospitalAddressTextArea.getText();
        
        Hospital hospital = providerEnterprise.getHospitalDirectory().createNewHospital();
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setHospitalName(hospitalName);
        populateTable();
        
    }//GEN-LAST:event_addHospitalButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHospitalButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel hospitalAddressLabel;
    private javax.swing.JTextArea hospitalAddressTextArea;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JTextField hospitalNameTextField;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
