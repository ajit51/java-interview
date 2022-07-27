package com.javainterview.collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println(queue);
        System.out.println("Element at the top of the queue: "+queue.peek());
       // System.out.println("Element at the top of the queue: "+queue.element());
        // System.out.println("Element at the top of the queue:"+queue.poll());
        System.out.println(queue.offer("Aditya"));
        System.out.println(queue);

    }
}
