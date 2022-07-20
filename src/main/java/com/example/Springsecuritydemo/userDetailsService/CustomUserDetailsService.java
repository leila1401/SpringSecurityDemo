package com.example.Springsecuritydemo.userDetailsService;

import com.example.Springsecuritydemo.Entity.User;
import com.example.Springsecuritydemo.Repository.UserInterface;
import com.example.Springsecuritydemo.UserDetails.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
            @Autowired
         private UserInterface userInterface;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userInterface.findByUsername(username);

        if(user==null){
            throw new UsernameNotFoundException("User not FOUND");
        }
        return new CustomUserDetails(user);
    }
}
