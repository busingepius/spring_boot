package com.gegabox.lab3.repository;

import com.gegabox.lab3.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
