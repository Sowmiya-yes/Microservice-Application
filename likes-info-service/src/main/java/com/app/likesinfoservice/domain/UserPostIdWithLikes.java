package com.app.likesinfoservice.domain;

import java.util.List;

public class UserPostIdWithLikes {
    private String userId;
    private List<PostIdWithLikes> listOfPostIdWithLikes;

    public UserPostIdWithLikes(String userID, List<PostIdWithLikes> listOfPostIdWithLikes) {
        this.userId = userID;
        this.listOfPostIdWithLikes = listOfPostIdWithLikes;
    }

    public String getUserID() {
        return userId;
    }

    public void setUserID(String userID) {
        this.userId = userID;
    }

    public List<PostIdWithLikes> getListOfPostIdWithLikes() {
        return listOfPostIdWithLikes;
    }

    public void setListOfPostIdWithLikes(List<PostIdWithLikes> listOfPostIdWithLikes) {
        this.listOfPostIdWithLikes = listOfPostIdWithLikes;
    }
}
