/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student2;

/**
 *
 * @author QUANG
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    
    // consructor
    public Student(String najafd, String quang, String group1, String ema) {
        name = najafd; 
        id = quang;
        group = group1;
        email = ema;
    }
    public Student() {
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }
    
    public Student(String n, String id, String ema){
        name = n;
        this.id = id;
        group = "K59CB";
        email = ema;
    }
    
    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    
    // phuong thuc setter, getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // full info 
    
    public String getInfo() {
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//        System.out.println("Group: " + group);
//        System.out.println("Email: " + email);
//        System.out.println("");
       return "Name: " + name + " ,ID: " + id + " ,Group: " + group + " ,Email: " + email;
          
    }
}
