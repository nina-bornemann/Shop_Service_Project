package com.ninabornemann;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShopService {

    ShopService() {}

    ShopService(OrderRepo o) {
        ordersList = o;
    }

    ProductRepo repo = new ProductRepo(new ArrayList<>());
    OrderRepo ordersList = new OrderMapRepo();



    public void placeOrder(Order order) {
        if (repo.hasProduct(order.product())) {
            ordersList.addToOrders(order);
            System.out.println("The product is available. Order successful.");
        } else {
            System.out.println("The product is not available. Order not successful.");
        }
    }
}
