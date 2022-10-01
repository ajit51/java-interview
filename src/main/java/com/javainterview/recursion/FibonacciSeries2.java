package com.javainterview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries2 {
    private static List<Integer> fibonacciSeries(int n) {
        List<Integer> fiboList = null;
        if (n < 0) {
            throw new IllegalArgumentException(n +" should not be less than zero");
        } else if (n == 0) {
            return Arrays.asList(0);
        } else if (n == 1) {
            return Arrays.asList(0, 1);
        } else {
            fiboList = new ArrayList<>();
            fiboList.add(0);
            fiboList.add(1);
            for (int i = 2; i < n; i++) {
                int elem1 = fiboList.get(i - 1);
                int elem2 = fiboList.get(i - 2);
                fiboList.add(elem1 + elem2);
            }
            return fiboList;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciSeries(10));
    }
}
