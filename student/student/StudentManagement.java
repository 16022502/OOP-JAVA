package student;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author QUANG
 */
public class StudentManagement{
    // thuoc tinh
    private List<Student> students = new ArrayList<>();
    private int size = 0;
    private int classSize  = 0;
    private String[] className = new String[100];
    
    
    public StudentManagement(){
        
    }
    
    // phuong thuc
//    public student.StudentManagement(int n){
//        this.students = new Student[n];
//    }
    
    public  void addStudent(Student s){
        students.add(s);
    }
    
   
    public boolean sameGroup(Student s1, Student s2){
//        if(s1.getGroup()== s2.getGroup()) return true;
//        else return false;
          return s1.getGroup().equals(s2.getGroup());
    }
    
    public void studentsByGroup(){
        System.out.println("-------------------------------------");
        Collections.sort(students,new StudentCompare());
        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
//
//        for(int index = 0; index < size; index++){
//          boolean  check = true;
//            for (int i = 0; i <= classSize; i++) {
//                if(students[index].getGroup().equals(className[i])){
//                    check = false;
//                    break;
//                }
//
//            }
//             while(check){
//                    className[classSize] = students[index].getGroup();
//                     classSize++;
//                     check = false;
//            }
//        }
//
//        for (int i = 0; i < classSize; i++) {
//                System.out.println("*lớp " + className[i]);
//                System.out.println("----------------");
//                for (int j = 0; j < size; j++) {
//                    if(students[j].getGroup().equals(className[i])){
//                         students[j].getInfo();
//
//
//                    }
//                }
//                 System.out.println("--------------");
//            }
    }
    
    public void removeStudent(String id){
        Student removed = students.get(0);
        for( Student i : students){
            if (i.getId().equals(id)){
                removed = i;
            }
        }
        students.remove(removed);
    }
    
    
        
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId("16022502");
        stu.setName("Nguyen Hong Quang");
        stu.setEmail("quang10397@gmail.com");
        stu.setGroup("K61N");
        
        System.out.println("Ten SV: "+ stu.getName());
        stu.getInfo();
        
        
        Student stu1 = new Student();
        stu1.getInfo();
        
        Student stu2 = new Student("Hai", "123", "hai.com", "K63CD");
        stu2.getInfo();
        
        Student stu3 = new Student(stu);
         stu3.getInfo();
        
         StudentManagement sm = new StudentManagement();
         sm.addStudent(stu);
         sm.addStudent(stu1);
         sm.addStudent(stu2);
         sm.addStudent(stu3);
         sm.addStudent( new Student("Hai", "123", "hai.com","K61CC"));
         sm.addStudent( new Student("Hai", "123", "hai.com","K61CF"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CC"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CA"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CA"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CA"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CA"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CC"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CC"));
        sm.addStudent( new Student("Hai", "123", "hai.com","K61CB"));



         if(sm.sameGroup(stu,stu2)) System.out.println(stu.getName()+ " va " + stu2.getName()+ " cung lop" );
         else System.out.println(stu.getName()+ " va " + stu2.getName()+ " ko cung lop");
         
         sm.studentsByGroup();
         
         sm.removeStudent("123");
         System.out.println("***************AFTER DELETE***************");
         sm.studentsByGroup();
    }

    }
class StudentCompare implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroup().compareTo(o2.getGroup());
    }
}