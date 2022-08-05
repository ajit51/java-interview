package com.javainterview.annotation;

import com.javainterview.config.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(("classpath:test.properties"))
public class AnnotationTest {

    @Autowired
   LazyrLoadingBeanTest test;

    @Value("${key1}")
    private String str;

    @Value("${msg}")
    private String str1;

    @Autowired
    private MailProperties mailProperties;

    @Autowired
    private DBConfig dbConfig;

    @GetMapping("/")
    public void test(){
        System.out.println(mailProperties);
        System.out.println(dbConfig.dataSourcePro());
        test.test();
    }

}
