/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3.bai3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.util.*;

/**
 *
 * @author QUANG
 */
public class FileReplace {
    ArrayList<String> lines = new ArrayList<String>();
    String line = null;
    
    public void doIt() throws IOException {
        try {
            File f1 = new File("E:\\JAVA\\BTL\\dictionaries.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            if (line.contains("java"))
                line = line.replace("java", " ");
            lines.add(line);
        }
        
        fr.close();
        br.close();
        
        FileWriter fw = new FileWriter(f1);
        BufferedWriter out = new BufferedWriter(fw);
        for(String s : lines)
             out.write(s);
        out.flush();
                } 
        
         catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException {
        FileReplace fr = new  FileReplace();
        fr.doIt();
    }
}
