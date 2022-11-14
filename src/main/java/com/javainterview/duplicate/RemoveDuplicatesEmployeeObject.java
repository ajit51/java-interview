package com.javainterview.duplicate;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesEmployeeObject {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Arun", 67.36, 2));
        studentList.add(new Student(2,"Sethu", 88.58, 1));
        studentList.add(new Student(3,"Ajith", 55.74, 4));
        studentList.add(new Student(4,"Vikcy", 61.32, 3));
        studentList.add(new Student(1,"Arun", 67.36, 2));

        // Java 8 - Collector.toCollection()
        TreeSet<Student> collect = studentList
                .stream()
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(Student::getId))
                ));
        collect.forEach(s -> System.out.println(s));
    }
}
