package com.saas.billing.response;

public class LoginResponse {
    private String token;
    private String message;
    private String status;

    public LoginResponse() {
    }

    public LoginResponse(String token, String message, String status) {
        this.token = token;
        this.message = message;
        this.status = status;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
