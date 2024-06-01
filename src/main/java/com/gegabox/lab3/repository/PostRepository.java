package com.gegabox.lab3.repository;

import com.gegabox.lab3.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
//    List<Post> findPostAll();
//
//    Post findPostById(long id);
//
//    void add(long id,Post post);
//
//    void updatePost(long id, Post post);
//
//    void deletePost(long id);

}
