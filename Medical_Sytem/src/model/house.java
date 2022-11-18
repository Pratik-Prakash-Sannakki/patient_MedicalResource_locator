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
public class house {
    private String houseName;
    private ArrayList<floor> floorData;
    private String street;
    private String sector;

    public String getStreet() {
        return street;
    }

    public String getSector() {
        return sector;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    

    public house() {
        this.houseName = houseName;
        this.floorData= new ArrayList<floor>();
    }
    

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public ArrayList<floor> getFloorData() {
        return floorData;
    }

    public void setFloorData(ArrayList<floor> floorData) {
        this.floorData = floorData;
    }
    
    public floor addNewfloor(int name){
        floor newfloor= new floor();
        newfloor.setFloor(name);
        this.floorData.add(newfloor);
        return newfloor;
    }
    
    
    
}
