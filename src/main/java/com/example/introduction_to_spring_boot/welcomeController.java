package com.example.introduction_to_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {

    @GetMapping("/name")
    public String name() {
        return "My name is Waleed.";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 29.";
    }

    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Waleed");
        names.add("Mohammed");
        names.add("Mutiq");
        names.add("Althubyani");
        return names;
    }
}
