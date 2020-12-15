package com.example.demoweb.controller;

import com.example.demoweb.pojo.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public Message message() {
        Message message = new Message();
        message.setMessage("Spring Boot + Docker ROCKS!");
        return message;
    }

}
