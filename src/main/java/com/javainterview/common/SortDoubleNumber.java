package com.javainterview.common;

import org.springframework.util.comparator.Comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDoubleNumber {

    static String getString() {
        try {
            return "A";
        } catch (Exception e) {
            return "B";
        } finally {
            return "C";
        }
    }

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(4.5, 5.9, 10.12, 3.2, 1.5);
        List<Double> sortedDoubleList = doubles
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedDoubleList);

        System.out.println("******************************");

        System.out.println(getString());

        System.out.println("******************************");
        List<String> strings = Arrays.asList("abc", "", "XYZ", "", "", "PQR");
        List<String> stringList = strings
                .stream()
                .filter(s -> !"".equals(s))
                .collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("******************************");
    }

}
