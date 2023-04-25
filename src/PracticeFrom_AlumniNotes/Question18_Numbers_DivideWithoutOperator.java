package PracticeFrom_AlumniNotes;

public class Question18_Numbers_DivideWithoutOperator {

    public static void main(String[] args) {

        /*
        Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
         */

        //20/2 10
        int first=23;
        int second=7;

        int bölüm=0;

        while (first>=second){
            first-=second;
        bölüm++;

        }
        System.out.println( "bölüm " + bölüm + " kalan " + first);




    }
}
