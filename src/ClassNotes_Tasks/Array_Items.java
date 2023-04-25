package ClassNotes_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Items {
    public static void main(String[] args) {

        /*
        5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
         */

        String[] items= new String[5];
        double[] prices= new double[5];


        Scanner scan= new Scanner(System.in);
        double sumofprice=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter item name:");
            items[i]= scan.next();
            System.out.println("Enter price:");
            prices[i]= scan.nextDouble();
            sumofprice+= prices[i];
        }
        System.out.println(Arrays.toString(items) );
        System.out.println(Arrays.toString(prices));
        System.out.println(sumofprice);
        System.out.println(items[0]+"= $"+ prices[0]);
        System.out.println(items[1]+"= $"+ prices[1]);
        System.out.println(items[2]+"= $"+ prices[2]);
        System.out.println(items[3]+"= $"+ prices[3]);
        System.out.println(items[4]+"= $"+ prices[4]);










    }
}
