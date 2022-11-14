package com.javainterview.map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        String name = "Ajeet";
        LinkedHashMap<String, Long> collect = Arrays.stream(name.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

    }
}
