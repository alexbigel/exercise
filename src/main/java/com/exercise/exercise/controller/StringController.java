package com.exercise.exercise.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string")
public class StringController {

    @PostMapping("reverce")
    public String gerReversed(@RequestBody String message){
        String reversed = new StringBuilder(message).reverse().toString();
        return reversed;
    }
}
