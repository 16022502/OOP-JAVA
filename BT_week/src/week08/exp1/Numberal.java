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
public class Numberal extends Expression{
    int value;
    
    public Numberal(){
        value = 0;
    }
    
    public Numberal(int vl){
        this.value = vl;
    }

    @Override
    public String toString() {
        return "Numberal{" + "value=" + value + '}';
    }

    @Override
    public int evaluate() {
        return this.value;
    }
    
  
          
}
