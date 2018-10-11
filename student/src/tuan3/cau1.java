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
public class cau1 {
    public static int ucln(int a, int b){
        while (a != b) {            
            if(a > b) a = a -b;
            else b = b- a;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ucln(a,b));
    }
}
