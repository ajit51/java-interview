package com.javainterview.clone;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Cloneable {

    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student(101, "Ajit");
        Student s2 = (Student) s1.clone();

       // System.out.println(s1.rollno + " " + s1.name);
       // System.out.println(s2.rollno + " " + s2.name);

        ArrayList list = new ArrayList();
        list.add("Alice");
        list.add(Boolean.TRUE);
        list.add(1,"Bob");
        list.remove("true");
        list.add(1,"mike");
        list.add(4,"tara");


        System.out.println(list); //Alice, mike, Bob,
    }
}
