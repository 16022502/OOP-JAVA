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
public class PhoneBookEntry {
    private String name;
    public String phone;
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
 
}
