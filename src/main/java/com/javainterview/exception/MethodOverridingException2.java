package com.javainterview.exception;


//If the superclass method declares an exception, subclass overridden method can declare the same subclass
// exception or no exception but cannot declare parent exception.
class Parent2 {
    void msg() throws ArithmeticException{
        System.out.println("parent2 method");
    }
}

public class MethodOverridingException2 extends Parent1 {
    @Override
    //void msg() throws ArithmeticException {
    //void msg() throws Exception{ //compile time error
    void msg(){
        System.out.println("MethodOverridingException2");
    }

    public static void main(String[] args) {
        MethodOverridingException2 exception2 = new MethodOverridingException2();
        exception2.msg();
    }
}
