package com.javainterview.lookupinjection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
public class LookupInjectionApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void singletonBeanScopeTest(){
        UserService userService1 = applicationContext.getBean("userService", UserService.class);
        UserService userService2 = applicationContext.getBean("userService", UserService.class);
        Assertions.assertEquals(userService1.hashCode(), userService2.hashCode());
    }

    @Test
    public void prototypeBeanScopeTest(){
        WeatherService weatherService1 = applicationContext.getBean("weatherService", WeatherService.class);
        WeatherService weatherService2 = applicationContext.getBean("weatherService", WeatherService.class);
        System.out.println(weatherService1.getTodaysTemp());
        Assertions.assertNotEquals(weatherService1.hashCode(), weatherService2.hashCode());
    }

}
