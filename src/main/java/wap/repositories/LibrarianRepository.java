package wap.repositories;

import wap.models.Librarian;
import org.springframework.data.repository.CrudRepository;

public interface LibrarianRepository
        extends CrudRepository<Librarian, Integer> {
}
