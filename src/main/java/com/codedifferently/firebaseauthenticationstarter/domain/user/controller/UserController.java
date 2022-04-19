package com.codedifferently.firebaseauthenticationstarter.domain.user.controller;

import com.codedifferently.firebaseauthenticationstarter.domain.user.models.User;
import com.codedifferently.firebaseauthenticationstarter.domain.user.service.UserService;
import com.codedifferently.firebaseauthenticationstarter.security.models.FireBaseUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<User> getUserInfo(@AuthenticationPrincipal FireBaseUser fireBaseUser) throws Exception {
        String email = fireBaseUser.getEmail();
        User user = userService.findByEmail(email);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/me")
    public ResponseEntity<User> createNewUser(@RequestBody User user){
        user = userService.create(user);
        return ResponseEntity.ok(user);
    }

}
