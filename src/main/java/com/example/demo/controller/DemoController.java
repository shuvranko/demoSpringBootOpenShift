package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({ "/" })
public class DemoController
{
    @GetMapping
    public String welcome() {
        return "welcome to ibm spring boot open shift demo";
    }
    
    @GetMapping({ "/{input}" })
    public String success(@PathVariable final String input) {
        return "Hi " + input + ". Your application deployed successfully.";
    }
}