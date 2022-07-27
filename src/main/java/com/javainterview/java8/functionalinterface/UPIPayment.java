package com.javainterview.java8.functionalinterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {
    String doPayment(String source, String dest);

    default double getScratchCard() {
        return new Random().nextDouble();
    }

    static String datePattern(String patterns) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }
}
