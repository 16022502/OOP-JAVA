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
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        layer.setVisible(true);
        Layer layer2 = new Layer();
        layer2.setVisible(false);
        Layer layer3 = new Layer();
        layer3.setVisible(true);
       Hexagon hexagon = new Hexagon(1);
     
       Circle circle = new Circle(1.5, "pink", true);
       Rectangle rectangle = new Rectangle(1, 2, 3, 4, 1, 2, 3, 4, "black", true, 1, 1);      
//       Square square = new Square(4, "red", true);
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
//      layer.addShape(square);
      layer.addShape(triangle);
      layer.addShape(new Hexagon(12));
      layer.addShape(new Hexagon(12));
      layer.addShape(new Hexagon(1));
     // layer.addShape(new Square(3));
      layer.addShape(new Square("red", true, 1, 2, 3, 4, 1, 2, 3, 4, 5, 5));
     
      layer2.addShape(circle);
      layer2.addShape(rectangle);
      layer2.addShape(triangle);
      layer2.addShape(triangle);
      layer2.addShape(circle);
      
      layer3.addShape(circle);
      layer3.addShape(rectangle);
      layer3.addShape(triangle);
      layer3.addShape(triangle);
      layer3.addShape(circle);
      
       
      layer.printShapeList();
      //   remove triangle
      
      // xoa cac hinh giong nhau trong cung layer
        System.out.println("-----------Sau khi xoa cac hinh giong nhau trong cung layer:");
      layer.removeShapeSame();
      
        
      layer.printShapeList();
      
//        System.out.println("Sau khi xoa cac doi tuong tam giac Triangle trong ShapeList");
//      layer.removeTriangleInShapeList();
    //  layer.printShapeList();
       
      
      // add vao 
      diagram.addLayer(layer);
      diagram.addLayer(layer2);
      diagram.addLayer(layer3);
      diagram.printListLayer();
      // di chuyen cac hinh cung loai vao cung mot doi tuong layer
        System.out.println("------------- Sau khi di chuyen cac hinh cung loai vao cung mot doi tuong layer");
      diagram.moveToSameLayer();
      diagram.printListLayer();
      
     // System.out.println("Sau khi xoa cac doi tuong hinh tron trong listLayer");
//      diagram.removeCirleInDiagram();
//      diagram.printListLayer();
        
                
    
    }

}
