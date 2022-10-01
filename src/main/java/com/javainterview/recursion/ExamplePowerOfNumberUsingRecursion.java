package com.javainterview.recursion;

public class ExamplePowerOfNumberUsingRecursion {
    private static long power(int x, int n) {
        long y = 0;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            y = power(x, n / 2);
            y = y * y;
            if (n % 2 == 0) {
                return y;
            }
        }
        return x + y;
    }

    public static void main(String[] args) {
        long power = power(2, 3);
        System.out.println(power);
    }
}
