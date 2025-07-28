package com.swagger.controller;

import com.swagger.api.UsersApi;
import com.swagger.delegate.UserDelegate;
import com.swagger.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController implements UsersApi {
    private final UserDelegate userDelegate;

    public UserController(UserDelegate userDelegate) {
        this.userDelegate = userDelegate;
    }

    @Override
    public ResponseEntity<Void> createUser(UserDto userDto) {
        return userDelegate.createUser(userDto);
    }

    @Override
    public ResponseEntity<UserDto> getCurrentUser() {
        return userDelegate.getCurrentUser();
    }

    @Override
    public ResponseEntity<Void> updateUser(UserDto userDto) {
        return userDelegate.updateUser(userDto);
    }
}
