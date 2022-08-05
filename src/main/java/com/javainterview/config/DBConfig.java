package com.javainterview.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class DBConfig {

    @Value("${db.driverClass}")
    private String driverClass;

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${sd.password}")
    private String password;

    @Bean
    @Profile("stg")
    public boolean dataSourcePro() {
        System.out.println(driverClass + " : " + url + " : " + username + " : " + password);
        return false;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,5,10,11, 21};
        Arrays.stream(arr)
                .filter(a ->  String.valueOf(a).startsWith("1"))
                .forEach(System.out::println);
    }
}
