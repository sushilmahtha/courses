package com.sushil.mahtha.controller;

import com.sushil.mahtha.entities.Course;
import com.sushil.mahtha.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return "My Home";
    }
    //get courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();



    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping ("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);

    }
}

