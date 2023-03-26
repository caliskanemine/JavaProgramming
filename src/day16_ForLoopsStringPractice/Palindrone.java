package day16_ForLoopsStringPractice;

public class Palindrone {
    public static void main(String[] args) {
        String word = "Level";

        String reserved= "";
        for (int i = word.length()-1; i>=0; i--) {
           reserved += word.charAt(i);

        }
        boolean isPalindrone= word.equalsIgnoreCase(reserved);

        System.out.println("isPalindrone = " + isPalindrone);
                
    }
}
