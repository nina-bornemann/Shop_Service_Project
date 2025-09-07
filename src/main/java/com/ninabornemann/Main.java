package com.ninabornemann;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        ShopService shop = new ShopService(new OrderListRepo());

        Product pillow = new Product(UUID.randomUUID().toString(), "Pillow", 5.99, 10);
        Product blanket = new Product(UUID.randomUUID().toString(), "Blanket", 20.55, 6);
        Product table = new Product(UUID.randomUUID().toString(), "Table", 45.95, 3);

        shop.repo.addProduct(pillow);
        shop.repo.addProduct(blanket);
        shop.repo.addProduct(table);

        Order order1 = new Order(UUID.randomUUID().toString(), Map.of(pillow, 2, blanket, 1));

        shop.placeOrder(order1);
        System.out.println(shop.ordersList.getAllOrderInfo());

    }
}