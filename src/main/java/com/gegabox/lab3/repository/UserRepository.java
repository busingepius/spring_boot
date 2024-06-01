package com.gegabox.lab3.repository;

import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    // deleteById(ID id);
    // existsById(ID id);
    // findAll();
    // findAllById(Iterable<ID> ids);
    // findById(ID id);
    // save(S entity);
    // saveAll(Iterable<S> entities);

}
