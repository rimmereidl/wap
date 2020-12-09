package wap.repositories;

import wap.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository
        extends CrudRepository<Item, Integer> {
}
