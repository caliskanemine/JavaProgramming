package Replits;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {


    /*
    ### It is finally time for you to use Scanner yourself!
### You will be accepting 3 numbers from the console (Using Scanner) and adding them together
- Declare four `int` variables: `num1, num2, num3, sum`
- Create a `Scanner` object named `scan`
#### Your program should follow this flow:
- Console shows: Enter 3 numbers:
> Using Scanner take three inputs from the console and store the values into your variables num1, num2, and num3
- Add the three numbers and assign the result to the `sum` variable
- Finally, print the following:
```
 Sum of numbers: $ValueOfSum
```
```
Ex:
    Enter 3 numbers:
      4
      6
      2
    Sum of numbers: 12
```
Main topics: variables, primitive datatypes, Scanner, concatenation, operators
     */

    Scanner scan= new Scanner(System.in);
        System.out.println("Enter three number");
    int num1= scan.nextInt();
    int num2= scan.nextInt();
    int num3= scan.nextInt();

    int sum= num1+num2+num3;
        System.out.println("Sum of numbers: "+ sum);






}



}
