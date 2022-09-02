package com.javainterview.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumberJava8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        System.out.println(numbers);
        Integer secondLargestNo = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargestNo);

    }
}
