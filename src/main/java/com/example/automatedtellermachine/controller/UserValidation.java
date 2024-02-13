package com.example.automatedtellermachine.controller;

import com.example.automatedtellermachine.model.User;
import com.example.automatedtellermachine.service.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserValidation {

    UserValidationService userValidationService;

    @Autowired
    UserValidation(UserValidationService userValidationService){
        this.userValidationService = userValidationService;
    }

    @GetMapping("/validate-user")
    public ResponseEntity<User> validateUser(@RequestParam String userId, String password){
        User user = userValidationService.validateUser(userId,password);
        ResponseEntity<User> userResponseEntity = new ResponseEntity<>(user, HttpStatusCode.valueOf(200));
        return userResponseEntity ;
    }
}
