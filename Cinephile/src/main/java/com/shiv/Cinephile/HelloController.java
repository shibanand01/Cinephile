package com.shiv.Cinephile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/Cinephile")
    public String greet(){
        return "Hello, Cinephile!";
    }
}
