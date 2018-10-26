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
public class Circle extends Shape {

    private final double PI = 3.14;
    private double radius;
    private double x1,y1;

    // 3 phuong thuc khoi tao
    public Circle() {
        this.radius = 1;    
    }

    public Circle(double bk) {
        this.radius = bk;
    }

    public Circle(double radius, String color, boolean filled) {
        super();
        this.radius = radius;
    }

    // get + set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // phuong thuc tra ve dien tich
    public double getArea() {
        return PI * radius * radius;
    }

    // phuong thuc tra ve dien tich
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "PI=" + PI + ", radius=" + radius + '}';
    }

    @Override
    public void moveTo(double x, double y) {
        this.x1 += x;
        this.y1 += y;
    }
    
    
}
