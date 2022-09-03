package com.javainterview.common;

public class StringPlindrom {

    private static boolean isPlindrom(String str){
        int i1 = 0;
        int i2 = str.length() - 1;

        while (i1 != i2){
            if (str.charAt(i1) != str.charAt(i2)){
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "My name is nitin";
        String[] words = str.split(" ");
        for (String word : words){
            if (isPlindrom(word)){
                System.out.println(word);
            }
        }
    }
}
