/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManufacturerWorkArea;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VaccineManufacturerEnterprise;
import Business.Inventory.Inventory;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.ManufacturerRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */

public class ManageManufacturerRequestPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ManageManufactureRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    private VaccineManufacturerEnterprise vaccineManufacturesEnterprise;
    
    public ManageManufacturerRequestPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, VaccineManufacturerEnterprise vaccineManufacturesEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.vaccineManufacturesEnterprise = vaccineManufacturesEnterprise;
        
        populateManufactureTable();
    }
    
    public void populateManufactureTable() {
        DefaultTableModel dtm = (DefaultTableModel) manufacturerOrderTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : vaccineManufacturesEnterprise.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getRequestedQuantity();
            row[2] = request.getSender();
            row[3] = request.getReceiver() == null ? null : request.getReceiver();
            row[4] = request.getStatus();
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

        backButton = new javax.swing.JButton();
        manufacturerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manufacturerOrderTable = new javax.swing.JTable();
        rejectButton = new javax.swing.JButton();
        viewOrderButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 140, 40));

        manufacturerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manufacturerButton.setText("Manufacture Vaccine");
        manufacturerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerButtonActionPerformed(evt);
            }
        });
        add(manufacturerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 290, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Manufacture Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 19, -1, -1));

        manufacturerOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Type", "Requested Quantity", "Employee Name", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manufacturerOrderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 52, 810, 140));

        rejectButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rejectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove (1).jpg"))); // NOI18N
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });
        add(rejectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 150, 40));

        viewOrderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewOrderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View.jpg"))); // NOI18N
        viewOrderButton.setText("View Order");
        viewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderButtonActionPerformed(evt);
            }
        });
        add(viewOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 150, 40));

        assignButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Assign.jpg"))); // NOI18N
        assignButton.setText("Assign to me");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });
        add(assignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 170, 40));

        forwardButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forwardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ManufactureVaccine.jpg"))); // NOI18N
        forwardButton.setText("Forward to State Distributor");
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });
        add(forwardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 290, 40));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccine ID", "Disease Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 336, 810, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vaccine Doodle.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void manufacturerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerButtonActionPerformed
        int selectedRow = manufacturerOrderTable.getSelectedRow();
        if (selectedRow >= 0) {
            ManufacturerRequest manufactureRequest = (ManufacturerRequest) manufacturerOrderTable.getValueAt(selectedRow, 0);
            UserAccount userAccount = (UserAccount) manufactureRequest.getSender();
            int requestedQuantity = manufactureRequest.getRequestedQuantity();
            Enterprise ent = null;
            
            for (Network network : system.getNetworkDirectory()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprisesDirectory()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountDirectory()) {
                        if (ua == userAccount) {
                            ent = enterprise;
                        }
                    }
                }
            }
            
            for (Organization organization : ent.getOrganizationDirectory().getOrganizationDirectory()) {
                for (Inventory inventory : organization.getInventoryDirectory().getInventoryDirectory()) {
                    if (manufactureRequest.getOrderID() == inventory.getVaccine().getVaccineID()) {
                        ManufacturerVaccinePanel manufactureVaccinePanel = new ManufacturerVaccinePanel(userProcessContainer, inventory, requestedQuantity);
                        userProcessContainer.add("manufactureVaccinePanel", manufactureVaccinePanel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                    }
                }
            }
        }
    }//GEN-LAST:event_manufacturerButtonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        
        int selectedRow = manufacturerOrderTable.getSelectedRow();
        int quantity = 0;
        int orginalQuantity = 0;
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (manufacturerOrderTable.getValueAt(selectedRow, 4) == "Rejected") {
            JOptionPane.showMessageDialog(null, "This request is rejected", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (manufacturerOrderTable.getValueAt(selectedRow, 4) == "Approved") {
            JOptionPane.showMessageDialog(null, "This request is approved", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        ManufacturerRequest request = (ManufacturerRequest) manufacturerOrderTable.getValueAt(selectedRow, 0);
        if (manufacturerOrderTable.getValueAt(selectedRow, 3) == null) {
            JOptionPane.showMessageDialog(null, "This request is yet to be assigned to National Distributor", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Confirm reject?", "warning", dialogButton);
        if (result == JOptionPane.YES_OPTION) {
            UserAccount userAccount = (UserAccount) request.getSender();
            Employee employee = (Employee) userAccount.getEmployee();
            for (Order order : employee.getOrderCatalog().getOrderList()) {
                if (request.getOrderID() == order.getOrderID()) {
                    order.setOrderStatus("Order rejected by National Distributor");
                    request.setStatus("Rejected");
                    request.setManufacturerRequest("Rejected");
                    for (OrderItem oi : order.getOrderItemList()) {
                        quantity = oi.getVaccine().getAvailablity();
                        orginalQuantity = quantity + oi.getItemQuantity();
                        oi.getVaccine().setAvailablity(orginalQuantity);
                    }
                }
            }
        }
        
        populateManufactureTable();
        JOptionPane.showMessageDialog(null, "Request rejected", "Vaccine Request", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_rejectButtonActionPerformed

    private void viewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderButtonActionPerformed
        
        int selectedRow = manufacturerOrderTable.getSelectedRow();
        if (selectedRow >= 0) {
            ManufacturerRequest request = (ManufacturerRequest) manufacturerOrderTable.getValueAt(selectedRow, 0);
            DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
            dtm.setRowCount(0);
            for (Vaccine vaccine : system.getVaccineDirectory().getVaccineDirectory()) {
                if (vaccine.getVaccineID() == request.getOrderID()) {
                    Object[] row = new Object[3];
                    row[0] = vaccine;
                    row[1] = vaccine.getVaccineID();
                    row[2] = vaccine.getDiseaseName();
                    dtm.addRow(row);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_viewOrderButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        
        int selectedRow = manufacturerOrderTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (manufacturerOrderTable.getValueAt(selectedRow, 3) != null) {
            JOptionPane.showMessageDialog(null, "This request is assigned", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        ManufacturerRequest request = (ManufacturerRequest) manufacturerOrderTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        UserAccount user = (UserAccount) request.getSender();
        Employee person = (Employee) user.getEmployee();
        for (Order order : person.getOrderCatalog().getOrderList()) {
            if (request.getOrderID() == order.getOrderID()) {
                order.setOrderStatus("Waiting to be approved by National Distributor");
            }
        }
        
        populateManufactureTable();
        JOptionPane.showMessageDialog(null, "This request is assigned to " + request.getReceiver());
        
    }//GEN-LAST:event_assignButtonActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        
        int selectedRow = manufacturerOrderTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (manufacturerOrderTable.getValueAt(selectedRow, 4) == "Approved") {
            JOptionPane.showMessageDialog(null, "This request is sent to State Distributor", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (manufacturerOrderTable.getValueAt(selectedRow, 4) == "Rejected") {
            JOptionPane.showMessageDialog(null, "This request is rejected", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        ManufacturerRequest request = (ManufacturerRequest) manufacturerOrderTable.getValueAt(selectedRow, 0);
        if (manufacturerOrderTable.getValueAt(selectedRow, 3) == null) {
            JOptionPane.showMessageDialog(null, "The request is yet to be assigned to National Distributor", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        request.setStatus("Approved");
        request.setManufacturerRequest("Approved");
        UserAccount user = (UserAccount) request.getSender();
        Employee employee = (Employee) user.getEmployee();
        
        for (Order order : employee.getOrderCatalog().getOrderList()) {
            if (request.getOrderID() == order.getOrderID()) {
                order.setOrderStatus("Approved by National Distributor");
            }
        }
        
        ManufacturerRequest manufactureRequest = new ManufacturerRequest();
        manufactureRequest.setRequestType("Manufacture Vaccine Request");
        manufactureRequest.setStatus("waiting");
        manufactureRequest.setSender(request.getSender());
        manufactureRequest.setOrderID(request.getOrderID());
        manufactureRequest.setReceiver(null);
        manufactureRequest.setRequestedQuantity(request.getRequestedQuantity());
        Enterprise e = null;
        Network net = null;
        Organization org = null;
        
        for (Network network : system.getNetworkDirectory()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprisesDirectory()) {
                for (UserAccount userAccount1 : enterprise.getUserAccountDirectory().getUserAccountDirectory()) {
                    if (userAccount == userAccount1) {
                        net = network;
                        break;
                    }
                }
            }
        }
        
        for (Enterprise ent : net.getEnterpriseDirectory().getEnterprisesDirectory()) {
            if (ent instanceof VaccineManufacturerEnterprise) {
                e = ent;
                break;
            }
        }
        
        for (Organization organization: e.getOrganizationDirectory().getOrganizationDirectory()) {
            if (organization instanceof FinanceOrganization) {
                org = organization;
            }
        }
        
        if (org!= null) {
            org.getWorkQueue().getWorkRequestList().add(manufactureRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(manufactureRequest);
        }
        
        populateManufactureTable();
        
    }//GEN-LAST:event_forwardButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton forwardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton manufacturerButton;
    private javax.swing.JTable manufacturerOrderTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton rejectButton;
    private javax.swing.JButton viewOrderButton;
    // End of variables declaration//GEN-END:variables
}
