package com.javainterview.createobject;

public class NewInstance {
    String s = "Creating object using newInstance()";

    public static void main(String[] args) {
        try {
            Class b = Class.forName("com.javainterview.createobject.NewInstance");
            NewInstance n = (NewInstance) b.newInstance();
            System.out.println(n.s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
