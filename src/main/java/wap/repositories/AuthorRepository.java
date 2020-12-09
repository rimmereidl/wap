package wap.repositories;

import wap.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository
        extends CrudRepository<Author, Integer> {
}
