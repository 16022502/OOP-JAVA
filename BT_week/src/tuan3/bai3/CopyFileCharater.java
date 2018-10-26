/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3.bai3;

import java.io.*;

/**
 *
 * @author QUANG
 */
public class CopyFileCharater {
    public static void main(String[] args) throws  IOException {
        BufferedInputStream bufferIn = null;
        BufferedOutputStream bufferOut = null;
        
        try {
            InputStream inputStream = new FileInputStream("E:\\JAVA\\Student\\src\\tuan3\\bai3\\input.txt");
            OutputStream outputStream = new FileOutputStream("E:\\JAVA\\Student\\src\\tuan3\\bai3\\output.txt");
            
            bufferIn = new BufferedInputStream(inputStream);
            bufferOut = new BufferedOutputStream(outputStream);
            
            int c;
            while((c = bufferIn.read()) != -1){
                bufferOut.write(c);
            }
        } finally {
            if( bufferIn != null){
                bufferIn.close();
            }
            
            if (bufferOut != null) {
                bufferOut.close();
            }
        }
    }
}
