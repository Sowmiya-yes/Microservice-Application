package com.app.postsdetailsservices.controller;

import com.app.postsdetailsservices.domain.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @RequestMapping("/{postId}")
    Post getPostByPostId(@PathVariable String postId) {
        List<Post> posts = Arrays.asList(
            new Post("123", "https://amazon.s3.com/sadqwsq", "My first post"),
            new Post("456", "https://amazon.s3.com/sdewd", "My second post"),
            new Post("789", "https://amazon.s3.com/dedww", "My third post")
        );

        return posts.stream()
                .filter(post -> post.getPostId().equals(postId))
                .findFirst()
                .orElse(null);
    }

}
