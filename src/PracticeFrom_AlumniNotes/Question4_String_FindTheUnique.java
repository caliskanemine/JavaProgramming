package PracticeFrom_AlumniNotes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Question4_String_FindTheUnique {

    public static void main(String[] args) {

        /*
        String -- Find the unique
        Write a return method that can find the unique characters from the String
        Ex: unique("AAABBBCCCDEF") ==> "DEF";
         */

       String metin = "AAABBBCCCDEF";

       String result ="";

       for(String each : metin.split("")){
        if (Collections.frequency(Arrays.asList(metin.split("")),each)==1) {
           result+=each;
        }

       }
        System.out.println(result);










    }

}
