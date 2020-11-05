package com.example.wam.daos;

import com.example.wam.models.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CourseDaoTest {
    @Autowired
    CourseDao dao;

    @Test
    void findAllCourses() {
        Iterable<Course> courses = dao.findAllCourses();
        for(Course course: courses) {
            System.out.println(course);
        }
    }

    @Test
    void findCourseById() {
    }

    @Test
    void createCourse() {
    }

    @Test
    void updateCourse() {
    }

    @Test
    void deleteCourse() {
    }
}
