/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08.exp2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author QUANG
 */
public class TestMain {
    public static void testNPE() {
        //throw new NullPointerException();
        String str = null;
        System.out.println(str.toString());
    }
    
    public static void testArrayOutOfBoundsException() {
        //throw new ArrayIndexOutOfBoundsException();
         int ar[] = {1, 2, 3, 4, 5}; 
        for (int i=0; i<=ar.length; i++) 
          System.out.println(ar[i]); 
    }
    
    public static void testArithmeticException() {
        //throw new ArithmeticException();
        int i = 0 / 0;
    }
    
    public static void testClassCastException() {
       // throw new ClassCastException();
    List list = new ArrayList();
    list.add("Java");
    list.add(new Integer(5));

    for(Object obj:list) {
        String str = (String)obj;
    }
    }
    
    public static void testError404 (String path) throws FileNotFoundException {
        //throw new FileNotFoundException();
        FileReader fileReader = new FileReader(path);
    }
    
    public static void testIOE() throws IOException {
        // throw new IOException();
        FileInputStream  fileInputStream = new FileInputStream(new File("test.txt"));
	fileInputStream.read();
    }
    
    //
    public static void main(String[] args) {
        // test Null Pointer
        System.out.println("Test Null Pointer:");
        try {
          testNPE();       
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
        
        
        
        // test Array index
        System.out.println("\n Test  Array index :");
        try {
          testArrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        
        // test ArithmeticException
        System.out.println("\n Test ArithmeticException:");
        try {
          testArithmeticException();
        } catch (ArithmeticException e) {
            //e.printStackTrace();
             System.out.println(e.toString());
        }
        
        // test ClassCastException
        System.out.println("\n Test ClassCastException");
        try {
            testClassCastException();
        } catch (ClassCastException e) {
            System.out.println(e.toString());
        }
        
        // test IOException
        System.out.println("\n test IOException");
        try {
            testIOE();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
        // test FileNotFoundException 
        System.out.println("\n test FileNotFoundException ");
        try {
            testError404("E:\\JAVA\\BTL-ver1+2+3\\new.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
