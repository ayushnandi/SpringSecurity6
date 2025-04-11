package com.SpringSecurityLearning.service;


import com.SpringSecurityLearning.entity.User;
import com.SpringSecurityLearning.repo.UserRepo;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    private final JWTservice jwTservice;
    private final UserRepo userRepo;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AuthenticationManager authenticationManager;

    public UserService(JWTservice jwTservice, UserRepo userRepo, BCryptPasswordEncoder bCryptPasswordEncoder, AuthenticationManager authenticationManager) {
        this.jwTservice = jwTservice;
        this.userRepo = userRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.authenticationManager = authenticationManager;
    }

    public User register(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }


    public String verify(User user) {
        Authentication authenticate  = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUserName(),user.getPassword()
                )
        );
        if(authenticate.isAuthenticated()){
            return jwTservice.generateToken(user);
        }
        return "Failure";
    }
}
