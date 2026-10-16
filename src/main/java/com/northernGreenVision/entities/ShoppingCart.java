package com.northernGreenVision.entities;

import java.util.ArrayList;

public class ShoppingCart {
    /* has products */
    protected ArrayList<Product> products = new ArrayList<>();
    protected double getTotalPrice (){
        return 0.00;
    }
    protected boolean addProduct(Product product){
        return true;
    }
    protected boolean removeProduct(Product product){
        return false;
    }
}
