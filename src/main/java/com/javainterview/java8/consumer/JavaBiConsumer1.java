package com.javainterview.java8.consumer;

import java.util.function.BiConsumer;

public class JavaBiConsumer1 {

    public static void main(String[] args) {

        //it is used in forEach loop for Map iterate
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(3, 5);
    }
}
