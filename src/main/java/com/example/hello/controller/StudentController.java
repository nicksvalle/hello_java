package com.example.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hello.entities.Student;

@RestController
@RequestMapping("students")
public class StudentController {
    
    @GetMapping
    public List<Student> getStudents(){
        
        List<Student> list = new ArrayList<Student>();



        Student s1 = new Student();
        s1.setCourse("ADS");
        s1.setId(1);
        s1.setName("Glauco Todesco");

        Student s2 = new Student();
        s2.setCourse("ADS");
        s2.setId(1);
        s2.setName("Glauco Todesco");

        list.add(s1);
        list.add(s2);

        return list;
    }

    



}
