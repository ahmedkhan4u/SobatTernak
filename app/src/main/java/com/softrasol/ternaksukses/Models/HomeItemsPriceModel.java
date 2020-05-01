package com.softrasol.ternaksukses.Models;

public class HomeItemsPriceModel {

    private int image;
    private String price;

    public HomeItemsPriceModel() { }

    public HomeItemsPriceModel(int image, String price) {
        this.image = image;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
