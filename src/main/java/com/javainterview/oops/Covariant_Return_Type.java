package com.javainterview.oops;

class Supper{
    Supper get(){
        return this;
    }
}

class Inner extends Supper{
    Inner get(){
        return this;
    }
    void msg(){
        System.out.println("welcome to covariant return type");
    }
}
public class Covariant_Return_Type {
    public static void main(String[] args) {
        new Inner().get().msg();
    }
}
