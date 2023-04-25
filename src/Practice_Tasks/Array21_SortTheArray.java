package Practice_Tasks;

import java.util.Arrays;

public class Array21_SortTheArray {
    public static void main(String[] args) {

        /*
        1. Write a program that sort the array of integer in descending order
         */

        int[] numbers= {1,2,3,4,5,6,7,8,9,10};

        int[] reversedNumbers= new int[numbers.length];

        int countOdd= 0;
        int countEven= 0;

        for (int number : numbers) {
            if (number% 2== 0){
                countEven++;
            }else{
                countOdd++;
            }

        }

        System.out.println(Arrays.toString(numbers)+ " has "+ countEven+ " even numbers and "+ countOdd+ " odd numbers.");






    }
}
