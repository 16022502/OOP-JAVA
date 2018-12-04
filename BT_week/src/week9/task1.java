/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author QUANG
 */
public class task1 {
    // lấy toàn bộ hàm static trong tệp đó qua các phép xử lý xâu
    public ArrayList<String> getAllFunction(String path) throws IOException{
        String str = Utils.readContentFromFile(path);
        
        // xu li str
        // mang arrLocationFunc chua vi tri bat dau cua cac ham public static function
        ArrayList<Integer> arrLocationFunc = new ArrayList<Integer>();
        
        // mang listFunc là danh sach chua source code cua tung hàm static
        ArrayList<String> listFunc = new ArrayList<String>();
        
        //int firstIndex = str.indexOf("public static");
        //arrLocationFunc.add(firstIndex);
        int value;
        
        // tim ra vi tri bat dau cua cac ham static trong tep
        for (int i = 0; i < str.length(); i+=20) {
            value = str.indexOf(" ", i+10);
            if(value != -1){
                
                arrLocationFunc.add(value-10);
                i = value;
            }
        }
        //
        for (Integer values : arrLocationFunc ) {
          //  System.out.println(values);
        }
        
        // cat source code
        for (int i = 0; i < arrLocationFunc.size() -1; i++) {
            String sub = str.substring(arrLocationFunc.get(i),arrLocationFunc.get(i+1));
            //String sub1 = sub.substring(0,sub.indexOf("public"));
            //System.out.println(sub1);
            
            String funcContent = sub.substring(sub.indexOf("public static"), sub.lastIndexOf("}") +1 );
            //System.out.println(funcContent);
           listFunc.add(funcContent);
        }
        
        // in ra ds cac ham static
        for (int i = 0; i < listFunc.size(); i++) {
          //  System.out.println(listFunc.get(i));
        }
       return listFunc;
        
    }
    
    
    // tim kiem 1 ham trong tep
    public String findFunctionByName(String name,String path) throws IOException{
        String result = "";
        ArrayList<String> listFunc = new ArrayList<>();
        listFunc = getAllFunction(path);
                 
            // cat ten ham can tim
            String nameFuncSearch = name.substring(0,name.indexOf("("));
           // System.out.println(nameFuncSearch);
            // cat kieu tham so
            String argumentTypeSearch = name.substring(name.indexOf("(") +1, name.lastIndexOf(")"));
            String[] arrArgumentsTypeSearch = argumentTypeSearch.split(",");
            for (String argumentType1 : arrArgumentsTypeSearch) {
               // System.out.println(argumentType1);
        }
          // xet tung function trong tep  
        for (int i = 0; i < listFunc.size(); i++) {
            String subFunc = listFunc.get(i);
            // cat lay dong tieu de function
            String lineTilteFunc = subFunc.substring(0, subFunc.indexOf("{"));
            
            // cat dong lineTilteFunc lay ra ten Func va ten tham so
         //   String nameFunc =  lineTilteFunc.substring(lineTilteFunc.indexOf())
           String argumentType = lineTilteFunc.substring(lineTilteFunc.indexOf("(")+1, lineTilteFunc.indexOf(")"));
           String[] arrArgumentType = argumentType.split(" ");            
           
           for (String argumentType1 : arrArgumentType) {
             //  System.out.println(argumentType1 );
        }
            System.out.println("");
           int count = 0;
           boolean check = false;
           if(arrArgumentsTypeSearch.length == arrArgumentType.length/2){
               for (int j = 0; j < arrArgumentsTypeSearch.length; j++) {
                   if (arrArgumentsTypeSearch[j].equals(arrArgumentType[j*2])) {
                     //  System.out.println(arrArgumentType[j*2]);
                     //  System.out.println(arrArgumentsTypeSearch[j]);                     
                       count++;
                   }
               }
              // System.out.println(count);
               if(count == arrArgumentsTypeSearch.length) check = true;
           }
           
           if(lineTilteFunc.contains(nameFuncSearch) && check == true){
               result = listFunc.get(i);
           }                 
        }
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        task1 test = new task1();
        ArrayList<String> arr =  new ArrayList<>();
        arr = test.getAllFunction("C:\\Users\\QUANG\\Desktop\\OOP\\OOP-JAVA\\BT_week\\src\\week9\\Utils.java");
        for (String string : arr) {
            System.out.println(string);
            System.out.println("---------------------");
        }
        
                
        
        //System.out.println(test.findFunctionByName("findFileByName(String,String)", "C:\\Users\\QUANG\\Desktop\\OOP\\OOP-JAVA\\BT_week\\src\\week9\\Utils.java"));
    }
}
