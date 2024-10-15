package com.example.demo.service;

import com.example.demo.Repository.UserDetailsRepo;
import com.example.demo.auth.JwtService;
import com.example.demo.dto.UserLoginRequest;
import com.example.demo.dto.UserLoginResponse;
import com.example.demo.dto.UserRegisterResponse;
import com.example.demo.models.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDetailsRepo userRepo;
    @Autowired
    AuthenticationManager authManager;

    @Autowired
    JwtService jwtService;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(11);

    public UserLoginResponse login(UserLoginRequest request){
        UserLoginResponse ans = new UserLoginResponse();
        try {
            Authentication auth = authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
            if (auth.isAuthenticated()) {
                MyUser currentUser = getUser(request.getUserName());

                if (currentUser != null) {
                    ans.setMainCode(200);
                    ans.setMessage("user fetched successfully");
                    ans.setUserName(currentUser.getUserName());
                    ans.setEmailId(currentUser.getEmail());
                    ans.setRoles(currentUser.getRoles());
                } else {
                    ans.setMainCode(404);
                    ans.setMessage("user not found");
                }
                String token = jwtService.generateToken(request.getUserName(), currentUser);
                ans.setToken(token);
                return ans;
            } else {
                ans.setMainCode(404);
                ans.setMessage("user not found");
                return ans;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public UserRegisterResponse saveUser(MyUser myUser){
        UserRegisterResponse ans = new UserRegisterResponse();
        if(userRepo.existsByUserName(myUser.getUserName())){
            ans.setMessage("userName has already been taken");
            ans.setMainCode(403);
            ans.setErrorMessage("userName has already been taken");
            return ans;
        }
        if(userRepo.existsByEmail(myUser.getEmail())){
            ans.setMessage("account with the email id already exists");
            ans.setMainCode(403);
            ans.setErrorMessage("account with the email id already exists");
            return ans;
        }
        String currPassword=myUser.getPassword();
        myUser.setPassword(encoder.encode(currPassword)); //while storing we are converting the password to hash
        //note that while authenticating the userpassword(done by spring security in the project)
        //we do not encrypt the password again and check instead we internally use : encoder.matches(enteredPasswordInEnglish, storedHashedPassword);
        //reason is because every time the hash changes because of different random salt.
        MyUser newMyUser = userRepo.save(myUser);
        ans.setMainCode(200);
        ans.setMessage("The account with userName "+newMyUser.getUserName()+" has been registered. Please login to your account");
        return ans;
    }

    public MyUser getUser(String userName){
        //UserLoginResponse ans = new UserLoginResponse();
        Optional<MyUser> user=userRepo.findByUserName(userName);
        return user.orElse(null);
    }
}
