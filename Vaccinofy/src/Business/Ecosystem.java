/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author meetdoshi
 */

public class Ecosystem extends Organization {
    
    private static Ecosystem ecoSystem;
    private ArrayList<Network> networkDirectory;
    private VaccineDirectory vaccineDirectory;
    private InventoryDirectory inventoryDirectory;
    private NationalDistributor nationalDistributor;
    
    public static Ecosystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new Ecosystem();
        }
        return ecoSystem;
    }
    
    private Ecosystem(){
        super(null);
        networkDirectory = new ArrayList<>();
        vaccineDirectory = new VaccineDirectory();
        inventoryDirectory = new InventoryDirectory();
        nationalDistributor = new NationalDistributor();
    }
    
    public Network createNetwork(String networkName){
        Network network = new Network();
        network.setNetworkName(networkName);
        networkDirectory.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SysAdminRole());
        return roles;
    }

    public ArrayList<Network> getNetworkDirectory() {
        return networkDirectory;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public NationalDistributor getNationalDistributor() {
        return nationalDistributor;
    }

    public void setNationalDistributor(NationalDistributor nationalDistributor) {
        this.nationalDistributor = nationalDistributor;
    }
    
}
