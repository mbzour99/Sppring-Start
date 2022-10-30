package com.spring.myfirstproject;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/daikichi")
public class Ass1 {
    @RequestMapping("")
    public String hello() {
            return "Hello";
    }
    @RequestMapping("/today")
    public String tody() {
        return "tody you will find good";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow";
    }
}
