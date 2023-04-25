package PracticeFrom_AlumniNotes;

import java.util.Arrays;

public class Question2_String_SameLetters {


    public static void main(String[] args) {


/*
        String first= "abc";
        String second= "cba";

        char[] firstArray= first.toCharArray();
        char[] secondArray= second.toCharArray();


        //System.out.println(Arrays.toString(firstArray));
        //System.out.println(Arrays.toString(secondArray));

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        String a1="", a2="";

        for (char eachFirst : firstArray) {
            a1+=eachFirst;
        }

        for (char eachSecond : secondArray) {
            a2+=eachSecond;
        }

        System.out.println(a1.equals(a2));



 */

        String first="melhı";
        String second = "lemhı";

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();


        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        String a1 = "";
        String a2 = "";

        for (char eachFirst : firstArray) {
         a1 +=eachFirst;
        }
        for (char eachSecond : secondArray) {
            a2 +=eachSecond;
        }

        System.out.println(a1.equals(a2));

















        /*
        String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
         */
    }

 /*   public static boolean ifSameLetters(String a, String b){




    }


  */







}
