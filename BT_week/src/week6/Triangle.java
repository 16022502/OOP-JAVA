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
public class Triangle extends Shape{
    private double x1,x2,x3;
    private double y1,y2,y3;
    // cac ham khoi tao
    
    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3, String color, boolean filled, double x, double y) {
        super(color, filled, x, y);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    
   

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double x, double y) {
        super(color, filled, x, y);
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
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
    public double getArea() {
         double s=((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2;
         return s;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x1+=x;
        this.x2+=x;
        this.x3+=x;

        this.y1+=y;
        this.y2+=y;
        this.y3+=y; 
    }

    @Override
    public String toString() {
        return "Triangle{" + "x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3 + '}';
    }
    
    public void fillColor(){
        if(filled == true)
            System.out.println("Hinh da duoc to mau" + getColor());
     }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.x1) ^ (Double.doubleToLongBits(this.x1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.x2) ^ (Double.doubleToLongBits(this.x2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.x3) ^ (Double.doubleToLongBits(this.x3) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.y1) ^ (Double.doubleToLongBits(this.y1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.y2) ^ (Double.doubleToLongBits(this.y2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.y3) ^ (Double.doubleToLongBits(this.y3) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangle other = (Triangle) obj;
        if (Double.doubleToLongBits(this.x1) != Double.doubleToLongBits(other.x1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.x2) != Double.doubleToLongBits(other.x2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.x3) != Double.doubleToLongBits(other.x3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y1) != Double.doubleToLongBits(other.y1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y2) != Double.doubleToLongBits(other.y2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y3) != Double.doubleToLongBits(other.y3)) {
            return false;
        }
        return true;
    }
    
    
    
}
