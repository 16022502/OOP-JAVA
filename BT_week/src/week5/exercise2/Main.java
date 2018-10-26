/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.exercise2;
import week5.exercise2.Shape;

/**
 *
 * @author QUANG
 */
public class Main  {
    
    
    public static void main(String[] args){
       Shape sh = new Shape();
        System.out.println(sh.getColor());
       Circle circle = new Circle();
       Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getLength());
       Square square = new Square();
        System.out.println(square.getSide());
                
    
    }

}
