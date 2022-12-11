/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManufacturerWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.VaccineManufacturerEnterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */

public class ManageManufacturerOrganizationPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManageManufactureOrganizationJPanel
     */
    
    private JPanel userProcessContainer;
    private VaccineManufacturerEnterprise vaccineManufacturesEnterprise;
    
    public ManageManufacturerOrganizationPanel(JPanel userProcessContainer, VaccineManufacturerEnterprise vaccineManufacturesEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.vaccineManufacturesEnterprise = vaccineManufacturesEnterprise;
        
        populateTable();
        popOrganizationComboBox();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) userAccountTable.getModel();
        model.setRowCount(0);
        for(Organization organization : vaccineManufacturesEnterprise.getOrganizationDirectory().getOrganizationDirectory()){
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
        vaccineManufacturesEnterprise.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Finance);
        organizationComboBox.removeAllItems();
        for (Organization org : vaccineManufacturesEnterprise.getOrganizationDirectory().getOrganizationDirectory()){
            organizationComboBox.addItem(org);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            if(role.toString().contains("Manufacturer")){
                roleComboBox.addItem(role);
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

        userNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userNameLabel1 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        passwordPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        userAccountTable1 = new javax.swing.JTable();
        roleComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        submitButton1 = new javax.swing.JButton();
        nameTextField1 = new javax.swing.JTextField();
        userNameTextField1 = new javax.swing.JTextField();
        organizationComboBox1 = new javax.swing.JComboBox();
        nameLabel1 = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        enterpriseRoleLabel1 = new javax.swing.JLabel();
        backButton1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userAccountTable = new javax.swing.JTable();
        roleComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        organizationComboBox = new javax.swing.JComboBox();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        enterpriseRoleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameLabel.setText("Username :");
        add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 571, -1, -1));

        userNameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameLabel1.setText("Username :");

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseLabel1.setText("Organization :");

        passwordPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        userAccountTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(userAccountTable1);

        roleComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roleComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Manage Manufacture Organization");

        submitButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton1.setText("Submit");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        nameTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        userNameTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        organizationComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBox1ActionPerformed(evt);
            }
        });

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel1.setText("Employee Name :");

        passwordLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLabel1.setText("Password :");

        enterpriseRoleLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseRoleLabel1.setText("Organization Role :");

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1203, 1203, 1203)
                .addComponent(backButton1)
                .addContainerGap(723, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(374, 374, 374)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel1)
                                        .addGap(139, 139, 139)
                                        .addComponent(organizationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(enterpriseRoleLabel1)
                                        .addGap(99, 99, 99)
                                        .addComponent(roleComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(passwordLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(userNameLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(nameLabel1)))
                                        .addGap(107, 107, 107)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(passwordPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(153, 153, 153)))
                    .addContainerGap(1198, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(847, Short.MAX_VALUE)
                .addComponent(backButton1)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel1)
                        .addComponent(organizationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enterpriseRoleLabel1)
                        .addComponent(roleComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userNameLabel1)
                        .addComponent(userNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLabel1)
                        .addComponent(passwordPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel1)
                        .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseLabel.setText("Organization :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 479, -1, -1));

        passwordPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(passwordPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 614, 140, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 277, -1, 168));

        roleComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 522, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Manufacture Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 230, -1, -1));

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 727, 121, 43));

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 140, -1));

        userNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 568, 140, -1));

        organizationComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 476, 140, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setText("Employee Name :");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 663, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLabel.setText("Password :");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 617, -1, -1));

        enterpriseRoleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseRoleLabel.setText("Organization Role :");
        add(enterpriseRoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 528, -1, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("<< back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 844, -1, -1));

        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 176, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        String userName = userNameTextField.getText();
        String password = String.valueOf(passwordPasswordField.getPassword());
        String empName = nameTextField.getText();
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        Role role = (Role) roleComboBox.getSelectedItem();
        Employee employee = vaccineManufacturesEnterprise.getEmployeeDirectory().createNewEmployee(empName);
        organization.getUserAccountDirectory().createNewUserAccount(userName, password, employee, role);

        populateTable();
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null){
            populateRoleComboBox(organization);
        }
        
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButton1ActionPerformed

    private void organizationComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationComboBox1ActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseRoleLabel;
    private javax.swing.JLabel enterpriseRoleLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JComboBox organizationComboBox1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JPasswordField passwordPasswordField1;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JComboBox roleComboBox1;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitButton1;
    private javax.swing.JTable userAccountTable;
    private javax.swing.JTable userAccountTable1;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JTextField userNameTextField1;
    // End of variables declaration//GEN-END:variables
}
