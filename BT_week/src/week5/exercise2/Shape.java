/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.exercise2;

/**
 *
 * @author QUANG
 */
public class Shape {
    protected String color;
    protected boolean filled;
    
    // phuong thuc khoi tao

    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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
    
    
    
    public static void main(String[] args) {
        Shape sh = new Shape();
        System.out.println(sh);
    }
    
    
}
