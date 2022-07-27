package com.javainterview.oops;

abstract class Content{
    int a;
    public final int b= 15;
    public Content(int a){
        this.a = a;
        System.out.println(this.a);
    }
    abstract int multiply(int val);
}

class GFG extends Content{
    GFG(){
        super(2);
    }
    public int multiply(int val){
        return this.a * val;
    }
}
public class AbstractDemo3 {
    public static void main(String[] args) {
        Content c = new GFG();
        System.out.println(c.b);
        System.out.println(c.multiply(3));
    }
}
