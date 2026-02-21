package com.de.app.controller;

import com.de.app.model.User;
import com.de.app.repo.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/")
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @PostMapping(value = "/add")
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping(value = "/{name}")
    public List<User> getUserDetails(@PathVariable("name") String name) {
        List<User> result = repo.findDetailsByName(name);
        return result;
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return repo.findById(id).get();
    }
}