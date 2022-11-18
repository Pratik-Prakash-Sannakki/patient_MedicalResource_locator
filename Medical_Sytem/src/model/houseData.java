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
public class houseData {
    private ArrayList<house>  houseData;
    
    public houseData() {
        this.houseData = new ArrayList<house>();
    }

    public ArrayList<house> getHouseData() {
        return houseData;
    }

    public void setHouseData(ArrayList<house> houseData) {
        this.houseData = houseData;
    }
    public house addDetails(){
    
    house h = new house();
    houseData.add(h);
    return h;
    
    }
    public void deleteDetails(house em)
    {
    
    houseData.remove(em);
    
    
    }
    
    
    
}
