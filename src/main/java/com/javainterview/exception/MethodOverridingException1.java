package com.javainterview.exception;


import java.io.FileNotFoundException;

//If the superclass method does not declare an exception,
// subclass overridden method cannot declare the checked exception but can declare unchecked exception.
class Parent1 {
    void msg() {
        System.out.println("parent1 method");
    }
}

public class MethodOverridingException1 extends Parent1 {
    @Override
    //void msg() throws FileNotFoundException {  // compile time error
    void msg() throws ArithmeticException {
        System.out.println("MethodOverridingException1");
    }

    public static void main(String[] args) {
        MethodOverridingException1 exception1 = new MethodOverridingException1();
        exception1.msg();
    }
}
