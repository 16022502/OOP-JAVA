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
public class StudentManagement {
    private Student[] students = new Student[100];
    private int size = 0;
    private int classSize = 0;
    private String[] className = new String[100];

    // public StudentManagement() {
    // students[0] = new Student();
    // students[1] = new Student("Bạn 2", "ai đi", "emailchuaco@gmail.com");
    // students[2] = new Student("Bạn 3", "em đi", "emailchuaco@gmail.com");
    // students[3] = new Student("Bạn 4", "anh đi", "emailchuaco@gmail.com");

    // students[1].setGroup("K62CLC");
    // students[2].setGroup("K62CLC");
    // // check size
    // while (students[size] != null) {
    // boolean check = true;
    // for (int i = 0; i <= classSize; i++) {
    // if (students[size].getGroup().equals(className[i])) {
    // check = false;
    // break;
    // }
    // }
    // if (check) {
    // className[classSize] = students[size].getGroup();
    // classSize++;
    // }
    // size++;
    // }
    // }

    public StudentManagement() {

    }

    public void addStudent(Student s) {
        if(size<=100){
            students[size] = s;
            size++;
        }else{
            System.out.println("Số người đã đạt giới hạn.");
        }
    }

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void studentByGroup() {
        classSize = 0;
        for (int index = 0; index < size; index++) {
            boolean check = true;
            for (int i = 0; i <= classSize; i++) {
                if (students[index].getGroup().equals(className[i])) {
                    check = false;
                    break;
                }
            }
            if (check) {
                className[classSize] = students[index].getGroup();
                classSize++;
            }
        }
        for (int i = 0; i < classSize; i++) {
            System.out.print("*Lớp " + className[i]);
            System.out.println(":");
            System.out.println("-----------------------");
            for (int j = 0; j < size; j++) {
                if (students[j].getGroup().equals(className[i])) {
                    // System.out.println(students[j].getName());
                    students[j].getInfo();
                    System.out.println("");
                }
            }
        }
    }

    public void removeStudent(String id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < size; j++) {
                    students[j] = students[j + 1];
                }
                size--;
                break;
            }
        }
    }

    public static void main(String[] arg) {
        Student student1 = new Student();
        Student student2 = new Student("Cô Dô Dép", "em đi", "emailchuaco@gmail.com");
        // Student student3 = new Student(student2);
        Student student4 = new Student("Uy Li Am", "anh đi", "email@email.com");

        student1.setName("Trần Mạnh Cường");
        student1.setId("ai đi");
        student1.setGroup("INT2204 N3");
        student1.setEmail("iammaytinhdibo@gmail.com");

        StudentManagement sm = new StudentManagement();
        sm.addStudent(student1);
        sm.addStudent(student2);
        // sm.addStudent(student3);
        sm.addStudent(student4);

        sm.studentByGroup();
        sm.removeStudent("ai đi");
        System.out.println("***************AFTER DELETE***************");
        sm.studentByGroup();

        // System.out.print(sm.sameGroup(student2, student4));

    }
}
