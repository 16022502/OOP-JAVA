/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.version1;

import java.util.Scanner;

/**
 *
 * @author QUANG
 */
public class DictionaryManagement extends Dictionary{
    
    public void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
       int sizeWord = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < sizeWord; i++) {
            
            String word_target = sc.nextLine();
            String word_explain = sc.nextLine();
            Word word = new Word(word_target, word_explain);
            ListWord.add(word);
                 
    }
  
    }
    
    public void showAllWords(){
        System.out.println("No\t|English\t \t|Vietnamese");
        int i = 1;
         for (Word word : ListWord){
             System.out.println(i +"\t|"+word.getWord_target() + "\t \t \t|" + word.getWord_explain());
             i += 1;
         }
    }
}
