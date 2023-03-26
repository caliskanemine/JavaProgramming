package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        List<Integer> list1= new Stack<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list1.get(0));

        List<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list2.get(0));

        List<Integer> list3= new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list3.get(0));

        List<Integer> list4= new LinkedList<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list4.get(0));

        System.out.println("-----------------");

        System.out.println(list1);
        ((Stack)list1).pop();
        System.out.println(list1);





    }

    public synchronized void method1(){

    }


   }
