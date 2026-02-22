package com.tinystripz.tv.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean authenticate(String username, String password) {
        // Add authentication logic here
        // This is just a placeholder implementation
        return "user".equals(username) && "pass".equals(password);
    }

    public void register(String username, String password) {
        // Add user registration logic here
        // This is just an example
        System.out.println("User registered: " + username);
    }
}