package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {

    //ENDPOINT
    @RequestMapping("/print")
    public double decimalInteger(){
        return 18.9;
    }

    @RequestMapping("/printint")
    public int numberInteger(){
        return 9;
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "This is my app.";
    }

    @RequestMapping("/subject")
    public double pointInteger(){
        return 36.9;
    }

    @RequestMapping("/statement")
    public String info(){
        return "I am going to print my statement.";
    }

}

