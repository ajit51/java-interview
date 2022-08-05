package com.javainterview.common;

public class BasicCommonCode {

    public static void main(String[] args) {

        for (int j = 2; j <= 10; j++) {
            int countttt = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    countttt++;
                }
            }
            if (countttt == 2)
                System.out.print(j + "  ");
        }
    }
}
