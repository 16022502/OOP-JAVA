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
public class Addition extends BinaryExpression {
    Expression left;
    Expression right;
    
    public Addition(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return Integer.toString(this.evaluate());
    }

    @Override
    public int evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }
    
    
}
