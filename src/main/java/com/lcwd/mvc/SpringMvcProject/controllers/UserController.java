package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("about request handler");
        return "about";
    }

    @RequestMapping("/home")
    public String homeRequestHandler(){
        System.out.println("home request handler");
        return "home";
    }

    @RequestMapping("/service")
    public String serviceRequestHandler(){
        System.out.println("service request handler");
        return "service";
    }
}
