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
public class patientData {
    
    private ArrayList<patient>  patientdata;

    public patientData() {
        this.patientdata = new ArrayList<patient>();
    }

    public ArrayList<patient> getPatientdata() {
        return patientdata;
    }

    public void setPatientdata(ArrayList<patient> patientdata) {
        this.patientdata = patientdata;
    }
    public patient addDetails(String Name, String patientID, int age, String gender,long Cell_phone_number,String emailAddress){
    
    patient pat = new patient(Name,patientID,age,gender,Cell_phone_number, emailAddress);
    patientdata.add(pat);
    return pat;
    
    }
    public void deleteDetails(patient pe)
    {
    
    patientdata.remove(pe);
    
    
    }
}
