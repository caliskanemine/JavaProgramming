package Practice_Tasks;

import java.util.Arrays;

public class Array21_MergeThreeArrays {
    public static void main(String[] args) {

        /*
        5. Write a program that can merge 3 arrays of integers
    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}
			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
         */

       int[] arr1 = {30, 10, 20};
       int[] arr2 = {15, 40, 25, 35};
       int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] result= new int[arr1.length+ arr2.length+ arr3.length];

       int j=0;

        for (int each1 : arr1) {
            result[j++] = each1;
        }

        for (int each2 : arr2) {
            result[j++] = each2;
        }

        for (int each3 : arr3) {
            result[j++] = each3;
        }

        System.out.println(Arrays.toString(result));










    }

}

