/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pratiksannakki
 */
public class doctor extends person {
    private String specliazation;
    private String Degree;

    /**
     *
     */
   
   

    public doctor(String specliazation, String Degree, String Name, String patientID, int age, String gender, long Cell_phone_number, String emailAddress) {
        super(Name, patientID, age, gender, Cell_phone_number, emailAddress);
        this.specliazation = specliazation;
        this.Degree = Degree;
    }
    public doctor(){}

    public String getSpecliazation() {
        return specliazation;
    }

    public String getDegree() {
        return Degree;
    }

    public void setSpecliazation(String specliazation) {
        this.specliazation = specliazation;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }
    
    
    
}
