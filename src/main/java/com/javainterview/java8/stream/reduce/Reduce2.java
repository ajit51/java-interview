package com.javainterview.java8.stream.reduce;

import java.util.Arrays;

public class Reduce2 {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d", "e"};

        String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
        // System.out.println(reduce);

        String reduce1 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });

        System.out.println(reduce1);

        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join("|", strings);
        System.out.println(join);
    }
}
