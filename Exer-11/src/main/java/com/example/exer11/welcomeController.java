package com.example.exer11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {
    @GetMapping("/name")
    public String name(){
        return "My name is Osama";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 22";
    }

    @GetMapping("/check/status")
    public String check(){
        return "Everything OK";
        }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    ArrayList<String> names = new ArrayList<>();


    @GetMapping("/names")
    public ArrayList<String> getNames(){
        return names;
    }


}
