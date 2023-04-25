package Practice_Tasks;

public class Day23_Task1_Numbers1to100 {


    public static void main(String[] args) {

  }


    //1. create a method that can print odd numbers between 1~100 in a same line saperated by space
    public static void printOddNumbers() {


        for (int i = 1; i <100 ; i++) {
            if (i %2!= 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();





    }


  // 2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void printOvenNumbers(){

        for (int i = 1; i <100 ; i++) {
            if (i %2 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
    }

    // 3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleToBuyAlcohol(int age){


        if (age >= 18){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }
    }


    /*4. create a method that can check if a person is eligible to vote
    			Ex:
    				eligibleToVote(19, "USA");
    		output:
    				You are not eligible to vote!
    				*/
    public static void eligibleToVote(int age, String citizen){

        if (age >= 18 && citizen.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }


   //  5. create a method that can calculate the grade of the student based on the score
    public static void grade(int score, char grade){

        if (score>= 0 && score<= 100) {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade= 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else if (score< 60){
                grade = 'E';
            }

        }else{
            System.out.println("Invalid score");
        }
        System.out.println("grade = " + grade);
    }

    //6. create a method that can calculate the area of a circle
    public static void areaOfCircle(double radius){
        
    }
















}
