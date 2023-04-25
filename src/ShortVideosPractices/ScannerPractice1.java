package ShortVideosPractices;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        // 1-Ask the user to enter an integer number
        System.out.println("Enter an integer number:");
        int number= input.nextInt();

        // 2- Ask the user to enter a decimal number
        System.out.println("Enter a decimal number:");
        double number2= input.nextDouble();

        //3- Ask user to enter a word
        System.out.println("Enter a word:");
        String word= input.next();

        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
        System.out.println("word = " + word);
















    }
}
