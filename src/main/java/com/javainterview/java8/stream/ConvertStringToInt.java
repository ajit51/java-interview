package com.javainterview.java8.stream;

public class ConvertStringToInt {

  /*  private static int getNumber(String number){
        int result = 0;
        for (int i = 0; i < number.length(); i++){
            result = result * 10 + number.charAt(i) - '0';
        }
        return result;
    }*/

    private static int getNumber(String number) {
        return number.chars().reduce(0, (a, b) -> 10 * a + b - '0');
    }

    public static void main(String[] args) {
        System.out.println(getNumber("123"));
    }
}
