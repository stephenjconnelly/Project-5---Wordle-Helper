//
//  WordTest.java
//
//  Class to test WordLists
//  Programming Project 5, COMS W1004
//
//
//  Your Name: Stephen James Connelly
//  Your Uni: Sjc2335
//**************************************

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class WordTest{

    public static void main(String[] args){
    try{ 
        //filters master and sets this equal to new array list 'myList'
        ArrayList<String> myList=WordLists.lengthN(Master(),4);
        myList=WordLists.letterAt(myList,'j',0);
        myList=WordLists.notAt(myList,'v',1);
        myList=WordLists.notIn(myList,'e');
        myList=WordLists.notIn(myList,'i');
        //creates new file and prints strings into it
        PrintWriter output = new PrintWriter("out.txt");
        for(int i =0; i<myList.size(); i++ ){
            output.println(myList.get(i));
        }
        output.close();
    }
    //catches error if user inputs file that doesn't exist
    catch(IOException e){
        System.out.println("Restart program and input correct file name.");
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    //adds to master arraylist from scanned contents of user inputted file
    public static ArrayList<String> Master() throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("which file would you like to import? Ex. in.txt ");
        String file = scanner.nextLine();
        File wordlist = new File(file);
        Scanner input = new Scanner(wordlist);
        String word;
        ArrayList<String> master = new ArrayList<String>();
            while(input.hasNext()){
                word = input.nextLine();
                master.add(word);
            }
        return master;
    }
}