package PracticeFrom_AlumniNotes;

import java.util.Arrays;

public class Question3_RemoveDuplicates {
   /* String -- Remove Duplicates
    Write a return method that can remove the duplicated values from String
    Ex: removeDup("AAABBBCCC") ==> ABC
    */
    public static void main(String[] args) {


        String text= "AAABBBCCC";
        String result="";



       /* for (int i = 0; i <text.length() ; i++) {

            if (!result.contains(""+text.charAt(i))){
                result+=""+text.charAt(i);
            }
        }
        System.out.println(result);


        */
/*
        for (int i = 0; i <text.length() ; i++) {
           if (!result.contains("" + text.charAt(i))){
               result+= ""+ text.charAt(i);
            }
        }

        System.out.println(result);


 */


        for (int i = 0; i < text.length(); i++) {
            if (!result.contains(""+text.charAt(i)))
       result+=""+text.charAt(i);
        }
        System.out.println(result);


    }
}
