package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayhello(){
        return "Hello World";
    }
    @GetMapping("/greeting")
    public String sayhello1(){
        return "Hello There , How are you";
    }
}
