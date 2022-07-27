package com.javainterview.java8;

import java.util.Arrays;
import java.util.List;

public class SequentialStreamDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "G", "E", "E", "K", "S!");
        list.stream().forEach(System.out::print);
        System.out.println("-----------------------------");
        list.parallelStream().forEach(System.out::print);
        System.out.println("-----------------------------");
        list.parallelStream().forEachOrdered(System.out::print);
        System.out.println("------------------------------");
        list.stream().parallel().forEach(System.out::print);
        System.out.println("------------------------------");
        list.stream().parallel().forEachOrdered(System.out::print);
        System.out.println("------------------------------");
        list.stream().sequential().forEach(System.out::print);
    }
}
