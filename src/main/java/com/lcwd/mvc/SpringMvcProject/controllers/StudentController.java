package com.lcwd.mvc.SpringMvcProject.controllers;

import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/student")
public class StudentController {

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        System.out.println(student);
        return "Student created";
    }

    @PostMapping("/create-students")
    public String createStudents(@RequestBody List<Student> students) {
        System.out.println(students);
        int size = students.size();
        return "Students created: " + size;
    }
}
