package com.javainterview.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapWithBinaryOperator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(100, "Sohan"));
        list.add(new Person(300, "Mahesh"));

        Map<Integer, String> collectMap = list.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName, (x, y) -> x + " , " + y));

        collectMap.forEach((k, v) -> System.out.println("key: " + k + " : " + "Value: " + v));

    }
}
