package com.javainterview.generics;

public class Counter <T> {
    T t;
    Counter(T t){
        this.t = t;
    }
    public void display(){
        System.out.println(t);
    }
}
