package com.gegabox.lab3.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String name;

    @JsonManagedReference
    @OneToMany
    @JoinColumn(name="user_id")
    List<Post> posts;
}
