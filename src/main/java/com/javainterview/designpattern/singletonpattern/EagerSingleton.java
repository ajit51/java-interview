package com.javainterview.designpattern.singletonpattern;

public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1);
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton2);
        System.out.println(eagerSingleton1 == eagerSingleton2);
    }
}
