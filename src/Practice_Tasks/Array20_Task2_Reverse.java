package Practice_Tasks;

public class Array20_Task2_Reverse {
    public static void main(String[] args) {
        /*
        2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */

        String [] classmates= {"Emine", "Elif", "Şüheda", "Derya", "Esra", "Eda", "Halit", "İbrahim", "Abdullah", "Engin"};
            for (String classmate : classmates) {
            String reversed= "";
            for ( int i = classmate.length()-1; i >=0 ; i--) {
            reversed+= classmate.charAt(i);

            }
            System.out.println(reversed);
        }









    }
}
