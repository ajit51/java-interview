package com.javainterview.trickyprogram;

public class AddTwoByteType {

    public static void main(String[] args) {

        final byte a = 4;
        final byte b = 8;

        //byte sum = a + b; compile time error
        //int sum = a + b;

        byte sum = a + b;

        System.out.println(sum);
    }
}
