package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Question27_RemoveSomeValues {

    public static void main(String[] args) {

        /*
        ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
         */

        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        numbers.removeIf(eachh-> eachh%2==0);
        System.out.println(numbers);
     /*
        for (Integer each : numbers) {

            if (each%2==0){
                continue;
            }else{
                System.out.print(" "+each);
            }
        }
          */


    }
}
