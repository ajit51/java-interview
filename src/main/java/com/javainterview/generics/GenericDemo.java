package com.javainterview.generics;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.display();
        Counter<Integer> counter1 = new Counter<>(5);
        counter1.display();
        Counter<String> stringCounter = new Counter<>("Hello");
        stringCounter.display();
        Counter<Double> doubleCounter = new Counter<>(6.0);
        doubleCounter.display();

        ArrayList<Object> integers = new ArrayList<>();
        integers.add(1);
        integers.add("1");

        String n = (String) integers.get(1);
        System.out.println(n);

        System.out.println(integers);


    }
}
