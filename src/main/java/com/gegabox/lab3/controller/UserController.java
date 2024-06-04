package com.gegabox.lab3.controller;

import com.gegabox.lab3.aspect.annotation.ExecutionTime;
import com.gegabox.lab3.aspect.annotation.LogMe;
import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.entity.User;
import com.gegabox.lab3.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ExecutionTime
    @LogMe
    @GetMapping
    public List<User> getUsers() {
        return userService.findAll();
    }

    @GetMapping("/size/{size}")
    public List<User> getUsers(@PathVariable("size") int size) {
        return userService.findByPostsGreaterThanSize(size);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.save(user);
    }

    @LogMe
    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return userService.findById(id);
    }

    @GetMapping("/{id}/posts")
    public List<Post> getUserPosts(@PathVariable long id) {
        return userService.findUserPostsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteById(id);
    }
}
