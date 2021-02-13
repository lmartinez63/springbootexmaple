package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
    @RequestMapping("/newPoint")
    public String newEnpoint(){
        return "Otro";
    }

}
