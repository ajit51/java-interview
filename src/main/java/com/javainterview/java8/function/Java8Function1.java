package com.javainterview.java8.function;

import java.util.function.Function;

public class Java8Function1 {

    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();
        Integer mkyong = function.apply("mkyong");
        System.out.println(mkyong);

        Function<String, Integer> func1 = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * 2;

        Integer mkyong1 = func1.andThen(func2).apply("mkyong");
        System.out.println(mkyong1);

    }
}
