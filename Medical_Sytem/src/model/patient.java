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
public class patient extends person {
    
    int floor;
    int aptno;
    String house;
    

    public patient(String Name, String patientID, int age, String gender,long Cell_phone_number,String emailAddress ) {
        super(Name, patientID, age, gender,Cell_phone_number,emailAddress);
        
        
    }
    public patient(){}

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setAptno(int aptno) {
        this.aptno = aptno;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getFloor() {
        return floor;
    }

    public int getAptno() {
        return aptno;
    }

    public String getHouse() {
        return house;
    }

    
    
    
    
}
