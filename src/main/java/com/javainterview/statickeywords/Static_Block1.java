package com.javainterview.statickeywords;

import static java.lang.System.exit;

public class Static_Block1 {
    static {
        System.out.println("static block is invoked");
        exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Hello main");
    }
}
