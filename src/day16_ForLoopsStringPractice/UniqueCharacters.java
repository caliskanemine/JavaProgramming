package day16_ForLoopsStringPractice;

public class UniqueCharacters {
    /*
    3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

     */
    public static void main(String[] args) {
        String str= "aaabccc";
        String result= "";
        if (str.indexOf('a') == str.lastIndexOf('a')){ //if the first and last index numbers of the character are same, the ch is unique.
            result += 'a';
            System.out.println(result);
        }





    }





}
