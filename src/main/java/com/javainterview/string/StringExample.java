package com.javainterview.string;

public class StringExample {
    public static void main(String[] args) {
        String first = "Cat";
        String second = "Cat";
        String third = "Cat";
        String fourth = new String("Cat");
        String fifth = new String("Cat");
        System.out.println(first == second);
        System.out.println(second == third);
        System.out.println(first == third);

        System.out.println("equals "+first.equals(third));

        System.out.println(first == fourth);

        System.out.println("first: "+first);
        System.out.println("fourth: "+fourth);

        System.out.println(first.hashCode() + " " +fourth.hashCode());
        System.out.println(fourth == fifth);
    }
}
