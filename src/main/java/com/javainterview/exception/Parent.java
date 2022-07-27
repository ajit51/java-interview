package com.javainterview.exception;

public class Parent {
    void msg(){
        System.out.println("parent method");
    }
}

class TestExceptionChild1 extends Parent{
    @Override
    void msg() throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Parent p = new TestExceptionChild1();
        p.msg();
    }
}
