package com.example.ztp_proj2.requests;

public class LoginRequest {
    public String username;
    public String password;

    public LoginRequest(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {return username;}

    public String getPassword() {return password;}
}
