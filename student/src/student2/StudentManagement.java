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
public class StudentManagement {
    private Student[] students = new Student[100];
    private int size = 0;
    private int classSize = 0;
    private String[] className = new String[100];
    
    public StudentManagement(){
        
    }
    
    public void addStudent(Student stu){
        if(size <= 100){
            students[size] = stu;
            size++;
        }else {
            System.out.println("Số người đã đạt giới hạn!");
        }
    }
    
    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
    
    
    public void studentByGoup() {
        for (int i = 0; i < size; i++) {
            boolean check = true;
            for (int j = 0; j < classSize ; j++) {
                if(students[i].getGroup().equals(className[j])){
                    check = false;
                }
            }
            if(check){
                className[classSize] = students[i].getGroup();
                classSize++;
            }
        }
        
        // in ra danh sach sinh vien theo tung lop
        for (int i = 0; i < classSize; i++) {
            System.out.println("Lop: "+ className[i]);
            System.out.println("-----");
            for (int j = 0; j < size; j++) {
                if(students[j].getGroup().equals(className[i])){
                    System.out.println(students[j].getInfo()); 
                    
                }
            }
            System.out.println("----------------------------");
        }
    }
    
    
    public void removeStudent(String id){
        for (int i = 0; i < size; i++) {
            if(students[i].getId().equals(id)){
                for (int j = i; j < size; j++) {
                    students[j] = students[j+1];
                    
                }
                size--;
                
            }
        }
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        
        Student student2 = new Student("Hong Quang", "123", "quang@vnu.edu.vn");
      //  Student student3 = new Student(student2);
        Student student4 = new Student("hong", "121","K61m", "g@vnu.edu.vn");
        
        StudentManagement sm = new StudentManagement();
        sm.addStudent(student4);
        sm.addStudent(student1);
        sm.addStudent(student2);
      //  sm.addStudent(student3);
        sm.addStudent(new Student("hong", "122","K61m", "g@vnu.edu.vn"));
        sm.addStudent(new Student("hong", "125","K62", "g@vnu.edu.vn"));
        sm.addStudent(new Student("hong", "126","K61", "g@vnu.edu.vn"));
        sm.addStudent(new Student("hong", "127","K63", "g@vnu.edu.vn"));
        sm.addStudent(new Student("hong", "128","K64", "g@vnu.edu.vn"));
        sm.addStudent(new Student("hong", "129","K63", "g@vnu.edu.vn"));
        
        
        sm.studentByGoup();
        
        sm.removeStudent("123");
        System.out.println("------------after delete------------");
        sm.studentByGoup();
    }
}
    

