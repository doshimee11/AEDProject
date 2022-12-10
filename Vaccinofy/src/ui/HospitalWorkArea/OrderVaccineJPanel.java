/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalWorkArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ProviderEnterprise;
import Business.Enterprise.PublicHealthEnterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.OrderOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.VaccineRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class OrderVaccineJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    private OrderOrganization orderOrganization;
    private Order order;
    private ProviderEnterprise providerEnterprise;
    private Boolean isCheckOut = false;

    /**
     * Creates new form OrderVaccineJPanel
     */
    public OrderVaccineJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, OrderOrganization orderOrganization, ProviderEnterprise providerEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.orderOrganization = orderOrganization;
        this.providerEnterprise = providerEnterprise;
        if(!isCheckOut){
        order = new Order();
        }
        populateVaccineTable();
    }
    private void populateVaccineTable() {
        DefaultTableModel dtm = (DefaultTableModel) vaccineJTable.getModel();
        dtm.setRowCount(0);
        for (Vaccine vaccine : system.getVaccineDirectory().getVaccineDirectory()){
            Object row[] = new Object[3];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineID();
            row[2] = vaccine.getDiseaseName();
            dtm.addRow(row);
        }
        
    }
    
    private void populateOrderItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderItemJTable.getModel();
        dtm.setRowCount(0);
        for(OrderItem oi : order.getOrderItemList()){
            Object row[] = new Object[2];
            row[0] = oi;
            row[1] = oi.getItemQuantity();
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

        changeQuantityJTextField = new javax.swing.JTextField();
        modifyQuantityJButton = new javax.swing.JButton();
        viewVaccineJButton = new javax.swing.JButton();
        viewOrderDetailsJButton = new javax.swing.JButton();
        removeItemJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineJTable = new javax.swing.JTable();
        checkOutJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        spnQuantitySpinner = new javax.swing.JSpinner();
        addToOrderJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemJTable = new javax.swing.JTable();

        changeQuantityJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        changeQuantityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeQuantityJTextFieldActionPerformed(evt);
            }
        });

        modifyQuantityJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modifyQuantityJButton.setText("Modify Quantity");
        modifyQuantityJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQuantityJButtonActionPerformed(evt);
            }
        });

        viewVaccineJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewVaccineJButton.setText("View Vaccine Details");
        viewVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineJButtonActionPerformed(evt);
            }
        });

        viewOrderDetailsJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewOrderDetailsJButton.setText("View Order Details");
        viewOrderDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderDetailsJButtonActionPerformed(evt);
            }
        });

        removeItemJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removeItemJButton.setText("Remove Item");
        removeItemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemJButtonActionPerformed(evt);
            }
        });

        vaccineJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(vaccineJTable);

        checkOutJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkOutJButton.setText("Check Out");
        checkOutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        spnQuantitySpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addToOrderJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addToOrderJButton.setText("Add to Order List");
        addToOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderJButtonActionPerformed(evt);
            }
        });

        orderItemJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(orderItemJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backJButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(viewVaccineJButton)
                                    .addGap(53, 53, 53)
                                    .addComponent(spnQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(addToOrderJButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(viewOrderDetailsJButton)
                                    .addGap(62, 62, 62)
                                    .addComponent(changeQuantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(modifyQuantityJButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(200, 200, 200)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(removeItemJButton)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(checkOutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(91, 91, 91))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(268, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnQuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewVaccineJButton)
                        .addComponent(addToOrderJButton))
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changeQuantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewOrderDetailsJButton)
                        .addComponent(modifyQuantityJButton))
                    .addGap(35, 35, 35)
                    .addComponent(removeItemJButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(checkOutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(backJButton)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeQuantityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeQuantityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeQuantityJTextFieldActionPerformed

    private void modifyQuantityJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQuantityJButtonActionPerformed
        int selectedrow = orderItemJTable.getSelectedRow();
        if (selectedrow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first", "Modify Quantity", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String changeQuantity = changeQuantityJTextField.getText();

        if(changeQuantity.trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Please enter the quantity to be modified", "Modify quantity", JOptionPane.WARNING_MESSAGE);
            return;
        }

        OrderItem orderItem = (OrderItem) orderItemJTable.getValueAt(selectedrow, 0);
        int modQuantity = Integer.parseInt(changeQuantityJTextField.getText());

        if (modQuantity > orderItem.getItemQuantity() + orderItem.getVaccine().getAvailablity() || modQuantity <= 0){
            JOptionPane.showMessageDialog(null, "Quantity is bad");
            return;
        }

        int oldAvailablity = orderItem.getVaccine().getAvailablity();
        int oldItemQuantity = orderItem.getItemQuantity();

        //        orderItem.getVaccine().setAvailablity(oldAvailablity + oldQuantity - modQuantity);
        orderItem.setItemQuantity(modQuantity);

        populateVaccineTable();
        populateOrderItemTable();
        changeQuantityJTextField.setText(null);
    }//GEN-LAST:event_modifyQuantityJButtonActionPerformed

    private void viewVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineJButtonActionPerformed
        int selectedRow = vaccineJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row !" , "Browse Product", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Vaccine vaccine = (Vaccine) vaccineJTable.getValueAt(selectedRow, 0);
        ViewVaccineDetailsJPanel vpj = new ViewVaccineDetailsJPanel(userProcessContainer, vaccine);
        userProcessContainer.add("ViewVaccineDetailsJPanel", vpj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVaccineJButtonActionPerformed

    private void viewOrderDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderDetailsJButtonActionPerformed
        int selectedRow = orderItemJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "Browse Product", JOptionPane.WARNING_MESSAGE);
            return;
        }

        OrderItem orderItem = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);
        ViewOrderItemJPanel voj = new ViewOrderItemJPanel(userProcessContainer, orderItem);
        userProcessContainer.add("ViewOrderItem", voj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewOrderDetailsJButtonActionPerformed

    private void removeItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemJButtonActionPerformed
        int selectedRow = orderItemJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a row", "Browse Product", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItem orderItem = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Are you sure if you want to delete?", "warning", dialogButton);
        if(result == JOptionPane.YES_OPTION){
            order.removeOrderItem(orderItem);
            int newAvailablity = orderItem.getItemQuantity() + orderItem.getVaccine().getAvailablity();
            //            orderItem.getVaccine().setAvailablity(newAvailablity);
        }
        populateVaccineTable();
        populateOrderItemTable();
    }//GEN-LAST:event_removeItemJButtonActionPerformed

    private void checkOutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) orderItemJTable.getModel();
        if(dtm.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No item in chart to checkout", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order ord = userAccount.getEmployee().getOrderCatalog().addNewOrder(order);
        if(ord != null){
            JOptionPane.showMessageDialog(null, "You have successfully checked out");
        } else {
            JOptionPane.showMessageDialog(null, "There is an error processing yoour order");
        }
        VaccineRequest request = new VaccineRequest();
        if(userAccount.getEmployee().getCheck().equalsIgnoreCase("Hospital")){
            request.setRequestType("Hospital Vaccine request");
        } else if(userAccount.getEmployee().getCheck().equalsIgnoreCase("Pharmacy")){
            request.setRequestType("Pharmacy Vaccine request");
        }
        request.setStatus("Sent");
        request.setSender(userAccount);
        request.setOrderID(order.getOrderID());
        order.setOrderStatus("Processing");
        Enterprise enterprise = null;
        Network net = null;
        for(Network network : system.getNetworkDirectory()){
            for(Enterprise ent : network.getEnterpriseDirectory().getEnterprisesDirectory()){
                if(ent == providerEnterprise){
                    net = network;
                }
            }
        }
        for(Enterprise ent : net.getEnterpriseDirectory().getEnterprisesDirectory()){
            if(ent instanceof PublicHealthEnterprise){
                enterprise = ent;
                break;
            }
        }
        if(enterprise!=null){
            enterprise.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        isCheckOut = true;
        order = new Order();
        populateVaccineTable();
        populateOrderItemTable();
    }//GEN-LAST:event_checkOutJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        if (isCheckOut == false) {
            for (OrderItem orderItem : order.getOrderItemList()) {
                orderItem.getVaccine().setAvailablity(orderItem.getItemQuantity() + orderItem.getVaccine().getAvailablity());
            }
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addToOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = vaccineJTable.getSelectedRow();
        int quantity = (Integer) spnQuantitySpinner.getValue();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Vaccine vaccine = (Vaccine) vaccineJTable.getValueAt(selectedRow, 0);

        Boolean isIncluded = false;
        for(OrderItem oi : order.getOrderItemList()){
            if(oi.getVaccine().getVaccineName().equals(vaccine.getVaccineName())){
                int oldQuantity = oi.getItemQuantity();
                int newQuantity = (Integer) spnQuantitySpinner.getValue();
                int availablity = vaccine.getAvailablity();
                int total_Quantity = oldQuantity + newQuantity;
                oi.setItemQuantity(total_Quantity);
                int new_Availablity = vaccine.getAvailablity() - newQuantity;
                //                vaccine.setAvailablity(new_Availablity);
                isIncluded = true;
            }
        }
        if(!isIncluded){
            OrderItem orderItem = order.addOrderItem();
            orderItem.setVaccine(vaccine);
            int quantity_NotIncluded = (Integer) spnQuantitySpinner.getValue();
            orderItem.setItemQuantity(quantity_NotIncluded);
            int new_availablity = vaccine.getAvailablity() - quantity_NotIncluded;
            //            vaccine.setAvailablity(new_availablity);
        }

        populateVaccineTable();
        populateOrderItemTable();
    }//GEN-LAST:event_addToOrderJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToOrderJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField changeQuantityJTextField;
    private javax.swing.JButton checkOutJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyQuantityJButton;
    private javax.swing.JTable orderItemJTable;
    private javax.swing.JButton removeItemJButton;
    private javax.swing.JSpinner spnQuantitySpinner;
    private javax.swing.JTable vaccineJTable;
    private javax.swing.JButton viewOrderDetailsJButton;
    private javax.swing.JButton viewVaccineJButton;
    // End of variables declaration//GEN-END:variables
}
