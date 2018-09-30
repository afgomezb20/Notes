package com.example.notasfaciles.controller;

import com.example.notasfaciles.exception.ResourceNotFoundException;
import com.example.notasfaciles.model.User;
import com.example.notasfaciles.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    //Get all Users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Create new User
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    //Get a single User
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
    }

    //Update a User
    @PutMapping("/users/{id}")
    public User uodateUser (@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) {
        User user  = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
        user.setName(userDetails.getName());
        user.setLast_name(userDetails.getLast_name());
        user.setEmail(userDetails.getEmail());
        user.setCedula(userDetails.getCedula());
        user.setAge(userDetails.getAge());
        return userRepository.save(user);
    }

    //Delete a User
    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteNote (@PathVariable(value = "id") Long userId) {
        User user  = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }
}
