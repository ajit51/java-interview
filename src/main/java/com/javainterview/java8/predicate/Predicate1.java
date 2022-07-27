package com.javainterview.java8.predicate;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        String stringOne = "Hello";
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String stringTwo) {
                return stringOne.equals(stringTwo);
            }
        };

       // System.out.println(predicate.test("Hi"));
       // System.out.println(predicate.test("Hello"));

        Predicate<String> predicate1 = (stringTwo) -> (stringOne.equals(stringTwo));

        System.out.println(predicate.test("Hi"));
        System.out.println(predicate.test("Hello"));
    }
}
