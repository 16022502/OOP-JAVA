/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.version1;

/**
 *
 * @author QUANG
 */
public class Word {
    private String word_target;
    private String word_explain;
    
    public Word( String a, String b){
        this.word_target = a;
        this.word_explain = b;
    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
   
}
