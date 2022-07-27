package com.javainterview.createobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionEg {
    private String s;
    public ReflectionEg(){}

    public void setName(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        try {
            Constructor constructor = ReflectionEg.class.getDeclaredConstructor();
            ReflectionEg r = (ReflectionEg) constructor.newInstance();
            r.setName("newInstance() method of Constructor class");
            System.out.println(r.s);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
