package com.softrasol.ternaksukses.Models;

public class HomeProductsModel {

    private int image;
    private String productName, productPrice;

    public HomeProductsModel() { }

    public HomeProductsModel(int image, String productName, String productPrice) {
        this.image = image;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
