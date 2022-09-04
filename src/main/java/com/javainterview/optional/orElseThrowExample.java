package com.javainterview.optional;

import java.util.Optional;

public class orElseThrowExample {
    public static void main(String[] args) {
        // create a Optional
        Optional<Integer> op = Optional.of(9455);
        Optional<Integer> optional = Optional.empty();

        // print supplier
        System.out.println("Optional: " + op);

        // orElseThrow supplier
        Integer elseThrow = op.orElseThrow(ArithmeticException::new);
        System.out.println(elseThrow);


        //outPut - java.lang.ArithmeticException
        try{
            Integer orElseThrow = optional.orElseThrow(ArithmeticException::new);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

