package com.javainterview.multithreading;

public class Company {
    int n;
    boolean f = false;
    //f=false; chance= Produce
    synchronized public void produce_item(int n){
        if (f){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }

    //f=true; chnace=Consumer
    synchronized public int consume_item() {
        if (!f){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
