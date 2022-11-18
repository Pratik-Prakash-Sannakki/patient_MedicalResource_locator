/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author pratiksannakki
 */
public class encounter {
 public String patientID;
 private Date aptDate;
 public String Doctor;
 int BP;
 int SPO2;
 int Diabateslevels;

    public encounter() {
        this.patientID = patientID;
        this.aptDate = aptDate;
        this.Doctor = Doctor;
        this.BP = BP;
        this.SPO2 = SPO2;
        this.Diabateslevels = Diabateslevels;
    }
 

    public String getPatientID() {
        return patientID;
    }

    public Date getAptDate() {
        return aptDate;
    }

    public String getDoctor() {
        return Doctor;
    }

    public int getBP() {
        return BP;
    }

    public int getSPO2() {
        return SPO2;
    }

    public int getDiabateslevels() {
        return Diabateslevels;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setAptDate(Date aptDate) {
        this.aptDate = aptDate;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public void setBP(int BP) {
        this.BP = BP;
    }

    public void setSPO2(int SPO2) {
        this.SPO2 = SPO2;
    }

    public void setDiabateslevels(int Diabateslevels) {
        this.Diabateslevels = Diabateslevels;
    }
 @Override
    public String toString(){
        return patientID;
    }
 
 
}
