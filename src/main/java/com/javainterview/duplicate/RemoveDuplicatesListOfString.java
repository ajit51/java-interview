package com.javainterview.duplicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesListOfString {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Roger");
        students.add("Rafael");
        students.add("Djokovic");
        students.add("Roger");
        students.add("Murray");
        students.add("Rafael");

        System.out.println(students);

        // Java 8 - distinct() method
        List<String> list = students
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);

        // Java 8 - sorting
        List<String> stringList = students
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
