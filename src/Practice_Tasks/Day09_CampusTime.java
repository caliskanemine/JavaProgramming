package Practice_Tasks;

public class Day09_CampusTime {
    public static void main(String[] args) {

        /*
     1.  Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been
     initialized, write a program that can find out if the campus is open or not. Campus is open from
     8 am(8) to 11 pm (23) If user enters a time within the open time they should see message:
     â€œopenâ€  but if the time entered is outside of operating hours they should see: â€œ closedâ€
         */

        int time= 7;
        String result= "";
         if (time>=8 && time<=23){
             result= "Open";
         }else{
             result= "Closed";
         }
        System.out.println(result);













    }
}
