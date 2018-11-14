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
public class Square extends Rectangle {
   private double size;
           
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled,double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4,double x, double  y) {
      super(x1, x2, x3, x4, y1, y2, y3, y4, color, filled, x, y);
      this.size = 0;
    }

    @Override
    public String toString() {
       return "Square{" + "x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3 + ", y4=" + y4 + ", color=" + color +", size="+ size+'}';
    }

     
    
    
    public double getSide() {
        return super.getWidth();
    }
    
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

   

    @Override
    public void setLength(double side) {
        this.length = side;
    }

  
    

   
    
    
    
}
