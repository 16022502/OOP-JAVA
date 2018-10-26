/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.version2;

import java.util.*;
import java.io.*;


/**
 *
 * @author QUANG
 */
public class DictionaryManagement{
    // ham nhap so luong tu va tu
    private Dictionary dic = new Dictionary();
    
    public void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
       int sizeWord = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < sizeWord; i++) {
            
            String word_target = sc.nextLine();
            String word_explain = sc.nextLine();
            Word word = new Word(word_target, word_explain);
            dic.listWord.add(word);
                 
    }
  
    }
    // ham show tat ca cac tu 
    public void showAllWords(){
        System.out.println("No\t|English\t \t|Vietnamese");
        int i = 1;
         for (Word word : dic.listWord){
             System.out.println(i +"\t|"+word.getWord_target() + "\t \t \t|" + word.getWord_explain());
             i += 1;
         }
    }
    
    public void showWords(ArrayList<Word> list){
        System.out.println("No\t|English\t \t|Vietnamese");
        int i = 1;
         for (Word word : list){
             System.out.println(i +"\t|"+word.getWord_target() + "\t \t \t|" + word.getWord_explain());
             i += 1;
         }
    }
    // Tim kiem cac tu
    public ArrayList<Word> dictionaryLookup(String key){
        ArrayList<Word> listSearch = new ArrayList<Word>();
        for(Word word : dic.listWord){
            if(word.getWord_target().contains(key))
            {
                listSearch.add(word);
            }
        }
        return listSearch;
    }
   
    // Tim kiem tu
    public Word dictionaryLookupWord(String key){
        Word wordSearch = new Word();
        for(Word word : dic.listWord){
            if(word.getWord_target().contains(key))
        return wordSearch;
    }
        return null;
    }
    
    // sưa tu 
  //  public Word repairWord( )
    
    // ham nhap du lieu tu tệp txt
    public void insertFromFile() throws IOException {
        File file = new File("dictionaries.txt");
         if(!file.exists()){
            file.createNewFile();
        }
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] details = line.split("\t");
            if(details.length <2)
            {
                continue;
            }
            Word word = new Word(details[0], details[1]);
            dic.listWord.add(word);
           
        }
        
      
    }
}
