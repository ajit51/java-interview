package com.javainterview.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //filter() accepts predicate as argument.
        List<Integer> integerList = list.stream().filter(x -> x > 5 && x < 8).collect(Collectors.toList());
        //System.out.println(integerList);

        Predicate<Integer> noGreaterThan5 = x -> x >5;
        Predicate<Integer> noLessThan9 = x -> x < 9;
        List<Integer> collect = list.stream().filter(noGreaterThan5.and(noLessThan9)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
