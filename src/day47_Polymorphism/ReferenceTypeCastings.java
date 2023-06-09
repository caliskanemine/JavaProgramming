package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //Shape shape= new Circle(4); //upcasting
        Shape shape2= new Circle(5);

        //WebDriver driver= (ChromeDriver)new ChromeDriver();

       // Dog dog2= new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //Dog dog3= dog2;

        Animal animal= new Dog("Lucy", "Husky", 'F', 5, "Small", "White");
        // Dog dog= (Dog) animal;
        // dog.bark();

        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        ( (Dog)animal ).bark();

        Shape shape1= new Square(5);

        System.out.println(((Square) shape1).getSide());

        System.out.println("-------------------------");

        Animal animal2= new Cat("Jim", "Scotish", 'M', 3, "Small", "White");
        //Cat cat= (Cat) animal2;
        //cat.Meow();
        ((Cat) animal2).meow();
        //((Dog)animal2).bark(); //ClassCastException
        System.out.println("-------------------------");

        Employee employee= new Tester("Ali", 30, 'M', 42, "Tester", 80000);
        ((Tester) employee).bugReport();
        //((Developer)employee).unitTest(); --> ClassCastException

        //Driver driver= (Driver) employee;
        Person person= (Person) employee;
        //Teacher teacher= (Teacher) employee;
        System.out.println("-----------------------");

        Shape s1= new Circle(10);
        s1.area();
        s1.perimeter();
        //((Cube)s1).volume(); --> ClassCastexception




    }

}
