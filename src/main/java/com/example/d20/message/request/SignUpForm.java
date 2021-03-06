package com.example.d20.message.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignUpForm {
    @NotBlank
    private String fname;
    
    @NotBlank
    private String lname;

    @NotBlank
    @Email
    private String email;
    
    @Size(min=8, max = 9)
    private String telephone;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 4)
    private String password;
    
    public SignUpForm(String fname, String lname, String email, String telephone, Set<String> role, String password) {
    	this.fname = fname;
    	this.lname = lname;
    	this.email = email;
    	this.telephone = telephone;
    	this.role = role;
    	this.password = password;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String tel) {
        this.telephone = tel;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
    	return this.role;
    }
    
    public void setRole(Set<String> role) {
    	this.role = role;
    }
}