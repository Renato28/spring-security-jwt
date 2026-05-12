package br.com.github.renato28.springsecurityjwt.repository;

import br.com.github.renato28.springsecurityjwt.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}
