package com.example.springbootwebjpatemplateproject.repositories;

import com.example.springbootwebjpatemplateproject.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository
    extends CrudRepository<Movie, Integer> { }
