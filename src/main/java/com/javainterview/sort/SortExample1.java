package com.javainterview.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class SortExample1 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(102, "Beejendra Singh", 85000));
        employees.add(new Employee(105, "Vijay Singh", 80000));
        employees.add(new Employee(101, "Rupesh Yadav", 60000));
        employees.add(new Employee(103, "Ankit Kumar", 95000));
        employees.add(new Employee(104, "Suresh Singh", 87000));

        /*employees.sort(Comparator.comparing(Employee::getEmpId)
                .reversed()
                .thenComparing(
                        Employee::getEmpName
                )
                .reversed()
        );*/

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getEmpId).reversed();
        employees.sort(employeeComparator);


        employees.forEach(System.out::println);

    }
}
