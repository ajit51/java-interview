package com.javainterview.collection;

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        Collection<String> set = new TreeSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            {
                System.out.println(itr.next());
            }
        }
    }
}
