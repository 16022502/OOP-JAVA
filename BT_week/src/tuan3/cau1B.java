/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

import java.util.Scanner;

/**
 *
 * @author QUANG
 */
public class cau1B {
    public static int soFibonaxi(int n) {
        if( n == 0) return 0;
        else if(n == 1) return 1;
        return soFibonaxi(n-1) +  soFibonaxi(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(soFibonaxi(n));
        
    }
}
