
package wap.repositories;

import wap.models.Patron;
import org.springframework.data.repository.CrudRepository;

public interface PatronRepository
        extends CrudRepository<Patron, Integer> {
}
