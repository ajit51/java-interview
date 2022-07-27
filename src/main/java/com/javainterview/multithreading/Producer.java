package com.javainterview.multithreading;

public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c = c;
    }
    @Override
    public void run() {
        int i = 1;
        while (true){
            this.c.produce_item(i);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
