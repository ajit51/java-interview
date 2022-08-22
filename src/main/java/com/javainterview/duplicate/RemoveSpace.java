package com.javainterview.duplicate;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RemoveSpace {

    public static void main(String[] args) {

        String str = "Ajit Kumar";
        StringBuilder sb = new StringBuilder();
        String[] s = str.split("\\s");
        for (String s1 : s){
            sb.append(s1);
        }
        System.out.println(sb.toString());

    }
}
