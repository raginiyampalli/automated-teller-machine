package com.example.automatedtellermachine.model;

public class User {
    private String userId;
    private Boolean isValidated;
    private String error;

    public User(String userId, Boolean isValidated, String error){
        this.userId = userId;
        this.isValidated = isValidated;
        this.error = error;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean isValidated() {
        return isValidated;
    }

    public void setValidated(Boolean validated) {
        isValidated = validated;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
