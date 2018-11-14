/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08.exp1;

/**
 *
 * @author QUANG
 */
public class ExpressionTest {
    public static void main(String[] args) {
        try {
            // tinh bieu thuc 10^2 - 1 + 2*3)^2
            Square square = new Square(new Numberal(10));
            Subtraction sub = new Subtraction(square,new Numberal(1) );
            Multiplication mul = new Multiplication( new Numberal(2), new Numberal(3));
            Addition add = new Addition(sub, mul);
            Square result = new Square(add);
            System.out.println(result.toString());
            
            // chia 
            System.out.println(new Division(result, square).toString());
            System.out.println(new Division(result, new Numberal(0)).toString());
            
            
            
            
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0.");
        }
    }
}
