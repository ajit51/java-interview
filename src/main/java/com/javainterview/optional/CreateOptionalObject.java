package com.javainterview.optional;

import java.util.Optional;

public class CreateOptionalObject {
    public static void main(String[] args) {

        //create an optional object
        Optional<String> myStr1 = Optional.empty();
        System.out.println(myStr1);

        //Optional.of
       // Optional<String> myStr2 = Optional.of(null);//throws NullPointerException in case value is null
        Optional<String> myStr2 = Optional.of("Java 8");
        System.out.println(myStr2);

        //Optional.ofNullable
        Optional<String> mystr3 = Optional.ofNullable(null);// it doesn't throw any exception
        System.out.println(mystr3);
    }
}
