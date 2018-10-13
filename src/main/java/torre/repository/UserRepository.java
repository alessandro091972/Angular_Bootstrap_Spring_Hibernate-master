package torre.repository;

import org.springframework.data.repository.CrudRepository;
import torre.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
