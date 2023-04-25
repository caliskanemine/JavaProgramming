package PracticeFrom_AlumniNotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Question26_ArrayList_RemoveAhmed {

    public static void main(String[] args) {

        /*
        ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"....
         */

      /*  ArrayList<String> names= new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
       names.removeIf(p-> p.equals("Ahmed"));
        System.out.println(names);


       */


        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList( "Ahmed", "John", "Eric", "Ahmed"));
        names.removeIf(p-> p.equals("Ahmed"));
        System.out.println(names);



    }
}
