package com.javainterview.collection;

import com.javainterview.map.Emp;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Set<Emp> set = new HashSet<>();
        set.add(new Emp(111, "Deepak", 96000));
        set.add(new Emp(222, "Ajay", 98000));
        System.out.println(set.size());
    }
}
