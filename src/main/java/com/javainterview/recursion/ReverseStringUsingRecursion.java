package com.javainterview.recursion;

public class ReverseStringUsingRecursion {

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String str = "Ajit Kumar";
        String reverseString = reverseString(str);
        System.out.println(reverseString);
    }
}
