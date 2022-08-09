package com.javainterview.queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(6);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(4);

        System.out.println(priorityQueue);
    }
}
