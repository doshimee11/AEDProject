/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.SystemAdminWorkArea;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meetdoshi
 */

public class ManageEnterpriseAdminPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    
    public ManageEnterpriseAdminPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateTable();
        populateNetworkComboBox();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminTable.getModel();
        model.setRowCount(0);
        for (Network network : system.getNetworkDirectory()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprisesDirectory()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountDirectory()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getOrgnizationName();
                    row[1] = network.getNetworkName();
                    row[2] = userAccount.getUserAccUserName();
                    
                    model.addRow(row);
                }
            }
        }
    }
    
    private void populateNetworkComboBox(){
        networkComboBox.removeAllItems();
        for (Network network : system.getNetworkDirectory()){
            networkComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprisesDirectory()){
            enterpriseComboBox.addItem(enterprise);
        }
        
    }
    
    private void populateEnterpriseRoleComboBox(Enterprise enterprise){
        enterpriseRoleComboBox.removeAllItems();
        for(Role role : enterprise.getSupportedRole()){
            enterpriseRoleComboBox.addItem(role);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseAdminTable = new javax.swing.JTable();
        networkJLabel = new javax.swing.JLabel();
        enterpriseJLabel = new javax.swing.JLabel();
        enterpriseRoleJLabel = new javax.swing.JLabel();
        userNameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        enterpriseComboBox = new javax.swing.JComboBox();
        userNameTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        enterpriseRoleComboBox = new javax.swing.JComboBox();
        passwordPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Enterprise Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 25, -1, -1));

        enterpriseAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminTable);
        if (enterpriseAdminTable.getColumnModel().getColumnCount() > 0) {
            enterpriseAdminTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseAdminTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseAdminTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 72, -1, 168));

        networkJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        networkJLabel.setText("Network :");
        add(networkJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 269, -1, -1));

        enterpriseJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseJLabel.setText("Enterprise :");
        add(enterpriseJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 315, -1, -1));

        enterpriseRoleJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseRoleJLabel.setText("Enterprise Role :");
        add(enterpriseRoleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 364, -1, -1));

        userNameJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameJLabel.setText("Username :");
        add(userNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 407, -1, -1));

        passwordJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordJLabel.setText("Password :");
        add(passwordJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 453, -1, -1));

        nameJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameJLabel.setText("Name :");
        add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 499, -1, -1));

        networkComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 266, 140, -1));

        enterpriseComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 312, 140, -1));

        userNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 404, 140, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 496, 136, -1));

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Submit.jpg"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 571, 121, 43));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 626, 110, 40));

        enterpriseRoleComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseRoleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 358, 140, -1));

        passwordPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(passwordPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 450, 140, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BluePlain-4.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 840, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        Enterprise enterprise = (Enterprise) enterpriseComboBox.getSelectedItem();
        
        String username = userNameTextField.getText();
        String password = String.valueOf(passwordPasswordField.getPassword());
        String name = nameTextField.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createNewEmployee(name);
        Role role = (Role) enterpriseRoleComboBox.getSelectedItem();
        
        UserAccount account = enterprise.getUserAccountDirectory().createNewUserAccount(username, password, employee, role);
        populateTable();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void enterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseComboBoxActionPerformed
        Enterprise enterprise = (Enterprise) enterpriseComboBox.getSelectedItem();
        if(enterprise != null){
            populateEnterpriseRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_enterpriseComboBoxActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        Network network = (Network) networkComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable enterpriseAdminTable;
    private javax.swing.JComboBox enterpriseComboBox;
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JComboBox enterpriseRoleComboBox;
    private javax.swing.JLabel enterpriseRoleJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel networkJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
