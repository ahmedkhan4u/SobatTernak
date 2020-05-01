package com.softrasol.ternaksukses.Models;

public class HomePostsModel {

    private int image;
    private String name, time, description, postType;

    public HomePostsModel() { }

    public HomePostsModel(int image, String name, String time, String description, String postType) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.description = description;
        this.postType = postType;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
}
