package Practice_Tasks;

public class Array20_Task4 {
    public static void main(String[] args) {


        //4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];
          /*
         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
         */

        for (int i = 0; i < grades.length; i++) {
            int score = scores[i];

            if (score == 90){
                grades[i]= 'A';
            }
            if (score== 75){
                grades[i]= 'B';
            }
            if (score== 80){
                grades[i]= 'C';
            }
            System.out.println(names[i]+"' score is "+ score+ ", and grade is "+ grades[i]);
        }









    }
}
