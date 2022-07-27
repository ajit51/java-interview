package com.javainterview.common;

import com.javainterview.map.Emp;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String input = "Basant";
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(map);

        List<Employee> employees = Stream.of(
                        new Employee(1, "Basant", "DEV", 50000),
                        new Employee(8, "Santosh", "DEV", 80000),
                        new Employee(3, "Pratik", "QA", 60000),
                        new Employee(9, "Deepak", "QA", 90000),
                        new Employee(4, "Vikash", "DEVOPS", 40000)
                )
                .collect(Collectors.toList());

        //approach 1 highest salary find by department group
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> employeeMap = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDept,
                                Collectors.reducing(BinaryOperator.maxBy(compareBySalary)))
                );
       // System.out.println(employeeMap);

        //approach 2
        Map<String, Employee> employeeMap1 = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDept,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get))
                );
        System.out.println(employeeMap1);
    }
}
