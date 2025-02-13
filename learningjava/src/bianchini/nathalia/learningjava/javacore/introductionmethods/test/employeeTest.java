package bianchini.nathalia.learningjava.javacore.introductionmethods.test;

import bianchini.nathalia.learningjava.javacore.introductionmethods.domain.employee;

public class employeeTest {
    public static void main(String[] args) {
        employee Employee = new employee();

        Employee.setName("Nathalia");
        Employee.setAge(20);
        Employee.setSalaries(new double[]{1512.52, 3438.68, 4406.16});


        Employee.print();
//      Employee.avgSalary();
    }
}
