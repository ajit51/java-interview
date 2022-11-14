package com.javainterview.java8.stream.find;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class MatchDemo {

    public static void main(String[] args) {
        matchingWithStreams();
    }


    private static void matchingWithStreams() {

        Predicate<Employee> p1 = e -> e.id < 10 && e.name.startsWith("A");
        Predicate<Employee> p2 = e -> e.sal < 10000;

        List<Employee> employees = Employee.getEmpList();

        /***** Example #1 - Using 'allMatch' *****/
        boolean b = employees.stream().allMatch(p1);
       // System.out.println(b);
        boolean b1 = employees.stream().allMatch(p2);
        //System.out.println(b1);

        /***** Example #2 - Using 'anyMatch' *****/
        boolean b3 = employees.stream().anyMatch(p1);
        System.out.println(b3);
        boolean b4 = employees.stream().anyMatch(p2);
        System.out.println(b4);

        /***** Example #2 - Using 'anyMatch' *****/
        boolean b5 = employees.stream().noneMatch(p1);
        System.out.println(b5);
        boolean b6 = employees.stream().noneMatch(p2);
        System.out.println(b6);
    }
}
