package com.javainterview.exception;

public class MyCustomException extends Exception{
}

class TestCustomException2{
    public static void main(String[] args) {
        try {
            throw new MyCustomException();
        } catch (MyCustomException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code...");
    }
}
