package com.javainterview.java8.consumer;

import java.util.Locale;
import java.util.function.Consumer;

public class Consumer2 {
    public static void main(String[] args) {
        Consumer<String> con1 = x -> System.out.println(x.toLowerCase());
        Consumer<String> con2 = y -> System.out.println(y.toUpperCase());

        con1.andThen(con2).accept("april");
    }
}
