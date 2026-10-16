package com.northernGreenVision.entities;

public class Product {

    private String productName;
    private double productPrice;
    private int productId;

    public Product(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public int getProductId() {
        return productId;
    }

    public void setProductName(String productName) {this.productName = productName;}
    public void setProductPrice(double productPrice) {this.productPrice = productPrice;}
    public void setProductId(int productId) {this.productId = productId;}
}
