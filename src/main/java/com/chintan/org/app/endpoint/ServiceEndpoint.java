package com.chintan.org.app.endpoint;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api")
public class ServiceEndpoint {

    @GetMapping(value = "/home", produces = MediaType.TEXT_PLAIN_VALUE)
    public String firstMethod(){
        System.out.println("Inside Service");
        return "Programming";
    }
}
