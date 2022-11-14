package com.javainterview.java8.binaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Java8BinaryOperator1 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func1 = (x, y) -> x + y;
        Integer apply = func1.apply(2, 3);
        System.out.println(apply);


        //In this example, the BiFunction<Integer, Integer, Integer> which accepts and returns the same type,
        // can be replaced with BinaryOperator<Integer>.
        // BinaryOperator
        BinaryOperator<Integer> func2 = (x, y) -> x + y;
        Integer apply1 = func2.apply(2, 3);
        System.out.println(apply1);
    }
}
