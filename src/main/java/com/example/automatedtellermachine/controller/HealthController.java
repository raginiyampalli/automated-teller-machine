package com.example.automatedtellermachine.controller;

import com.example.automatedtellermachine.model.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HealthController {

    @GetMapping("/health")
    public Health isHealthy(){
        return new Health();
    }
}
