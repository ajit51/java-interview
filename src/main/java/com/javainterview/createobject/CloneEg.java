package com.javainterview.createobject;

public class CloneEg implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    String s = "Creating object using clone()";

    public static void main(String[] args) {
        CloneEg a = new CloneEg();
        try {
            CloneEg b = (CloneEg) a.clone();
            System.out.println(b.s);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
