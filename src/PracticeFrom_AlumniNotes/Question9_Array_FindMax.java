package PracticeFrom_AlumniNotes;

import java.util.Arrays;

public class Question9_Array_FindMax {

    public static void main(String[] args) {


        /*
    Array -- Find Maximum
    Write a method that can find the maximum number from an int Array

         */

    /*
        int[] numbers = {1, 2, 7, 14, 3, 20};

        int max=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    max= numbers[i];
                }
            }
        }
        System.out.println(max);


     */



        int []num = {1,5,9,6,15};
        int max=0;
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num.length ; j++) {
                if (num[i] > num[j]){
                    max=num[i];

                }

            }

        }
        System.out.println(max);

    }

}