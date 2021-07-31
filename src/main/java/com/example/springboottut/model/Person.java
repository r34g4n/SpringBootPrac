package com.example.springboottut.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * @author r34g4n
 * @date 7/31/21 11:32 AM
 */
public class Person {
    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
