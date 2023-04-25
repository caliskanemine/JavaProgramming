package Practice_Tasks;

import java.util.Arrays;

public class Array20_Task5_Reverse {
    public static void main(String[] args) {

        /*
        5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
         */

        int numbers[]= {1,2,3,4,5};
        int reversedArray[]= new int[numbers.length];

        for (int i = numbers.length-1; i >=0 ; i--) {
        reversedArray[i]= numbers[i];
        }
        System.out.println(Arrays.toString(reversedArray));






    }
}
