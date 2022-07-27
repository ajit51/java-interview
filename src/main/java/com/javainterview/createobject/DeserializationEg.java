package com.javainterview.createobject;

import java.io.*;

public class DeserializationEg implements Serializable {
    private String name;
    public DeserializationEg(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        DeserializationEg b = new DeserializationEg("studytonight");
        try {
            FileOutputStream c = new FileOutputStream("CoreJava.txt");
            ObjectOutputStream d = new ObjectOutputStream(c);
            d.writeObject(b);
            d.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
