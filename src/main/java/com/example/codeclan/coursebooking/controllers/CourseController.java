package com.example.codeclan.coursebooking.controllers;

import com.example.codeclan.coursebooking.models.Course;
import com.example.codeclan.coursebooking.repositories.courserepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")

public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping(value = "/starRating/{starRating}")
    public List<Course> getCoursesByStarRating(@PathVariable int starRating) {
        return courseRepository.findCoursesByStarRating(starRating);
    }
//
//    @GetMapping(value = "/customer/{name}")
//    public List<Course> getCoursesByCustomer(@PathVariable String name) {
//        return courseRepository.findCoursesByCustomer(name);
//    }

}
