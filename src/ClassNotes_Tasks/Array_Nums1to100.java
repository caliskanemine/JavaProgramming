package ClassNotes_Tasks;

import java.util.Arrays;

public class Array_Nums1to100 {

    public static void main(String[] args) {

    int[] numbers= new int[100];
        int max = numbers[0];
        int min= numbers[0];

        for (int i= 0; i< 100 ; i++) {

            numbers[i] = i + 1;


            if (numbers[i] > max)
                max = numbers[i];

            if (numbers[i]< min)
                min= numbers[i];

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);







    }
}
