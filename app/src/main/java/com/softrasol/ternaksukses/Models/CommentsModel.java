package com.softrasol.ternaksukses.Models;

public class CommentsModel {
    private int image;
    private String name, time, message, noOfLikes;

    public CommentsModel() { }

    public CommentsModel(int image, String name, String time, String message, String noOfLikes) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.message = message;
        this.noOfLikes = noOfLikes;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(String noOfLikes) {
        this.noOfLikes = noOfLikes;
    }
}
