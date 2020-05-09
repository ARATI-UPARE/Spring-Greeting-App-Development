package com.greeting.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {

    public String getMessage() {
        return "Hello World!";
    }
}
