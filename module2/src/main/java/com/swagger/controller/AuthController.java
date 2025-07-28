package com.swagger.controller;

import com.swagger.api.AuthApi;
import com.swagger.delegate.AuthDelegate;
import com.swagger.model.LoginRequest;
import com.swagger.model.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController implements AuthApi {
    @Autowired
    private final AuthDelegate authDelegate;

    public AuthController(AuthDelegate authDelegate) {
        this.authDelegate = authDelegate;
    }

    @Override
    public ResponseEntity<LoginResponse> loginUser(LoginRequest loginRequest) {
        return authDelegate.loginUser(loginRequest);
    }
}
