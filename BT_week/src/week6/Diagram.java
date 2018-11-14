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
    public void addLayer(Layer layer) {
        if (layer.isVisible() == true) {
            layerList.add(layer);
        }

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
    public void removeCirleInDiagram() {
        for (int i = 0; i < layerList.size(); i++) {
            layerList.get(i).removeCircle();

        }
    }

    // phuong thuc chuyen tung loai hinh ve vao tung doi tuong layer
    public void moveToSameLayer() {
        Layer rectangle = new Layer();
        Layer square = new Layer();
        Layer triangle = new Layer();
        Layer circle = new Layer();
        Layer hexagon = new Layer();

        // sort 
        for (int i = 0; i < layerList.size(); i++) {
            for (int j = 0; j < layerList.get(i).getShapeList().size(); j++) {
                Shape shapeCurrent = layerList.get(i).getShapeList().get(j);
               if ( shapeCurrent instanceof Rectangle){
                   
                   rectangle.addShape(shapeCurrent);
               }
               if(shapeCurrent instanceof Square) square.addShape(shapeCurrent);
               if(shapeCurrent instanceof Triangle) triangle.addShape(shapeCurrent);
               if(shapeCurrent instanceof Circle) circle.addShape(shapeCurrent);
               if(shapeCurrent instanceof Hexagon) hexagon.addShape(shapeCurrent);

//                if (shapeCurrent instanceof Rectangle) {
//                    shapeCurrent.type = "Rectangle";
//                }
//                if (shapeCurrent instanceof Square) {
//                    shapeCurrent.type = "Square";
//                }
//                if (shapeCurrent instanceof Triangle) {
//                    shapeCurrent.type = "Triangle";
//                }
//                if (shapeCurrent instanceof Circle) {
//                    shapeCurrent.type = "Circle";
//                }
//                if (shapeCurrent instanceof Hexagon) {
//                    shapeCurrent.type = "Hexagon";
//                }

                layerList.clear();
                layerList.add(circle);
                layerList.add(hexagon);
                layerList.add(triangle);
                layerList.add(rectangle);
                layerList.add(square);
            }

        }
    }

}
