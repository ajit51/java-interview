package com.javainterview.trickyprogram;

public class CompareIntegerTrueFalse {
    public static void main(String[] args) {

        //range -128 to 127
        Integer a = 111; //auto-boxing -- Integer.valueOf(111)
        Integer b = 111;

        Integer x = 555;
        Integer y = 555;

        System.out.println(a == b); //True
        System.out.println(x == y); // False
    }
}
