package com.javainterview.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 2);
        map.put("c", 1);
        System.out.println(map);

        //method 1
        LinkedHashMap<String, Integer> sortedMap = map
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    return e1.getValue() - e2.getValue();
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //method 2
        LinkedHashMap<String, Integer> map1 = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //method 3
        LinkedHashMap<String, Integer> map2  =new LinkedHashMap<>();
        map
                .entrySet()
                .stream()
               // .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(e -> map2.put(e.getKey(), e.getValue()));
        System.out.println(map2);
    }
}
