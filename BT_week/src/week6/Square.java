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

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        //super(side, side, color, filled);
        super(side, side);
        this.color = color;
        this.filled = filled;
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
