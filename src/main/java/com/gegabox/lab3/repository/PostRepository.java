package com.gegabox.lab3.repository;

import com.gegabox.lab3.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("select p from Post p where  size(p.comment) > ?1")
    List<Post> findPostsByCommentGreaterThan(int num);

    @Query(value = "select p from Post p where p.title = ?1 ")
    List<Post> findPostsByTitle(String title);
}
