package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        //Person person= new Person("Josh", 35, 'M');
        //Employee employee= new Employee();

        Tester tester= new Tester("Ali", 30, 'M', 42, "SDET", 145000.0);
        Developer developer= new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.0);
        Teacher teacher= new Teacher("Angel", 20, 'F', 22, "English Teacher", 85000.0);
        Driver driver= new Driver("Jhon", 34, 'M', 42, "Lyft Driver", 75000.0);

        System.out.println("tester = " + tester);
        System.out.println("developer = " + developer);
        System.out.println("teacher = " + teacher);
        System.out.println("driver = " + driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("------------------");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();

        System.out.println("------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();








    }
}
