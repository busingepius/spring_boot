package com.gegabox.lab3.controller;

import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.entity.User;
import com.gegabox.lab3.service.UserService;
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

    @GetMapping
    public List<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.save(user);
    }

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
