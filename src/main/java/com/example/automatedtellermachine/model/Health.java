package com.example.automatedtellermachine.model;

import org.springframework.stereotype.Service;

@Service
public class Health {
    private String serviceName;
    private boolean isHealthy;

    public Health(){
        serviceName = "ATM Service";
        isHealthy = true;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}
