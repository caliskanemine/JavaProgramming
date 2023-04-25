package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.List;

public class Question11_Array_SortAscending {

    /*
    Array -- Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of
    the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

     */

    public static void main(String[] args) {

      List<Integer> sonuç= new ArrayList<Integer>();

        int[] arr = {10,9,7,8};

        for (int each : arr) {
            sonuç.add(each);
        }

        for (int i = 0; i < sonuç.size(); i++) {
            for (int j = 0; j < sonuç.size(); j++) {
                if (sonuç.get(i)<sonuç.get(j)){
                    Integer temp= sonuç.get(i);
                    sonuç.set(i, sonuç.get(j));
                }
            }
            
        }


      
    }
}
