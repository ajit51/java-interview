package com.javainterview.string;

import java.util.StringTokenizer;

public class WordCount {
    public static int countWordsUsingSplit(String str){
        if (str == null || str.isEmpty()){
            return 0;
        }
        String[] strings = str.split("\\s+");
        return strings.length;
    }
    public static int countWordsUsingStringTokenizer(String sentence){
        if (sentence == null || sentence.isEmpty()){
            return 0;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(sentence);
        return stringTokenizer.countTokens();
    }

    public static void main(String[] args) {
        String str = "welcome to  java   tutorial on Java2blog";
        int count =1;
        for (int i = 0; i < str.length()-1 ; i++){
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                count++;
            }
        }

        System.out.println("Number of words in a string : " + count);

        // Solution 2
        String string ="    India Is My Country";
       // System.out.println(countWordsUsingSplit(string));

        // Solution 3
        System.out.println(countWordsUsingStringTokenizer(string));



        String a = "meow";
        String ab = a + "deal";
        String abc = "meowdeal";
        System.out.println(ab == abc);
    }
}
