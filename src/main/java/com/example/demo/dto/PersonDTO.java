package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {
    private String name;
    private String age;
    private String email;

    @Override
    public String toString() {
        return name + "\n" + age + "\n" + email;
    }
}
