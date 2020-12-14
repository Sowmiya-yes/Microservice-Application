package com.app.userpostsservices.controller;

import com.app.userpostsservices.domain.Post;
import com.app.userpostsservices.domain.PostAndLikes;
import com.app.userpostsservices.domain.UserPostIdWithLikes;
import com.app.userpostsservices.domain.UserPosts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user-posts")
public class UserPostsController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    UserPosts getPostsByUserId(@PathVariable String userId) {
        UserPostIdWithLikes userPostIdWithLikes =
                restTemplate.getForObject(
                        String.format("http://likes-info-service/post-likes/%s", userId),
                        UserPostIdWithLikes.class);

        List<PostAndLikes> userPosts = null;

        if (userPostIdWithLikes != null) {
            userPosts = userPostIdWithLikes.getListOfPostIdWithLikes()
                    .stream()
                    .map(post -> {
                        Post userPost = restTemplate.getForObject(
                                String.format("http://posts-details-service/posts/%s", post.getPostId()),
                                Post.class);
                        return new PostAndLikes(userPost, post.getLikes());
                    })
                    .collect(Collectors.toList());
        }



        return new UserPosts(userId, userPosts);
    }
}
