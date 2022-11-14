package com.javainterview.designpattern.builderpattern;

import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student
                .Builder()
                .name("mkyong")
                .age(18)
                .language(Arrays.asList("chinese","english"))
                .build();

        System.out.println(student);
    }
}
