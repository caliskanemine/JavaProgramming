package ClassNotes_Tasks;

import java.util.Arrays;

public class Array22_ReverseSecondWord {
    public static void main(String[] args) {

        /*
        2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
         */

   String sentence= "I love Java";
   String[] words= sentence.split(" ");

   System.out.println(Arrays.toString(words));

   String reversedWord= "";

        for (int i= words[1].length()-1; i >=0 ; i--) {
            reversedWord += words[1].charAt(i);
        }
        System.out.println(reversedWord);

        words[1]= reversedWord;
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.print(word+ " ");
        }















    }
}
