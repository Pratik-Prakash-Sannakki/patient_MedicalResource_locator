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
public class encounterData {
    private ArrayList<encounter>  encounterData;
    public encounterData(){
    this.encounterData = new ArrayList<encounter>();
    }

    public ArrayList<encounter> getEncounterData() {
        return encounterData;
    }

    public void setEncounterData(ArrayList<encounter> encounterData) {
        this.encounterData = encounterData;
    }
    public encounter addDetails(){
    
    encounter usd = new encounter();
    encounterData.add(usd);
    return usd;
    
    }
    public void deleteDetails(encounter em)
    {
    
    encounterData.remove(em);
    
    
    }
    
}
