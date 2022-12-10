/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VaccineManufacturesEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ManufacturerWorkArea.ManufactureFinanceWorkAreaJPanel;

/**
 *
 * @author meetdoshi
 */

public class ManufacturerFinanceRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system) {
        return new ManufactureFinanceWorkAreaJPanel(userProcessContainer, system, account, (VaccineManufacturesEnterprise)enterprise);
    }
    
}
