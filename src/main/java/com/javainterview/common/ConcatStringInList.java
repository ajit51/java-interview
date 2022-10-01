package com.javainterview.common;

import java.util.*;
import java.util.stream.Collectors;

public class ConcatStringInList {
    public static void main(String[] args) {
        List<Sample> list = Arrays.asList(
                new Sample("1", "India"),
                new Sample("2", "USA"),
                new Sample("1", "France"),
                new Sample("1", "Germany"),
                new Sample("2", "Spain"),
                new Sample("3", "Pakistan")
        );


        Map<String, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(Sample::getId, Collectors.mapping(s -> s.getCountryName(), Collectors.toList())));

        collect.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
