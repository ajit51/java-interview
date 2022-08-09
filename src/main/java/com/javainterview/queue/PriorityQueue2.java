package com.javainterview.queue;

import java.util.PriorityQueue;

public class PriorityQueue2 {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("B");
        queue.add("A");
        queue.add("D");

        System.out.println(queue);
       // System.out.println(queue.poll()); it remove data head of element and return it but doesn't throw any exception
       // System.out.println(queue.remove()); it remove data head of element and return it but throw an NoSuchElementException
       // System.out.println(queue.peek()); it doesn't remove data but it doesn,t throws NoSuchElementException
       // System.out.println(queue.element()); it doesn't remove data but it throws NoSuchElementException
        System.out.println(queue);
    }
}
