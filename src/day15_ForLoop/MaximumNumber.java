package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        /*
        Write a program that asks the user to enter a number for 5 times.
         return the maximum number
         */

        Scanner scan= new Scanner(System.in);
        int max= -2147483648;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number:");
           int num=  scan.nextInt();

           if (num > max){
               max= num;
           }
        }

        System.out.println("max = " + max);









    }
}
