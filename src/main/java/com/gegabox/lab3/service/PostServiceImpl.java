package com.gegabox.lab3.service;


import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.entity.User;
import com.gegabox.lab3.repository.PostRepository;
import com.gegabox.lab3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    // @Autowired
    PostRepository postRepository;
    UserService userService;

    @Autowired
    public PostServiceImpl(PostRepository postRepository, UserService userService){
        this.postRepository = postRepository;this.userService=userService;
    }
@Override
   public List<Post> findAll(){
        return postRepository.findAll();
    }

    @Override
   public Post findById(long id){
        return postRepository.findById(id).get();
    }

    @Override
   public void add(Post post){
        User user = userService.findById(1L);
        user.getPosts().add(post);
        postRepository.save(post);
    }

    public void update(long id, Post post) {
        postRepository.save(post);
    }

    public void delete(long id) {
        postRepository.deleteById(id);
    }

}
