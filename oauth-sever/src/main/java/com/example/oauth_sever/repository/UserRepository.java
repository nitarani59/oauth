package com.example.oauth_sever.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oauth_sever.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
