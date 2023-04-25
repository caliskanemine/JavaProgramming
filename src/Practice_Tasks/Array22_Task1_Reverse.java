package Practice_Tasks;

import java.util.Arrays;

public class Array22_Task1_Reverse {
    public static void main(String[] args) {

        /*
        1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};
		output:
			reverse = { {6,5,4}, {3,2,1},};

         */

      int[][] numbers= { {1,2,3}, {4,5,6}};



        for (int i = (numbers.length)-1; i >= 0; i--) {

            for (int j = numbers[i].length-1; j>= 0; j--) {
                System.out.print(numbers[i][j]+" ");
            }

            }






    }
}
