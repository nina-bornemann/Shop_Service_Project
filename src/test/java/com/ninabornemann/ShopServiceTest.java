package com.ninabornemann;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void placeOrder_isAvailable() {
        ShopService shop = new ShopService();
        Product pancake = new Product("Pancake", 2.95, true);
        shop.repo.addProduct(pancake);
        Order pancakeOrder = new Order("1129", pancake, 5);
        boolean expected = true;
        shop.placeOrder(pancakeOrder);
        boolean actual = shop.ordersList.contains(pancakeOrder.orderId());
        assertEquals(expected, actual);
    }
}