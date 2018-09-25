package com.example.notasfaciles.repository;

import com.example.notasfaciles.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
