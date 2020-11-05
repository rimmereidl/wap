package com.example.wam.repositories;

import com.example.wam.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository
    extends CrudRepository<Student, Integer> {
}
