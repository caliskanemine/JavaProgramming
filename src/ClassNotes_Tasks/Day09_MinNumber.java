package ClassNotes_Tasks;

public class Day09_MinNumber {
    public static void main(String[] args) {

       /* 1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers,
        if both are equal then print Equal
        Ex:
        n1= 100, n2 = 200;
        output:
        100 is the minimum number
        n1 & n2
        possibility #1: n1 is Min
        possibility #2: n2 is Min
        possibility #3: equal
*/

        int number1= 100;
        int number2= 200;

        /*
        if (number1< number2){
            System.out.println(number1+ " is the minimum number");
        }if (number2< number1){
            System.out.println(number2+ " ia the minimum number");
        }if (number1== number2){
            System.out.println(number1+ " is equal to "+number2);
        }

         */

        boolean number1IsMin= number1< number2;
        boolean number2IsMin= number2< number1;
        boolean equal= number1== number2;

        if (number1IsMin){
            System.out.println(number1+ " is the minimum number");
        }if (number2IsMin){
            System.out.println(number2+ " is the minimum number");
        }if (equal){
            System.out.println("equal");
        }














    }
}
