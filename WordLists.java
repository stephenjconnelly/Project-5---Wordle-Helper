//*************************************
//
//  WordLists.java
//
//  Class to aid with Wordle
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Stephen James Connelly
//  Your Uni: Sjc2235
//**************************************

import java.util.ArrayList;


public class WordLists{
   // returns a new ArrayList of all length n Strings in the ArrayList words.
   public static ArrayList<String> lengthN(ArrayList<String> words, int n){ 
      ArrayList<String> lengthN = new ArrayList<String>();
      //makes sure n is not a negative value. Returns an empty array if so.
      if(n < 0){
      return lengthN;
      }else{
         for(int i =0; i<words.size(); i++ ){
            if(words.get(i).length() == n){
               lengthN.add(words.get(i));
            }
         }
         return lengthN;
      }
   }
   //words that have the letter included at position index
   public static ArrayList<String> letterAt(ArrayList<String> words, 
      char included, int index){
      ArrayList<String> letterAt = new ArrayList<String>();
      //makes sure index is not a negative value. Returns empty array if so.
      if(index < 0){
         return letterAt;
      }else{
         for(int i =0; i<words.size(); i++ ){
            if(words.get(i).charAt(index) == included){
               letterAt.add(words.get(i));  
            }
         }
      return letterAt;
      }
   }
   // words that are included, but not at position index
   public static ArrayList<String> notAt(ArrayList<String> words,
      char included, int index){
      ArrayList<String> notAt = new ArrayList<String>();
      if(index < 0){
         return notAt;
      }else{
         //iterates through strings and their letters
         for(int i =0; i<words.size(); i++){
            for (int j =0; j<words.get(i).length(); j++){
               if(words.get(i).charAt(j) == included && 
                  words.get(i).charAt(index) != included){
                  notAt.add(words.get(i));
               }
            }
         }
         return notAt;
      }  
   }
   // words that do not include the letter included anywhere. 
   public static ArrayList<String> notIn(ArrayList<String> words,
      char included){
      ArrayList<String> notIn = new ArrayList<String>(); 
      int counter = 0;
      Boolean contains = true; 
      //loops through chars of strings and strings themselves
         for(int i =0; i<words.size(); i++ ){
            for (int j =0; j<words.get(i).length(); j++){
               //boolean to keep track of if 'included' is in the string
               if(words.get(i).charAt(j) == included){
                  contains = false;
               }     
            } 
            //adds all words that do not have 'included'
            if (contains == true){
               notIn.add(words.get(i));
            }
         contains = true;
         counter=0;
         }
      return notIn;    
   }
}

