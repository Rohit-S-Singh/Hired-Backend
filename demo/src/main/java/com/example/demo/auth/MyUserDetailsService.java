package com.example.demo.auth;

import com.example.demo.Repository.UserDetailsRepo;
import com.example.demo.auth.UserPrincipal;
import com.example.demo.models.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserDetailsRepo repo;
    private MyUser myUserObj;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> user = repo.findByUserName(username);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("User with user name " + username + " was not found");
        }

        this.myUserObj = user.get();
        //we want to return an Object of type UserDetails which is an interface.
        //therefore we create UserPrincipal which implements UserDetails
        return new UserPrincipal(myUserObj);
    }
}
