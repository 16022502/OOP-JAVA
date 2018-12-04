/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QUANG
 */
public class Utils {
    
    // doc noi dung tu file 
    public static String readContentFromFile(String path) throws FileNotFoundException, IOException{
        FileReader fileReader = new FileReader(new File(path));
        Scanner sc = new Scanner(fileReader);
        String s = "{";
        while(sc.hasNextLine()){
            s = s + sc.nextLine() + "\n";
        }
        fileReader.close();
        return s;
    }
    
    //viet noi dung moi vao file, xoa noi dung cu
    public void writeContentToFile(String path) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap noi dung can them vao file: ");
        String str = sc.nextLine();
        Writer input;
        input = new BufferedWriter(new FileWriter(path, false));
        input.write(str);
        input.close();

    }
    
    //viet noi dung moi vao file noi tiep sau nd cu 
     public static void writeContentAppendToFile(String path) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap noi dung can them vao file: ");
        String str = sc.nextLine();
        Writer input;
        input = new BufferedWriter(new FileWriter(path, true));
        input.write(str);
        input.close();
    }
    
    // ham tim file trong folder
     public static File findFileByName(String folderPath, String fileName) {
        File root = new File(folderPath);
        if (!root.isDirectory()){
            if (root.getName().equals(fileName)) return root;
        } else{
            File[] listFile = root.listFiles();
            for (File file:listFile){
                File found = findFileByName(file.getPath(),fileName);
                if (found!=null) return found;
            }
        }
        return null;
    }
         
    public static void main(String[] args) {
        
        // doc noi dung  tu file
        try {
            System.out.println(readContentFromFile("E:\\JAVA\\BTL-ver1+2+3\\new.txt.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            // ghi vao file. xoa nd cu
//            writeContentToFile("E:\\JAVA\\BTL-ver1+2+3\\new.txt.txt");
//        } catch (IOException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        // doc noi dung  tu file
        try {
            System.out.println(readContentFromFile("E:\\JAVA\\BTL-ver1+2+3\\new.txt.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            // bổ sung nội dung vào cuối tệp hiện hành
            writeContentAppendToFile("E:\\JAVA\\BTL-ver1+2+3\\new.txt.txt");
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
         // doc noi dung  tu file
         System.out.println("......After....");
          try {
            System.out.println(readContentFromFile("E:\\JAVA\\BTL-ver1+2+3\\new.txt.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
          System.out.println(findFileByName("E:\\JAVA\\", "dictionaries.txt"));
        
        
    }
}
