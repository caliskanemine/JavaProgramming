package ShortVideosPractices;

public class IteratingArray2 {
    public static void main(String[] args) {

        String[] fruits= {"Orange", "Banana", "Apple", "Strawberry", "Lemon", "Grape"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("--------------------");

        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }





    }
}
