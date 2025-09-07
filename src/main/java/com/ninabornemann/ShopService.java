package com.ninabornemann;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopService {

    ShopService() {
    }

    ShopService(OrderRepo o) {
        ordersList = o;
    }

    ProductRepo repo = new ProductRepo(new ArrayList<>());
    OrderRepo ordersList = new OrderMapRepo();


    public void placeOrder(Order order) {
        boolean productsAvailable = true;
        for (Map.Entry<Product, Integer> entry : order.products().entrySet()) {
            Product p = entry.getKey();
            Integer amountToOrder = entry.getValue();
            if (!repo.hasProduct(p.id(), amountToOrder)) {
                productsAvailable = false;
                System.out.println("The product" + p.name() + "is not available. Order not successful.");
            }
        }
        if (productsAvailable) {
            ordersList.addToOrders(order);
            System.out.println("The product is available. Order successful.");
        }
    }
}
