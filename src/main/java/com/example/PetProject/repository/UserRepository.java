package com.example.PetProject.repository;

import com.example.PetProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Long> {
}
