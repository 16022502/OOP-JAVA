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

    /**
     * @param args the command line arguments
     */
    
    // thuoc tinh
   private String id;
   private String name;
   private String group;
   private String email;
   
   
   // phuong thuc khoi tao
   public Student(){
       id = "000";
       name = "Student";
       group = "K61CB";
       email = "uet@vnuedu.vn";
   }
   
   public Student(String n, String sid, String em, String _group){
       id = sid;
       name = n;
       email = em;
       group = _group;
   }
   
   public Student(Student s){
       this.id = s.id;
       this.name = s.name;
       this.email = s.email;
       this.group = s.group;
            
   }
   
   // phuong thuc
   public void setName(String n){
       this.name = n;
   }
   
   public String getName(){
       return this.name;
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

    public void getInfo() {
        System.out.println("Ten: "+getName()+", ID: "+getId()+", Email: "+getEmail()+", Group: "+getGroup() );
    }

    @Override
    public String toString() {
        return "Ten: "+getName()+", ID: "+getId()+", Email: "+getEmail()+", Group: "+getGroup();
    }
}
