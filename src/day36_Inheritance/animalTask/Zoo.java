package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog= new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println("dog = " + dog);

        Cat cat= new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "Brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();
        System.out.println("cat = " + cat);

        Tiger tiger= new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Red");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        System.out.println("tiger = " + tiger);




    }
}
