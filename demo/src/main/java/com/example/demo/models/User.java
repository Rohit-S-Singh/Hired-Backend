package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;


//(collection = "users")
@Document(collection = "users")
public class User {

    String Id;
    String userName;
    String email;
    String password;
    Set<String> roles;
    Boolean havingOffer;
    String workExperience;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Boolean getHavingOffer() {
        return havingOffer;
    }

    public void setHavingOffer(Boolean havingOffer) {
        this.havingOffer = havingOffer;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }



}
