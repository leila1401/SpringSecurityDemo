package com.example.Springsecuritydemo.Repository;

import com.example.Springsecuritydemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
