package com.javainterview.lookupinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LookupInjectionApplication {

    @Autowired
    private UserService userService;

    @GetMapping("/scope")
    public List<String> getWeatherForecast() throws InterruptedException {
        String response1 = userService.getCurrentTempFromWeatherAPI();
        Thread.sleep(1000);
        String response2 = userService.getCurrentTempFromWeatherAPI();
        return Arrays.asList(response1, response2);
    }
}
