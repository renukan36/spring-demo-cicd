package com.thevarungupta.spring_sample_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String index(){
        return "Hello from spring boot app";
    }
}