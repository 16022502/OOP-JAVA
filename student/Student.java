/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author QUANG
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    // constructor
    public Student() {
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String n, String nid, String em) {
        name = n;
        id = nid;
        group = "K59CB";
        email = em;
    }

    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    // setter getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    // full info

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Group: " + group);
        System.out.println("Email: " + email);
    }
}
