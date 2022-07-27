package com.javainterview.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("Initial list of elements:");
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav");
        hm.entrySet().stream().forEach(System.out::println);
        hm.replace(101, "Vijay", "Ravi");
        System.out.println("Updated list of elements:");
        hm.entrySet().stream().forEach(System.out::println);
        System.out.println("----------------putIfAbsent------------");
        hm.putIfAbsent(102, "Rohit");
        hm.entrySet().stream().forEach(System.out::println);
        System.out.println("Updated list of elements:");
        hm.replaceAll((k, v) -> "Ajay");
        hm.entrySet().stream().forEach(System.out::println);
        System.out.println("Size of map : "+hm.size());
    }
}
