package com.ninabornemann;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void sumPriceOfOrders_isEqual() {
        Order o = new Order("5", Map.of(new Product("2", "Pancake", 2.5, 7), 4));
        double actual = o.sumPriceOfOrders();
        assertThat(actual).isEqualTo(10);
    }

    @Test
    void sumPriceOfOrders_isAlsoEqual() {
        Order o = new Order("5", Map.of(new Product("2", "Pancake", 2.5, 7), 3));
        assertThat(o.sumPriceOfOrders()).isEqualTo(7.5);
    }

    @ParameterizedTest
    @CsvSource({"5,2.5,2", "12,3,4", "7.5,1.5,5"})
    void sumPriceOfOrders_isEqualAgain(double expected, double price, int quantity) {
        Order o = new Order("5", Map.of(new Product("2", "Pancake", price, 7), quantity));
        assertThat(o.sumPriceOfOrders()).isEqualTo(expected);
    }
}