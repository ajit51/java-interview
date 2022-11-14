package com.javainterview.java8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionDemo1 {

    public static void main(String[] args) {

        //Example 1
        BiFunction<Integer, Integer, Integer> function1 = (x, y) -> x + y;
        Integer apply = function1.apply(20, 30);
        System.out.println(apply);

        //Example 2
        Function<Integer, Integer> function2 = (n) -> n * n;
        System.out.println(function1.andThen(function2).apply(2, 4));

        //Example 3
        BiFunction<Integer, Integer, Double> func1 = (a, b) -> Math.pow(a, b);
        Double apply1 = func1.apply(2, 3);
        System.out.println(apply1);

        //Example 4
        BiFunction<Integer, Integer, List<Integer>> func2 = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> apply2 = func2.apply(4, 5);
        System.out.println(apply2);

        //Example 4
        BiFunction<List<Integer>, List<Integer>, List<Integer>> func3 = (l1, l2) -> {
            return Stream.of(l1, l2)
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        List<Integer> list1 = Stream.of(1, 3, 4, 6, 7, 9, 19).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(11, 3, 43, 6, 7, 9, 19).collect(Collectors.toList());
        System.out.println(func3.apply(list1, list2));
    }
}
