package com.javainterview.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class JavaBiPredicate2CustomeObjectExample {

    public static void main(String[] args) {

        List<Domain> domains = Arrays.asList(new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("mkyong.com", 0),
                new Domain("microsoft.com", 2));

        BiPredicate<String, Integer> biPredicate = (domain, score) -> {
            return (domain.equalsIgnoreCase("google.com") || score == 0);
        };

        // if google or score == 0
        List<Domain> domains1 = filterBadDomain(domains, biPredicate);
        System.out.println(domains1);

        //  if score == 0
        List<Domain> domains2 = filterBadDomain(domains, (domain, score) -> score == 0);
        System.out.println(domains2);

        // if start with i or score > 5
        List<Domain> result3 = filterBadDomain(domains, (domain, score) -> domain.startsWith("i") && score > 5);
        System.out.println(result3); // i-am-spammer.com

    }

    public static <T extends Domain> List<T> filterBadDomain(List<T> list, BiPredicate<String, Integer> biPredicate) {
        return list
                .stream()
                .filter(x -> biPredicate.test(x.getName(), x.getScore()))
                .collect(Collectors.toList());
    }
}
