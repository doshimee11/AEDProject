/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui.HospitalWorkArea;

import Business.Order.Order;
import Business.Order.OrderItem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */

public class ViewHospitalOrderPanel extends javax.swing.JPanel {
    
    /**
    * Creates new form ViewHospitalJPanel
    */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    public ViewHospitalOrderPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        
        populateOrderTable();
    }
    
    public void populateOrderTable(){
        DefaultTableModel dtm = (DefaultTableModel) orderIDTable.getModel();
        dtm.setRowCount(0);
        for(Order order : userAccount.getEmployee().getOrderCatalog().getOrderList()){
            if(userAccount.getEmployee().getCheck().equalsIgnoreCase("Hospital")){
                Object[] row = new Object[2];
                row[0] = order.getOrderID();
                row[1] = order.getOrderStatus();
                dtm.addRow(row);
            }
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderIDTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        titleJLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderIDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderIDTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 327, -1, 154));

        viewButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 507, 140, 42));

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(vaccineTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 567, -1, 175));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleJLabel.setText("View Hospital Order History");
        add(titleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 258, -1, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 812, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BluePlain-4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -3, 1200, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        
        int selectedRow = orderIDTable.getSelectedRow();
        if(selectedRow >= 0){
            int orderId = (Integer) orderIDTable.getValueAt(selectedRow, 0);
            DefaultTableModel dtm = (DefaultTableModel) vaccineTable.getModel();
            dtm.setRowCount(0);
            Order orderI = null;
            for(Order order : userAccount.getEmployee().getOrderCatalog().getOrderList()){
                if(orderId == order.getOrderID()){
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
            JOptionPane.showMessageDialog(null, "Please select a row first", "View Order", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderIDTable;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JTable vaccineTable;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
