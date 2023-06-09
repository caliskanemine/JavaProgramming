package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {


        //add
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(20); //7
        numbers.add(2, 25);
        numbers.add(5, 45);

        System.out.println(numbers);

        //size
        System.out.println(numbers.size());

        int lastIndex= numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);


        //get
        int num= numbers.get(3);

        System.out.println("num = " + num);
        System.out.println("------------------------");

        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("--------------------");


        //set
        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); //replace
        list.set(3, "C++");

        System.out.println(list);













    }
}
