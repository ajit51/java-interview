package com.javainterview.java8.mapvsflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVSFlatmap {
    public static void main(String[] args) {
        List<User> users = Stream.of(
                        new User("user1", "45786464", Arrays.asList("abc@gmail.com", "def@gmail.com")),
                        new User("user2", "88656466", Arrays.asList("xyz@gmail.com", "pqr@gmail.com"))
                )
                .collect(Collectors.toList());

        System.out.println("*************** Map ******************");
        List<String> names = users.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(names);
        List<List<String>> emails = users.stream().map(User::getEmail).collect(Collectors.toList());
        System.out.println(emails);
        System.out.println("*************** FlatMap ******************");
        List<String> listOfEmails = users.stream().flatMap(u -> u.getEmail().stream()).collect(Collectors.toList());
        System.out.println(listOfEmails);
    }
}
