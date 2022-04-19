package com.codedifferently.firebaseauthenticationstarter.domain.user.service;

import com.codedifferently.firebaseauthenticationstarter.domain.user.models.User;
import com.codedifferently.firebaseauthenticationstarter.domain.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findByEmail(String email) throws Exception {
        Optional<User> optional = userRepo.findByEmail(email);
        if(optional.isEmpty())
            throw new Exception();
        return optional.get();
    }
}
