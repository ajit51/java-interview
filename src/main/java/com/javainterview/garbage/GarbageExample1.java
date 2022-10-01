package com.javainterview.garbage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;

class Employee {

    public Employee() {
        System.out.println("Object created...");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method invoked...");
    }
}

public class GarbageExample1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1 = null;//by nulling the reference

        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp2 = emp3;//by assigning a reference to another

        new Employee();//by anonymous object

       //System.gc();
        Runtime.getRuntime().gc();
    }
}
