package Practice_Tasks;

public class Day09_CharacterIdentity {
    public static void main(String[] args) {

        /*
        4. Create a class called Character Identity, and write a program that can identify if the given character
        is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
		output:
			Special Character
		HINT: You may wanna check out the numbers of the chracters on ASCII table
         */

        char ch= '@';
        String result= "";

        if (ch>= 0 && ch<=9){
            result= "Digit";
        } else if ((ch>= 'a' && ch<= 'z') || (ch>= 'A' && ch<= 'Z') ){
            result= "Alphabetic Character";
        }else{
            result= "Special Character";
        }

        System.out.println(result);
    }
}
