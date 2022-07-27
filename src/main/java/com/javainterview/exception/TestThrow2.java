package com.javainterview.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2 {
    public static void method() throws FileNotFoundException{
        FileReader fileReader = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}
