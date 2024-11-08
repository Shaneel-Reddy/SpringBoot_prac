package com.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Register;

import com.demo.service.RegisterServiceImp;
 
@RestController 

public class RegisterController {
 
	@Autowired private RegisterServiceImp service;

	@PostMapping("/save")
    public String saveUser(@RequestBody Register register) {
        Register savedUser = service.saveNewUser(register);
        String message = null;

        if (savedUser != null) {
            message = "New User Successfully Registered...";
        } else {
            message = "Registration Failed";
        }

        return message;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Register register) {
        Register loggedInUser = service.login(register.getUsername(), register.getPassword());
        String message = null;

        if (loggedInUser != null) {
            message = "Login Successful...";
        } else {
            message = "Login Failed";
        }

        return message;
    }

}