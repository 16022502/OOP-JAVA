/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3.bai3;

/**
 *
 * @author QUANG
 */
public class Duck {
    private int size;
    public static int count = 0;
    
    public Duck(){
        count++; // đếm sô lượng đối tượng được tạo ra
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Duck.count = count;
    }
    
}
