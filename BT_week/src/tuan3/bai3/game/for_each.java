/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3.bai3.game;

/**
 *
 * @author QUANG
 */
public class for_each {
    public static void main(String[] args) {
        String name = "Than Hoa Trieu Quang Hai Anh Phương Van Huy Quoc Huyen";
        String[] names = name.split(" ");
        
        for (String name1 : names) {
            System.out.println(name1);
        }
        
        int[] values = {1,2,3,4,5,6,7,8};
        for (int value : values) {
            System.out.println("x = " + value);
        }
        
    }
}
