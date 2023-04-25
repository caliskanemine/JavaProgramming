package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.List;

public class Question15_Array_MoveZerosToEnd {

    public static void main(String[] args) {

      /*
        Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
        Ex:
        input: {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
       */

        ArrayList<Integer> list = new ArrayList<>();

        int[] numbers={1,0,2,0,3,0,4,0};

       // int [] result= new int[8];
        int result;


        for (int each : numbers) {
              if (each!=0)
               list.add(each);
        }
        System.out.println(list);







    }
}
