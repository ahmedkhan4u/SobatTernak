package com.softrasol.ternaksukses.Models;

public class NotificationsModel {
    private int image, icon;
    private String name, description, time;

    public NotificationsModel() {}

    public NotificationsModel(int image, int icon, String name, String description, String time) {
        this.image = image;
        this.icon = icon;
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
