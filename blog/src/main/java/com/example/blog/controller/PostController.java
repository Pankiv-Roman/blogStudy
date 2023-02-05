package com.example.blog.controller;

import com.example.blog.entity.Post;
import com.example.blog.service.PostService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/posts", produces = MediaType.APPLICATION_JSON_VALUE)
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<Post> getPosts() {

        return postService.getPosts();
    }

    @PostMapping
    public Post addPost(@RequestBody Post post) {

        return postService.addPosts(post);
    }

    @PutMapping({"/{id}"})
    public Post editPost(@PathVariable(value = "id") long id, @RequestBody Post post) {

        return postService.editPost(id, post);
    }

    @DeleteMapping({"/{id}"})
    public void deletePost(@PathVariable(value = "id") long id) {

        postService.deletePost(id);
    }
}
