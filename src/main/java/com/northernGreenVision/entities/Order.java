package com.northernGreenVision.entities;

import java.util.ArrayList;

public class Order {
    /* has products */
    protected int orderId;
    protected double totalPrice;
    protected Customer customer;
    protected ArrayList<Product> orderedProducts;
}
