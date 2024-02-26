package com.javainterview.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Sohan");
        list.add("Mahesh");

        Map<String, String> collectMap = list.stream()
                .collect(Collectors.toMap(Function.identity(), s -> s));

        collectMap.forEach((k, v) -> System.out.println("key: " + k + " : " + "Value: " + v));
    }
}
