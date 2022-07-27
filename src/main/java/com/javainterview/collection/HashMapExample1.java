package com.javainterview.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(103, "Apple");
        map.put(101, "Sumsung");
        map.put(105, "Oneplus");
        map.put(102, "Vivo");
        map.put(104, "Redmi");
        map.put(null, null);

        String oppo = map.put(103, null);

        map.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
