package com.javainterview.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    /*public static <T, U> void print(T t, U u){
        System.out.println(t+" "+u);
    }*/

    public static <T, U> T print(T t, U u){
        System.out.println(t+" "+u);
        return t;
    }
    public static void print(List<? extends Number> list){
        System.out.println(list );
    }
    public static void main(String[] args) {
        print(1, "Amit");
        print("abc", 4.2);
        System.out.println(print("xyz", 4586));
        print(2.5, "Seema");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        print(integerList);

    }
}
