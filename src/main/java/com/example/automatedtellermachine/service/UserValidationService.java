package com.example.automatedtellermachine.service;

import com.example.automatedtellermachine.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserValidationService {
    Map<String,String> validUsers = new HashMap<>();

    UserValidationService(){
        validUsers.put("Ragini","HJH123iklL");
        validUsers.put("Ved","dhkfY76HHk8");
    }

    public User validateUser(String userId, String password){
        if(!validUsers.containsKey(userId)){
            return new User(userId, false, "User does not exist.");
        } else if(password.equals(validUsers.get(userId))){
            return new User(userId, true, "None");
        }

        return new User(userId, false, "Request failed. Incorrect password.");
    }

}
