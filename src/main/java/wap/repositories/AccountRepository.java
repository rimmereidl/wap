package wap.repositories;

import wap.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository
        extends CrudRepository<Account, Integer> {
}
