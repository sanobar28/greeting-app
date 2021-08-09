package com.bridgelabz.greetings.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String message;

    public Greeting(long id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Greeting() {

    }
}
