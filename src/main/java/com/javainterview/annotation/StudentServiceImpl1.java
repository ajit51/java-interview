package com.javainterview.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("StudentServiceImpl1")
public class StudentServiceImpl1 implements StudentService{
    @Override
    public void display() {
        System.out.println("Inside StudentServiceImpl1 class........");
    }
}
