package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from API-2 !";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return String.format("Hello from API-2 , %s!", name);
    }
}
