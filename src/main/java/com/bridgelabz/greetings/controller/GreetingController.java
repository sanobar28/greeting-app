package com.bridgelabz.greetings.controller;

import com.bridgelabz.greetings.dto.GreetingDTO;
import com.bridgelabz.greetings.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
//@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingService greetingService;

    /**
     * Get request to get greetings from database
     * @return
     */
    @GetMapping(value = "/getGreetingDetails")
    public ResponseEntity<List<GreetingDTO>> getGreeting() {
        return new ResponseEntity<>(greetingService.getGreeting(), HttpStatus.OK);
    }

    /**
     * Post request to add greeting to database
     * @param greeting
     * @return
     */
    @PostMapping(value = "/addGreetingDetails")
    public ResponseEntity<GreetingDTO> addGreeting(@RequestBody GreetingDTO greeting) {
        return new ResponseEntity<>(greetingService.addGreeting(greeting), HttpStatus.OK);
    }

}
