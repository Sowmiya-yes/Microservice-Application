package com.app.userpostsservices.domain;

public class PostAndLikes {
    private Post post;
    private int likes;

    public PostAndLikes() {
    }

    public PostAndLikes(Post post, int likes) {
        this.post = post;
        this.likes = likes;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
