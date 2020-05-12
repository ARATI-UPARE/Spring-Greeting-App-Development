package com.greeting.greetingapp.repository;

import com.greeting.greetingapp.model.Greeting;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GreetingRepository extends MongoRepository<Greeting,Integer> {

}
