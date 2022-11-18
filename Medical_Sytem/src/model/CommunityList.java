/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//this is the city
package model;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CommunityList {
    private ArrayList<Community> commList;

    public CommunityList() {
        this.commList= new ArrayList<Community>();
    }
    
    
    public void setList(ArrayList<Community> commList) {
        this.commList = commList;
    }
        
    public ArrayList<Community> getList(){
        return commList;
    }
    
    public Community addNewCommunity(){
        Community newCommunity= new Community();
        commList.add(newCommunity);
        return newCommunity;
    }
    public void deleteDetails(Community em)
    {
    
    commList.remove(em);
    
    
    }
}

    
