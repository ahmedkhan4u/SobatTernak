package com.softrasol.ternaksukses.Models;

public class ArticleTabsModel {

    private int image;
    private String title, subhead, description;

    public ArticleTabsModel() { }

    public ArticleTabsModel(int image, String title, String subhead, String description) {
        this.image = image;
        this.title = title;
        this.subhead = subhead;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
