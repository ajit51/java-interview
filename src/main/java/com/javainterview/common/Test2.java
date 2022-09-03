package com.javainterview.common;

public class Test2 {
    public static void main(String[] args) {

        new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        }

        ).start();
        System.out.println(Thread.currentThread().getName());
    }
}
