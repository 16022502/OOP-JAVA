//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package view;
//
//import java.util.*;
//import java.io.*;
//
//
///**
// *
// * @author QUANG
// */
//public class DictionaryManagement{
//    // ham nhap so luong tu va tu
//    
//     Scanner sc = new Scanner(System.in);
//     
//     
//         // ham doc du lieu tu tệp txt
//    public static void insertFromFile() throws IOException {
////        File file = new File("dictionaries.txt");
////         if(!file.exists()){
////            file.createNewFile();
////        }
//         File file = new File("dictionaries.txt");
//         BufferedReader in = new BufferedReader(
//		   new InputStreamReader(
//                      new FileInputStream(file), "UTF8"));
//        Scanner sc = new Scanner(in);
//        while(sc.hasNextLine()){
//            String line = sc.nextLine();
//            String[] details = line.split("\t");
//            if(details.length <2)
//            {
//                continue;
//            }
//            Word word = new Word(details[0], details[1]);
//            dic.listWord.add(word);
//           
//        }  
//    }
//
//        
//   
//    // ham show tat ca cac tu 
//    public void showAllWords(){
//       
//        int i = 1;
//         for (Word word : dic.listWord){
//            System.out.println(i +"\t|"+word.getWord_target() + "\t \t \t|" + word.getWord_explain());
//             i += 1;
//         }
//    }
//    
//    public void showWords(ArrayList<Word> list){
//        System.out.println("No\t|English\t \t|Vietnamese");
//        int i = 1;
//         for (Word word : list){
//             System.out.println(i +"\t|"+word.getWord_target() + "\t \t \t|" + word.getWord_explain());
//             i += 1;
//         }
//    }
//    // Tim kiem cac tu
//    public ArrayList<Word> dictionaryLookup(String key){
//        ArrayList<Word> listSearch = new ArrayList<Word>();
//        for(Word word : dic.listWord){
//            if(word.getWord_target().contains(key))
//            {
//                listSearch.add(word);
//            }
//        }
//        return listSearch;
//    }
//    
//    // add word to listWord : them
//    public void add() throws FileNotFoundException, IOException {
//        System.out.println("Input word target: ");
//        String wordTarget = sc.nextLine();
//        System.out.println("Input word explain: ");
//        String wordExplain = sc.nextLine();
//        Word word = new Word(wordTarget, wordExplain);
//        dic.listWord.add(word);
//        write(dic.listWord);
//        
//        
//    }
//   
//    // Tim kiem tu
//    public  Word dictionaryLookupWord(String key){
//       // Word wordSearch = new Word();
//        for(Word word : dic.listWord){
//            if(word.getWord_target().contains(key))
//        return word;
//    }
//        return null;
//    }
//    
//   // sưa tu 
//   public void repairWord( ) throws IOException{
//        Word wordRepair = new Word();
//       System.out.println("Nhap tu can sua: ");
//                String key = sc.nextLine();
//               
//       wordRepair = dictionaryLookupWord(key);
//       System.out.println("Sua tu thanh: ");
//       String repairWordTarget = sc.nextLine();
//       System.out.println("Sua nghia tu thanh: ");
//       String repairWordExplain = sc.nextLine();
//       wordRepair.setWord_target(repairWordTarget);
//       wordRepair.setWord_explain(repairWordExplain);
//       for(Word word: dic.listWord){
//           if(word.getWord_target().equals(key)){
//               int index = dic.listWord.indexOf(word);
//               dic.listWord.set(index,wordRepair );    
//               
//       }
//            
//   }
//       writeAll(dic.listWord);
//   }
//   
//  
//    
//    // ham doc du lieu tu tệp txt
//    public void insertFromFile() throws IOException {
////        File file = new File("dictionaries.txt");
////         if(!file.exists()){
////            file.createNewFile();
////        }
//         File file = new File("dictionaries.txt");
//         BufferedReader in = new BufferedReader(
//		   new InputStreamReader(
//                      new FileInputStream(file), "UTF8"));
//        Scanner sc = new Scanner(in);
//        while(sc.hasNextLine()){
//            String line = sc.nextLine();
//            String[] details = line.split("\t");
//            if(details.length <2)
//            {
//                continue;
//            }
//            Word word = new Word(details[0], details[1]);
//            dic.listWord.add(word);
//           
//        }  
//    }
//    
//    // ghi 1 tu vao file 
//     public static void write(ArrayList<Word> listWord ) throws FileNotFoundException, IOException {
////         Writer output;
////         output = new BufferedWriter(new FileWriter("dictionaries.txt",true));
//         Writer output;
//         output = new BufferedWriter(new OutputStreamWriter(
//					new FileOutputStream("dictionaries.txt"), "UTF8"));
//         output.append(System.getProperty( "line.separator" ));
//         output.append(listWord.get(listWord.size() - 1).getWord_target() + "\t");
//         output.append(listWord.get(listWord.size()-1).getWord_explain());
//        
//         output.close();
//    }
//     
//     // ghi lai tat ca tu vao file 
//     public  void writeAll( ArrayList<Word> listWord ) throws IOException{
//         Writer output;
//         output = new BufferedWriter(new OutputStreamWriter(
//					new FileOutputStream("dictionaries.txt"), "UTF8"));
//         int i = 0;
//         for(Word word: dic.listWord){
//             
//            output.append(listWord.get(i).getWord_target() + "\t");
//             output.append(listWord.get(i).getWord_explain());
//             output.append(System.getProperty( "line.separator" ));
//             i++;
//             
//         }
//         output.close();
//     }
//     
//     
//    // xoa tư
//         
//    public void removeWord() throws IOException{
//        Word wordRemove = new Word();
//        System.out.println("Nhap tu can xoa: ");
//                String key = sc.nextLine();
//        wordRemove = dictionaryLookupWord(key);
//     //   System.out.println(wordRemove.equals(dic.listWord.get(20)));
//        dic.listWord.remove(wordRemove);
//        writeAll(dic.listWord);
//        
//    }
//
//    private void closeStream(ObjectOutputStream fos) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void closeStream(FileOutputStream fos) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//}
