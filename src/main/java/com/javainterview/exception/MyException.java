package com.javainterview.exception;

public class MyException extends Exception {
    private int ex;

    MyException(int n) {
        ex = n;
    }

    @Override
    public String toString() {
        return "MyException[" + ex + "]is less than zero";
    }
}

class Demo {
    static void sum(int a, int b) throws MyException {
        if (a < 0)
            throw new MyException(a); //calling constructor of user-defined exception class
        else
            System.out.println(a + b);
    }

    public static void main(String[] args) {
        try {
            sum(-10, 20);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
