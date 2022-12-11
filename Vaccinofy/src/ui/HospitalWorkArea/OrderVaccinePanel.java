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

public class OrderVaccinePanel extends javax.swing.JPanel {
    
    /**
     * Creates new form OrderVaccineJPanel
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private UserAccount userAccount;
    private OrderOrganization orderOrganization;
    private Order order;
    private ProviderEnterprise providerEnterprise;
    private Boolean isCheckOut = false;
    
    public OrderVaccinePanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, OrderOrganization orderOrganization, ProviderEnterprise providerEnterprise) {
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
        DefaultTableModel dtm = (DefaultTableModel) vaccineTable.getModel();
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
        DefaultTableModel dtm = (DefaultTableModel) orderItemTable.getModel();
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

        changeQuantityTextField = new javax.swing.JTextField();
        modifyQuantityButton = new javax.swing.JButton();
        viewVaccineButton = new javax.swing.JButton();
        viewOrderDetailsButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        checkOutButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        spnQuantitySpinner = new javax.swing.JSpinner();
        addToOrderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changeQuantityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        changeQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeQuantityTextFieldActionPerformed(evt);
            }
        });
        add(changeQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, 50));

        modifyQuantityButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modifyQuantityButton.setText("Modify Quantity");
        modifyQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQuantityButtonActionPerformed(evt);
            }
        });
        add(modifyQuantityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 609, 220, 50));

        viewVaccineButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewVaccineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View.jpg"))); // NOI18N
        viewVaccineButton.setText("View Vaccine Details");
        viewVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineButtonActionPerformed(evt);
            }
        });
        add(viewVaccineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 279, 250, 50));

        viewOrderDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewOrderDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewOrder (3).png"))); // NOI18N
        viewOrderDetailsButton.setText("View Order Details");
        viewOrderDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderDetailsButtonActionPerformed(evt);
            }
        });
        add(viewOrderDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 609, 230, 50));

        removeItemButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removeItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove (1).jpg"))); // NOI18N
        removeItemButton.setText("Remove Item");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });
        add(removeItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 699, 190, 50));

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(vaccineTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 665, 141));

        checkOutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Checkout (1).jpg"))); // NOI18N
        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });
        add(checkOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 699, 200, 50));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.jpg"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 810, 120, 40));

        spnQuantitySpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(spnQuantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 80, 50));

        addToOrderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addToOrderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewOrder (3).png"))); // NOI18N
        addToOrderButton.setText("Add to Order List");
        addToOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderButtonActionPerformed(evt);
            }
        });
        add(addToOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 279, 230, 50));

        orderItemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(orderItemTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 392, 665, 195));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Order Vaccine");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 22, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BluePlain-4.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 1200));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 1220));
    }// </editor-fold>//GEN-END:initComponents

    private void changeQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeQuantityTextFieldActionPerformed

    private void modifyQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQuantityButtonActionPerformed
        try{
            int selectedrow = orderItemTable.getSelectedRow();
            if (selectedrow < 0){
                JOptionPane.showMessageDialog(null, "Select a row first", "Modify Quantity", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String changeQuantity = changeQuantityTextField.getText();
            if(changeQuantity.trim().length() == 0){
                JOptionPane.showMessageDialog(null, "Enter the quantity to be modified", "Modify quantity", JOptionPane.WARNING_MESSAGE);
                return;
            }

            OrderItem orderItem = (OrderItem) orderItemTable.getValueAt(selectedrow, 0);
            int modQuantity = Integer.parseInt(changeQuantityTextField.getText());
            if (modQuantity > orderItem.getItemQuantity() + orderItem.getVaccine().getAvailablity() || modQuantity <= 0){
                JOptionPane.showMessageDialog(null, "Quantity is bad");
                return;
            }

            int oldAvailablity = orderItem.getVaccine().getAvailablity();
            int oldItemQuantity = orderItem.getItemQuantity();

            orderItem.setItemQuantity(modQuantity);

            populateVaccineTable();
            populateOrderItemTable();
            changeQuantityTextField.setText(null);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_modifyQuantityButtonActionPerformed

    private void viewVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineButtonActionPerformed
        try{
            int selectedRow = vaccineTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row " , "Browse Product", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            Vaccine vaccine = (Vaccine) vaccineTable.getValueAt(selectedRow, 0);
            ViewVaccineDetailsPanel vpj = new ViewVaccineDetailsPanel(userProcessContainer, vaccine);
            userProcessContainer.add("ViewVaccineDetailsPanel", vpj);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_viewVaccineButtonActionPerformed

    private void viewOrderDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderDetailsButtonActionPerformed
        try{
            int selectedRow = orderItemTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row", "Browse Product", JOptionPane.WARNING_MESSAGE);
                return;
            }

            OrderItem orderItem = (OrderItem) orderItemTable.getValueAt(selectedRow, 0);
            ViewOrderItemPanel voj = new ViewOrderItemPanel(userProcessContainer, orderItem);
            userProcessContainer.add("ViewOrderItem", voj);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_viewOrderDetailsButtonActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        try{
            int selectedRow = orderItemTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row", "Browse Product", JOptionPane.WARNING_MESSAGE);
                return;
            }

            OrderItem orderItem = (OrderItem) orderItemTable.getValueAt(selectedRow, 0);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Confirm delete?", "warning", dialogButton);
            if(result == JOptionPane.YES_OPTION){
                order.removeOrderItem(orderItem);
                int newAvailablity = orderItem.getItemQuantity() + orderItem.getVaccine().getAvailablity();
            }

            populateVaccineTable();
            populateOrderItemTable();
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel dtm = (DefaultTableModel) orderItemTable.getModel();
            if(dtm.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "No item in chart", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            Order ord = userAccount.getEmployee().getOrderCatalog().addNewOrder(order);
            if(ord != null){
                JOptionPane.showMessageDialog(null, "You have successfully checked out");
            }
            else {
                JOptionPane.showMessageDialog(null, "There is an error processing the order");
            }
            
            VaccineRequest request = new VaccineRequest();
            if(userAccount.getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                request.setRequestType("Hospital Vaccine request");
            }
            else if(userAccount.getEmployee().getCheck().equalsIgnoreCase("Pharmacy")){
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
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try{
            if (isCheckOut == false) {
                for (OrderItem orderItem : order.getOrderItemList()) {
                    orderItem.getVaccine().setAvailablity(orderItem.getItemQuantity() + orderItem.getVaccine().getAvailablity());
                }
            }

            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void addToOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderButtonActionPerformed
        // TODO add your handling code here:
        try{
            int selectedRow = vaccineTable.getSelectedRow();
            int quantity = (Integer) spnQuantitySpinner.getValue();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a row");
                return;
            }

            Vaccine vaccine = (Vaccine) vaccineTable.getValueAt(selectedRow, 0);
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
            }

            populateVaccineTable();
            populateOrderItemTable();
        }
        catch(Exception e){
            System.out.println("Exception executed" + e);
        }
    }//GEN-LAST:event_addToOrderButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToOrderButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField changeQuantityTextField;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyQuantityButton;
    private javax.swing.JTable orderItemTable;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JSpinner spnQuantitySpinner;
    private javax.swing.JTable vaccineTable;
    private javax.swing.JButton viewOrderDetailsButton;
    private javax.swing.JButton viewVaccineButton;
    // End of variables declaration//GEN-END:variables
}
