package ShortVideosPractices;

public class CustomMethods_parameters {

    public static void main(String[] args) {

        displayValue(10);
        System.out.println("---------------");
        eligibleToVote(23, false);
        System.out.println("-----------------");
        oddOrEven(200);


    }
    public static void displayValue(int num)//
    {
         System.out.println("The value is: "+num);
    }

        public static void eligibleToVote(int age, boolean isUSCitizen){
if (age>= 18 && isUSCitizen){
    System.out.println("Eligible to vote");
}else{
    System.out.println("Not eligible to vote");
}

    }

    public static void oddOrEven(int number){
        if (number % 2== 0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }
}
