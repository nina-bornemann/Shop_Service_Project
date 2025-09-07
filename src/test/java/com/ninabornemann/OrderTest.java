package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void sumPriceOfOrders_isEqual() {
        Order o = new Order("5", Map.of(new Product("2", "Pancake", 2.5, 7), 4));
        double expected = 2.5 * 4;
        double actual = o.sumPriceOfOrders();
        assertEquals(expected, actual);
    }

    @Test
    void sumPriceOfOrders_isAlsoEqual() {
        Order o = new Order("5", Map.of(new Product("2", "Pancake", 2.5, 7), 3));
        double expected = 2.5 * 3;
        double actual = o.sumPriceOfOrders();
        assertEquals(expected, actual);
    }
}