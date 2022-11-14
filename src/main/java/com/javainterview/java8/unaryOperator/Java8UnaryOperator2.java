package com.javainterview.java8.unaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Java8UnaryOperator2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = math(list, x -> x * 2);
        System.out.println(result);

        List<Integer> result1 = math(list, x -> x * 2, x -> x + 1);
        System.out.println(result1);
    }

    private static <T> List<T> math(List<T> list, UnaryOperator<T> up) {

        List<T> result = new ArrayList<>();
        for (T t : list) {
            result.add(up.apply(t));
        }
        return result;
    }

    private static <T> List<T> math(List<T> list, UnaryOperator<T> up1, UnaryOperator<T> up2) {

        List<T> result = new ArrayList<>();
        for (T t : list) {
            result.add(up1.andThen(up2).apply(t));
        }
        return result;
    }
  }
