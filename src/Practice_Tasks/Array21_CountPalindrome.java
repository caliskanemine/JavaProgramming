package Practice_Tasks;

public class Array21_CountPalindrome {
    public static void main(String[] args) {

        /*
        4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
         */

        String[] words= {"anna", "level", "Java"};

        int count=0;


        for (String word : words) {

            String reverse="";
            for (int i = word.length()-1; i >=0; i--) {
                reverse += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reverse)){
               count++;
            }
        }
        System.out.println(count);









    }
}
