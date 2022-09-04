package com.javainterview.optional;

import java.util.Optional;

public class IfPresentOrElseExample {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("Java 8");
        Optional<String> op2 = Optional.empty();

        //ifPresentOrElse(Consumer, Runnable)
        op2.ifPresentOrElse((value) -> {
            System.out.println(value);
        },
                () -> {
                    System.out.println("Value is empty");
                }
        );
    }
}
