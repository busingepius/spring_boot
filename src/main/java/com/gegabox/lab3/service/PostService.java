package com.gegabox.lab3.service;

import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {


    public List<Post> findAll();

    public Post findById(long id);

    public void add(Post post);

    public void update(long id, Post post) ;

    public void delete(long id) ;


}
