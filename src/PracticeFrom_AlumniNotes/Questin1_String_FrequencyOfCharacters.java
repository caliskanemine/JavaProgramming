package PracticeFrom_AlumniNotes;

public class Questin1_String_FrequencyOfCharacters {


    /*
    Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

   /* public static void main(String[] args) {

            String name = "AAABBCDD";

            int count=0;

            for (int i = 0; i < name.length() ; i++) {
                System.out.println(name.charAt(i));
                if (name.charAt(i)==name.charAt(i)){
                    count++;
                }
                System.out.println(count);


            }





*/

    public static void main(String[] args) {



        String input= "aaaabbcccdeeee";
        String result="";
        int count=0;

        for (int i = 0; i <input.length() ; i++) {
           count=0;
            for (int j = 0; j <input.length() ; j++) {

                if (input.charAt(i)==input.charAt(j)){
                    count++;
                }
            }

            if (!result.contains(input.substring(i, i+1))){
                result+= input.substring(i, i+1)+ count;
            }


        }

        System.out.println(result);


























        // "aaaabbcccdeeee" output: a4b2c3d1e4
       /* String input = "aaaabbcccdeeee";

        String result = "";

        int count=0;

        for (int i = 0; i <input.length(); i++) {
            count=0;
            for (int j = 0; j <input.length(); j++) {
                if (input.charAt(i)==input.charAt(j)){
                    count++;
                }


            }
            if (!result.contains(input.substring(i, i+1))){
                result+=input.substring(i, i+1) + count;
            }
        }
        System.out.println(result);


        */




    }











}
