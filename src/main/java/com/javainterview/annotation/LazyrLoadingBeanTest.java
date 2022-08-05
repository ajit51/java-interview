package com.javainterview.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyrLoadingBeanTest {

    LazyrLoadingBeanTest(){
        System.out.println("LazyrLoadingBeanTest object created.....");
    }

    void test(){
        System.out.println("test...........");
    }
}
