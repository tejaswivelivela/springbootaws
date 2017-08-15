package com.example.demo;

import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("/hello")
    public String print(){
        return "hello world";

    }
}
