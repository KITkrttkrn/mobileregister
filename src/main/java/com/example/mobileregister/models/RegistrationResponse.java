package com.example.mobileregister.models;

public class RegistrationResponse {

    private String Type;
    private String RefCode;

    public RegistrationResponse(String type) {
        Type = type;
    }
    
    public RegistrationResponse(String type, String refCode) {
        Type = type;
        RefCode = refCode;
    }

    public String getType() {
        return Type;
    }

    public String getRefCode() {
        return RefCode;
    }
}
