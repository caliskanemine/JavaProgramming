package Practice_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array21_EvenOddNumbers {
    public static void main(String[] args) {

        /*
        2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
         */

        int[] numbers= {1,2,3,4,5,6,7,8,9,10};

        for (int number : numbers) {
            if (number%2== 0){
                System.out.println(number+ " is even number");
        }
            if (number%2 != 0){
                System.out.println(number+ " is odd number");
            }

        }









    }
}
