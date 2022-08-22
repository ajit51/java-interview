package com.javainterview.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class PrimaryQualifierExample {

    @Autowired
    //@Qualifier("StudentServiceImpl1")
    private StudentService studentService;

    @GetMapping("/disp")
    public void disp(){
        studentService.display();
    }
}
