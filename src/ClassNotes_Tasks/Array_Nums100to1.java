package ClassNotes_Tasks;

import java.util.Arrays;

public class Array_Nums100to1 {
    public static void main(String[] args) {

int[] numbers= new int[100];
int max= numbers[numbers.length-1];
int min= numbers[numbers.length-1];

        for (int i = numbers.length-1; i >=0; i--) {
         numbers[i]= numbers.length-i;
         if (numbers[i]> max)
             max= numbers[i];

         if (numbers[i]< min)
             min= numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);









    }
}
