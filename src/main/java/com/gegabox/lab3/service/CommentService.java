package com.gegabox.lab3.service;

import com.gegabox.lab3.entity.Comment;

import java.util.List;

public interface CommentService {
    void addComment(Comment comment);
    List<Comment> getComments();
    Comment getComment(Long id);
    void deleteComment(Long id);
}
