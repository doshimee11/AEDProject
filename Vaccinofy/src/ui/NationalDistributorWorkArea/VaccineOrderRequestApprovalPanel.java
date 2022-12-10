/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.NationalDistributorWorkArea;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VaccineRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */

public class VaccineOrderRequestApprovalPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form VaccineOrderRequestApprovalJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Ecosystem system;
    
    public VaccineOrderRequestApprovalPanel(JPanel userProcessContainer, UserAccount userAccount, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        
        populateVaccineOrderTable();
    }
    
    public void populateVaccineOrderTable(){
        DefaultTableModel dtm = (DefaultTableModel) vaccineOrderTable.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request : system.getNationalDistributor().getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            if(request.getRequestType().equalsIgnoreCase("Hospital Vaccine request")){
                row[1] = request.getSender().getEmployee().getHospital().getHospitalName();
            } else if(request.getRequestType().equalsIgnoreCase("Pharmacy Vaccine request")){
                row[1] = request.getSender().getEmployee().getPharmacy().getPharmacyName();
            }
            row[2] = request.getSender();
            row[3] = request.getReceiver() == null? null : request.getReceiver();
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

        viewOrderButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineOrderTable = new javax.swing.JTable();

        viewOrderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewOrderButton.setText("View Order");
        viewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderButtonActionPerformed(evt);
            }
        });

        assignButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignButton.setText("Assign to me");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        forwardButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forwardButton.setText("Forward to State Distributor");
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Vaccine Request");

        vaccineOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Type", "Provider Name", "Employee Name", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccineOrderTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(264, 264, 264)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewOrderButton)
                                        .addGap(47, 47, 47)
                                        .addComponent(assignButton)
                                        .addGap(36, 36, 36)
                                        .addComponent(forwardButton)))
                                .addGap(87, 87, 87)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(jLabel1)))
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewOrderButton)
                        .addComponent(assignButton)
                        .addComponent(forwardButton))
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)
                    .addComponent(backButton)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderButtonActionPerformed
        
        int selectedRow = vaccineOrderTable.getSelectedRow();
        if(selectedRow >= 0){
            VaccineRequest request = (VaccineRequest) vaccineOrderTable.getValueAt(selectedRow, 0);
            DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
            dtm.setRowCount(0);
            
            UserAccount userAccount = (UserAccount) request.getSender();
            Employee employee = (Employee) userAccount.getEmployee();
            Order orderI = null;
            
            for(Order order : employee.getOrderCatalog().getOrderList()){
                if(request.getOrderID() == order.getOrderID()){
                    orderI = order;
                }
            }
            
            for(OrderItem orderItem : orderI.getOrderItemList()){
                Object[] row = new Object[2];
                row[0] = orderItem;
                row[1] = orderItem.getItemQuantity();
                dtm.addRow(row);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_viewOrderButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        
        int selectedRow = vaccineOrderTable.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(vaccineOrderTable.getValueAt(selectedRow, 3) != null){
            JOptionPane.showMessageDialog(null, "The request is already assigned", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        VaccineRequest request = (VaccineRequest) vaccineOrderTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        UserAccount user = (UserAccount) request.getSender();
        Employee person = (Employee) user.getEmployee();
        
        for(Order order : person.getOrderCatalog().getOrderList()){
            if(request.getOrderID() == order.getOrderID()){
                order.setOrderStatus("Waiting to be approved by National Distributor");
            }
        }
        
        populateVaccineOrderTable();
        
        JOptionPane.showMessageDialog(null, "The request is assigned to " + request.getReceiver());
        
    }//GEN-LAST:event_assignButtonActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        
        int selectedRow = vaccineOrderTable.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(vaccineOrderTable.getValueAt(selectedRow, 4) == "Approved"){
            JOptionPane.showMessageDialog(null, "The request is already sent to State Distributor", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(vaccineOrderTable.getValueAt(selectedRow, 4) == "Rejected"){
            JOptionPane.showMessageDialog(null, "The request is already rejected", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        VaccineRequest request = (VaccineRequest) vaccineOrderTable.getValueAt(selectedRow, 0);
        if(vaccineOrderTable.getValueAt(selectedRow, 3) == null){
            JOptionPane.showMessageDialog(null, "The request is yet to be assigned to National Distributor", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        request.setStatus("Approved");
        request.setVaccineRequest("Approved");
        UserAccount user = (UserAccount) request.getSender();
        Employee employee = (Employee) user.getEmployee();
        
        for(Order order : employee.getOrderCatalog().getOrderList()){
            if(request.getOrderID() == order.getOrderID()){
                order.setOrderStatus("Approved by National Distributor");
            }
        }
        
        VaccineRequest vaccineRequest = new VaccineRequest();
        if(employee.getCheck().equalsIgnoreCase("Hospital")){
            vaccineRequest.setRequestType("Hospital Vaccine Request");
        }
        else if(employee.getCheck().equalsIgnoreCase("Pharmacy")){
            vaccineRequest.setRequestType("Pharmacy Vaccine Request");
        }
        
        vaccineRequest.setStatus("waiting");
        vaccineRequest.setSender(request.getSender());
        vaccineRequest.setOrderID(request.getOrderID());
        vaccineRequest.setReceiver(null);
        Enterprise e = null;
        Network net = null;
        
        for(Network network : system.getNetworkDirectory()){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterprisesDirectory()){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationDirectory()){
                    for(UserAccount userAccount1 : organization.getUserAccountDirectory().getUserAccountDirectory()){
                        if(user == userAccount1){
                            net = network;
                            break;
                        }
                    }
                }
            }
        }
        
        for(Enterprise ent : net.getEnterpriseDirectory().getEnterprisesDirectory()){
            if(ent instanceof DistributorEnterprise){
                e = ent;
                break;
            }
        }
        
        if(e != null){
            e.getWorkQueue().getWorkRequestList().add(vaccineRequest);
            user.getWorkQueue().getWorkRequestList().add(vaccineRequest);
        }
        
        populateVaccineOrderTable();
        
    }//GEN-LAST:event_forwardButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton forwardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable vaccineOrderTable;
    private javax.swing.JButton viewOrderButton;
    // End of variables declaration//GEN-END:variables
}