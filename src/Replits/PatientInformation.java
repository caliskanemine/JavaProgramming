package Replits;
import java.util.Scanner;

public class PatientInformation {



        public static void main(String[] args) {
            //Enter your code here
//Declare nine `String` variables: `firstName`, `lastName`, `email`, `street`, `state`, `city`
            String firstName = "",
                    lastName = "",
                    email = "",
                    street = "",
                    state = "",
                    city = "";
            //Declare two `int` variables: `age`, `zipCode`


            //Declare two `double` variables: `height`, `weight`

            //Declare a `boolean` variable: `isMarried`


            // Declare two `long` variables: `workPhoneNumber` ,`personalPhoneNumber`

            //Create a `Scanner` object named `scan`
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
            System.out.println("Enter your first name");
            firstName = scan.next();
            System.out.println("Enter your last name");
            lastName = scan.next();

            // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            email = scan.next();
            scan.nextLine();//to capture Enter key press
            System.out.println("Enter your street");
            street = scan.nextLine();

            // continue for city
            System.out.println("Enter your city");
            city = scan.next();
            System.out.println("Enter your state");
            state = scan.next();
            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();
            System.out.println("Enter your work phone number");
            long workPhoneNumber = scan.nextLong();
            System.out.println("Enter your personal phone number");
            long personalPhoneNumber = scan.nextLong();
            System.out.println("Enter your age");
            int age = scan.nextInt();
            System.out.println("Enter your height");
            double height = scan.nextDouble();
            System.out.println("Enter your weight");
            double weight = scan.nextDouble();
            System.out.println("Are you married?");
            boolean isMarried = scan.nextBoolean();
            System.out.println("Patient personal information");
            String fullName = firstName + " " + lastName;
            System.out.println(fullName);
            // Declare and assign an `address` variable using these inputs: *street, city, state, zip code* Use a comma and a space to separate each value
            String address = street + ", " + city + ", " + state + ", " + zipCode;
            System.out.println("address = " + address);

            //Declare and assign a `contact` variable using these inputs: *work phone, personal phone and email*. Use a comma and a space to separate each value
            String contact = "Work phone number: " + workPhoneNumber + ", Personal phone number: " + personalPhoneNumber + ", email: " +email;
            System.out.println("contact = " + contact);
            System.out.println("age = " + age);
            System.out.println("height = " + height);
            System.out.println("weight = " + weight);
            System.out.println("isMarried = " + isMarried);
        }

    }