package com.javainterview.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargestNumberInListUsingJava8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        System.out.println(numbers);
       //Using Stream.max() method
       // Integer max = numbers.stream().max(Integer::compare).get();

        // Using Stream.collect() method
        //Integer max = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        //Integer max = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
        //Integer max = numbers.stream().collect(Collectors.reducing(Integer::max)).get();

        //Using Stream.reduce() method
        Integer max = numbers.stream().reduce(Integer::max).get();
        System.out.println(max);
    }
}
