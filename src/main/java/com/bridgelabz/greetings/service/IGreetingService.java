package com.bridgelabz.greetings.service;

import com.bridgelabz.greetings.dto.GreetingDTO;

import java.util.List;

public interface IGreetingService {

    public GreetingDTO addGreeting(GreetingDTO greeting);

    public List<GreetingDTO> getGreeting();
}
