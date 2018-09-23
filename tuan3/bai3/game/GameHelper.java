///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package tuan3.bai3.game;
////import java.io.*;
////import java.util.*;
//
//import java.io.*;
//import java.util.ArrayList;
//
///**
// *
// * @author QUANG
// */
//public class GameHelper {
//    private static final String alphabet = "abcdefg";
//    private int gridLength = 7;
//    private int gridSize = 49;
//    private int [] grid = new int[gridSize];
//    private int shipCount = 0;
//    
//    public String getUserInput(String prompt){
//        String inputLine = null;
//        System.out.println(prompt + " ");
//        try {
//            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
//            inputLine = is.readLine();
//            if(inputLine.length() == 0) return null;
//        }  catch (IOException e){
//            System.out.println("IOException: "+ e);
//        }
//        return inputLine.toLowerCase();
//    }
//    
//    public ArrayList<String> placeShip(int size){
//        ArrayList<String> alphaCells = new ArrayList<String>();
//        String [] alphacoords = new String [size]; // holds 'F6' type coords- dieu phoi
//        String temp = null; // temporary String for concat = chuoi tam thoi cho concat
//        int [] coords = new int[size]; // current candidate croods - ng dieu phoi hien tai
//        int attempts = 0; // current attempts counter = 
//        
//        boolean success = false; // flag = found a good location ? // cờ = tìm thấy một vị trí thích hợp
//        
//        
//        
//        
//    }
//}
//
//
//
