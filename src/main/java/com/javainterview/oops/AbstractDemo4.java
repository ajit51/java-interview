package com.javainterview.oops;
abstract class Test{
    public Test(){
        System.out.println("foo");
    }

    public static class SubTest extends Test{

    }
}
public class AbstractDemo4 {
    public static void main(String[] args) {
        Test.SubTest sb = new Test.SubTest();
    }
}
