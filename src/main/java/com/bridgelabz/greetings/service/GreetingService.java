package com.bridgelabz.greetings.service;

import com.bridgelabz.greetings.dto.Greeting;
import com.bridgelabz.greetings.dto.GreetingDTO;
import com.bridgelabz.greetings.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GreetingService implements IGreetingService{

    @Autowired
    private GreetingRepository greetingRepository;

    /**
     * Method to add greeting to repository
     * @param greeting
     * @return
     */
    public GreetingDTO addGreeting(GreetingDTO greeting) {
        Greeting greeting1 = new Greeting();
        greeting1.setMessage(greeting.getContent());
        greetingRepository.save(greeting1);
        return greeting;
    }

    /**
     * Method to get greeting from repository
     * @return
     */
    public List<GreetingDTO> getGreeting() {
        return greetingRepository.findAll().stream().map(greeting -> {
            return new GreetingDTO(greeting.getMessage());
        }).collect(Collectors.toList());
    }
}
