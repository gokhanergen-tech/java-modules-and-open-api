package com.swagger.delegate;

import com.swagger.api.UsersApi;
import com.swagger.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserDelegate implements UsersApi {

    @Override
    public ResponseEntity<Void> createUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> getCurrentUser() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(UserDto userDto) {
        return null;
    }
}
