package com.javainterview.collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(55);
        set.add(10);
        set.add(28);
        set.add(15);
        set.add(70);

        System.out.println(set);

        //1
        TreeSet<Integer> treeSet = (TreeSet<Integer>) set.descendingSet();
        System.out.println(treeSet);

        //2
        TreeSet<Integer> treeSet1 = new TreeSet<>(Collections.reverseOrder());
        treeSet1.addAll(set);
        System.out.println(treeSet1);


    }
}
