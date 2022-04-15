package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //ENDPOINT

    @RequestMapping("/hi")
    public void message(){
        System.out.println("Hello, welcome to Spring boot app..");
    }

    @RequestMapping("/mobile")
    public String hey(){
        return "This is my first Sprint Boot app..";
    }
    @RequestMapping("/int")
    public int number(){
        return 18;
    }
}
