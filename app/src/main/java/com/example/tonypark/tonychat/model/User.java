package com.example.tonypark.tonychat.model;

/**
 * Created by Tony Park on 10/29/2017.
 */

public class User {
    private String userName;
    private String profileImageUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getprofileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
