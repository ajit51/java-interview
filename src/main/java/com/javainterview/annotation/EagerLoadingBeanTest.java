package com.javainterview.annotation;

import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBeanTest {

    EagerLoadingBeanTest() {
        System.out.println("EagerLoadingBeanTest object created.....");
    }
}
