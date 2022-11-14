package com.javainterview.java8.supplier;

import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Java8Supplier1 {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        //Eaxmple 1
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        //Eaxmple 2
        Supplier<String> s = () -> dtf.format(LocalDateTime.now());
        String stringDate = s.get();
        System.out.println(stringDate);


    }
}
