package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Question29_SortingDescending {

    public static void main(String[] args) {



        /*
        ArrayList -- sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
         */
      /*  String result="";

        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));



        for (int i = numbers.size() - 1; i >= 0; i--) {
           result+=" "+numbers.get(i);
        }
        System.out.println(Arrays.asList(result));


       */




        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,3,2,4));

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    Integer temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j,temp);

                }

            }

        }
              System.out.println(numbers);



    }

}
