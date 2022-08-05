package com.javainterview.java8.stream.reduce;

import java.util.Arrays;
import java.util.OptionalInt;

public class Reduce1 {



    public static void main(String[] args) {

        // using normal for loop sum
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum : " + sum);

        //using reduce method
        //int sum1 = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println(sum2);

        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);  // 10
        int max1 = Arrays.stream(numbers).reduce(0, Integer::max);            // 10

        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);  // 0
        int min1 = Arrays.stream(numbers).reduce(0, Integer::min);            // 0

        OptionalInt optionalInt = Arrays.stream(numbers).reduce(Integer::min);// 1

        System.out.println();
    }
}
