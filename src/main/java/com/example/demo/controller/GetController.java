package com.example.demo.controller;

import com.example.demo.dto.PersonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GetController {

    @GetMapping(value = "/api/v1/name")
    public String name() {
        return "jtlee";
    }

    @GetMapping(value = "/api/v1//name/{name}")
    public String echoName(@PathVariable String name) {
        return name;
    }

    @GetMapping(value = "/api/v1/person")
    public String printPersonInfo(@RequestParam String name, @RequestParam String age) {
        return name + "/" + age;
    }

    @GetMapping(value = "/api/v1/person2")
    public String printPersonInfo2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map-> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping(value = "/api/v1/person3")
    public String printPersonInfo2(PersonDTO personDTO) {
        return personDTO.toString();
    }
}
