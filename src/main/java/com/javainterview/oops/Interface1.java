package com.javainterview.oops;

interface Printable {
    // Static method
    static void print() {
        System.out.println("Printing...");
    }

    static void print2D() {
        System.out.println("Printing 2D...");
    }

    // Default Method
    default void print3D() {
        division();
        System.out.println("Printing 3D...");
    }

    private void division() {         // private method
        System.out.println("private method division");
    }

    // Abstract Method
    void getInfo();
}

public class Interface1 implements Printable {

    public void getInfo() {
        System.out.println("This is new style Java 8 Interface");
    }

    public static void main(String[] args) {
        Printable.print();
        Printable.print2D();

        Interface1 i = new Interface1();
        i.getInfo();
        i.print3D();
    }
}
