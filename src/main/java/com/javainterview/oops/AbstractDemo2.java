package com.javainterview.oops;

abstract class Car{
    Car(){
        System.out.println("car is created");
    }
}

class Maruti extends Car{
    void run(){
        System.out.println("Maruti is running");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Maruti m = new Maruti();
        m.run();
    }
}
