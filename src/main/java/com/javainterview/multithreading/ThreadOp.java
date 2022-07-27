package com.javainterview.multithreading;

public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("program started...");
        int x = 35 + 40;
        System.out.println("Sum is "+x);
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        t.setName("mythread");
        System.out.println(t.getName());

        System.out.println("program endded");
    }
}
