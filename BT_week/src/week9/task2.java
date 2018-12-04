/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Random;

/**
 *
 * @author QUANG
 */
public class task2 {
    public static void bubbleSort(){
        Random rd = new Random();
        double[] arr = new double[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = rd.nextInt(1000)+rd.nextDouble();
        }
        
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 999; j++) {
                if (arr[j] > arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
                
        }
        
        for (int i = 0; i < 1000; i++) {
            System.out.println(arr[i]);
        }
}
    public static void main(String[] args) {
        bubbleSort();
    }
        
}

