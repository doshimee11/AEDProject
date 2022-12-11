/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ProviderWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.ProviderEnterprise;
import Business.Organization.Organization;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalindjoshi
 */

public class ManagePharmacyEmployeePanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManagePharmacyEmployeeJPanel
     */
    
    private ProviderEnterprise providerEnterprise;
    private JPanel userProcessContainer;
    
    public ManagePharmacyEmployeePanel(JPanel userProcessContainer, ProviderEnterprise providerEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.providerEnterprise = providerEnterprise;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        populatePharmacyComboBox();
    }
    
    public void populateOrganizationComboBox(){
        organizationComboBox.removeAllItems();
        for (Organization organization : providerEnterprise.getOrganizationDirectory().getOrganizationDirectory()){
            organizationComboBox.addItem(organization);
        }
    }
    
    public void populatePharmacyComboBox(){
        pharmacyComboBox.removeAllItems();
        for(Pharmacy pharmacy : providerEnterprise.getPharmacyDirectory().getPharmacyDirectory()){
            pharmacyComboBox.addItem(pharmacy);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpComboBox.removeAllItems();
        for (Organization organization : providerEnterprise.getOrganizationDirectory().getOrganizationDirectory()){
            organizationEmpComboBox.addItem(organization);
        }
    }
    
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationTable.getModel();
        model.setRowCount(0);
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeDirectory()){
            if(employee.getCheck().equalsIgnoreCase("Pharmacy")){
                Object[] row = new Object[2];
                row[0] = employee.getEmployeeID();
                row[1] = employee.getEmployeeName();
                model.addRow(row);
            }
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
        jLabel4 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpComboBox = new javax.swing.JComboBox();
        pharmacyComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("Manage Pharmacy Employee");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 23, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Organization :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 96, -1, -1));

        organizationComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 93, 154, -1));

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 148, 480, 92));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Organization :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 276, -1, -1));

        organizationEmpComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationEmpComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 273, 182, -1));

        pharmacyComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pharmacyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(pharmacyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 334, 182, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Associated Pharmacy :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 337, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 417, -1, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 414, 182, -1));

        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("Create Employee");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, 39));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText(" Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 558, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Employee.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 1190, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
        
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void organizationEmpComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpComboBoxActionPerformed

    }//GEN-LAST:event_organizationEmpComboBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        Organization organization = (Organization) organizationEmpComboBox.getSelectedItem();
        Pharmacy pharmacy = (Pharmacy) pharmacyComboBox.getSelectedItem();
        String name = nameTextField.getText();
        
        Employee employee = organization.getEmployeeDirectory().createNewEmployee(name);
        employee.setPharmacy(pharmacy);
        employee.setCheck("Pharmacy");
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JComboBox organizationEmpComboBox;
    private javax.swing.JTable organizationTable;
    private javax.swing.JComboBox pharmacyComboBox;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
