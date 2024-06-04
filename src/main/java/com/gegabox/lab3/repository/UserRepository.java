package com.gegabox.lab3.repository;

import com.gegabox.lab3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from User u where size(u.posts) > :size")
    public List<User> findUsersByPostsSize(int size);
}
