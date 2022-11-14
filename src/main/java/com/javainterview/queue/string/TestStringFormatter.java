package com.javainterview.queue.string;

import java.util.Locale;

public class TestStringFormatter {
    public static String capitalizeWord(String str) {
        String[] words = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterFirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterFirst + " ";
        }
        return capitalizeWord.trim();
    }

    public static void main(String[] args) {
        String s = capitalizeWord("my name is khan");
        System.out.println(s);
    }
}
