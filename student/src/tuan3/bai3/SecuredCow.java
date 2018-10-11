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
public class SecuredCow {
    private int age;
    
    public void setAge(int a){
        if(a > 0) {
            age = a;
        }
    }
    
    public int getAge() {
        return age;
    }
    
    void moo() {
        if(age <= 5){
            System.out.println("Mooooooo....");
        }else {
            System.out.println("Moo.");
        }
    }
}
