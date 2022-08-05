package com.javainterview.java8.stream.reduce;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class Reduce3 {

    public static void main(String[] args) {
        List<Invoice> invoices = Arrays.asList(
                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
        );

        BigDecimal sum = invoices.stream()
                .map(x -> x.getQty().multiply(x.getPrice())) //map
                .reduce(BigDecimal.ZERO, BigDecimal::add);//reduce

        System.out.println(sum);
        System.out.println(sum.setScale(2, RoundingMode.HALF_DOWN));
    }
}
