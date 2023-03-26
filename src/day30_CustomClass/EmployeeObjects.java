package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true) ;
        System.out.println("employee1 = " + employee1);

        Employee employee2= new Employee();
        employee2.setInfo("Anna", 'F', 28, 2287, "QA", 85000, true );
        System.out.println("employee2 = " + employee2);

        Employee employee3= new Employee();
        employee3.setInfo("David", 'M', 35, 2256, "QA", 45000, false) ;
        System.out.println("employee3 = " + employee3);

        Employee employee4= new Employee();
        employee4.setInfo("Lina", 'F', 45, 2290, "Manager", 80000, true);
        System.out.println("employee4 = " + employee4);

        Employee employee5= new Employee();
        employee5.setInfo("Kevin", 'M', 35,2298, "Senior QA", 110000, true );
        System.out.println("employee5 = " + employee5);
    
    Employee[] employees= {employee1, employee2, employee3, employee4, employee5};
    
    int countFullTime= 0;
    int countPartTime= 0;
    double max= employees[0].salary;
    double min= employees[0].salary;



        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }

            if (employee.salary> max){
                max= employee.salary;
            }
            if (employee.salary< min){
                min= employee.salary;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    
    
    }
}
