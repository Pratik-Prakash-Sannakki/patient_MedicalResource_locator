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
public class cityData {
    private ArrayList<city>  cityData;

    public cityData() {
        this.cityData = new ArrayList<city>();
    }
    
    

    public ArrayList<city> getCityData() {
        return cityData;
    }

    public void setCityData(ArrayList<city> cityData) {
        this.cityData = cityData;
    }

    
    public city addDetails(){
    
    city usd = new city();
    cityData.add(usd);
    return usd;
    
    }
    public void deleteDetails(city em)
    {
    
    cityData.remove(em);
    
    
    }
    
    
    
    
}
