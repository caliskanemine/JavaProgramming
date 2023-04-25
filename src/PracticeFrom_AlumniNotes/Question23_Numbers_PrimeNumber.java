package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.List;

public class Question23_Numbers_PrimeNumber {

    public static void main(String[] args) {

/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not
 */

   boolean asal=true;
   int number=5;

        for (int i = 2; i <5 ; i++) {
            if (number%i==0){
                asal=false;
            }
        }
        if (asal){
            System.out.println(number + " is asal");
        }else {
            System.out.println(number + " is not asal");
        }








    }

}
