package com.sc.pojo;

public class Video {
    private Integer videoId;
    private Integer upvoteCount;//点赞数
    private String videoName;
    private String path;

    public Video(Integer videoId, Integer upvoteCount, String videoName, String path) {
        this.videoId = videoId;
        this.upvoteCount = upvoteCount;
        this.videoName = videoName;
        this.path = path;
    }

    public Video(Integer upvoteCount, String videoName, String path) {
        this.upvoteCount = upvoteCount;
        this.videoName = videoName;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public void setUpvoteCount(Integer upvoteCount) {
        this.upvoteCount = upvoteCount;
    }
}
