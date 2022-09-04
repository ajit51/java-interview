package com.javainterview.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class GetValuesFromOptional {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.empty();
        Optional<Integer> optional2 = Optional.of(100);
        System.out.println(optional1);

        //Get method
        //Integer n = optional.get();//throw NoSuchElementException if value is not present

        //orElse method
        Integer orElse = optional1.orElse(200);// it doesn't throw any exception

        //orElseGet method
        Integer orElseGet = optional2.orElseGet(() -> (int) (Math.random() * 200));
        System.out.println(orElseGet);
    }
}
