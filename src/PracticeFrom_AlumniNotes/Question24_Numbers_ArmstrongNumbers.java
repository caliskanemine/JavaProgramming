package PracticeFrom_AlumniNotes;

public class Question24_Numbers_ArmstrongNumbers {

    public static void main(String[] args) {

        /*
        Numbers -- Armstrong numbers
Write a method that can check if a number is Armstrong number
         */

     int sayı=121;

     int basamaktakiSayı=0;
     int result=0;
     int copy= sayı;

        for (int i = 1; i <=3 ; i++) {
            basamaktakiSayı= copy%10;
            result+= basamaktakiSayı*basamaktakiSayı*basamaktakiSayı;
           copy= sayı/10;
        }

        System.out.println(result==sayı);


    }
}
