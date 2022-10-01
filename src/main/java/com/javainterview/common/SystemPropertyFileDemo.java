package com.javainterview.common;

import java.util.Map;
import java.util.Properties;

public class SystemPropertyFileDemo {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.setProperty("test", "Tesing for java");
        //properties.list(System.out);
      //  System.out.println(System.getenv("test"));

        Map<String, String> getenv = System.getenv();
        getenv.forEach((k, v) -> {
            System.out.println(k + " "+ v);
        });

    }
}
