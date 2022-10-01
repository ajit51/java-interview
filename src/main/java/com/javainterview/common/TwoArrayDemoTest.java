package com.javainterview.common;

import java.util.*;

public class TwoArrayDemoTest {
    public static void main(String[] args) {
        //A = [2, 3, 4, 6, 9, 9]
        //B = [1, 4, 6, 7, 9]
        // o/p - 0, 1, 1, 0, 2

        List<Integer> list1 = Arrays.asList(2, 3, 4, 6, 9, 9);
        List<Integer> list2 = Arrays.asList(1, 4, 6, 7, 9);
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        list2.stream().forEach(l2 -> {
            int count = (int) list1.stream().filter(l1 -> l2 == l1).count();
            map.put(l2, count);
            System.out.print(count + " ");
        });

        System.out.println(map);
    }
}
