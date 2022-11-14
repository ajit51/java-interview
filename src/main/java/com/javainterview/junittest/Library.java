package com.javainterview.junittest;

public class Library {

    private int sumOfTwoNumbers(Integer a, Integer b){
        return a + b;
    }

    public int sumOfNumbers(int a, int b){
        return sumOfTwoNumbers(a, b);
    }

}
