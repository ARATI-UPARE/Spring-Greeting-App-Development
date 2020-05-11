package com.greeting.greetingapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {

    private String message;
    private String firstName;
    private String lastName;

    public String getMessage() {

        return "Hello World !";
    }

    public String getMessage(String name)
    {
        return this.message = "Hello ! "+name;
    }

    public String userData(String firstName, String lastName) {

            return ("Hello ! " + firstName + " " + lastName);
    }
}
