package com.northernGreenVision.entities;

import java.util.ArrayList;

public class Customer extends User {
    /* Customer will put stuff to shopping cart */
    protected ShoppingCart shoppingCart;
    protected String paymentMethod;
    protected String shippingAddress;
    protected ArrayList<Order> listOfOrders;
}