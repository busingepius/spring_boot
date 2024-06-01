
package com.gegabox.lab3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Post{

    @JsonBackReference
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    String title;
    String content;
    String author;

    @OneToMany
    @JoinColumn(name="post_id")
    List<Comment> comment;
}