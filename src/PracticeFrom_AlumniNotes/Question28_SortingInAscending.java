package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Question28_SortingInAscending {

    public static void main(String[] args) {

        /*
        ArrayList -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
         */




        String result="";

        ArrayList<Character> harfler= new ArrayList<>(Arrays.asList('b', 'd', 'g', 'n', 'f'));
        for (int i = 0; i < harfler.size(); i++) {
            for (int j = 0; j < harfler.size(); j++) {
                if (harfler.get(i)<harfler.get(j)){
                    Character temp=harfler.get(i);
                    harfler.set(i, harfler.get(j));
                    harfler.set(j, temp);
                }
            }
        }
        System.out.println(Arrays.asList(harfler));



    }
}
