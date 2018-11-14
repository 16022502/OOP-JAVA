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
public class Square extends Expression{
    Expression expression;
    public Square(Expression e){
        this.expression = e;
    }

    @Override
    public String toString() {
        return Integer.toString(this.evaluate());
    }
    
        

    @Override
    public int evaluate() {
        return this.expression.evaluate() * this.expression.evaluate();
    }
    
}
