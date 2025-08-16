package com.example.registrationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.registrationsystem.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
