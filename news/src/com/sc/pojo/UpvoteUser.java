package com.sc.pojo;

public class UpvoteUser {
    private Integer id;
    private Integer videoId;
    private Integer userId;

    public UpvoteUser(Integer id, Integer videoId, Integer userId) {
        this.id = id;
        this.videoId = videoId;
        this.userId = userId;
    }

    public UpvoteUser(Integer videoId, Integer userId) {
        this.videoId = videoId;
        this.userId = userId;
    }

    public UpvoteUser() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
