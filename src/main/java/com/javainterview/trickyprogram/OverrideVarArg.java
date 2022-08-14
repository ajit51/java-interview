package com.javainterview.trickyprogram;

class A{
    public void show(String... arg){
        System.out.println("Hi");
    }
}

class B extends A{
    public void show(String... arg){
        System.out.println("Bye");
    }
}

public class OverrideVarArg {

    public static void main(String[] args) {
        B b = new B();
        b.show();//Bye
    }
}
