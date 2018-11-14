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
public class Layer {
    private boolean visible;
    // một danh sánh các đối tượng thuộc lớp Shape
    ArrayList<Shape> shapeList = new ArrayList<>();
    
    // hàm add thêm Shape vào danh sách shapeList
    public void addShape( Shape shape){
        shapeList.add(shape);
    }
    
    // hàm in ra danh sách các Shape
    public void printShapeList() {
         System.out.println("Danh sach ShapeList");
        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println(shapeList.get(i));
        }
        System.out.println("------------------- \n \n \n");
    }
    
    // xóa tất cả các đối tượng thuộc lớp Triangle trong lớp
    public void removeTriangleInShapeList(){
         for (int i = 0; i < shapeList.size(); i++) {
            if(shapeList.get(i) instanceof Triangle){
                shapeList.remove(i);
                i--;
            }
        }
    }
    
    // xóa tất cả các đối tượng thuộc lớp Circle trong lớp
    public void removeCircle(){
        for (int i = 0; i < shapeList.size(); i++) {
            if( shapeList.get(i) instanceof Circle ){
               shapeList.remove(i);
               i--;
            }
        }
    }
    // phuong thuc khoi tao
    public Layer() {
            this.visible = true;
    }
    // geter seter

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

   // xoa cac hinh giong nhau trong cung mot layer
    public void removeShapeSame(){
        for (int i = 0; i < shapeList.size()-1; i++) {
            for (int j = i+1; j < shapeList.size(); j++) {
                if (shapeList.get(i).equals(shapeList.get(j))) {
                    shapeList.remove(i);
                }
            }
        }
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }
     
    
}

