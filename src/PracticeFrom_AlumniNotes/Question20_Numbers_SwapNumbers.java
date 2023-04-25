package PracticeFrom_AlumniNotes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question20_Numbers_SwapNumbers {

    public static void main(String[] args) {


/*
Numbers -- Swap Numbers
Swap two variable' values without using a third variable
 */

        int[] numbers={1,2};
        numbers [0]=2;
        numbers [1]=1;
        System.out.println(Arrays.toString(numbers));


        int first=5;
        int second=10;

          first=first+second; //15(first ün yeni değeri)=5+10
          second=first-second;//5(second ın yeni değeri)=15-10
          first=first-second;//10(first ün son hali)=15-5
        System.out.println("first = " + first);
        System.out.println("second = " + second);


    }
}
