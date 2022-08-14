package com.javainterview.trickyprogram;

public class DivideAnyNumberyZero {
    public static void main(String[] args) {
        //Number/0
        //System.out.println(0/0);  /// by zero
        System.out.println(0.0/0);//NaN
        System.out.println(5.5/0);//Infinity
        System.out.println(5.5/0.0);
        System.out.println(5.5f/0.0);
        System.out.println(5.5f/0.0f);
        System.out.println(0.0/0.0);//NaN
        System.out.println(45/0.0);
    }
}
