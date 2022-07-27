package com.javainterview.exception;

class N {
    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}

public class TestExceptionPropagation1 {
    public static void main(String[] args) {
        N obj = new N();
        obj.p();
        System.out.println("normal flow...");
    }
}
