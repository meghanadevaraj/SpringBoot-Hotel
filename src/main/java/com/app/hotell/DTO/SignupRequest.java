package com.app.hotell.DTO;

public class SignupRequest {
    private String username;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String role; // Added for assigning USER or ADMIN

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {  // Getter for role
        return role;
    }

    public void setRole(String role) {  // Setter for role
        this.role = role;
    }
}
