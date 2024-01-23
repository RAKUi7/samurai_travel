package com.example.samurai_travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samurai_travel.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository< VerificationToken, Integer> {
    public VerificationToken findByToken(String token);
}
