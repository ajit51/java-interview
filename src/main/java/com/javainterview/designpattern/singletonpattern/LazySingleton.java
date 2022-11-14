package com.javainterview.designpattern.singletonpattern;

public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                // Double check
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public static void main(String[] args) {

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);
    }
}
