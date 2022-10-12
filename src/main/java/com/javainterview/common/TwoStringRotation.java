package com.javainterview.common;

public class TwoStringRotation {
    public static void main(String[] args) {
        String str = "abcd";
        for (int i =0; i< str.length(); i++){
            char[] ch = str.toCharArray();
            System.out.print(ch[1]+ch[2]+ch[3]+ch[0] +" ");
        }
    }
}
