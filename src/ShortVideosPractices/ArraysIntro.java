package ShortVideosPractices;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // 1.create a variable named numbers that can have 5 integers

        int numbers[] = new int[5]; //[0, 0, 0, 0, 0]

        numbers[0]= 10;
        numbers[1]= 20;
        numbers[2]= 30;
        numbers[3]= 40;
        numbers[4]= 50;

        System.out.println(Arrays.toString(numbers) );
        System.out.println(numbers.length);
        //create a variable named colors that has: Yellow, Red, White, Blue, Green, Black

        String[] colors = {"Yellow", "Red", "White", "Blue", "Green", "Black" };
        System.out.println(Arrays.toString(colors) );
        System.out.println(colors.length);





    }
}
