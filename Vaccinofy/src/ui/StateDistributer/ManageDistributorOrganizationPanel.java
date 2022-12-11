/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.StateDistributer;

import Business.Employee.Employee;
import Business.Enterprise.DistributorEnterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meetdoshi
 */

public class ManageDistributorOrganizationPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManageDistributerOrganizationJPanel
     */
    
    private JPanel userProcessContainer;
    private DistributorEnterprise distributorEnterprise;
    
    public ManageDistributorOrganizationPanel(JPanel userProcessContainer, DistributorEnterprise distributorEnterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.distributorEnterprise = distributorEnterprise;
        
        populateTable();
        popOrganizationComboBox();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) userAccountTable.getModel();
        model.setRowCount(0);
        
        for(Organization organization : distributorEnterprise.getOrganizationDirectory().getOrganizationDirectory()){
            for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountDirectory()){
                Object[] row = new Object[2];
                row[0] = userAccount.getUserAccUserName();
                row[1] = userAccount.getRole();
                model.addRow(row);
            }
        }
    }
    
    public void popOrganizationComboBox() {
        organizationComboBox.removeAllItems();
        distributorEnterprise.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Finance);
        organizationComboBox.removeAllItems();
        for (Organization org : distributorEnterprise.getOrganizationDirectory().getOrganizationDirectory()){
            organizationComboBox.addItem(org);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            if(role.toString().contains("Distributor"))
            roleComboBox.addItem(role);
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

        jPanel1 = new javax.swing.JPanel();
        organizationComboBox = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        roleComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userAccountTable = new javax.swing.JTable();
        passwordPasswordField = new javax.swing.JPasswordField();
        userNameJLabel = new javax.swing.JLabel();
        enterpriseJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        enterpriseRoleJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Distributor Organization");

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        roleComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        userAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userAccountTable);

        passwordPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        userNameJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameJLabel.setText("Username :");

        enterpriseJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseJLabel.setText("Organization :");

        passwordJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordJLabel.setText("Password :");

        enterpriseRoleJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseRoleJLabel.setText("Organization Role :");

        nameJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameJLabel.setText("Employee Name :");

        userNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(enterpriseJLabel)
                                .addGap(139, 139, 139)
                                .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(enterpriseRoleJLabel)
                                .addGap(99, 99, 99)
                                .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(userNameJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(nameJLabel)))
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(257, 396, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)))
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(268, 268, 268))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJLabel)
                    .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterpriseRoleJLabel)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJLabel)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 187, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Employee.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        String userName = userNameTextField.getText();
        String password = String.valueOf(passwordPasswordField.getPassword());
        String empName = nameTextField.getText();
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        Role role = (Role) roleComboBox.getSelectedItem();
        Employee employee = distributorEnterprise.getEmployeeDirectory().createNewEmployee(empName);
        organization.getUserAccountDirectory().createNewUserAccount(userName, password, employee, role);
        
        populateTable();
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JLabel enterpriseRoleJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable userAccountTable;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
