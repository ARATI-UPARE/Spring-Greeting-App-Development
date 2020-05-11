package com.greeting.greetingapp.service;

import com.greeting.greetingapp.model.Greeting;
import com.greeting.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
    @Autowired
    private GreetingRepository greetingRepository;

    private String message;

    public String greetingMessage() {
        this.message = "Hello World !";
        return message;
    }

    public String greetingMessage(String name)
    {
        this.message = "Hello ! "+name;
        Greeting greeting = new Greeting(greetingRepository.count() + 1, name, message);
        greetingRepository.save(greeting);
        return message;
    }

    public String greetingMessage(String firstName, String lastName) {

        this.message =("Hello ! " + firstName + " " + lastName);
        Greeting greeting = new Greeting(greetingRepository.count() + 1, firstName,lastName, message);
        greetingRepository.save(greeting);
        return message;
    }
}
