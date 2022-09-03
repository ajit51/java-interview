package com.javainterview.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";
        Character result = input
                .chars()// Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                //.filter(e -> e.getValue() == 1L)
                .filter(e -> e.getValue() > 1l)
                .map(e -> e.getKey())
                .findFirst()
                .get();
        System.out.println(result);


    }
}
