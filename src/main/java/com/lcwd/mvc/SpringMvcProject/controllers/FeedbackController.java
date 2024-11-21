package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController()
public class FeedbackController {

    @GetMapping("/feedback")
    public List<String> feedback(){
        List<String> feedback = Arrays.asList(
                "Good",
                "Nice",
                "Useful"
        );
        return feedback;
    }

    @PostMapping("/create-feedback")
    public String createFeedback(){
        System.out.println("Feedback created");
        return "Feedback created";
    }
}
