package com.javainterview.java8.function;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        System.out.println(function.apply("hi"));
        System.out.println(function.apply("Hello"));

        Function<Integer, String> function1 = (value) -> value.toString();

        System.out.println(function1.apply(2222));
        System.out.println(function1.apply(5555));
    }
}
