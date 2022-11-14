package com.javainterview.java8.unaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Java8UnaryOperator1{

    public static void main(String[] args) {

        //Function Example 1
        Function<Integer, Integer> func1 = x -> x * 2;
        Integer apply = func1.apply(4);
        System.out.println(apply);

        //UnaryOperator Example 2
        UnaryOperator<Integer> func2 = x -> x * 2;
        Integer apply1 = func2.apply(5);
        System.out.println(apply1);


    }
}
