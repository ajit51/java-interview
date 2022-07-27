package com.javainterview.multithreading;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            this.c.consume_item();
            try {
                sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
