package com.javainterview.map;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapKeys {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "b");
        map.put(3, "c");
        map.put(1, "a");
        System.out.println(map);

        //method 1
        LinkedHashMap<Integer, String> map1 = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //method 2
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(e -> map2.put(e.getKey(), e.getValue()));

        System.out.println(map2);
    }
}
