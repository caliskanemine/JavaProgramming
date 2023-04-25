package Practice_Tasks;

import java.util.Arrays;

public class Array20_Task6_OnesToEnd {
    public static void main(String[] args) {
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */

int nums[]= {10, 0, 5, 0, 1, 0};

int result[]= new int[nums.length];

int j= 0;

        for (int i = 0; i < nums.length ; i++) {

            if (nums[i]!= 0){
               result[j++]= nums[i];
            }
        }
        System.out.println(Arrays.toString(result));










    }
}
