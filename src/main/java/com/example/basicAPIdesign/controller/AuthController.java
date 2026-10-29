package com.example.basicAPIdesign.controller;

import com.example.basicAPIdesign.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping
@RestController
public class AuthController {

    @GetMapping("/login")
    public ResponseEntity<User> login(@RequestBody String username, String password){

    }

    @GetMapping("/register")
    // Return the login page after a successful registration popup
    public ResponseEntity<T> registration(@RequestBody String email, String username){

    }

    @PostMapping("/dashboard")
    public ResponseEntity<T> userInfo(@RequestBody User user){

    }
}
