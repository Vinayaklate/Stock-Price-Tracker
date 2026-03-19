package com.example.stocktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.stocktracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}