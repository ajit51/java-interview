package com.javainterview.java8.stream;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(32, 42, 55, 2, 10, 45);
        List<Integer> list2 = Arrays.asList(32, 41, 55, 20, 1, 45);

        //way 1
        List<Integer> mergeList = Stream.concat(list1.stream(), list2.stream())
                //.distinct()
                //.filter(new TreeSet<>()::add)
                //There is also a thread-safe variant, in case you want to use it with parallel streams
                .filter(new ConcurrentSkipListSet<>()::add)
                .collect(Collectors.toList());

        System.out.println(mergeList);

        List<Integer> mergeList2 = Stream
                .of(list1, list2)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(mergeList2);

        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        //find common element from two list
        List<Integer> commonElement = l1
                .stream()
                //.filter(l2::contains)
                .filter(x -> l2.contains(x))
                .collect(Collectors.toList());
        System.out.println(commonElement);

    }
}
