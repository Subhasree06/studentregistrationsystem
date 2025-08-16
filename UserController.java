package com.example.registrationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.registrationsystem.model.User;
import com.example.registrationsystem.repository.UserRepository;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://127.0.0.1:5500") // allow frontend running on live-server / VSCode
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Create student
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Get all students
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Update student
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setUsername(userDetails.getUsername());
            user.setFirstName(userDetails.getFirstName());
            user.setLastName(userDetails.getLastName());
            user.setFatherName(userDetails.getFatherName());
            user.setMotherName(userDetails.getMotherName());
            user.setTenthMark(userDetails.getTenthMark());
            user.setTwelfthMark(userDetails.getTwelfthMark());
            user.setDob(userDetails.getDob());
            user.setGender(userDetails.getGender());
            user.setAddress(userDetails.getAddress());
            user.setCaste(userDetails.getCaste());
            user.setCommunity(userDetails.getCommunity());
            user.setState(userDetails.getState());
            user.setCountry(userDetails.getCountry());
            return userRepository.save(user);
        }).orElse(null);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "Student deleted successfully!";
    }
}
