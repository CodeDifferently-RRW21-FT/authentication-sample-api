package com.codedifferently.firebaseauthenticationstarter.domain.user.repo;

import com.codedifferently.firebaseauthenticationstarter.domain.user.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
