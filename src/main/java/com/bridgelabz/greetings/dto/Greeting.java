package com.bridgelabz.greetings.dto;

import lombok.Data;

@Data
public class Greeting {

    private long id;
    private String message;

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }
}
