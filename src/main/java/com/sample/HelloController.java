package com.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public Hello sayHello() {
        return new Hello("Hello World");
    }
}