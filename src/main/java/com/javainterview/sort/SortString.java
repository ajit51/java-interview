package com.javainterview.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("d", "A", "B", "AA", "c", "a", "b", "bb", "C", "bb", "BB");
        List<String> sortedList = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
