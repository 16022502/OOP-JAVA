/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author QUANG
 */
public class Week4 {
    // Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về là giá trị max
    public static int max(int a, int b){
        if(a >= b) return a;
        else return b;
    }
    
    
    // Tìm giá trị nhỏ nhất của mảng số nguyên, giá trị trả về là phần tử min
    public static int minOfArray( int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
}
    
    
    // chương trình tính chỉ số BMI và in ra kết quả đánh giá
    public static String calculateBMI(double weight, double height){
        double BMI = weight/(height * height);
        if(BMI < 18.5) return "Thieu can";
        else if(BMI >= 18.5 && BMI < 23) return "Binh thuong";
        else if(BMI >= 23 && BMI < 24.99) return "Thua can";
        else return "Beo phi";
    }

    public static void main(String[] args) {
        
    }
}
