package com.javainterview.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(103, "Apple");
        linkedHashMap.put(101, "Sumsung");
        linkedHashMap.put(105, "Oneplus");
        linkedHashMap.put(102, "Vivo");
        linkedHashMap.put(104, "Redmi");

        //1
       /*linkedHashMap.forEach((k, v) -> {
           System.out.println(k + " " + v);
       });*/

        //2
       /* linkedHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });*/

        //3
       // System.out.println(Arrays.asList(linkedHashMap));

        //4
        //System.out.println(Collections.singleton(linkedHashMap));

        //5


    }
}
