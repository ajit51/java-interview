package com.javainterview.java8;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        BiFunction<String, String, Boolean> function = (x, y) -> x.equals(y);

        System.out.println(function.apply("Java8", "Java8"));

        Stream.of("bus", "car", "bycle", "flight", "train")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
