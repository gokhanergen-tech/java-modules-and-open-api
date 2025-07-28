package com.swagger.controller;

import com.swagger.api.UsersApi;
import com.swagger.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController implements UsersApi {
    @Override
    public ResponseEntity<Void> _createUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> _getCurrentUser() {
        return null;
    }

    @Override
    public ResponseEntity<Void> _updateUser(UserDto userDto) {
        return null;
    }
}
