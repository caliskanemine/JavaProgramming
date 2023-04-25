package ClassNotes_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Array_AverageNumber {
    public static void main(String[] args) {

        /*
        4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
         int numbers= scan.nextInt();

        int length[]= new int[numbers];

        for (int i = 0; i < length.length; i++) {
            System.out.println("Enter a number");
            length[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(length));

        int sum= 0;
        for (int i = 0; i < length.length ; i++) {
            sum+= length[i];
        }

      double averageNumber= sum/ length.length;
        System.out.println("averageNumber = " + averageNumber);








    }
}
