package day16_ForLoopsStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        /*
        2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

         */
        String str= "aabbaacc";
        String result= "";

        for (int i=0; i<= str.length()-1; i++){ //i: represents the all the index numbers of str(start from 0)
            String ch= ""+str.charAt(i); //represents each character of str

            if (!result.contains(ch)){ //if the character is not contained in the result
            result += ch; // the character will be added to the result
        }

        }
        System.out.print(result);


    }
}
