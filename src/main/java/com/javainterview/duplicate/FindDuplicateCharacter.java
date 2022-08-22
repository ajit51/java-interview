package com.javainterview.duplicate;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacter {

    public static void main(String[] args) {

        String s = "Hello";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[i]);
                }
            }
        }

        String input = "JavaJavaEE";
        Map<Character, Long> map = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        map.forEach((k, v) -> {
            if (v > 1)
                System.out.println(k + " : "+ v);
        });
    }
}
