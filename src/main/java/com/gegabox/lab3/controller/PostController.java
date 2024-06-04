package com.gegabox.lab3.controller;

import com.gegabox.lab3.entity.Post;
import com.gegabox.lab3.service.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    PostServiceImpl postService;

    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping
    public List findPostAll(
            @RequestParam(required = false, name = "title") String title,
            @RequestParam(required = false, name = "likes") String likes
    ) {
        System.out.println(title +"ii iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        System.out.println(likes+"  qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        if (!title.isEmpty()) {
            return postService.findPostsByTitle(title);
        }
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public Post findPostById(@PathVariable("id") long ID) {
        return postService.findById(ID);
    }

    @PostMapping
    public void addPost(@RequestBody Post post) {
        postService.add(post);
    }

    @PutMapping("/{id}")
    public void updatePost(@PathVariable long id, @RequestBody Post post) {
        postService.update(id, post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable long id) {
        postService.delete(id);
    }
}
