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
public class VaccineOrderRequestApprovalJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Ecosystem system;

    /**
     * Creates new form VaccineOrderRequestApprovalJPanel
     */
    public VaccineOrderRequestApprovalJPanel(JPanel userProcessContainer, UserAccount userAccount, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        populateVaccineOrderTable();
    }
    public void populateVaccineOrderTable(){
        DefaultTableModel dtm = (DefaultTableModel) vaccineOrderJTable.getModel();
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

        viewOrderJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        forwardJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineOrderJTable = new javax.swing.JTable();

        viewOrderJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewOrderJButton.setText("View Order");
        viewOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderJButtonActionPerformed(evt);
            }
        });

        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        forwardJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forwardJButton.setText("Forward to State Distributor");
        forwardJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardJButtonActionPerformed(evt);
            }
        });

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(orderJTable);

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Vaccine Request");

        vaccineOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(vaccineOrderJTable);

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
                                    .addComponent(backJButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(viewOrderJButton)
                                        .addGap(47, 47, 47)
                                        .addComponent(assignJButton)
                                        .addGap(36, 36, 36)
                                        .addComponent(forwardJButton)))
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
                        .addComponent(viewOrderJButton)
                        .addComponent(assignJButton)
                        .addComponent(forwardJButton))
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)
                    .addComponent(backJButton)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderJButtonActionPerformed
        int selectedRow = vaccineOrderJTable.getSelectedRow();
        if(selectedRow >= 0){
            VaccineRequest request = (VaccineRequest) vaccineOrderJTable.getValueAt(selectedRow, 0);
            DefaultTableModel dtm = (DefaultTableModel) orderJTable.getModel();
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
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_viewOrderJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = vaccineOrderJTable.getSelectedRow();

        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(vaccineOrderJTable.getValueAt(selectedRow, 3) != null){
            JOptionPane.showMessageDialog(null, "The request is already assigned", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        VaccineRequest request = (VaccineRequest) vaccineOrderJTable.getValueAt(selectedRow, 0);
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
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void forwardJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardJButtonActionPerformed
        int selectedRow = vaccineOrderJTable.getSelectedRow();

        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(vaccineOrderJTable.getValueAt(selectedRow, 4) == "Approved"){
            JOptionPane.showMessageDialog(null, "The request is already sent to State Distributor", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(vaccineOrderJTable.getValueAt(selectedRow, 4) == "Rejected"){
            JOptionPane.showMessageDialog(null, "The request is already rejected", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        VaccineRequest request = (VaccineRequest) vaccineOrderJTable.getValueAt(selectedRow, 0);
        if(vaccineOrderJTable.getValueAt(selectedRow, 3) == null){
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
        } else if(employee.getCheck().equalsIgnoreCase("Pharmacy")){
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
    }//GEN-LAST:event_forwardJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton forwardJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderJTable;
    private javax.swing.JTable vaccineOrderJTable;
    private javax.swing.JButton viewOrderJButton;
    // End of variables declaration//GEN-END:variables
}
