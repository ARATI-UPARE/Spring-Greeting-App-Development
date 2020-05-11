package com.greeting.greetingapp.controller;

import com.greeting.greetingapp.service.GreetingAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class GreetingAppController {

    @Autowired
    GreetingAppService greetingAppService;

    @GetMapping("/greetings")
    public ResponseEntity getGreeting(){

        return new ResponseEntity(greetingAppService.greetingMessage(), HttpStatus.OK);
    }

    @PutMapping("/greetings/update/{name}")
    public ResponseEntity updateGreetings(@PathVariable String name){
        return new ResponseEntity(greetingAppService.greetingMessage(name),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("greetings/delete/{name}")
    public ResponseEntity deleteGreeting(@PathVariable String name){
        return new ResponseEntity(greetingAppService.greetingMessage(name)+"  Deleted", HttpStatus.ACCEPTED);
    }

    @PostMapping("/greetings/userdata/{name}")
    public ResponseEntity postGreeting(@PathVariable String name) {
        return new ResponseEntity(greetingAppService.greetingMessage(name), HttpStatus.CREATED);

    }

    @PostMapping("/greetings/userdata/{firstName}/{lastName}")
    public ResponseEntity postGreeting(@PathVariable String firstName,
                                         @PathVariable String lastName) {
            return new ResponseEntity(greetingAppService.greetingMessage(firstName, lastName), HttpStatus.CREATED);

    }

}
