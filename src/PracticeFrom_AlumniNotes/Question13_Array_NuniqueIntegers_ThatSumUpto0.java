package PracticeFrom_AlumniNotes;

public class Question13_Array_NuniqueIntegers_ThatSumUpto0 {

    public static void main(String[] args) {


        /*
        Array -- N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2]
or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one
of the possible answers is [-1,0,1] (but there are many more correct answers).
         */



        /*
        int[] array = {-1, -2, 3};
        int sum = 0;
        for (int each : array) {
            sum+=each;
        }

        System.out.println("sum = " + sum);




         */


        int[] array = {2, -3, 1};

        int sum = 0;

        for (int each : array) {
            sum += each;
        }
        System.out.println(sum);

    }
}

