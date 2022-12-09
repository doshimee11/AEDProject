/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public abstract class Organization {
    
    private String orgnizationName;
    private int organizationID;
    private static int count = 1;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private InventoryDirectory inventoryDirectory;
    
    public enum OrganizationType{
        Admin("Admin Organization"),
        Finance("Finance Organization"),
        Inventory("Inventory Organization"),
        Order("Order Organization");
        
        private String value;
        
        private OrganizationType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public Organization(String organizationName){
        this.orgnizationName = organizationName;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        inventoryDirectory = new InventoryDirectory();
        workQueue = new WorkQueue();
        organizationID = count;
        ++count;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
}
