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
public class HospitalDirectory {
    private static ArrayList<Hospital>  hospitalData;

    public HospitalDirectory() {
        this.hospitalData = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalData() {
        return hospitalData;
    }

    public void setHospitalData(ArrayList<Hospital> hospitalData) {
        this.hospitalData = hospitalData;
    }
    public Hospital addDetails(){
    
    Hospital hd = new Hospital();
    hospitalData.add(hd);
    return hd;
    
    }
    
}
