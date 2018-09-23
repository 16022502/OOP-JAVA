/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3.bai3.game;
import java.util.ArrayList;

/**
 *
 * @author QUANG
 */
public class Ship {
    private ArrayList<String> locationCells; // mang luu vi tri cua cac toa do tau
    private String name; // ten tau
    public void setName(String string) {
        name = string;
    }
    
    public void setLocationcells(ArrayList<String> loc){
        locationCells = loc;
    }
    
    public String check(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0) {
            locationCells.remove(index);
            if(locationCells.isEmpty()) result = "kill";
            else result = "hit";
        }
        return result;
        
    }
    
          
}
