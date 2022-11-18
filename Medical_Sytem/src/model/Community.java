/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class Community {
    
    private ArrayList<Hospital> hospitalDirectory;
    private ArrayList<house> houseDirectory;
    private String communityName;

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityName() {
        return communityName;
    }
    public Community(){
        this.hospitalDirectory = new ArrayList<Hospital>();
        this.houseDirectory = new ArrayList<house>();
        
        
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }
    
    public Hospital addNewHospital(String name){
        Hospital newHospital= new Hospital();
        newHospital.setHospitalName(name);
        this.hospitalDirectory.add(newHospital);
        return newHospital;
    }
    public void deleteDetails(Community em)
    {
    
    this.hospitalDirectory.remove(em);
    
    
    }

    public ArrayList<house> getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(ArrayList<house> houseDirectory) {
        this.houseDirectory = houseDirectory;
    }
    public house addNewHouse(String name){
        house newhouse= new house();
        newhouse.setHouseName(name);
        this.houseDirectory.add(newhouse);
        return newhouse;
    }
     
    
    
    //overrides object state
    @Override
    public String toString(){
        return communityName;
    }
    
}
