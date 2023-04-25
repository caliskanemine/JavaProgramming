package ClassNotes_Tasks;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class Array21_MergeTwoArrays {
    public static void main(String[] args) {

        /*
        1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
         */

        int[] arr1= {1,2,3,4};
        int[] arr2= {5,6};

        int[] arr3= new int[arr1.length+ arr2.length];

        int i=0;
        for (int each1 : arr1) {
            arr3[i++]= each1;
        }
        for (int each2 : arr2) {
            arr3[i++]= each2;
        }


        System.out.println(Arrays.toString(arr3));

















    }
}
