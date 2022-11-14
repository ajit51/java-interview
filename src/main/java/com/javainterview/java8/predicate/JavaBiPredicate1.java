package com.javainterview.java8.predicate;

import java.util.function.BiPredicate;

public class JavaBiPredicate1 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean mkyong = filter.test("mkyong", 6);
        System.out.println(mkyong);

        boolean java = filter.test("Java", 10);
        System.out.println(java);
    }
}
