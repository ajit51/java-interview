package com.javainterview.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal{
    @Override
    public String characteristic() {
        return "Meow";
    }
}
