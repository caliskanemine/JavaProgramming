package Practice_Tasks;

public class Day09_OxygenTank {
    public static void main(String[] args) {

        /*
        4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
        and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
         */
        int oxygenLevel= 75;
        String result= "";

        if (oxygenLevel> 90){
            result= "Your tank is full";
        } else if (oxygenLevel> 80) {
            result= "Still okay";
        } else if (oxygenLevel> 70) {
            result= "Don't go too far";
        } else if (oxygenLevel> 60) {
            result= "Start to head back";
        } else if (oxygenLevel>50) {
            result= "Be careful now you at at 50%";
        }

        System.out.println(result);
    }
}
