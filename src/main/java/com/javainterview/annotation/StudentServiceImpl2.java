package com.javainterview.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("StudentServiceImpl2")
@Primary
public class StudentServiceImpl2 implements StudentService{
    @Override
    public void display() {
        System.out.println("Inside StudentServiceImpl2 class........");
    }
}
