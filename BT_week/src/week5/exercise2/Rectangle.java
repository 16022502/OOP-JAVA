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
public class Rectangle extends Shape {

    protected double width;
    protected double length;

    // 3 phuong thuc khoi tao
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // phuong thuc tra ve dien tich
    public double getArea() {
        return width * length;
    }

    // phuong thuc tra ve dien tich
    public double getPerimeter() {
        return 2 * (width + length);
    }
    
    // get + set

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    

}
