package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void placeOrder_isAvailable() {
        ShopService shop = new ShopService();
        Product pancake = new Product("1", "Pancake", 2.95, 7);
        shop.repo.addProduct(pancake);
        Order pancakeOrder = new Order("1129", Map.of(pancake, 5));
        boolean expected = true;
        shop.placeOrder(pancakeOrder);
        boolean actual = shop.ordersList.contains(pancakeOrder.orderId());
        assertEquals(expected, actual);
    }
}