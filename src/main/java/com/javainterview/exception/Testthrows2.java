package com.javainterview.exception;

import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("device error");
    }
}
public class Testthrows2 {
    public static void main(String[] args) {
        M m = new M();
        try {
            m.method();
        } catch (IOException e) {
            System.out.println("exception handled");
            System.out.println(e.getCause());
        }
        System.out.println("normal flow...");
    }
}
