package Practice_Tasks;

public class Array21_JavaAndPython {
    public static void main(String[] args) {

        /*

	6. Write a program that can return the number of appearances of â€œjavaâ€ and â€œpythonâ€ anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
         */

        String sentence = "java java python python java python";

        String[] word= sentence.split(" ");

        int countJava= 0;
        int countPython= 0;

        for (String each1 : word) {
            if (each1.equalsIgnoreCase("Java")){
                countJava++;
            }
            if (each1.equalsIgnoreCase("Python")){
                countPython++;
            }
        }
        System.out.println(countJava+ " Java and "+ countPython+ " Python");









    }
}
