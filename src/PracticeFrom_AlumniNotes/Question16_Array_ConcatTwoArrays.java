package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.List;

public class Question16_Array_ConcatTwoArrays {

    public static void main(String[] args) {


        /*
        Array -- Concat two arrays
        Write a return method that can concate two arrays
         */

        int[] first= {1,3,5,7,9};
        int[] second={2,4,6,8,10};

      //  int[] concat= new int[first.length+ second.length];

       List<Integer> concat= new ArrayList<>();
        for ( int eachFirst : first) {
            concat.add(eachFirst);
        }
        for (int eachSecond : second) {
            concat.add(eachSecond);

        }
        System.out.println(concat);


































    }
}
