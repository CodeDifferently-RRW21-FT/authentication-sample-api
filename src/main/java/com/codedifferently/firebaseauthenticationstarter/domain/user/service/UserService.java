package com.codedifferently.firebaseauthenticationstarter.domain.user.service;

import com.codedifferently.firebaseauthenticationstarter.domain.user.models.User;

public interface UserService {

    User create(User user);
    User findByEmail(String email) throws Exception;
}
