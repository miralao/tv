package com.tinystripz.tv.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Authentication logic here
        return ResponseEntity.ok("Login successful");
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        // Registration logic here
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
    }
}

class LoginRequest {
    private String username;
    private String password;

    // Getters and Setters
}

class RegisterRequest {
    private String username;
    private String password;
    private String email;

    // Getters and Setters
}