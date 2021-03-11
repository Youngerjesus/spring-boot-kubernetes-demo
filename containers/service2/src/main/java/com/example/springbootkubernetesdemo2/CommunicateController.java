package com.example.springbootkubernetesdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommunicateController {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @GetMapping("/communicate")
    public String communicate(){
        RestTemplate restTemplate = restTemplateBuilder.build();

        String helloResponse = restTemplate.getForObject("http://app-demo:8080/hello", String.class);

        return "Communicate" + " " + helloResponse;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
