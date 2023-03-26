package day15_ForLoop;

import java.io.FilterOutputStream;

public class ForLoopPractices {
    public static void main(String[] args) {

        //15 16 17 18.......45

        /*System.out.println(15);
        System.out.println(16);
        ....
        System.out.println(45);
        */
        for (int i = 15; i <= 45; i++) { //i; 15 16 17.... 45
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println("----------------------");
        //100 99 98 97.......50

        for (int e = 100; e >= 50; e--) {
            System.out.print(e + " ");
        }

        System.out.println();

        // print all the even numbers between 1-55

        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }


        }

    }
}
