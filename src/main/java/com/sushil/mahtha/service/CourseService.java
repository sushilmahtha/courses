package com.sushil.mahtha.service;
import com.sushil.mahtha.entities.Course;

import java.util.List;
public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
}
