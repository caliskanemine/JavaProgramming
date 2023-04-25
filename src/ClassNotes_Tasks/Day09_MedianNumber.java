package ClassNotes_Tasks;

public class Day09_MedianNumber {
    public static void main(String[] args) {

        /*
        2. Create a class called MedianNumber. write a program that can find the median number between
        three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
         */

      int num1= 2; // 2 1 3  3 1 2
      int num2= 5; // 1 2 3  3 1 2
      int num3= 7; // 1 3 2  2 3 1

      boolean num1IsMedian= num1> num2 && num1< num3 || num3<num1 && num2>num1;

      boolean num2IsMedian= num2> num1 && num2< num3 || num3<num1 && num2>num1;

      boolean num3IsMedian= num1< num3 && num2> num3 || num2<num3 && num1>num3;

        if (num1IsMedian){
            System.out.println(num1+ " is the median number");
        }
        if (num2IsMedian){
            System.out.println(num2+ " is the median number");
        }
        if (num3IsMedian){
            System.out.println(num3+ " is the median number");
        }









    }
}
