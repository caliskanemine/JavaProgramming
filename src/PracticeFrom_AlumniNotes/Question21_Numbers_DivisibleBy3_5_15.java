package PracticeFrom_AlumniNotes;

public class Question21_Numbers_DivisibleBy3_5_15 {

    public static void main(String[] args) {


        /*
        Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in
DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in
DivisibelBy5' section
         */
/*
        String result15="";
        String result3="";
        String resul5="";
        for (int i = 1; i <101 ; i++) {
            if (i%3==0 && i%5==0 && i%15==0){
                result15+= i+" ";
            }if (i%3==0 && i%15!=0){
                result3+=i+" ";
            }
            if (i%5==0 && i%15!=0){
               resul5+=i+" ";
            }
        }
        System.out.println("DivisibleBy15: "+result15);
        System.out.println("DivisibleBy3: "+result3);
        System.out.println("DivisibleBy5: "+resul5);


 */

        String result3 = "";
        String result5 = "";
        String result15 = "";


        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 15 != 0) {
                result3 += " " + i;

            }
            if (i % 5 == 0 && i % 15 != 0) {
                result5 += " " + i;
            }
            if (i % 15 == 0) {
                result15 += " " + i;
            }

        }

        System.out.println("DivisibleBy3: " + result3);
        System.out.println("DivisibleBy5: " + result5);
        System.out.println("DivisibleBy15: " + result15);


    }
}
