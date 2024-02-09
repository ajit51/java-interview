package com.javainterview.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindTop3NumbersFromList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(32, 42, 55, 2, 10, 45);
        List<Integer> integers = list1
                .stream()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(integers);
    }
}
