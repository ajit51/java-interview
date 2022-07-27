package com.javainterview.java8.supplier;

import java.util.function.Supplier;

public class Supplier2 {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student(5, "MCA", "Ram");

        System.out.println(supplier.get().getName());
    }
}
