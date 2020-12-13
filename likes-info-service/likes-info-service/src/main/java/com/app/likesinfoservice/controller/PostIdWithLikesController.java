package com.app.likesinfoservice.controller;

import com.app.likesinfoservice.domain.PostIdWithLikes;
import com.app.likesinfoservice.domain.UserPostIdWithLikes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/post-likes")
public class PostIdWithLikesController {

    @GetMapping("/{userId}")
    UserPostIdWithLikes getPostIdsAndLikesByUserId(@PathVariable String userId) {
        List<PostIdWithLikes> postIdWithLikesList = Arrays.asList(
                new PostIdWithLikes("123", "101",  10),
                new PostIdWithLikes("456", "102", 9),
                new PostIdWithLikes("789", "101", 8)
                );
        List<PostIdWithLikes> filteredPostIdWithLikes = postIdWithLikesList
                .stream()
                .filter(post -> post.getUserId().equals(userId))
                .collect(Collectors.toList());
        
        return new UserPostIdWithLikes(userId, filteredPostIdWithLikes);
    }

}
