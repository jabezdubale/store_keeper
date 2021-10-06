package com.demo.store_keeper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping ("/hey")
    public String hello(){

        return "hey there  ";
    }
}
