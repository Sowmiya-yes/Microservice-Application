package com.app.userpostsservices.domain;

import java.util.List;

public class UserPosts {
    private String userId;
    private List<PostAndLikes> posts;

    public UserPosts() {
    }

    public UserPosts(String userId, List<PostAndLikes> posts) {
        this.userId = userId;
        this.posts = posts;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<PostAndLikes> getPosts() {
        return posts;
    }

    public void setPosts(List<PostAndLikes> posts) {
        this.posts = posts;
    }
}
