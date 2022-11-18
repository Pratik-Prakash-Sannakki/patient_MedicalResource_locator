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
public class doctorData {
    private ArrayList<doctor>  doctordata;
    public doctorData(){
    this.doctordata = new ArrayList<doctor>();
    }

    public ArrayList<doctor> getDoctordata() {
        return doctordata;
    }

    public void setDoctordata(ArrayList<doctor> doctordata) {
        this.doctordata = doctordata;
    }
    
    public doctor addDetails(){
    
    doctor usd = new doctor();
    doctordata.add(usd);
    return usd;
    
    }
    public void deleteDetails(doctor pe)
    {
    
    doctordata.remove(pe);
    
    
    }
   
}
