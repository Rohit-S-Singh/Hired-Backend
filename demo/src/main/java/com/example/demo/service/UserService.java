package com.example.demo.service;

import com.example.demo.Repository.UserRepo;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User saveUser(User user){
        User newUser = userRepo.save(user);
        return newUser;
    }
}
