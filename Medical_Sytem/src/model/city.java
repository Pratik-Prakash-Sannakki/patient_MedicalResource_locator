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
public class city {
    private ArrayList<Community>  comm;
    private String cityName;
    private String UID;

    public city(){
        this.comm = new ArrayList<>();
    }

    public ArrayList<Community> getComm() {
        return comm;
    }

    public void setComm(ArrayList<Community> comm) {
        this.comm = comm;
    }

    public Community addNewCommunity(String name) {
        Community com = new Community();
        com.setCommunityName(name);
        this.comm.add(com);
        return com;
    }
    
    public void deleteDetails(city em)
    {
    
    this.comm.remove(em);
    
    
    }

    

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public city(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
}
