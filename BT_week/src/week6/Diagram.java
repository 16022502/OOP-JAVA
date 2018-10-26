/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.ArrayList;

/**
 *
 * @author QUANG
 */
public class Diagram {
    // danh sachs cac doi tuong layer
    ArrayList<Layer> layerList = new ArrayList<>();
    
    // add layer vao danh sach
    public void addLayer( Layer layer){
        layerList.add(layer);
    }
    
    // ham in ra danh sach layer
   public void printListLayer() {
       System.out.println("DS layer");
        for (int i = 0; i < layerList.size(); i++) {
            System.out.println("Layer:  " + i);
            layerList.get(i).printShapeList();
        }
       System.out.println("------------------------ \n \n\n\n");
    }
   
   // ham xoa tat ca doi tuong Circle trong Diagram
   public void removeCirleInDiagram(){
       for (int i = 0; i < layerList.size(); i++) {
          layerList.get(i).removeCircle();
          
       }
    }
}



