package com.javainterview.controller;

import com.javainterview.annotation.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autowire")
public class AutoWiredController {

    //@Autowired
    //@Qualifier("cat")
    //private Animal animal;

    //@Autowired
    //private Animal dog;
    private Animal animal;

    /*  @Autowired
      public void setAnimal(@Qualifier("dog") Animal animal) {
          this.animal = animal;
      }*/

    /*@Autowired(required = false)
    public void setAnimal(@Qualifier("cat") Animal animal) {
        this.animal = animal;
    }*/

    @Autowired(required = false)
    public AutoWiredController(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    @GetMapping
    public String fetchCharacteristic() {
        return animal.characteristic();
    }
}
