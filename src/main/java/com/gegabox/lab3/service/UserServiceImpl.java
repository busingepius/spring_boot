package com.gegabox.lab3.service;

import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.entity.User;
import com.gegabox.lab3.repository.PostRepository;
import com.gegabox.lab3.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    PostRepository postRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
//        this.postRepository = postRepository;
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).get();
    }

    public List<Post> findUserPostsById(long id) {
        User user = userRepository.findById(id).get();
        return user.getPosts();
    }

    @Override
    public void save(User user) {

        userRepository.save(user);
    }
}
