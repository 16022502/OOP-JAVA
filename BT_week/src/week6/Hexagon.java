/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.awt.Point;

/**
 *
 * @author QUANG
 */
public class Hexagon extends Shape{

    private int size;
    private Point point;

    public Hexagon(int size) {
        this.size = size;
    }

    public Hexagon(int size, String color, boolean filled, double x, double y) {
        super(color, filled, x, y);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
        
    
    @Override
        public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveTo(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Hexagon{" + "size=" + size + '}';
    }
    
    // so sánh hai hình Hexagon

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Hexagon other = (Hexagon) obj;
        if (this.size != other.size) {
            return false;
        }
        return true;
    }
   
    
    
}
