package com.javainterview.exception;

public class UserDefinedException extends Exception {
    UserDefinedException(String str) {
        super(str);
    }
}

class TestThrow3{
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is user-defined exception");
        } catch (UserDefinedException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
    }

}
