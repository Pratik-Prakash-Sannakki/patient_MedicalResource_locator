/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Hospital {
    private ArrayList<doctor> doctorDirectory;
    private String hospitalName;
    
    
    public Hospital(){
        this.doctorDirectory = new ArrayList<doctor>();
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }
    

    public ArrayList<doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public doctor addNewdoctor(String name){
        doctor newDoctor= new doctor();
        newDoctor.setName(name);
        this.doctorDirectory.add(newDoctor);
        return newDoctor;
    }
    public void deleteDetails(Hospital em)
    {
    
    this.doctorDirectory.remove(em);
    
    
    }
    //overrides object state
    

}
