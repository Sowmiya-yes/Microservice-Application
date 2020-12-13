package com.app.userpostsservices.domain;

public class Post {
    private String postId;
    private String postUrl;
    private String postCaption;

    public Post() {
    }

    public Post(String postId, String postUrl, String postCaption) {
        this.postId = postId;
        this.postUrl = postUrl;
        this.postCaption = postCaption;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getPostCaption() {
        return postCaption;
    }

    public void setPostCaption(String postCaption) {
        this.postCaption = postCaption;
    }
}
