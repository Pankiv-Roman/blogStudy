package com.example.blog.service;

import com.example.blog.entity.Post;
import com.example.blog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Post addPosts(Post post) {
        return postRepository.save(post);
    }

    public Post editPost(long id, Post post) {
        post.setId(id);
        return postRepository.save(post);
    }

    public void deletePost(long id) {
        Post post = postRepository.getById(id);
        postRepository.delete(post);
    }
}
