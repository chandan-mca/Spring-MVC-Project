package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloApi(){
        System.out.println("Hello Api Controller");
        return "Hello, How are you. You are calling: Api Controller";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<String> usersApi(){
        List<String> users = Arrays.asList("Ram", "Shyam", "Chandan");
        return users;
    }

    @RequestMapping(value = "/create-user", method = RequestMethod.POST)
    public String createUser(){
        System.out.println("Create User Controller");
        return "User created...";
    }

}