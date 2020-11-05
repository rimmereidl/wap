package com.example.wam.repositories;

import com.example.wam.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository
    extends CrudRepository<Movie, Integer> { }
