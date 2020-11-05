package com.example.wam.controllers;

import com.example.wam.models.Course;
import com.example.wam.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }
}
