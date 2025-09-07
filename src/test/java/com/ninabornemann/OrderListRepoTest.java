package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderListRepoTest {

    @Test
    void printOrderInfo_isEqual() {
        OrderListRepo orderRepo = new OrderListRepo(new ArrayList<>());
        Order order1 = new Order("1", Map.of(new Product("3", "Table", 54.95, 5), 2));
        String expected = "OrderId=1, {Product[id=3, name=Table, price=54.95, availability=5]=2}";
        String actual = orderRepo.getOrderInfo(order1);
        assertEquals(expected, actual);
    }

    @Test
    void printAllOrderInfo_isEqual() {
        List<Order> list = new ArrayList<>();
        Order order1 = new Order("1", Map.of(new Product("2", "Table", 54.95, 7), 2));
        Order order2 = new Order("2", Map.of(new Product("4", "Blanket", 22.99, 10), 4));
        list.add(order1);
        list.add(order2);
        OrderListRepo orderRepo = new OrderListRepo(list);
        String expected = "OrderId=1, {Product[id=2, name=Table, price=54.95, availability=7]=2}\n" +
        "OrderId=2, {Product[id=4, name=Blanket, price=22.99, availability=10]=4}\n"
        ;
        String actual = orderRepo.getAllOrderInfo();
        assertEquals(expected, actual);
    }



}