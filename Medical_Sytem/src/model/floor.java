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
public class floor {
    private ArrayList<aptnumber> aptNoData;
    int  floor;
    
public floor()
{
this.aptNoData= new ArrayList<aptnumber>();
}
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ArrayList<aptnumber> getAptNoData() {
        return aptNoData;
    }

    public void setAptNoData(ArrayList<aptnumber> aptNoData) {
        this.aptNoData = aptNoData;
    }
    
    public aptnumber addNewaprNo(int name){
        aptnumber newfloor= new aptnumber();
        newfloor.setAptnumber(name);
        this.aptNoData.add(newfloor);
        return newfloor;
    }
    
    
}
