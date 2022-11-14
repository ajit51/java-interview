package com.javainterview.java8.function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Function2 {

    public static void main(String[] args) {

        Function<Integer, String> func = (num) -> {
            if (num % 2 == 0){
                return "Number " + num + " is even";
            }else {
                return "Number " + num + " is odd";
            }
        };

        System.out.println(func.apply(11));

        //Example 2
        Function<List<Integer>, List<Integer>> func2 = (l) -> {
            return l.stream()
                    .distinct()
                    .collect(Collectors.toList());
        };
        List<Integer> list = Stream.of(1, 3, 4, 6, 7, 3, 6, 9, 19).collect(Collectors.toList());
        System.out.println(func2.apply(list));
    }
}
