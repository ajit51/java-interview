package com.javainterview.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = a -> {
            System.out.println(a);
        };
        consumer.accept(41);

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list2.add(111);
        list2.add(222);
        list2.addAll(list);

        // Consumer to display a list of numbers
        Consumer<List<Integer> >
                dispList = (l) -> l.stream().forEach(a -> System.out.print(a + " "));
        dispList.accept(list);

       Consumer<List<Integer>> dispList2 = l2 -> l2.stream().forEach(y -> System.out.println(y + " "));

       dispList.andThen(dispList2).accept(list2);

    }
}
