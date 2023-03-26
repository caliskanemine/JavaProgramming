package day42_Exceptions;

import static java.lang.Thread.*;

public class MorningWorkOut {

    public static void main(String[] args){

        System.out.println("------Push up started-----");

        for (int i = 0; i <= 30 ; i++) {

        System.out.println("Push up "+i);

        sleep(2.5);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

        System.out.println("Push ups completed");

    }

   public static void sleep(double seconds){
       try {
           Thread.sleep((long)(seconds * 1000));
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }




}
