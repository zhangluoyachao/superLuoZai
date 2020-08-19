package com.sc.pojo;

public class VideoComment {
    private Integer id;
    private Integer videoId;
    private Integer userId;
    private String comment;

    public VideoComment(Integer id, Integer videoId, Integer userId, String comment) {
        this.id = id;
        this.videoId = videoId;
        this.userId = userId;
        this.comment = comment;
    }

    public VideoComment(Integer videoId, Integer userId, String comment) {
        this.videoId = videoId;
        this.userId = userId;
        this.comment = comment;
    }

    public VideoComment() {
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
