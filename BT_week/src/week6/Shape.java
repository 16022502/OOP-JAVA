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
public abstract class Shape {
    protected double x;
    protected double y;
    protected String color;
    protected boolean filled;
    protected double width;
    protected double length;
    protected String type;
    
    // phuong thuc khoi tao

    public Shape() {
        this.color = "red";
        this.filled = true;
        
    }
    

    public Shape(String color, boolean filled , double x,double y ) {
        this.color = color;
        this.filled = filled;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    // get set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
// ghi de phuong thuc
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
    abstract public double getArea();
    abstract public void moveTo(double x, double y);
     public void fillColor(){
   
     }
     

    
    
}
