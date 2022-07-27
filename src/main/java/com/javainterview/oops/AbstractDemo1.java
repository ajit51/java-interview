package com.javainterview.oops;


abstract class Bike{
    Bike(){
        System.out.println("bike is created...");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed...");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("running safely...");
    }
}
public class AbstractDemo1 {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
        b.changeGear();
    }
}
