package com.greeting.greetingapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingAppController {

    public String message ;
    public String getMessage(String name) {
        return this.message = "Hello! Welcome to Greetings Application "+name;
    }
    @GetMapping("/greetings")
    public ResponseEntity getGreeting(){
        return new ResponseEntity(getMessage("ARATI"), HttpStatus.OK);
    }

    @PostMapping("/greetings/{name}")
    public ResponseEntity postGreeting(@PathVariable String name){
        return new ResponseEntity(getMessage(name),HttpStatus.CREATED);
    }

    @PutMapping("/greetings/update/{name}")
    public ResponseEntity putGreetings(@PathVariable String name){
        return new ResponseEntity(getMessage(name),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("greetings/delete/{name}")
    public ResponseEntity deleteGreeting(@PathVariable String name){
        return new ResponseEntity(getMessage(name)+"Deleted", HttpStatus.ACCEPTED);
    }
}
