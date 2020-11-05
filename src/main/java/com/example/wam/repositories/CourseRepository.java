package com.example.wam.repositories;

import com.example.wam.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository
        extends CrudRepository<Course, Integer> {
}
