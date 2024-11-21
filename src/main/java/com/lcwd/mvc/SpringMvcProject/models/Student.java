package com.lcwd.mvc.SpringMvcProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int studentId;
    private String studentName;
    private String studentEmail;
    private long studentPhone;
    private String studentAddress;
}
