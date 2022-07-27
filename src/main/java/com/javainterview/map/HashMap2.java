package com.javainterview.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        Map<Integer, Emp> map = new HashMap<>();
        map.put(101, new Emp(111, "Deepak", 96000));
        map.put(102, new Emp(333, "Abhishek", 65000));
        map.put(103, new Emp(222, "Sumit", 98000));

        //System.out.println("Size of map : " + map.size());
       /// map.entrySet().stream().forEach(System.out::println);
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(111, "Deepak", 96000));
        list.add(new Emp(333, "Abhishek", 65000));
        list.add(new Emp(222, "Sumit", 98000));

        System.out.println("Size of list : " + list.size());

        Emp emp1 = new Emp(111, "Deepak", 96000);
        Emp emp2 = new Emp(222, "Abhishek", 65000);
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
    }
}
