package com.javainterview.java8.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Java8FunctionConvertListToMap {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Mango", "Apple", "Watermelon");
        Map<String, Integer> stringIntegerMap = convertListToMap(list, x -> x.length());
        System.out.println(stringIntegerMap);
    }

    private static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func){
        Map<T, R> result = new HashMap<>();
        for (T t : list){
            result.put(t, func.apply(t));
        }
        return result;
    }
}
