package com.ninabornemann;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        ShopService shop = new ShopService(new OrderListRepo());

        Product pillow = new Product("Pillow", 5.99, true);
        Product blanket = new Product("Blanket", 20.55, true);
        Product table = new Product("Table", 45.95, true);

        shop.repo.addProduct(pillow);
        shop.repo.addProduct(blanket);
        shop.repo.addProduct(table);

        Order order1 = new Order(UUID.randomUUID().toString(), pillow, 2);

        shop.placeOrder(order1);
        System.out.println(shop.ordersList.getAllOrderInfo());

    }
}