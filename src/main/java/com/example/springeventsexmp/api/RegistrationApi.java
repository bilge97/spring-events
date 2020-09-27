package com.example.springeventsexmp.api;

import com.example.springeventsexmp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegistrationApi {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public void registerUser(@RequestBody User user){
        registrationService.publishRegistrationEvent(user);
        System.out.println("User request processed");
    }
}
