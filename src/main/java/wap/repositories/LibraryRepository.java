package wap.repositories;

import wap.models.Item;
import wap.models.Library;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository extends CrudRepository<Library, Integer> {
}
