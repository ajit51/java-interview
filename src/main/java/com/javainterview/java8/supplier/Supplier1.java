package com.javainterview.java8.supplier;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "hello";
            }
        };
        System.out.println(supplier.get());


        Supplier<String> stringSupplier = () -> "Hello";
        System.out.println(stringSupplier.get());

    }
}
