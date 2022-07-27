package com.javainterview.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(25);
        list.add(16);
        list.add(8);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp(102, "Beejendra Singh", 85000));
        emps.add(new Emp(105, "Vijay Singh", 80000));
        emps.add(new Emp(101, "Rupesh Yadav", 60000));
        emps.add(new Emp(103, "Ankit Kumar", 95000));
        emps.add(new Emp(104, "Suresh Singh", 87000));

        Collections.sort(emps, Collections.reverseOrder());
        //emps.forEach(System.out::println);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(102, "Beejendra Singh", 85000));
        employees.add(new Employee(105, "Vijay Singh", 80000));
        employees.add(new Employee(101, "Rupesh Yadav", 60000));
        employees.add(new Employee(103, "Ankit Kumar", 95000));
        employees.add(new Employee(104, "Suresh Singh", 87000));

        Collections.sort(employees, new NameComparator());
        employees.forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");
        List<Employee> employees1 = new ArrayList(employees);
        Collections.sort(employees1, new IdCompator());
        employees1.forEach(System.out::println);

    }
}
