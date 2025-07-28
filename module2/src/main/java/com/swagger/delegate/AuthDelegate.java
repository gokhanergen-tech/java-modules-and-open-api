package com.swagger.delegate;

import com.swagger.api.AuthApi;
import com.swagger.model.LoginRequest;
import com.swagger.model.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AuthDelegate implements AuthApi {

    @Override
    public ResponseEntity<LoginResponse> loginUser(LoginRequest loginRequest) {
        return null;
    }
}
