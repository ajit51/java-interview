package com.javainterview.statickeywords;

public class TestOuter1 {
    static int data = 30;
    static class Inner{
        void msg(){
            System.out.println(data);
        }
        static void disp(){
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        TestOuter1.Inner obj = new TestOuter1.Inner();
        obj.msg();

        TestOuter1.Inner.disp();
    }
}
