package com.gegabox.lab3.service;

import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    void deleteById(long id);
    List<User> findAll();
    User findById(long id);
    List<Post> findUserPostsById(long id);
    void save(User user);
    List<User> findByPostsGreaterThanSize(int size);

}
