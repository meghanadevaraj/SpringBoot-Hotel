package com.app.hotell.DTO;

public class JWTResponse { 
    private String token; 
 
    public JWTResponse(String token) { 
        this.token = token; 
    } 
 
    public String getToken() { 
        return token; 
    } 
}
