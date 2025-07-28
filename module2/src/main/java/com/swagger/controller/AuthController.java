package com.swagger.controller;

import com.swagger.api.AuthApi;
import com.swagger.model.LoginRequest;
import com.swagger.model.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController implements AuthApi {
    @Override
    public ResponseEntity<LoginResponse> _loginUser(LoginRequest loginRequest) {
        return null;
    }
}
