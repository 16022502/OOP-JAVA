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
public class Singleton {
    private static Singleton instance;
    private String info = "Initial info class";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    private Singleton() {
        
    }
   
    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getInfo());
        
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setInfo("New enum info");
        
        System.out.println(singleton1.getInfo());
        System.out.println(singleton2.getInfo());
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}
