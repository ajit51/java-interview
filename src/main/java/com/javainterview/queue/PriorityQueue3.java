package com.javainterview.queue;

import java.util.PriorityQueue;

public class PriorityQueue3 {

    public static void main(String[] args) {

        PriorityQueue<Employee> queue = new PriorityQueue<>();

        queue.add(new Employee(3, "C"));
        queue.add(new Employee(1, "A"));
        queue.add(new Employee(2, "B"));
        queue.add(new Employee(4, "D"));

        System.out.println(queue);
    }
}
