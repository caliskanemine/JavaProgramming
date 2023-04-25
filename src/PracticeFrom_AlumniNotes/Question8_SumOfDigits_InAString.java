package PracticeFrom_AlumniNotes;

public class Question8_SumOfDigits_InAString {

    public static void main(String[] args) {

        /*
        String -- sum of digits in a string
       Write a method that can return the sum of the digits in a string
         43 56


        String first= "4356";


       int total=0;

       char[] ch= first.toCharArray();
        for (char eachFirst : ch) {
            if (Character.isDigit(eachFirst)){
                total+=Integer.valueOf(""+eachFirst);
            }
        }
        System.out.println(total);


         */


        String num ="45678";

        int total=0;

        char[] ch = num.toCharArray();

        for (char each : ch) {
            if (Character.isDigit(each))
        total+=Integer.valueOf("" + each);

        }

        System.out.println(total);

    }





}
