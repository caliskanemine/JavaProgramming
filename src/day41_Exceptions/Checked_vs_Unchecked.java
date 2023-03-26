package day41_Exceptions;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

       //unchecked exceptions:

        int a= 10;
        int b= 0;
        // System.out.println(a/b); //arithmetic exception
        //System.out.println("Wooden Spoon");

        char[] characters= {'A', 'B', 'C'};
        //System.out.println(characters[99]); //arrayIndexOutOfBoundsException


        //checked exception:

        System.out.println("Hello");

        // Thread.sleep(3000);   interrupted exception

        System.out.println("Cydeo");

       //  FileInputStream file= new FileInputStream("Path of the file");  //fileNotFoundException


       // System.out.println("java".charAt(20000));  --> unchecked exception



    }
}
