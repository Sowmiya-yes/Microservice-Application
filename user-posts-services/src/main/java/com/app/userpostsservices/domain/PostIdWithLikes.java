package com.app.userpostsservices.domain;

public class PostIdWithLikes {
    private String postId;
    private String userId;
    private int likes;

    public PostIdWithLikes() {
    }

    public PostIdWithLikes(String postId, String userId, int likes) {
        this.postId = postId;
        this.userId = userId;
        this.likes = likes;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
