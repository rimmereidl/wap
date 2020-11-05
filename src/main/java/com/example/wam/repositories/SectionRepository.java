package com.example.wam.repositories;

import com.example.wam.models.Section;
import org.springframework.data.repository.CrudRepository;

public interface SectionRepository
    extends CrudRepository<Section, Integer> {
}
