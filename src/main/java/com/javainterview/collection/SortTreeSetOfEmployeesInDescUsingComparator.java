package com.javainterview.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortTreeSetOfEmployeesInDescUsingComparator {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();

        // 1.1 add Employees to TS
        employees.add(new Employee(103, "Amudha", 49000L));
        employees.add(new Employee(106, "Meena", 38000L));
        employees.add(new Employee(105, "Bhagyalakshmi", 29000L));
        employees.add(new Employee(102, "ThenMozhi", 57000L));
        employees.add(new Employee(101, "Saranya", 85000L));
        employees.add(new Employee(104, "Pushpa", 24000L));

        // 1.2 original TreeSet in insertion order of Id
        System.out.println("1. Original TreeSet "
                + "as per sorted-order of Id :- \n");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

            Set<Employee> reverseEmployees = new TreeSet<>(Collections.reverseOrder());
            reverseEmployees.addAll(employees);

            System.out.println("---------------------------------------------------------");
            // 2.2 Iterating using enhanced for-loop
            for (Employee revEmp : reverseEmployees) {
                System.out.println(revEmp);
            }
    }
}
