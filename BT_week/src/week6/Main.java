/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;



/**
 *
 * @author QUANG
 */
public class Main  {
    
    
    public static void main(String[] args){
        Diagram soDo = new Diagram();
        Layer layer = new Layer();
        
       
       Circle circle = new Circle(1.5, "pink", true);
       Rectangle rectangle = new Rectangle(1, 2, 3, 4, 1, 2, 3, 4, "black", true, 1, 1);      
       Square square = new Square(4, "red", true);
       Triangle triangle = new Triangle(1, 2, 3, 1, 2, 3, "Blue", true, 2, 2);
       System.out.println(rectangle);
        System.out.println("toa do HCN sau khi di chuyen:");
       rectangle.moveTo(1, 3);
        System.out.println(rectangle);
        System.out.println("\n\n");
        
       
       // add cac doi tuong vao danh sach Shape
      layer.addShape(circle);
      layer.addShape(rectangle);
      layer.addShape(triangle);
      layer.addShape(triangle);
      layer.addShape(circle);
      layer.addShape(circle);
      layer.addShape(circle);
      layer.addShape(square);
      layer.addShape(triangle);
      
       
      layer.printShapeList();
      //   remove triangle
      
      
      
        System.out.println("Sau khi xoa cac doi tuong tam giac Triangle trong ShapeList");
      layer.removeTriangleInShapeList();
      layer.printShapeList();
       
      
      // add vao 
      soDo.addLayer(layer);
      soDo.addLayer(layer);
      
      soDo.printListLayer();
      
      System.out.println("Sau khi xoa cac doi tuong hinh tron trong listLayer");
      soDo.removeCirleInDiagram();
      soDo.printListLayer();
        
                
    
    }

}
